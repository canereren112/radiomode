/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.echonest.api.v4.EchoNestException;
import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.album.AlbumFans;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.artist.ArtistFans;
import com.eren.radiomode.domain.artist.ArtistPictures;
import com.eren.radiomode.domain.artist.ArtistSimiliar;
import com.eren.radiomode.domain.artist.ArtistStats;
import com.eren.radiomode.domain.artist.ArtistTags;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.service.ArtistService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<Artist> getArtistsLikeName(String query, int limit) {
        return entityDAOFactory.getArtistDAO().getArtistsLikeName(query, limit);
    }

    public Artist getArtistByName(String query) {
//        Artist artist = new Artist();
//        artist.setName(query);
//        List<Artist> list = (List<Artist>) entityDAOFactory.getArtistDAO().loadEntityByParam(artist);
//        if (list.size() > 0) {
//            return list.get(0);
//        }
//        return null;
        return entityDAOFactory.getArtistDAO().getArtistByName(query);
    }

    public List<Artist> loadArtistByParam(Artist artist) {
        return entityDAOFactory.getArtistDAO().loadArtistByParam(artist);
    }

    public List<Artist> getAllArtists() {
        return entityDAOFactory.getArtistDAO().getAllArtists();
    }

    public List<ArtistPictures> getArtistPictures(List<Integer> artistidList) {
        return entityDAOFactory.getArtistDAO().getArtistPictures(artistidList);
    }

    public List<ArtistTags> getArtistTags(Artist artist) {
        ArtistTags artistTags = new ArtistTags();
        artistTags.setArtistid(artist);
        List<ArtistTags> artistList = entityDAOFactory.getTagDAO().loadEntityByParam(artistTags);
        return artistList;
    }

    public ArtistPictures getDefaultArtistPicture(Artist artist) {
        ArtistPictures pictures = new ArtistPictures();
        pictures.setArtistid(artist);
        pictures.setIsDefault(Boolean.TRUE);
        List<ArtistPictures> list = entityDAOFactory.getArtistDAO().loadEntityByParam(pictures);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public List<ArtistPictures> loadArtistPicturesByParam(ArtistPictures pictures) {
        return entityDAOFactory.getArtistDAO().loadArtistPicturesByParam(pictures);
    }

    public List<ArtistSimiliar> getSimiliarArtists(Map<Integer, String> addedArtists) {
        return entityDAOFactory.getArtistDAO().getSimiliarArtists(addedArtists);
    }

    public List<ArtistSimiliar> getSimiliarArtists(Artist artist, int first, int max) {
        return entityDAOFactory.getArtistDAO().getSimiliarArtists(artist, first, max);
    }

    public void saveArtist(String name, Country countryCode) {
        entityDAOFactory.getArtistDAO().saveArtist(name, countryCode);
    }

    public void saveArtistPictures(List<ArtistPictures> artistPictures) {
        entityDAOFactory.getArtistDAO().saveArtistPictures(artistPictures);
    }

    public void saveArtistSimliar(Artist artist, Artist artist2, float percent) {
        entityDAOFactory.getArtistDAO().saveArtistSimliar(artist, artist2, percent);
    }

    public List<Artist> searchArtistsLikeName(String name, int limit) {
        return entityDAOFactory.getArtistDAO().searchArtistsLikeName(name, limit);
    }

    public void loveArtist(Integer artistid, User user) {
        //TODO bu kullanicinin radyolarindaki ilgili artistin percent i 100 yapilacak.
        ArtistFans af = new ArtistFans();
        Artist artist = (Artist) entityDAOFactory.getSongDAO().loadEntity(Artist.class, artistid);
        af.setArtistid(artist);
        af.setUserid(user);
        af.setType(AlbumFans.Type.LIKE.name());
        entityDAOFactory.getSongDAO().saveEntity(af);

        artist.getArtistStats().setFanCount(artist.getArtistStats().getFanCount() + 1);
        entityDAOFactory.getArtistDAO().saveEntity(artist);

        user.getUserStats().setArtistLikeCount(user.getUserStats().getArtistLikeCount() + 1);
        entityDAOFactory.getUserDAO().saveEntity(user);

        UserActivity activity = new UserActivity();
        activity.setUserid(user);
        activity.setActivityDate(new Date());
        activity.setActivity(user.getUserName() + " loved " + artist.getName());
        activity.setActivityType(UserActivity.ActivityType.LOVE.name());
        activity.setActionType(UserActivity.ActionType.INSERT.name());
        activity.setEntityType(UserActivity.EntityType.ARTIST.name());
        activity.setEntityid(artistid);
        entityDAOFactory.getUserDAO().saveEntity(activity);
    }

    public void blockArtist(Integer artistid, User user) {
        //TODO bu kullanicinin radyolarindaki ilgili artistin percent i 0 yapilacak.
        ArtistFans af = new ArtistFans();
        Artist artist = (Artist) entityDAOFactory.getSongDAO().loadEntity(Artist.class, artistid);
        af.setArtistid(artist);
        af.setUserid(user);
        af.setType(AlbumFans.Type.DISLIKE.name());
        entityDAOFactory.getSongDAO().saveEntity(af);

        artist.getArtistStats().setFanCount(artist.getArtistStats().getFanCount() + 1);
        entityDAOFactory.getArtistDAO().saveEntity(artist);

        user.getUserStats().setArtistLikeCount(user.getUserStats().getArtistLikeCount() + 1);
        entityDAOFactory.getUserDAO().saveEntity(user);

        UserActivity activity = new UserActivity();
        activity.setUserid(user);
        activity.setActivityDate(new Date());
        activity.setActivity(user.getUserName() + " blocked " + artist.getName());
        activity.setActivityType(UserActivity.ActivityType.LOVE.name());
        activity.setActionType(UserActivity.ActionType.INSERT.name());
        activity.setEntityType(UserActivity.EntityType.ARTIST.name());
        activity.setEntityid(artistid);
        entityDAOFactory.getUserDAO().saveEntity(activity);
    }

    public List<ArtistFans> getArtistFans(Artist artist, int first, int max) {
        ArtistFans artistFans = new ArtistFans();
        artistFans.setArtistid(artist);
        artistFans.setType(ArtistFans.Type.LIKE.name());
        List<ArtistFans> fans = entityDAOFactory.getArtistDAO().loadEntityByParam(artistFans, first, max, "id");
        return fans;
    }

    public void searchAndSaveSimiliarArtistsByTag(Tag tag) throws EchoNestException {
        entityDAOFactory.getArtistDAO().searchAndSaveSimiliarArtistsByTag(tag);
    }

    public void searchAndSaveSimiliarArtists(Artist artist) {
        entityDAOFactory.getArtistDAO().searchAndSaveSimiliarArtists(artist);
    }

    public void saveArtistBioAndPicture(Artist artist) {
        entityDAOFactory.getArtistDAO().saveArtistBioAndPicture(artist);
    }

    public List<RadioArtistsAll> getRecommendedArtists(User user, int first, int max) {
        List<RadioUsers> list = entityDAOFactory.getRadioDAO().getAllRadios(user.getUserName());
        List<RadioArtistsAll> recommendedArtists = new ArrayList<RadioArtistsAll>();
        for (RadioUsers ru : list) {
            RadioArtistsAll param = new RadioArtistsAll();
            param.setRadioid(ru.getRadioid());
            List<RadioArtistsAll> all = entityDAOFactory.getRadioDAO().loadEntityByParam(param, first, max, "playPercent");
            for (RadioArtistsAll radioArtist : all) {
                //TODO burasi duzeltilecek, eger varsa ortalaması alinacak
                if (!recommendedArtists.contains(radioArtist)) {
                    ArtistFans fans = new ArtistFans();
                    fans.setArtistid(radioArtist.getArtistid());
                    fans.setUserid(user);
                    List<ArtistFans> afs = entityDAOFactory.getRadioDAO().loadEntityByParam(fans);
                    if (afs.isEmpty()) {
                        recommendedArtists.add(radioArtist);
                    }
                }
            }
        }
        recommendedArtists = recommendedArtists.subList(0, max);
        return recommendedArtists;
    }

    public List<ArtistTags> getTopArtistsByTag(Tag tag, int first, int max) {
        return entityDAOFactory.getArtistDAO().getTopArtistsByTag(tag, first, max);
    }

    public List<ArtistStats> getTopArtists(int first, int max) {
        ArtistStats stats = new ArtistStats();
        List<ArtistStats> list = entityDAOFactory.getArtistDAO().loadEntityByParam(stats, first, max, "listenCount");
        return list;
    }

    public Integer getSimiliarArtistNumberOfAnArtist(Integer artistID) {
        return entityDAOFactory.getArtistDAO().getSimiliarArtistNumberOfAnArtist(artistID);

    }

    public Integer getFanNumberOfAnArtist(Integer artistID) {
        return entityDAOFactory.getArtistDAO().getFanNumberOfAnArtist(artistID);
    }
}
