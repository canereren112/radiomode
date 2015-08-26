/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.junit.RadioModeJUnitTest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author work
 */
public class RadioCreateServiceImplTest extends RadioModeJUnitTest {

    public RadioCreateServiceImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of loadArtistsLikeName method, of class RadioCreateServiceImpl.
     */
    public void DISABLED_testGetArtistsLikeName() {
        System.out.println("getArtistsLikeName");
        String query = "";
        int limit = 10;
        RadioCreateServiceImpl instance = (RadioCreateServiceImpl) applicationContext.getBean("radioCreateService");
        List expResult = null;
        //long time1, time2;
        List result = null;
        for(int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            result = instance.loadArtistsLikeName(query, 11);
            long time1 = System.currentTimeMillis() - start;
            System.out.println(i + ": " + time1);
        }

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadSimiliarArtists method, of class RadioCreateServiceImpl.
     */
    public void DISABLED_testGetSimiliarArtists() {
        System.out.println("getSimiliarArtists");
        List<String> addedArtists = new ArrayList<String>();
        List<String> blockedArtists = new ArrayList<String>();
        addedArtists.add("Teoman");
        addedArtists.add("Emre Aydın");
        addedArtists.add("Kargo");

        RadioCreateServiceImpl instance = (RadioCreateServiceImpl) applicationContext.getBean("radioCreateService");
        List expResult = null;
        //List result = instance.loadSimiliarArtists(addedArtists, blockedArtists);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadArtistPictures method, of class RadioCreateServiceImpl.
     */
    public void testGetArtistPictures() {
        System.out.println("getArtistPictures");
        List<Integer> artistidList = null;
        RadioCreateServiceImpl instance = (RadioCreateServiceImpl) applicationContext.getBean("radioCreateService");
        List expResult = null;
        List result = instance.loadArtistPictures(artistidList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
