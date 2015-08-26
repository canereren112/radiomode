/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.service.impl.SongServiceImpl;
import com.eren.radiomode.service.parent.ServiceFactory;
import java.util.List;

/**
 *
 * @author firat
 */
public class SongServiceTest extends RadioModeJUnitTest {

    public SongServiceTest(String testName) {
        super(testName);
    }

    /**
     * Test of saveSong method, of class SongService.
     */
    public void testSaveSong() {
        System.out.println("saveSong");
        Artist artist = null;
        String songName = "";
        SongService instance = new SongServiceImpl();
        instance.saveSong(artist, songName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");


    }

    /**
     * Test of getAllSongs method, of class SongService.
     */
    public void testGetAllSongs() {
        System.out.println("getAllSongs");
        ServiceFactory instance = (ServiceFactory) getApplicationContext().getBean("serviceFactory");
        List<Song> list = instance.getSongService().getAllSongs();
        assertEquals(list, list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");


    }

    /**
     * Test of getSongsByArtist method, of class SongService.
     */
    public void DISABLED_testGetSongsByArtist() {
        System.out.println("getSongsByArtist");
        Artist artist = null;
        SongService instance = new SongServiceImpl();
        List expResult = null;
        List result = instance.getSongsByArtist(artist);
        assertEquals(
                expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");


    }

    /**
     * Test of getSongStatsByArtist method, of class SongService.
     */
    public void DISABLED_testGetSongStatsByArtist() {
        System.out.println("getSongStatsByArtist");
        Artist artist = null;
        SongService instance = new SongServiceImpl();
        List expResult = null;
        List result = instance.getSongStatsByArtist(artist);
        assertEquals(
                expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");


    }

    /**
     * Test of searchSongsLikeName method, of class SongService.
     */
    public void DISABLED_testSearchSongsLikeName() {
        System.out.println("searchSongsLikeName");
        String name = "";


        int limit = 0;
        SongService instance = new SongServiceImpl();
        List expResult = null;
        List result = instance.searchSongsLikeName(name, limit);
        assertEquals(
                expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");


    }

    /**
     * Test of loveSong method, of class SongService.
     */
    public void  DISABLED_testLoveSong() {
        System.out.println("loveSong");
        Integer songid = new Integer(146);
        User user = null;
        ServiceFactory instance = (ServiceFactory) getApplicationContext().getBean("serviceFactory");
        user = instance.getUserService().getUserByUsername("brokensword");
        instance.getSongService().loveSong(songid, user);
        assertEquals(songid, songid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");

    }
}
