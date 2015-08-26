/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

/**
 * SignUp Servisi
 * @author work
 */
public interface SignUpService {

    /**
     * kullanici adi kontrolu
     * @param userName kullanici adi
     * @return var/yok
     */
    String checkUserName(String userName);

    /**
     * eposta kontrolu
     * @param email eposta
     * @return var/yok
     */
    String checkEmail(String email);

    /**
     * kullaniciyi kaydeder
     * @param email eposta
     * @param userName kullanici adi
     * @param password sifre
     * @param activationNumber aktivasyon no
     */
    void signupUser(String email, String userName, String password, String activationNumber);

    /**
     * kullanicinin epostasina aktivasyon no gonderir
     * @param email eposta
     * @param userName kullanici adi
     * @param password sifre
     * @param activationNumber aktivasyon no
     * @return basarili/basarisiz
     */
    boolean sendActivationEmail(String email, String userName, String password, String activationNumber);

    /**
     * kullanicinin uyeligini aktive eder
     * @param userid aktivasyon no
     * @return WAITING,TIMEOUT,ACTIVATED
     */
    String activateUser(String userid);

    boolean loginUser(String userName, String password);
}
