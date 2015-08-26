/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.recommend.impl;

import com.eren.radiomode.dao.RadioDAO;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.recommend.PlayRecommender;
import java.util.List;

/**
 *
 * @author work
 */
public class PlayRecommenderImplTest extends RadioModeJUnitTest {

    public PlayRecommenderImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of getRadioArtistsAll method, of class PlayRecommenderImpl.
     */
    public void DISABLED_testGetRadioArtistsAll() {
        System.out.println("getRadioArtistsAll");
        PlayRecommenderImpl instance = new PlayRecommenderImpl();
        List expResult = null;
        List result = instance.getRadioArtistsAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadioArtistsAll method, of class PlayRecommenderImpl.
     */
    public void DISABLED_testSetRadioArtistsAll() {
        System.out.println("setRadioArtistsAll");
        List<RadioArtistsAll> radioArtistsAll = null;
        PlayRecommenderImpl instance = new PlayRecommenderImpl();
        instance.setRadioArtistsAll(radioArtistsAll);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayPercentSum method, of class PlayRecommenderImpl.
     */
    public void DISABLED_testGetPlayPercentSum() {
        System.out.println("getPlayPercentSum");
        PlayRecommenderImpl instance = new PlayRecommenderImpl();
        int expResult = 0;
        int result = instance.getPlayPercentSum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayPercentSum method, of class PlayRecommenderImpl.
     */
    public void DISABLED_testSetPlayPercentSum() {
        System.out.println("setPlayPercentSum");
        int playPercentSum = 0;
        PlayRecommenderImpl instance = new PlayRecommenderImpl();
        instance.setPlayPercentSum(playPercentSum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recommendNextVideo method, of class PlayRecommenderImpl.
     */
    public void testRecommendNextVideo() {
        System.out.println("recommendNextVideo");
        RadioDAO radioArtistsAllDAO = (RadioDAO) applicationContext.getBean("radioDAO");
        List<RadioArtistsAll> artistsAll = radioArtistsAllDAO.getRadioArtistsAll(1);
        PlayRecommender playRecommender = (PlayRecommender) getApplicationContext().getBean("playRecommender");
        playRecommender.setRadioArtistsAll(artistsAll);
        Video result = playRecommender.recommendNextVideo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
