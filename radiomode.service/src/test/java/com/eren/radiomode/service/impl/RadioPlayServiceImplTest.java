/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.service.RadioPlayService;
import java.util.List;

/**
 *
 * @author work
 */
public class RadioPlayServiceImplTest extends RadioModeJUnitTest {

    public RadioPlayServiceImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of loadNextVideo method, of class RadioPlayServiceImpl.
     */
    public void DISABLED_testGetNextVideo() {
        System.out.println("getNextVideo");
        String userName = "brokensword";
        String radioid = "DEFAULT";
        RadioPlayService instance = (RadioPlayService) applicationContext.getBean("radioPlayService");
        String expResult = "";
        ListenHistory result = instance.loadNextVideo(userName, radioid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addNextVideos method, of class RadioPlayServiceImpl.
     */
    public void DISABLED_testAddNextVideos() {
        System.out.println("addNextVideos");
        String userName = "brokensword";
        Integer radioid = 1;
        RadioPlayService instance = (RadioPlayService) applicationContext.getBean("radioPlayService");
        boolean expResult = false;
        boolean result = instance.addNextVideos(userName, radioid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testGetRadioUsers method, of class RadioPlayServiceImpl.
     */
    public void testGetRadioUsers() {
        System.out.println("addNextVideos");
        String userName = "brokensword";
        Integer radioid = 1;
        RadioPlayService instance = (RadioPlayService) applicationContext.getBean("radioPlayService");
        boolean expResult = false;
        List<RadioUsers> result = instance.getRadioUsers(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
