/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;

/**
 * Genel Araclar Sinifi
 * @author work
 */
public class UtilImpl {

    private static ResourceBundle constantsProperty, exceptionProperty, jdbcProperty, mailProperty,
            messageProperty, queryProperty, viewProperty;

    public static synchronized String generateActivationNumber(String userName) {
        int length = userName.length();
        Random random = new Random();
        int part1Length = random.nextInt(length);
        int totalLength = 2 * length + part1Length;
        StringBuffer activationNumber = new StringBuffer();

        for (int i = 0; i < totalLength; i++) {
            int index = random.nextInt(10 + length);
            if (index > 9) {
                index -= 10;
                activationNumber.append(userName.charAt(index));
            } else {
                activationNumber.append(index);
            }
        }
        return activationNumber.toString();
    }

    public static boolean checkReCaptchaCode(String challengeField, String responseField) {
        ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
        reCaptcha.setPrivateKey(Constants.RECAPTCHA_PRIVATE_KEY);
        ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(Constants.REMOTE_ADDRESS,
                challengeField, responseField);

        if (reCaptchaResponse.isValid()) {
            return true;
        } else {
            return false;
        }
    }

    public static String rewriteParams(String param) {
        param = param.replace('_', ' ');
//        param.replace('ı', 'i');
//        param.replace('ş', 's');
//        param.replace('ü', 'u');
//        param.replace('ğ', 'g');
//        param.replace('ö', 'o');
//        param.replace('ç', 'c');
        return param;
    }

    public static String loadConstantsProperty(String propertyName) throws IOException {
        if (constantsProperty == null) {
            constantsProperty = ResourceBundle.getBundle(Constants.CONSTANTS_PROPERTIES);
        }
        return constantsProperty.getString(propertyName);
    }

    public static String loadExceptionProperty(String propertyName) throws IOException {
        if (exceptionProperty == null) {
            exceptionProperty = ResourceBundle.getBundle(Constants.EXCEPTION_PROPERTIES);
        }
        return exceptionProperty.getString(propertyName);
    }

    public static String loadJdbcProperty(String propertyName) throws IOException {
        if (jdbcProperty == null) {
            jdbcProperty = ResourceBundle.getBundle(Constants.JDBC_PROPERTIES);
        }
        return jdbcProperty.getString(propertyName);
    }

    public static String loadMailProperty(String propertyName) throws IOException {
        if (mailProperty == null) {
            mailProperty = ResourceBundle.getBundle(Constants.MAIL_PROPERTIES);
        }
        return mailProperty.getString(propertyName);
    }

    public static String loadMessageProperty(String propertyName) throws IOException {
        if (messageProperty == null) {
            //Locale.setDefault(new Locale("tr"));
            messageProperty = ResourceBundle.getBundle(Constants.MESSAGE_PROPERTIES);
        }
        return messageProperty.getString(propertyName);
    }

    public static String loadQueryProperty(String propertyName) throws IOException {
        if (queryProperty == null) {
            queryProperty = ResourceBundle.getBundle(Constants.QUERY_PROPERTIES);
        }
        return queryProperty.getString(propertyName);
    }

    public static String loadViewProperty(String propertyName) throws IOException {
        if (viewProperty == null) {
            viewProperty = ResourceBundle.getBundle(Constants.VIEW_PROPERTIES);
        }
        return viewProperty.getString(propertyName);
    }

    public static String loadProperty(String fileName, String propertyName) throws IOException {
        Properties properties = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle("com.eren.radiomode.files.properties.message");


        String property = bundle.getString(propertyName);
        return property;
    }

    public static void main(String args[]) {
        try {
            //String number = UtilImpl.generateActivationNumber("brokensword");            
            String property = UtilImpl.loadMessageProperty("warning.artistNameNotFound");
            UtilImpl impl = new UtilImpl();
            //System.out.println(property);
            property = UtilImpl.loadMessageProperty("warning.artistNameNotFound");
            System.out.println(property);


        } catch (IOException ex) {
            Logger.getLogger(UtilImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
