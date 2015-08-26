/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.SongDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.song.SongTags;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author work
 */
public class SongDAOImpl extends EntityDAO implements SongDAO {

    public void saveSong(Artist artist, String songName) {
        Song song = new Song();
        song.setArtistid(artist);
        song.setSongName(songName);
        getHibernateTemplate().save(song);
    }

    public List<Song> getAllSongs() {
        return getHibernateTemplate().findByNamedQuery("Song.findAll");
    }

    public List<Song> getSongsByArtist(Artist artist) {
        return getHibernateTemplate().findByNamedQueryAndNamedParam("Song.findByArtistid", "artistid",
                artist.getArtistid());
    }

    public List<SongStats> getSongStatsByArtist(Artist artist) {
        //TODO burasi uncommentlenip digeri acilacak
//        return getHibernateTemplate().findByNamedQueryAndNamedParam("SongStats.findByArtistid", "artistid",
//                artist.getArtistid());
        return getHibernateTemplate().findByNamedQueryAndNamedParam("SongStats.findNoVideosByArtistid", "artistid",
                artist.getArtistid());
    }

    public List<SongStats> getSongsByArtist(Artist artist, int first, int count) {
        DetachedCriteria criteria = DetachedCriteria.forClass(SongStats.class, "ss");
        criteria.createAlias("ss.songid", "s");
        criteria.add(Restrictions.eq("s.artistid", artist));
        criteria.addOrder(Order.desc("listenCount"));
        List<SongStats> list = getHibernateTemplate().findByCriteria(criteria, first, count);
        return list;
    }

    public List<Song> searchSongsLikeName(String name, int limit) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Song.class);
        criteria.add(Restrictions.like("songName", name, MatchMode.ANYWHERE));
        return getHibernateTemplate().findByCriteria(criteria, 0, limit);
    }

    public List<SongTags> getTopSongsByTag(Tag tag, int first, int max) {
        DetachedCriteria criteria = DetachedCriteria.forClass(SongTags.class, "at");
        criteria.createAlias("at.songid", "a");
        criteria.createAlias("a.songStats", "as");
        criteria.add(Restrictions.eq("at.tagid", tag));
        criteria.addOrder(Order.desc("as.listenCount"));
        List<SongTags> list = getHibernateTemplate().findByCriteria(criteria, first, max);
        return list;
    }

    public Integer getSongsNumberOfAlbum(Integer albumID) {
        List<Song> songs;
        String query = "SELECT s from Song s where s.albumid = :albumID";
        songs = getSession().createQuery(query).setString("albumID", albumID.toString()).list();
        return songs.size();
    }

    public Integer getSongNumberOfArtist(Integer artistId) {
        List<Song> songs;
        String query = "SELECT s from Song s where s.artistid = :artistId";
        songs = getSession().createQuery(query).setString("artistId", artistId.toString()).list();
        return songs.size();
    }
}
