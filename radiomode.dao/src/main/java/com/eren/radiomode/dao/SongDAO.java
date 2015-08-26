/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.song.SongTags;
import java.util.List;

/**
 *
 * @author work
 */
public interface SongDAO extends IEntityDAO {

    void saveSong(Artist artist, String songName);

    List<Song> getAllSongs();

    Integer getSongsNumberOfAlbum(Integer albumID);
    
    public Integer getSongNumberOfArtist(Integer artistId);

    List<Song> getSongsByArtist(Artist artist);

    List<SongStats> getSongStatsByArtist(Artist artist);

    List<Song> searchSongsLikeName(String name, int limit);

    List<SongStats> getSongsByArtist(Artist artist, int first, int max);

    List<SongTags> getTopSongsByTag(Tag tag, int first, int max);
}
