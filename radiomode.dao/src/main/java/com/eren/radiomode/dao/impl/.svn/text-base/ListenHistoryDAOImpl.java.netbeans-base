/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.ListenHistoryDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.radio.Radio;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.dao.util.QueryConstants;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongFans;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

/**
 *
 * @author work
 */
public class ListenHistoryDAOImpl extends EntityDAO implements ListenHistoryDAO {

    public void saveListenHistory(RadioUsers radioUsersid, Video videoid) {
        ListenHistory listenHistory = new ListenHistory(null, radioUsersid, videoid);
        getHibernateTemplate().save(listenHistory);
    }

    public void updateListenHistory(int id, int listenPercent, int volumePercent, Date listenDate) {
        getHibernateTemplate().bulkUpdate(QueryConstants.updateListenHistory, new Object[]{new Integer(listenPercent),
                    new Integer(volumePercent), listenDate, true, id});
    }

    public ListenHistory getListenHistory(int id) {
        return (ListenHistory) getHibernateTemplate().load(ListenHistory.class, id);
    }

    public List<ListenHistory> getPastListenHistory(User userid, Radio radioid) {
        String[] paramNames = {"userid", "radioid"};
        Object[] paramValues = {userid.getUserid(), radioid.getRadioid()};
        return getHibernateTemplate().findByNamedQueryAndNamedParam("ListenHistory.findByUseridAndRadioid",
                paramNames, paramValues);
    }

    public ListenHistory getNextListenHistory(User userid, Radio radioid) {
        String[] paramNames = {"userid", "radioid"};
        Object[] paramValues = {userid.getUserid(), radioid.getRadioid()};
        getHibernateTemplate().setMaxResults(1);
        List<ListenHistory> historys = getHibernateTemplate().findByNamedQueryAndNamedParam("ListenHistory.findNextByUseridAndRadioid",
                paramNames, paramValues);
        getHibernateTemplate().setMaxResults(0);
        if (historys.size() > 0) {
            return historys.get(0);
        } else {
            return null;
        }
    }

    public List<ListenHistory> getRecentlyListenedSongs(User user, int first, int max) {
        DetachedCriteria criteria = DetachedCriteria.forClass(ListenHistory.class, "listenHistory");
        criteria.createAlias("listenHistory.radioUsersid", "ru");
        criteria.add(Restrictions.eq("ru.userid", user));
        criteria.add(Restrictions.ge("listenHistory.listenPercent", 50));
        criteria.addOrder(Order.desc("listenHistory.listenDate"));
        return getHibernateTemplate().findByCriteria(criteria, first, max);
    }

    public List getMostListenedSongs(User user, int first, int max) {
        // DetachedCriteria criteria = DetachedCriteria.forClass(SongFans.class, "sf");
        //criteria.createAlias(".songid", "s");
        //TODO secilen 10 sarki arasinda gidip o userin songfans i varsa profile de kalp gosterilecek, aynisi album ve artist icin de yapilacak
        DetachedCriteria criteria = DetachedCriteria.forClass(ListenHistory.class, "listenHistory");
        criteria.createAlias("listenHistory.radioUsersid", "ru");
        criteria.createAlias("listenHistory.videoid", "v");
        criteria.createAlias("v.songid", "s");
        criteria.createAlias("s.artistid", "a");
        //criteria.createAlias("s.songFans", "sf", CriteriaSpecification.LEFT_JOIN);
        ProjectionList projList = Projections.projectionList();
        projList.add(Projections.groupProperty("v.songid"));
        projList.add(Projections.count("s.songid"), "count");
        // projList.add(Projections.property("sf.id"));
        criteria.add(Restrictions.eq("ru.userid", user));
        //criteria.add(Restrictions.eq("sf.userid", user));
        //criteria.add(Restrictions.eq("sf.type", SongFans.Type.LIKE.name()));
        criteria.setProjection(projList);
        criteria.add(Restrictions.ge("listenHistory.listenPercent", 50));
        criteria.addOrder(Order.desc("count"));
        List list = getHibernateTemplate().findByCriteria(criteria, first, max);
        return list;
    }

