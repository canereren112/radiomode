/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.service.FriendListService;
import com.eren.radiomode.service.parent.ServiceFactory;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author firat
 */
public class FriendListServiceImplTest extends RadioModeJUnitTest {

    public FriendListServiceImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of getEntityDAOFactory method, of class FriendListServiceImpl.
     */
    public void DISABLED_testGetEntityDAOFactory() {
        System.out.println("getEntityDAOFactory");
        FriendListServiceImpl instance = new FriendListServiceImpl();
        EntityDAOFactory expResult = null;
        EntityDAOFactory result = instance.getEntityDAOFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntityDAOFactory method, of class FriendListServiceImpl.
     */
    public void DISABLED_testSetEntityDAOFactory() {
        System.out.println("setEntityDAOFactory");
        EntityDAOFactory entityDAOFactory = null;
        FriendListServiceImpl instance = new FriendListServiceImpl();
        instance.setEntityDAOFactory(entityDAOFactory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFriendList method, of class FriendListServiceImpl.
     */
    public void testGetFriendList() {
        System.out.println("getFriendList");
        User user = new User(1);
        int first = 0;
        int max = 5;
        ServiceFactory instance = (ServiceFactory) applicationContext.getBean("serviceFactory");
        FriendListService service = instance.getFriendListService();
        List expResult = null;
        List result = service.getFriendList(user, first, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
