/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.recommend.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.domain.video.VideoStats;
import com.eren.radiomode.recommend.PlayRecommender;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.google.gdata.util.ServiceException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Kullanici radyo listesi icin sarki onerir
 * @author work
 */
public class PlayRecommenderImpl implements PlayRecommender {

    private List<RadioArtistsAll> radioArtistsAll;
    private int playPercentSum;
    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }
    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<RadioArtistsAll> getRadioArtistsAll() {
        return radioArtistsAll;
    }

    public void setRadioArtistsAll(List<RadioArtistsAll> radioArtistsAll) {
        this.radioArtistsAll = radioArtistsAll;
    }

    public int getPlayPercentSum() {
        return playPercentSum;
    }

    public void setPlayPercentSum(int playPercentSum) {
        this.playPercentSum = playPercentSum;
    }

    public Video recommendNextVideo() {
        Artist artist = recommendArtist();
        if (artist == null) {
            return null;
        }
        Song song = recommendSong(artist);
        if (song == null) {
            return null;
        }
        Video video = recommendVideo(song);
        if (video == null) {
            try {
                serviceFactory.getVideoService().saveYoutubeVideoBySong(song);
            } catch (IOException ex) {
                Logger.getLogger(PlayRecommenderImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ServiceException ex) {
                Logger.getLogger(PlayRecommenderImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            video = recommendVideo(song);
            if (video == null) {
                return null;
            }
        }
        return video;
    }

    private Artist recommendArtist() {
        if (playPercentSum == 0) {
            for (RadioArtistsAll artistsAll : radioArtistsAll) {
                playPercentSum += artistsAll.getPlayPercent();
            }
        }
        java.util.Random random = new Random();
        int randomInt = random.nextInt(playPercentSum);
        for (RadioArtistsAll artistsAll : radioArtistsAll) {
            randomInt -= artistsAll.getPlayPercent();
            if (randomInt < 0) {
                return artistsAll.getArtistid();
            }
        }
        return null;
    }

    private Song recommendSong(Artist artist) {
        //TODO duzeltilecek
        List<SongStats> songStatses = entityDAOFactory.getSongDAO().getSongStatsByArtist(artist);
        if (songStatses.size() == 0) {
            return null;
        }
        int popularPercentSum = 0;
        for (SongStats songStats : songStatses) {
            popularPercentSum += songStats.getPopularPercent();
        }

        java.util.Random random = new Random();
        int randomInt = random.nextInt(popularPercentSum);

        for (SongStats songStats : songStatses) {
            randomInt -= songStats.getPopularPercent();
            if (randomInt < 0) {
                return songStats.getSongid();
            }
        }
        return null;
    }

    private Video recommendVideo(Song song) {
        //TODO duzeltilecek
        List<VideoStats> videoStatses = entityDAOFactory.getVideoDAO().getVideoStatsBySong(song);
        if (videoStatses.size() == 0) {
            return null;
        }
        int popularPercentSum = 0;
        for (VideoStats videoStats : videoStatses) {
            popularPercentSum += videoStats.getPopularPercent();
        }

        java.util.Random random = new Random();
        int randomInt = random.nextInt(popularPercentSum);

        //TODO sonra duzeltilecek, simdilik ilk video çekiliyor
        for (VideoStats videoStats : videoStatses) {
//            randomInt -= videoStats.getPopularPercent();
//            if (randomInt < 0) {
//                return videoStats.getVideoid();
//            }
            if (videoStats.getVideoid().getSearchIndex() == 1) {
                return videoStats.getVideoid();
            }
        }
        return null;
    }
}
