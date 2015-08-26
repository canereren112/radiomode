/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import junit.framework.TestCase;

/**
 *
 * @author work
 */
public class ViewProfileServiceTest extends RadioModeJUnitTest {

    public ViewProfileServiceTest(String testName) {
        super(testName);
    }

    /**
     * Test of loadProfileMain method, of class ViewProfileService.
     */
    public void testViewProfileMain() {
        System.out.println("viewProfileMain");
        String userName = "brokensword";
        ViewProfileService viewProfileService = (ViewProfileService) applicationContext.getBean("viewProfileService");
        User expResult = null;
        User result = viewProfileService.loadProfileMain(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
