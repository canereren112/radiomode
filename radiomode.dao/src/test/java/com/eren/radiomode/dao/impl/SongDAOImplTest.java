/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.SongDAO;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import java.util.List;

/**
 *
 * @author firat
 */
public class SongDAOImplTest extends RadioModeJUnitTest {

    public SongDAOImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of saveSong method, of class SongDAOImpl.
     */
    public void DISABLED_testSaveSong() {
        System.out.println("saveSong");
        Artist artist = null;
        String songName = "";
        SongDAOImpl instance = new SongDAOImpl();
        boolean expResult = false;
        instance.saveSong(artist, songName);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSongs method, of class SongDAOImpl.
     */
    public void DISABLED_testGetAllSongs() {
        System.out.println("getAllSongs");
        SongDAOImpl instance = new SongDAOImpl();
        List expResult = null;
        List result = instance.getAllSongs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSongsByArtist method, of class SongDAOImpl.
     */
    public void testGetSongsByArtist() {
        System.out.println("getSongsByArtist");
        Artist artist = new Artist(1);
        SongDAO instance = (SongDAO) applicationContext.getBean("songDAO");
        List expResult = null;
        List result = instance.getSongsByArtist(artist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSongStatsByArtist method, of class SongDAOImpl.
     */
    public void DISABLED_testGetSongStatsByArtist() {
        System.out.println("getSongStatsByArtist");
        Artist artist = null;
        SongDAOImpl instance = new SongDAOImpl();
        List expResult = null;
        List result = instance.getSongStatsByArtist(artist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchSongsLikeName method, of class SongDAOImpl.
     */
    public void DISABLED_testSearchSongsLikeName() {
        System.out.println("searchSongsLikeName");
        String name = "";
        int limit = 0;
        SongDAOImpl instance = new SongDAOImpl();
        List expResult = null;
        List result = instance.searchSongsLikeName(name, limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
