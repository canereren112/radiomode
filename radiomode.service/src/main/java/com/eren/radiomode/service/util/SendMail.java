/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 *
 * @author work
 */
public class SendMail {

    @Autowired
    public JavaMailSender mailSender;

    public JavaMailSender getMailSender() {
        return mailSender;
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Basit eposta gonderir
     * @param from gonderen
     * @param to alici
     * @param subject baslik
     * @param text icerik
     * @return basarili/basarisiz
     */
    public boolean sendSimpleMail(String from, String to, String subject, String text) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSentDate(new java.util.Date());
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        try {
            mailSender.send(mailMessage);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    /**
     * HTML formatinda eposta gonderir
     * @param from gonderen
     * @param to alici
     * @param subject baslik
     * @param text icerik
     * @return basarili/basarisiz
     */
    public boolean sendHTMLMail(String from, String to, String subject, String text) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mailMessage = new MimeMessageHelper(mimeMessage, true);
            mailMessage.setFrom(from);
            mailMessage.setTo(to);
            mailMessage.setSentDate(new java.util.Date());
            mailMessage.setSubject(subject);
            mailMessage.setText(text, true);
            mailSender.send(mimeMessage);
        } catch (MessagingException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
