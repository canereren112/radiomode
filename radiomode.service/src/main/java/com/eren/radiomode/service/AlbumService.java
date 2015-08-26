/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.album.AlbumFans;
import com.eren.radiomode.domain.album.AlbumStats;
import com.eren.radiomode.domain.album.AlbumTags;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.user.User;
import java.util.List;

/**
 *
 * @author firat
 */
public interface AlbumService {

    List<Album> searchAlbumsLikeName(String name, int limit);

    List<Album> getAlbumsByArtist(Artist artist, int firstResult, int maxResults);

    void loveAlbum(Integer albumid, User user);
    
    Integer getAlbumNumberOfArtist(Integer artistID);
    
    Integer getFanNumberOfAnAlbum(Integer albumID);

    Album getAlbumByName(String albumName);

    List<AlbumFans> getAlbumFans(Album album, int first, int max);

    List<AlbumTags> getTopAlbumsByTag(Tag tag, int first, int max);

    List<AlbumStats> getTopAlbums(int first, int max);
}
