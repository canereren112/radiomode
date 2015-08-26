/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.echonest.api.v4.EchoNestException;
import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.artist.ArtistPictures;
import com.eren.radiomode.domain.artist.ArtistSimiliar;
import com.eren.radiomode.domain.artist.ArtistTags;
import java.util.List;
import java.util.Map;

/**
 *
 * @author work
 */
public interface ArtistDAO extends IEntityDAO {

    /**
     * Artist autocomplete icin benzer sarkicilari dondurur
     * @param query sarkici adi sorgusu
     * @param limit limit
     * @return sarkici listesi
     */
    List<Artist> getArtistsLikeName(String query, int limit);

    List<Artist> searchArtistsLikeName(String name, int limit);

    /**
     * Artist adina gore dondurur
     * @param query artist adi
     * @return Artist nesnesi
     */
    Artist getArtistByName(String query);

    List<Artist> loadArtistByParam(Artist artist);

    List<Artist> getAllArtists();

    /**
     * Istenen sanatcilarin resimlerini dondurur
     * @param artistidList sanatci id listesi
     * @return ArtistPictures listesi
     */
    List<ArtistPictures> getArtistPictures(List<Integer> artistidList);

    List<ArtistPictures> loadArtistPicturesByParam(ArtistPictures pictures);

    List<ArtistSimiliar> getSimiliarArtists(Map<Integer, String> addedArtists);

    List<ArtistSimiliar> getSimiliarArtists(Artist artist, int first, int max);

    void saveArtist(String name, Country countryCode);

    void saveArtistPictures(List<ArtistPictures> artistPictures);

    void saveArtistSimliar(Artist artist, Artist artist2, float percent);

     public void searchAndSaveSimiliarArtistsByTag(Tag tag) throws EchoNestException;

     void searchAndSaveSimiliarArtists(Artist artist);

     void saveArtistBioAndPicture(Artist artist);

     List<ArtistTags> getTopArtistsByTag(Tag tag, int first, int max);

    Integer getSimiliarArtistNumberOfAnArtist(Integer artistID);

    Integer getFanNumberOfAnArtist(Integer artistID);
}
