/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import java.util.List;

/**
 *
 * @author firat
 */
public class AlbumDAOImplTest extends RadioModeJUnitTest {

    public AlbumDAOImplTest(String testName) {
        super(testName);
    }

    /**
     * Test of searchAlbumsLikeName method, of class AlbumDAOImpl.
     */
    public void testSearchAlbumsLikeName() {
        System.out.println("searchAlbumsLikeName");
        String name = "On Yedi";
        int limit = 5;
        AlbumDAOImpl instance = (AlbumDAOImpl) applicationContext.getBean("albumDAO");
        List expResult = null;
//        List result = instance.searchAlbumsLikeName(name, limit);
        Album result = (Album) instance.loadEntity(Album.class, 1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
