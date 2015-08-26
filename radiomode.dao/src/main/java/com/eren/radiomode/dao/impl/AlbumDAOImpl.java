/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.AlbumDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.album.AlbumFans;
import com.eren.radiomode.domain.album.AlbumTags;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author work
 */
public class AlbumDAOImpl extends EntityDAO implements AlbumDAO {

    public List<Album> searchAlbumsLikeName(String name, int limit) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Album.class);
        criteria.add(Restrictions.like("albumName", name, MatchMode.ANYWHERE));
        return getHibernateTemplate().findByCriteria(criteria, 0, limit);
    }

    public List<AlbumTags> getTopAlbumsByTag(Tag tag, int first, int max) {
        DetachedCriteria criteria = DetachedCriteria.forClass(AlbumTags.class, "at");
        criteria.createAlias("at.albumid", "a");
        criteria.createAlias("a.albumStats", "as");
        criteria.add(Restrictions.eq("at.tagid", tag));
        criteria.addOrder(Order.desc("as.listenCount"));
        List<AlbumTags> list = getHibernateTemplate().findByCriteria(criteria, first, max);
        return list;
    }

    public Integer getAlbumNumberOfArtist(Integer artistID ) {
        List<Album> albums;
        String query = "SELECT a from Album a where a.artistid = :artistID";
        albums = getSession().createQuery(query).setString("artistID", artistID.toString()).list();
        return albums.size();
    }

    public Integer getFanNumberOfAnAlbum(Integer albumID) {
         List<AlbumFans> albumFans;
        String query = "SELECT f from AlbumFans f where f.albumid = :albumID";
        albumFans = getSession().createQuery(query).setString("albumID", albumID.toString()).list();
        return albumFans.size();
    }
    
    
}
