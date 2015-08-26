/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.domain.user.UserPictures;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.service.UserService;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author firat
 */
public class UserServiceImplTest extends RadioModeJUnitTest {

    public UserServiceImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of getEntityDAOFactory method, of class UserServiceImpl.
     */
    public void DISABLED_testGetEntityDAOFactory() {
        System.out.println("getEntityDAOFactory");
        UserServiceImpl instance = new UserServiceImpl();
        EntityDAOFactory expResult = null;
        EntityDAOFactory result = instance.getEntityDAOFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntityDAOFactory method, of class UserServiceImpl.
     */
    public void DISABLED_testSetEntityDAOFactory() {
        System.out.println("setEntityDAOFactory");
        EntityDAOFactory entityDAOFactory = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.setEntityDAOFactory(entityDAOFactory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserPicture method, of class UserServiceImpl.
     */
    public void DISABLED_testGetUserPicture() {
        System.out.println("getUserPicture");
        User user = new User(1);
        UserService instance = (UserService) applicationContext.getBean("userService");
        UserPictures expResult = null;
        UserPictures result = instance.getUserPicture(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existsByUserName method, of class UserServiceImpl.
     */
    public void DISABLED_testExistsByUserName() {
        System.out.println("existsByUserName");
        String userName = "";
        UserServiceImpl instance = new UserServiceImpl();
        boolean expResult = false;
        boolean result = instance.existsByUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existsByEmail method, of class UserServiceImpl.
     */
    public void DISABLED_testExistsByEmail() {
        System.out.println("existsByEmail");
        String email = "";
        UserServiceImpl instance = new UserServiceImpl();
        boolean expResult = false;
        boolean result = instance.existsByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByUsername method, of class UserServiceImpl.
     */
    public void DISABLED_testGetUserByUsername() {
        System.out.println("getUserByUsername");
        String userName = "";
        UserServiceImpl instance = new UserServiceImpl();
        User expResult = null;
        User result = instance.getUserByUsername(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUser method, of class UserServiceImpl.
     */
    public void DISABLED_testSaveUser() {
        System.out.println("saveUser");
        User user = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.saveUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordByUserName method, of class UserServiceImpl.
     */
    public void DISABLED_testGetPasswordByUserName() {
        System.out.println("getPasswordByUserName");
        String userName = "";
        UserServiceImpl instance = new UserServiceImpl();
        String expResult = "";
        String result = instance.getPasswordByUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePasswordByUserName method, of class UserServiceImpl.
     */
    public void DISABLED_testSavePasswordByUserName() {
        System.out.println("savePasswordByUserName");
        String userName = "";
        String password = "";
        UserServiceImpl instance = new UserServiceImpl();
        boolean expResult = false;
        boolean result = instance.savePasswordByUserName(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotificationsByUsername method, of class UserServiceImpl.
     */
    public void DISABLED_testGetNotificationsByUsername() {
        System.out.println("getNotificationsByUsername");
        String userName = "";
        UserServiceImpl instance = new UserServiceImpl();
        UserNotifications expResult = null;
        UserNotifications result = instance.getNotificationsByUsername(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveNotifications method, of class UserServiceImpl.
     */
    public void DISABLED_testSaveNotifications() {
        System.out.println("saveNotifications");
        UserNotifications notifications = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.saveNotifications(notifications);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserActivityLimited method, of class UserServiceImpl.
     */
    public void testGetUserActivityLimited() {
        System.out.println("getUserActivityLimited");
        User user = new User();
        user.setUserid(new Integer(1));
        int first = 0;
        int max = 2;
        UserService instance = (UserService) applicationContext.getBean("userService");
        List expResult = null;
        List result = instance.getUserActivity(user, first, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
