/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.recommend.PlayRecommender;
import com.eren.radiomode.service.RadioPlayService;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationObjectSupport;

/**
 *
 * @author work
 */
public class RadioPlayServiceImpl extends WebApplicationObjectSupport implements RadioPlayService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<RadioUsers> getRadioUsers(String userName) {
        return entityDAOFactory.getRadioDAO().getAllRadios(userName);
    }

    public ListenHistory loadNextVideo(String userName, String radioidStr) {
        RadioUsers radioUsers = null;
        if (radioidStr.equals(RadioUsers.DEFAULT_STRING)) {
            radioUsers = entityDAOFactory.getRadioDAO().getDefaultRadioByUserName(userName);
        } else {
            radioUsers = entityDAOFactory.getRadioDAO().getRadio(userName, Integer.valueOf(radioidStr));
        }

        ListenHistory listenHistory = entityDAOFactory.getListenHistoryDAO().getNextListenHistory(radioUsers.getUserid(),
                radioUsers.getRadioid());
        if (listenHistory == null) {
            addNextVideos(userName, radioUsers.getRadioid().getRadioid());
            listenHistory = entityDAOFactory.getListenHistoryDAO().getNextListenHistory(radioUsers.getUserid(),
                    radioUsers.getRadioid());
        }

        return listenHistory;
    }

    public void updateLastVideo(int id, int listenPercent, int volumePercent) {
        entityDAOFactory.getListenHistoryDAO().updateListenHistory(id, listenPercent, volumePercent, new Date());
    }

    public boolean addNextVideos(String userName, Integer radioid) {
        List<RadioArtistsAll> artistsAll = entityDAOFactory.getRadioDAO().getRadioArtistsAll(radioid);
        if (artistsAll.size() == 0) {
            return false;
        }
        PlayRecommender playRecommender = (PlayRecommender) getApplicationContext().getBean("playRecommender");
        playRecommender.setRadioArtistsAll(artistsAll);
        boolean resultAll = true;
        for (int i = 0; i < 5; i++) {
            Video video = playRecommender.recommendNextVideo();
            if (video == null) {
                resultAll = false;
                continue;
            } else {
                System.out.println(video.getSearchIndex() + ": " + video.getSongid().getArtistid().getName()
                        + " song: " + video.getSongid().getSongName());
                System.out.println("");
                System.out.println("------");
                System.out.println("");
            }
            RadioUsers radioUsers = entityDAOFactory.getRadioDAO().getRadio(userName, radioid);
            boolean result = true;
            try {
                entityDAOFactory.getListenHistoryDAO().saveListenHistory(radioUsers, video);
            } catch (Exception ex) {
                result = false;
            }
            resultAll &= result;
        }
        return resultAll;
    }
}
