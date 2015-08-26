/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.radio.Radio;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.video.Video;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author work
 */
public interface ListenHistoryDAO extends IEntityDAO {

    void saveListenHistory(RadioUsers radioUsersid, Video videoid);

    void updateListenHistory(int id, int listenPercent, int volumePercent, Date listenDate);

    ListenHistory getListenHistory(int id);

    List<ListenHistory> getPastListenHistory(User userid, Radio radioid);

    ListenHistory getNextListenHistory(User userid, Radio radioid);

    List<ListenHistory> getRecentlyListenedSongs(User user, int first, int max);

    List getMostListenedSongs(User user, int first, int max);

    List getMostListenedSongsByArtist(Artist artist, int first, int max);

    List getMostListenedArtists(User user, int first, int max);

    List getMostListenedAlbums(User user, int first, int max);
}
