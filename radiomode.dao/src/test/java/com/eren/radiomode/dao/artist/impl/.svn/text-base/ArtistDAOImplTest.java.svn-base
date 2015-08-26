/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.artist.impl;

import com.eren.radiomode.dao.impl.ArtistDAOImpl;
import com.eren.radiomode.dao.ArtistDAO;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import java.util.List;

/**
 *
 * @author work
 */
public class ArtistDAOImplTest extends RadioModeJUnitTest {

    public ArtistDAOImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of getArtist method, of class ArtistDAOImpl.
     */
    public void DISABLED_testGetArtist() {
        System.out.println("getArtist");
        ArtistDAOImpl instance = new ArtistDAOImpl();
        Artist expResult = null;
        //Artist result = instance.getArtist();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtist method, of class ArtistDAOImpl.
     */
    public void DISABLED_testSetArtist() {
        System.out.println("setArtist");
        Artist artist = null;
        ArtistDAOImpl instance = new ArtistDAOImpl();
        //instance.setArtist(artist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadArtistsLikeName method, of class ArtistDAOImpl.
     */
    public void DISABLED_testLoadArtistsLikeName() {
        System.out.println("loadArtistsLikeName");
        String query = "";
        int limit = 0;
        ArtistDAOImpl instance = new ArtistDAOImpl();
        List expResult = null;
        List result = instance.getArtistsLikeName(query, limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadArtistByName method, of class ArtistDAOImpl.
     */
    public void DISABLED_testLoadArtistByName() {
        System.out.println("loadArtistsLikeName");
        String query = "";
        int limit = 0;
        ArtistDAO instance = (ArtistDAO) applicationContext.getBean("artistDAO");
        List expResult = null;
        Artist result = (Artist) instance.loadEntity(Artist.class, 1);
        result.setName("Teo");
        instance.updateEntity(result);
        //List<Artist> result = instance.loadArtistsLikeName("a", 10);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadArtistByParam method, of class ArtistDAOImpl.
     */
    public void testLoadArtistByParam() {
        System.out.println("loadArtistByParam");

        Artist artist = new Artist();
        //artist.setName("Teoman");
        artist.setArtistid(4);

//        Country country = new Country(null, "TR", "en");
//        artist.setCountryCode(country);

        ArtistDAO instance = (ArtistDAO) applicationContext.getBean("artistDAO");
        List expResult = null;

        List<Artist> result = instance.loadArtistByParam(artist);
        Artist artist2 = (Artist) instance.loadEntity(Artist.class, 4);
        List<Artist> result2 = instance.loadEntityByParam(artist);
        System.out.println("artist: " + artist2.getName());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void DISABLED_testLoadArtistByParamComparision() {
        System.out.println("loadArtistByParam");

        Artist artist = new Artist();
        ArtistDAO instance = (ArtistDAO) applicationContext.getBean("artistDAO");
        List expResult = null;
        long toplam1 = 0, toplam2 = 0, toplam3 = 0, toplam4 = 0, sayac = 0;
        for (int i = 4; i < 14; i++) {
            artist.setArtistid(i);
            sayac = System.currentTimeMillis();
            List<Artist> result2 = instance.loadEntityByParam(artist);
            toplam2 = toplam1 + System.currentTimeMillis() - sayac;
            sayac = System.currentTimeMillis();
            List<Artist> result3 = instance.loadArtistByParam(artist);
            toplam3 = toplam1 + System.currentTimeMillis() - sayac;
            sayac = System.currentTimeMillis();
            Artist result = (Artist) instance.loadEntity(Artist.class, i);
            toplam1 = toplam1 + System.currentTimeMillis() - sayac;
        }

        System.out.println("result: " + toplam1);
        System.out.println("result2: " + toplam2);
        System.out.println("result3: " + toplam3);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
