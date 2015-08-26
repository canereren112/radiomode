/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.echonest.api.v4.Biography;
import com.echonest.api.v4.EchoNestAPI;
import com.echonest.api.v4.EchoNestException;
import com.echonest.api.v4.Image;
import com.eren.radiomode.dao.ArtistDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.artist.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author work
 */
public class ArtistDAOImpl extends EntityDAO implements ArtistDAO {

    public List<Artist> getArtistsLikeName(String query, int limit) {
        getHibernateTemplate().setMaxResults(limit);
        List<Artist> artists = getHibernateTemplate().findByNamedQueryAndNamedParam("Artist.findLikeName",
                "name", query + "%");
        getHibernateTemplate().setMaxResults(0);
        return artists;
    }

    public Artist getArtistByName(String query) {
        List<Artist> artists = getHibernateTemplate().findByNamedQueryAndNamedParam("Artist.findByName",
                "name", query);
        if (artists.size() == 0) {
            return null;
        }
        return artists.get(0);
    }

    public List<Artist> loadArtistByParam(Artist artist) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Artist.class);
        if (artist.getCountryCode() != null) {
            criteria.add(Restrictions.eq("countryCode", artist.getCountryCode()));
        }
        if (artist.getName() != null) {
            criteria.add(Restrictions.eq("name", artist.getName()));
        }
        if (artist.getArtistid() != null) {
            criteria.add(Restrictions.eq("artistid", artist.getArtistid()));
        }
        List<Artist> artists = getHibernateTemplate().findByCriteria(criteria);
        //Country c = artists.get(0).getCountryCode();
        return artists;
    }

    public List<Artist> getAllArtists() {
        List<Artist> artists = getHibernateTemplate().findByNamedQuery("Artist.findAll");
        return artists;
    }

    public List<ArtistPictures> getArtistPictures(List<Integer> artistidList) {
        List<ArtistPictures> list = new ArrayList<ArtistPictures>();
        ArtistPictures pictures = null;
        for (Integer artistid : artistidList) {
            pictures = (ArtistPictures) this.loadEntity(ArtistPictures.class, artistid);
            list.add(pictures);
        }
        return list;
    }

    public List<ArtistPictures> loadArtistPicturesByParam(ArtistPictures pictures) {
        DetachedCriteria criteria = DetachedCriteria.forClass(ArtistPictures.class);
        if (pictures.getArtistid() != null) {
            criteria.add(Restrictions.eq("artistid", pictures.getArtistid()));
        }
        if (pictures.getComment() != null) {
            criteria.add(Restrictions.eq("comment", pictures.getComment()));
        }
        if (pictures.getHeight() != 0) {
            criteria.add(Restrictions.eq("height", pictures.getHeight()));
        }
        if (pictures.getWidth() != 0) {
            criteria.add(Restrictions.eq("width", pictures.getWidth()));
        }
        if (pictures.getSearchIndex() != 0) {
            criteria.add(Restrictions.eq("searchIndex", pictures.getSearchIndex()));
        }
        if (pictures.getLocationBig() != null) {
            criteria.add(Restrictions.eq("locationBig", pictures.getLocationBig()));
        }
        if (pictures.getLocationNormal() != null) {
            criteria.add(Restrictions.eq("locationNormal", pictures.getLocationNormal()));
        }
        if (pictures.getLocationSmall() != null) {
            criteria.add(Restrictions.eq("locationSmall", pictures.getLocationSmall()));
        }
        if (pictures.getUploadDate() != null) {
            criteria.add(Restrictions.eq("uploadedDate", pictures.getUploadDate()));
        }
        if (pictures.getUploadedBy() != null) {
            criteria.add(Restrictions.eq("uploadedBy", pictures.getUploadedBy()));
        }
        if (pictures.isIsDefault() != null) {
            criteria.add(Restrictions.eq("isDefault", pictures.isIsDefault()));
        }

        List<ArtistPictures> allPictures = getHibernateTemplate().findByCriteria(criteria);
        return allPictures;
    }

    public List<ArtistSimiliar> getSimiliarArtists(Map<Integer, String> addedArtists) {
        DetachedCriteria criteria = DetachedCriteria.forClass(ArtistSimiliar.class).
                createAlias("artistid", "a").createAlias("similiarArtistid", "s");
        criteria.add(Restrictions.or(Restrictions.in("a.artistid", addedArtists.keySet()),
                Restrictions.in("s.artistid", addedArtists.keySet())));
        List<ArtistSimiliar> similiars = getHibernateTemplate().findByCriteria(criteria);
        return similiars;
    }

    public List<ArtistSimiliar> getSimiliarArtists(Artist artist, int first, int max) {
        DetachedCriteria criteria = DetachedCriteria.forClass(ArtistSimiliar.class).
                createAlias("artistid", "a").createAlias("similiarArtistid", "s");
        criteria.add(Restrictions.or(Restrictions.eq("artistid", artist),
                Restrictions.eq("similiarArtistid", artist)));
        criteria.addOrder(Order.desc("similiarPercent"));
        List<ArtistSimiliar> similiars = getHibernateTemplate().findByCriteria(criteria, first, max);

        //TODO burasi kaldirilacak
        if (similiars.isEmpty()) {
            searchAndSaveSimiliarArtists(artist);
            criteria = DetachedCriteria.forClass(ArtistSimiliar.class).
                    createAlias("artistid", "a").createAlias("similiarArtistid", "s");
            criteria.add(Restrictions.or(Restrictions.eq("artistid", artist),
                    Restrictions.eq("similiarArtistid", artist)));
            criteria.addOrder(Order.desc("similiarPercent"));
            similiars = getHibernateTemplate().findByCriteria(criteria, first, max);
        }
        return similiars;
    }

    public void searchAndSaveSimiliarArtists(Artist artist) {
        //TODO burasi kaldirilacak sonra
        try {
            EchoNestAPI echoNest = new EchoNestAPI("ITCSHG7EA7QKOQIQL");
            List<com.echonest.api.v4.Artist> artists = echoNest.searchArtists(artist.getName());
            if (artists.size() > 0) {
                com.echonest.api.v4.Artist weezer = artists.get(0);
                System.out.println("Similar artists for " + weezer.getName());
                float percent = 100;
                for (com.echonest.api.v4.Artist simArtist : weezer.getSimilar(100)) {
                    System.out.println("   " + simArtist.getName());
                    Artist otherArtist = getArtistByName(simArtist.getName());
                    if (otherArtist != null) {
                        saveArtistSimliar(artist, otherArtist, percent);
                    }
                    percent--;
                }
            }
        } catch (EchoNestException ex) {
            Logger.getLogger(ArtistDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //TODO burasi kaldirilacak sonra
    public void searchAndSaveSimiliarArtistsByTag(Tag tag) throws EchoNestException {
        ArtistTags artistTags = new ArtistTags();
        artistTags.setTagid(tag);
        List<ArtistTags> artistList = loadEntityByParam(artistTags);
        List<com.echonest.api.v4.Artist> similiars = null;
        EchoNestAPI echoNest = new EchoNestAPI("ITCSHG7EA7QKOQIQL");
        for (ArtistTags artistTag : artistList) {

            Artist artist = artistTag.getArtistid();
            ArtistSimiliar artistSimiliar = new ArtistSimiliar();
            artistSimiliar.setArtistid(artist);
            List<ArtistSimiliar> list = loadEntityByParam(artistSimiliar);
            if (!list.isEmpty()) {
                continue;
            }
            List<com.echonest.api.v4.Artist> artists = null;
            try {
                Thread.sleep(5000);
                artists = echoNest.searchArtists(artist.getName());
            } catch (InterruptedException ex) {
                Logger.getLogger(ArtistDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EchoNestException ex) {
                Logger.getLogger(ArtistDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex1) {
                    Logger.getLogger(ArtistDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            if (artists.size() > 0) {
                com.echonest.api.v4.Artist weezer = artists.get(0);
                System.out.println("Similar artists for " + weezer.getName());
                float percent = 100;
                similiars = weezer.getSimilar(25);
                for (com.echonest.api.v4.Artist simArtist : similiars) {
                    System.out.println("   " + simArtist.getName());
                    Artist otherArtist = getArtistByName(simArtist.getName());
                    if (otherArtist != null) {
                        saveArtistSimliar(artist, otherArtist, percent);
                    }
                    Random random = new Random();
                    int next = random.nextInt(4);
                    percent -= (next + 1);
                }
            }


        }
    }

    public void saveArtistBioAndPicture(Artist artist) {
        EchoNestAPI echoNest = new EchoNestAPI("ITCSHG7EA7QKOQIQL");
        try {
            List<com.echonest.api.v4.Artist> list = echoNest.searchArtists(artist.getName());
            if (!list.isEmpty()) {
                List<Image> images = list.get(0).getImages();
                if (!images.isEmpty()) {
                    artist.setPictureSmall(images.get(0).getURL());
                }
                List<Biography> bios = list.get(0).getBiographies();
                if (!images.isEmpty()) {
                    artist.setBiography(bios.get(0).getText());
                    artist.setBioSource(bios.get(0).getURL());
                }
                if (!images.isEmpty() || !images.isEmpty()) {
                    this.saveEntity(artist);
                }
            }
        } catch (EchoNestException ex) {
            Logger.getLogger(ArtistDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveArtist(String name, Country countryCode) {
        Artist artist = new Artist();
        artist.setName(name);
        artist.setCountryCode(countryCode);
        this.saveEntity(artist);
        ArtistStats stats = new ArtistStats();
        stats.setArtistid(artist);
        this.saveEntity(stats);
    }

    public void saveArtistStats() {
        List<Artist> artists = getHibernateTemplate().findByNamedQuery("Artist.findAll");
        ArtistStats stats2 = new ArtistStats();
        List<ArtistStats> list = this.loadEntityByParam(stats2);
        if (list == null || list.size() == 0) {
            for (Artist artist : artists) {
                ArtistStats stats = new ArtistStats();
                stats.setArtistid(artist);
                stats.setAlbumCount(new Integer(0));
                stats.setBlockCount(new Integer(0));
                stats.setCommentCount(new Integer(0));
                stats.setFanCount(new Integer(0));
                stats.setListenCount(new Integer(0));
                stats.setSongCount(new Integer(0));
                stats.setStationCount(new Integer(0));
                this.saveEntity(stats);
            }
        }
    }

    public void saveArtistPictures(List<ArtistPictures> artistPictures) {
        for (ArtistPictures ap : artistPictures) {
            getHibernateTemplate().save(ap);
        }
    }

    public void saveArtistSimliar(Artist artist, Artist artist2, float percent) {
        ArtistSimiliar artistSimiliar = new ArtistSimiliar();
        artistSimiliar.setArtistid(artist);
        artistSimiliar.setSimiliarArtistid(artist2);
        List<ArtistSimiliar> list = loadEntityByParam(artistSimiliar);
        artistSimiliar.setSimiliarPercent(Integer.parseInt(String.valueOf((int) percent)));
        getHibernateTemplate().save(artistSimiliar);
    }

    public List<Artist> searchArtistsLikeName(String name, int limit) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Artist.class);
        criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
        return getHibernateTemplate().findByCriteria(criteria, 0, limit);
    }

    public List<ArtistTags> getTopArtistsByTag(Tag tag, int first, int max) {
        DetachedCriteria criteria = DetachedCriteria.forClass(ArtistTags.class, "at");
        criteria.createAlias("at.artistid", "a");
        criteria.createAlias("a.artistStats", "as");
        criteria.add(Restrictions.eq("at.tagid", tag));
        criteria.addOrder(Order.desc("as.listenCount"));
        List<ArtistTags> list = getHibernateTemplate().findByCriteria(criteria, first, max);
        return list;
    }

    public Integer getSimiliarArtistNumberOfAnArtist(Integer artistID) {
        List<ArtistSimiliar> similiarArtists;
        String query = "SELECT s from ArtistSimiliar s where s.artistid = :artistID";
        similiarArtists = getSession().createQuery(query).setString("artistID", artistID.toString()).list();
        return similiarArtists.size();
    }

    public Integer getFanNumberOfAnArtist(Integer artistID) {
        List<ArtistFans> artistFans;
        String query = "SELECT f from ArtistFans f where f.artistid = :artistID";
        artistFans = getSession().createQuery(query).setString("artistID", artistID.toString()).list();
        return artistFans.size();
    }

  
}
