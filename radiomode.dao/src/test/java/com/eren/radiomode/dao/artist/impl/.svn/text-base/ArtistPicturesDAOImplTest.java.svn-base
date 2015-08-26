/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.artist.impl;

import com.eren.radiomode.dao.impl.ArtistDAOImpl;
import com.eren.radiomode.domain.artist.ArtistPictures;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import java.util.List;

/**
 *
 * @author work
 */
public class ArtistPicturesDAOImplTest extends RadioModeJUnitTest {

    public ArtistPicturesDAOImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of loadArtistPictures method, of class ArtistPicturesDAOImpl.
     */
    public void DISABLED_testLoadArtistPictures() {
        System.out.println("loadArtistPictures");
        List<Integer> artistidList = null;
        ArtistDAOImpl instance = new ArtistDAOImpl();
        List expResult = null;
        List result = instance.getArtistPictures(artistidList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadArtistByParam method, of class ArtistPicturesDAOImpl.
     */
    public void DISABLED_testLoadArtistByParam() {
        System.out.println("loadArtistByParam");
        ArtistPictures pictures = new ArtistPictures();
        //pictures.setWidth(503);
        //pictures.setIsDefault(true);
        pictures.setUploadedBy("FIRAT");
        ArtistDAOImpl instance = (ArtistDAOImpl) applicationContext.getBean("artistDAO");
        List expResult = null;

        List result = instance.loadArtistPicturesByParam(pictures);
        List result2 = instance.loadEntityByParam(pictures);
        List result3 = instance.loadEntityByExample(pictures);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
