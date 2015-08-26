/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.UserDAO;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import junit.framework.TestCase;

/**
 *
 * @author firat
 */
public class UserDAOImplTest extends RadioModeJUnitTest {

    public UserDAOImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of existsByUserName method, of class UserDAOImpl.
     */
    public void DISABLED_testExistsByUserName() {
        System.out.println("existsByUserName");
        String userName = "brokensword";
        UserDAO instance = (UserDAO) getApplicationContext().getBean("userDAO");
        boolean expResult = false;
        boolean result = instance.existsByUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existsByEmail method, of class UserDAOImpl.
     */
    public void DISABLED_testExistsByEmail() {
        System.out.println("existsByEmail");
        String email = "";
        UserDAOImpl instance = new UserDAOImpl();
        boolean expResult = false;
        boolean result = instance.existsByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByUserName method, of class UserDAOImpl.
     */
    public void testGetByUserName() {
        System.out.println("getByUserName");
        String userName = "brokensword";
        UserDAO instance = (UserDAO) getApplicationContext().getBean("userDAO");
        User expResult = null;
        User result = instance.getUserByUsername(userName);
        System.out.println(result.getEmail());

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUser method, of class UserDAOImpl.
     */
    public void DISABLED_testSaveUser() {
        System.out.println("saveUser");
        User user = null;
        UserDAOImpl instance = new UserDAOImpl();
        boolean expResult = false;
        instance.saveUser(user);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordByUserName method, of class UserDAOImpl.
     */
    public void DISABLED_testGetPasswordByUserName() {
        System.out.println("getPasswordByUserName");
        String userName = "";
        UserDAOImpl instance = new UserDAOImpl();
        String expResult = "";
        String result = instance.getPasswordByUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordByUserName method, of class UserDAOImpl.
     */
    public void DISABLED_testSetPasswordByUserName() {
        System.out.println("setPasswordByUserName");
        String userName = "";
        String password = "";
        UserDAOImpl instance = new UserDAOImpl();
        boolean expResult = false;
        boolean result = instance.savePasswordByUserName(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
