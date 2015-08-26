/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author work
 */
public class EditProfileServiceTest extends RadioModeJUnitTest {

    public EditProfileServiceTest(String testName) {
        super(testName);
    }

    /**
     * Test of loadCountryList method, of class EditProfileService.
     */
    public void DISABLED_testGetCountryList() {
        System.out.println("getCountryList");
        EditProfileService instance = (EditProfileService) applicationContext.getBean("editProfileService");
        List expResult = null;
        List result = instance.loadCountryList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadGeneralProfile method, of class EditProfileService.
     */
    public void DISABLED_testLoadGeneralProfile() {
        System.out.println("loadGeneralProfile");
        String userName = "";
        EditProfileService instance = (EditProfileService) applicationContext.getBean("editProfileService");
        User expResult = null;
        User result = instance.loadGeneralProfile(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editGeneralProfile method, of class EditProfileService.
     */
    public void DISABLED_testEditGeneralProfile() {
        System.out.println("editGeneralProfile");
        User user = null;
        String countryCode = "";
        EditProfileService instance = (EditProfileService) applicationContext.getBean("editProfileService");
        boolean expResult = false;
        //instance.editGeneralProfile(user, countryCode);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadPassword method, of class EditProfileService.
     */
    public void DISABLED_testGetPassword() {
        System.out.println("getPassword");
        String userName = "brokensword";
        EditProfileService instance = (EditProfileService) applicationContext.getBean("editProfileService");
        String expResult = "";
        String result = instance.loadPassword(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePassword method, of class EditProfileService.
     */
    public void DISABLED_testSetPassword() {
        System.out.println("setPassword");
        String userName = "brokensword";
        String password = "sifreler";
        EditProfileService instance = (EditProfileService) applicationContext.getBean("editProfileService");
        String expResult = "";
        boolean result = instance.savePassword(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadNotifications method, of class EditProfileService.
     */
    public void testLoadNotifications() {
        System.out.println("loadNotifications");
        String userName = "brokensword";
        EditProfileService instance = (EditProfileService) applicationContext.getBean("editProfileService");
        UserNotifications expResult = null;
        UserNotifications result = instance.loadNotifications(userName);
        testSaveNotifications(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveNotifications method, of class EditProfileService.
     */
    public void testSaveNotifications(UserNotifications result2) {
        System.out.println("saveNotifications");
        result2.setConcertAlert(Boolean.FALSE);
        result2.setFriendshipRequest(Boolean.FALSE);
        EditProfileService instance = (EditProfileService) applicationContext.getBean("editProfileService");
        boolean expResult = false;
        instance.saveNotifications(result2);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
