/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.service.RadioPlayService;
import com.eren.radiomode.service.SignUpService;
import com.eren.radiomode.service.ViewProfileService;
import com.eren.radiomode.service.util.SendMail;

/**
 *
 * @author work
 */
public class SignUpServiceImplTest extends RadioModeJUnitTest {

    public SignUpServiceImplTest(String DISABLED_testName) {
        super(DISABLED_testName);
    }

    /**
     * DISABLED_test of getSendMail method, of class SignUpServiceImpl.
     */
    public void DISABLED_testGetSendMail() {
        System.out.println("getSendMail");
        SignUpServiceImpl instance = new SignUpServiceImpl();
        SendMail expResult = null;
        SendMail result = instance.getSendMail();
        assertEquals(expResult, result);

        fail("The DISABLED_test case is a prototype.");
    }

    /**
     * DISABLED_test of setSendMail method, of class SignUpServiceImpl.
     */
    public void DISABLED_testSetSendMail() {
        System.out.println("setSendMail");
        SendMail sendMail = null;
        SignUpServiceImpl instance = new SignUpServiceImpl();
        instance.setSendMail(sendMail);

        fail("The DISABLED_test case is a prototype.");
    }

    /**
     * DISABLED_test of signupUser method, of class SignUpServiceImpl.
     */
    public void DISABLED_testSignupUser() {
        System.out.println("signupUser");
        String userName = "";
        String password = "";
        String email = "";
        String activation = "";
        SignUpServiceImpl instance = new SignUpServiceImpl();
        instance.signupUser(email, userName, password, activation);

        fail("The DISABLED_test case is a prototype.");
    }

    /**
     * DISABLED_test of checkUserName method, of class SignUpServiceImpl.
     */
    public void DISABLED_testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "";
        SignUpServiceImpl instance = new SignUpServiceImpl();
        String expResult = "";
        String result = instance.checkUserName(userName);
        assertEquals(expResult, result);

        fail("The DISABLED_test case is a prototype.");
    }

    /**
     * DISABLED_test of checkEmail method, of class SignUpServiceImpl.
     */
    public void DISABLED_testCheckEmail() {
        System.out.println("checkEmail");
        String email = "";
        SignUpServiceImpl instance = new SignUpServiceImpl();
        String expResult = "";
        String result = instance.checkEmail(email);
        assertEquals(expResult, result);

        fail("The DISABLED_test case is a prototype.");
    }

    /**
     * DISABLED_test of sendActivationEmail method, of class SignUpServiceImpl.
     */
    public void testSendActivationEmail() {
        System.out.println("sendActivationEmail");
        String email = "firat52@gmail.com";
        String userName = "brokensword";
        String password = "sword123";
        String activation = "";

        SignUpService instance = (SignUpService) applicationContext.getBean("signupService");
        boolean expResult = false;
        boolean result = instance.sendActivationEmail(email, userName, password, activation);

        assertEquals(expResult, "");
        fail("The DISABLED_test case is a prototype.");
    }
}
