/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongFans;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.song.SongTags;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.service.SongService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class SongServiceImpl implements SongService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public void saveSong(Artist artist, String songName) {
        entityDAOFactory.getSongDAO().saveSong(artist, songName);
    }

    public List<Song> getAllSongs() {
        return entityDAOFactory.getSongDAO().getAllSongs();
    }

    public synchronized List<SongStats> getSongswithNoVideos(int first, int max) {
        SongStats song = new SongStats();
        song.setVideoCount(0);
        List<SongStats> songs = entityDAOFactory.getSongDAO().loadEntityByParam(song, first, max, null);
        for (SongStats songStats : songs) {
            songStats.setVideoCount(5);
        }
        entityDAOFactory.getTagDAO().saveEntity(songs);
        return songs;
    }

    public List<Song> getSongsByArtist(Artist artist) {
        return entityDAOFactory.getSongDAO().getSongsByArtist(artist);
    }

    public List<Song> getSongsByAlbum(Album album) {
        Song song = new Song();
        song.setAlbumid(album);
        List<Song> songs = entityDAOFactory.getSongDAO().loadEntityByParam(song, 0, 10, null);
        return songs;
    }

    public List<SongStats> getSongStatsByArtist(Artist artist) {
        return entityDAOFactory.getSongDAO().getSongStatsByArtist(artist);
    }

    public List<SongStats> getSongsOfArtistByPage(Artist artist, Integer pageNumber) {
        if (pageNumber <= 0) {
            pageNumber = 1;
        }

        Integer pageSize = 10;
        Integer firstIndex = ((pageNumber * pageSize) - pageSize);
        return entityDAOFactory.getSongDAO().getSongsByArtist(artist, firstIndex.intValue(), pageSize.intValue());
    }

    public List<SongStats> getTopSongsByArtist(Artist artist, int first, int max) {
        return entityDAOFactory.getSongDAO().getSongsByArtist(artist, first, max);
    }

    public List<Song> searchSongsLikeName(String name, int limit) {
        return entityDAOFactory.getSongDAO().searchSongsLikeName(name, limit);
    }

    public void loveSong(Integer songid, User user) {
        SongFans sf = new SongFans();
        Song song = (Song) entityDAOFactory.getSongDAO().loadEntity(Song.class, songid);
        sf.setSongid(song);
        sf.setUserid(user);
        sf.setType(SongFans.Type.LIKE.name());
        entityDAOFactory.getSongDAO().saveEntity(sf);

        song.getSongStats().setFanCount(song.getSongStats().getFanCount() + 1);
        entityDAOFactory.getSongDAO().saveEntity(song);

        user.getUserStats().setSongLikeCount(user.getUserStats().getSongLikeCount() + 1);
        entityDAOFactory.getUserDAO().saveEntity(user);

        UserActivity activity = new UserActivity();
        activity.setUserid(user);
        activity.setActivityDate(new Date());
        activity.setActivity(user.getUserName() + " loved " + song.getArtistid().getName() + " - " + song.getSongName() + " song");
        activity.setActivityType(UserActivity.ActivityType.LOVE.name());
        activity.setActionType(UserActivity.ActionType.INSERT.name());
        activity.setEntityType(UserActivity.EntityType.SONG.name());
        activity.setEntityid(songid);
        entityDAOFactory.getUserDAO().saveEntity(activity);
    }

    public List<SongTags> getTopSongsByTag(Tag tag, int first, int max) {
        return entityDAOFactory.getSongDAO().getTopSongsByTag(tag, first, max);
    }

    public List<SongStats> getTopSongs(int first, int max) {
        SongStats stats = new SongStats();
        List<SongStats> list = entityDAOFactory.getSongDAO().loadEntityByParam(stats, first, max, "listenCount");
        return list;
    }

    public Integer getNumberOfSongs(Integer albumID) {
        return entityDAOFactory.getSongDAO().getSongsNumberOfAlbum(albumID);
    }

    public List<Song> getSongOfAlbumByPage(Album album, Integer pageNumber) {
        if (pageNumber <= 0) {
            pageNumber = 1;
        }
        Integer pageSize = 10;
        Integer firstIndex = ((pageNumber * pageSize) - pageSize);
        Integer secondIndex = pageNumber * pageSize;
        Song song = new Song();
        song.setAlbumid(album);
        List<Song> songs = entityDAOFactory.getSongDAO().loadEntityByParam(song, firstIndex.intValue(), secondIndex.intValue(), null);
        return songs;
    }

    public Integer getSongNumberOfArtist(Integer artistId) {
        return entityDAOFactory.getSongDAO().getSongNumberOfArtist(artistId);
    }
}
