/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.radio.Radio;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.service.ListenHistoryService;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class ListenHistoryServiceImpl implements ListenHistoryService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public void saveListenHistory(RadioUsers radioUsersid, Video videoid) {
        entityDAOFactory.getListenHistoryDAO().saveListenHistory(radioUsersid, videoid);
    }

    public void updateListenHistory(int id, int listenPercent, int volumePercent, Date listenDate) {
        entityDAOFactory.getListenHistoryDAO().updateListenHistory(id, listenPercent, volumePercent, listenDate);
    }

    public ListenHistory getListenHistory(int id) {
        return entityDAOFactory.getListenHistoryDAO().getListenHistory(id);
    }

    public List<ListenHistory> getPastListenHistory(User userid, Radio radioid) {
        return entityDAOFactory.getListenHistoryDAO().getPastListenHistory(userid, radioid);
    }

    public ListenHistory getNextListenHistory(User userid, Radio radioid) {
        return entityDAOFactory.getListenHistoryDAO().getNextListenHistory(userid, radioid);

    }

    public List<ListenHistory> getRecentlyListenedSongs(User user, int first, int max) {
        return entityDAOFactory.getListenHistoryDAO().getRecentlyListenedSongs(user, first, max);
    }

    public List getMostListenedSongs(User user, int first, int max) {
        return entityDAOFactory.getListenHistoryDAO().getMostListenedSongs(user, first, max);
    }

    public List getMostListenedArtists(User user, int first, int max) {
        return entityDAOFactory.getListenHistoryDAO().getMostListenedArtists(user, first, max);
    }

    public List getMostListenedAlbums(User user, int first, int max) {
        return entityDAOFactory.getListenHistoryDAO().getMostListenedAlbums(user, first, max);
    }

    public List getMostListenedSongsByArtist(Artist artist, int first, int max) {
        return entityDAOFactory.getListenHistoryDAO().getMostListenedSongsByArtist(artist, first, max);
    }
}
