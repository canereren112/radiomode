/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.artist.ArtistPictures;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.user.User;
import java.util.List;
import java.util.Map;

/**
 *
 * @author work
 */
public interface RadioCreateService {

    /**
     * Artist autocomplete icin benzer sarkicilari dondurur
     * @param query sarkici adi sorgusu
     * @param limit limit
     * @return sarkici listesi
     */
    List<Artist> loadArtistsLikeName(String query, int limit);

    /**
     * Eklenen ve bloklanan sanatcilara gore ortalama benzer sarkicilari dondurur
     * @param addedArtists eklenen sanatcilar
     * @param blockedArtists bloklanan sanatcilar
     * @return RadioArtistsAll listesi
     */
    List<RadioArtistsAll> loadSimiliarArtists(Map<Integer, String> addedArtists, Map<Integer, String> blockedArtists);

    /**
     * Artist adina gore dondurur
     * @param artistName artist adi
     * @return Artist nesnesi
     */
    Artist loadArtist(String artistName);

    /**
     * Sanatci resilerini dondurur
     * @param artistidList sanatci id listesi
     * @return ArtistPictures listesi
     */
    List<ArtistPictures> loadArtistPictures(List<Integer> artistidList);

    void createArtistRadio(Artist artist, User user);
}
