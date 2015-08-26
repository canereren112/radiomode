/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.util;

import com.eren.radiomode.service.util.SendMail;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 *
 * @author work
 */
public class SendMailTest extends RadioModeJUnitTest {

    public SendMailTest(String testName) {
        super(testName);
    }

    /**
     * Test of getMailSender method, of class SendMail.
     */
    public void DISABLED_testGetMailSender() {
        System.out.println("getMailSender");
        SendMail instance = new SendMail();
        JavaMailSenderImpl expResult = null;
        //JavaMailSenderImpl result = instance.getMailSender();
        //assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMailSender method, of class SendMail.
     */
    public void DISABLED_testSetMailSender() {
        System.out.println("setMailSender");
        JavaMailSenderImpl mailSender = null;
        SendMail instance = new SendMail();
        instance.setMailSender(mailSender);
        
        fail("The test case is a prototype.");
    }

}
