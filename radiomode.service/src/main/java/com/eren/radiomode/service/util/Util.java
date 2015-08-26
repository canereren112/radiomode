/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.util;

/**
 * Genel Araclar Arayuzu(kullanilmiyor)
 * @author work
 */
public interface Util {

    /**
     * aktivasyon no uretir
     * @param userName kullanici adi
     * @return aktivasyon no
     */
    String generateActivationNumber(String userName);

    /**
     * reCaptha kodunu kontrol eder
     * @param challengeField girilen kod
     * @param responseField cevap kodu
     * @return dogru/yanlis
     */
    boolean checkReCaptchaCode(String challengeField, String responseField);

    String loadConstantsProperty(String propertyName);

    String loadExceptionProperty(String propertyName);

    String loadJdbcProperty(String propertyName);

    String loadMailProperty(String propertyName);

    String loadMessageProperty(String propertyName);

    String loadQueryProperty(String propertyName);

    String loadViewProperty(String propertyName);
}