    public List getMostListenedSongsByArtist(Artist artist, int first, int max) {
        // DetachedCriteria criteria = DetachedCriteria.forClass(SongFans.class, "sf");
        //criteria.createAlias(".songid", "s");
        //TODO secilen 10 sarki arasinda gidip o userin songfans i varsa profile de kalp gosterilecek, aynisi album ve artist icin de yapilacak
        DetachedCriteria criteria = DetachedCriteria.forClass(ListenHistory.class, "listenHistory");
        criteria.createAlias("listenHistory.radioUsersid", "ru");
        criteria.createAlias("listenHistory.videoid", "v");
        criteria.createAlias("v.songid", "s");
        criteria.createAlias("s.artistid", "a");
        //criteria.createAlias("s.songFans", "sf", CriteriaSpecification.LEFT_JOIN);
        ProjectionList projList = Projections.projectionList();
        projList.add(Projections.groupProperty("v.songid"));
        projList.add(Projections.count("s.songid"), "count");
        // projList.add(Projections.property("sf.id"));
        criteria.add(Restrictions.eq("s.artistid", artist));
        //criteria.add(Restrictions.eq("sf.userid", user));
        //criteria.add(Restrictions.eq("sf.type", SongFans.Type.LIKE.name()));
        criteria.setProjection(projList);
        criteria.add(Restrictions.ge("listenHistory.listenPercent", 50));
        criteria.addOrder(Order.desc("count"));
        List list = getHibernateTemplate().findByCriteria(criteria, first, max);
        return list;
    }

    public List getMostListenedArtists(User user, int first, int max) {
        DetachedCriteria criteria = DetachedCriteria.forClass(ListenHistory.class, "listenHistory");
        criteria.createAlias("listenHistory.radioUsersid", "ru");
        criteria.createAlias("listenHistory.videoid", "v");
        criteria.createAlias("v.songid", "s");
        criteria.createAlias("s.artistid", "a");
        criteria.add(Restrictions.eq("ru.userid", user));
        ProjectionList projList = Projections.projectionList();
        projList.add(Projections.groupProperty("s.artistid"));
        projList.add(Projections.count("s.artistid"), "count");
        criteria.setProjection(projList);
        criteria.add(Restrictions.ge("listenHistory.listenPercent", 50));
        criteria.addOrder(Order.desc("count"));
        List list = getHibernateTemplate().findByCriteria(criteria, first, max);
//        Iterator it = list.iterator();
//        Map<Artist, Long> artists = new HashMap<Artist, Long>();
//        if (!it.hasNext()) {
//            return null;
//        } else {
//            while (it.hasNext()) {
//                Object[] row = (Object[]) it.next();
//                artists.put((Artist) row[0], (Long) row[1]);
//            }
//        }

        return list;
    }

    public List getMostListenedAlbums(User user, int first, int max) {
        DetachedCriteria criteria = DetachedCriteria.forClass(ListenHistory.class, "listenHistory");
        criteria.createAlias("listenHistory.radioUsersid", "ru");
        criteria.createAlias("listenHistory.videoid", "v");
        criteria.createAlias("v.songid", "s");
        criteria.createAlias("s.artistid", "a");
        //criteria.createAlias("songfans.songid", "sf", CriteriaSpecification.LEFT_JOIN);
        ProjectionList projList = Projections.projectionList();
        projList.add(Projections.groupProperty("s.albumid"));
        projList.add(Projections.count("s.albumid"), "count");
        //projList.add(Projections.property("sf.statsid"));
        criteria.setProjection(projList);
        criteria.add(Restrictions.eq("ru.userid", user));
        //criteria.add(Restrictions.eq("sf.userid", user));
        criteria.add(Restrictions.ge("listenHistory.listenPercent", 50));
        criteria.addOrder(Order.desc("count"));
        List list = getHibernateTemplate().findByCriteria(criteria, first, max);
        return list;
    }
}
