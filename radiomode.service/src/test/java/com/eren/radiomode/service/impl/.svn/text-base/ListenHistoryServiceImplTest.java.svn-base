/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.radio.Radio;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.service.parent.ServiceFactory;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author firat
 */
public class ListenHistoryServiceImplTest extends RadioModeJUnitTest {

    public ListenHistoryServiceImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of getEntityDAOFactory method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testGetEntityDAOFactory() {
        System.out.println("getEntityDAOFactory");
        ListenHistoryServiceImpl instance = new ListenHistoryServiceImpl();
        EntityDAOFactory expResult = null;
        EntityDAOFactory result = instance.getEntityDAOFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntityDAOFactory method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testSetEntityDAOFactory() {
        System.out.println("setEntityDAOFactory");
        EntityDAOFactory entityDAOFactory = null;
        ListenHistoryServiceImpl instance = new ListenHistoryServiceImpl();
        instance.setEntityDAOFactory(entityDAOFactory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveListenHistory method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testSaveListenHistory() {
        System.out.println("saveListenHistory");
        RadioUsers radioUsersid = null;
        Video videoid = null;
        ListenHistoryServiceImpl instance = new ListenHistoryServiceImpl();
        instance.saveListenHistory(radioUsersid, videoid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateListenHistory method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testUpdateListenHistory() {
        System.out.println("updateListenHistory");
        int id = 0;
        int listenPercent = 0;
        int volumePercent = 0;
        Date listenDate = null;
        ListenHistoryServiceImpl instance = new ListenHistoryServiceImpl();
        instance.updateListenHistory(id, listenPercent, volumePercent, listenDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListenHistory method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testGetListenHistory() {
        System.out.println("getListenHistory");
        int id = 0;
        ListenHistoryServiceImpl instance = new ListenHistoryServiceImpl();
        ListenHistory expResult = null;
        ListenHistory result = instance.getListenHistory(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPastListenHistory method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testGetPastListenHistory() {
        System.out.println("getPastListenHistory");
        User userid = null;
        Radio radioid = null;
        ListenHistoryServiceImpl instance = new ListenHistoryServiceImpl();
        List expResult = null;
        List result = instance.getPastListenHistory(userid, radioid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextListenHistory method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testGetNextListenHistory() {
        System.out.println("getNextListenHistory");
        User userid = null;
        Radio radioid = null;
        ListenHistoryServiceImpl instance = new ListenHistoryServiceImpl();
        ListenHistory expResult = null;
        ListenHistory result = instance.getNextListenHistory(userid, radioid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentlyListenedSongs method, of class ListenHistoryServiceImpl.
     */
    public void DISABLED_testGetRecentlyListenedSongs() {
        System.out.println("getRecentlyListenedSongs");
        User user = null;
        int first = 0;
        int max = 10;
        ServiceFactory instance = (ServiceFactory) getApplicationContext().getBean("serviceFactory");
        user = instance.getUserService().getUserByUsername("brokensword");
        List expResult = null;
        List result = instance.getListenHistoryService().getRecentlyListenedSongs(user, first, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentlyListenedSongs method, of class ListenHistoryServiceImpl.
     */
    public void testGetMostListenedSongs() {
        System.out.println("getRecentlyListenedSongs");
        User user = null;
        int first = 0;
        int max = 10;
        ServiceFactory instance = (ServiceFactory) getApplicationContext().getBean("serviceFactory");
        user = instance.getUserService().getUserByUsername("brokensword");
        List expResult = null;
        List map = instance.getListenHistoryService().getMostListenedSongs(user, first, max);
        assertEquals(expResult, map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
