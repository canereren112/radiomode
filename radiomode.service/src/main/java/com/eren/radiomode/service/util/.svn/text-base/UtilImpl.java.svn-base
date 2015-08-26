/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.util;

import java.util.ArrayList;
import java.util.List;
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

    public static String loadConstantsProperty(String propertyName) {
        if (constantsProperty == null) {
            constantsProperty = ResourceBundle.getBundle(Constants.CONSTANTS_PROPERTIES);
        }
        return constantsProperty.getString(propertyName);
    }

    public static String loadExceptionProperty(String propertyName) {
        if (exceptionProperty == null) {
            exceptionProperty = ResourceBundle.getBundle(Constants.EXCEPTION_PROPERTIES);
        }
        return exceptionProperty.getString(propertyName);
    }

    public static String loadJdbcProperty(String propertyName) {
        if (jdbcProperty == null) {
            jdbcProperty = ResourceBundle.getBundle(Constants.JDBC_PROPERTIES);
        }
        return jdbcProperty.getString(propertyName);
    }

    public static String loadMailProperty(String propertyName) {
        if (mailProperty == null) {
            mailProperty = ResourceBundle.getBundle(Constants.MAIL_PROPERTIES);
        }
        return mailProperty.getString(propertyName);
    }

    public static String loadMessageProperty(String propertyName) {
        if (messageProperty == null) {
            messageProperty = ResourceBundle.getBundle(Constants.MESSAGE_PROPERTIES);
        }
        return messageProperty.getString(propertyName);
    }

    public static String loadQueryProperty(String propertyName) {
        if (queryProperty == null) {
            queryProperty = ResourceBundle.getBundle(Constants.QUERY_PROPERTIES);
        }
        return queryProperty.getString(propertyName);
    }

    public static String loadViewProperty(String propertyName) {
        if (viewProperty == null) {
            viewProperty = ResourceBundle.getBundle(Constants.VIEW_PROPERTIES);
        }
        return viewProperty.getString(propertyName);
    }

    public static String loadProperty(String fileName, String propertyName) {
        Properties properties = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle("com.eren.radiomode.files.properties.message");


        String property = bundle.getString(propertyName);
        return property;
    }

    public static String generateLogMessage(String logMessage, String... params) {
        for(String param: params) {
            logMessage = logMessage.replace("?", param);
        }
        return logMessage;
    }

    public static void main(String args[]) {
        try {
            //String number = UtilImpl.generateActivationNumber("brokensword");            
//            String property = UtilImpl.loadMessageProperty("warning.artistNameNotFound");
//            UtilImpl impl = new UtilImpl();
//            //System.out.println(property);
//            property = UtilImpl.loadMessageProperty("warning.artistNameNotFound");
//            System.out.println(property);

            String s = UtilImpl.generateLogMessage("? Not Found", "brokensword");
            System.out.println(s);
        } catch (Exception ex) {
            Logger.getLogger(UtilImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
