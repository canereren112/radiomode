/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.domain.user.UserPictures;
import com.eren.radiomode.domain.user.UserSimiliar;
import com.eren.radiomode.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author firat
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public boolean existsByUserName(String userName) {
        return entityDAOFactory.getUserDAO().existsByUserName(userName);
    }

    public boolean existsByEmail(String email) {
        return entityDAOFactory.getUserDAO().existsByEmail(email);
    }

    public User getUserByUsername(String userName) {
        return entityDAOFactory.getUserDAO().getUserByUsername(userName);
    }

    public void saveUser(User user) {
        entityDAOFactory.getUserDAO().saveUser(user);
    }

    public String getPasswordByUserName(String userName) {
        return entityDAOFactory.getUserDAO().getPasswordByUserName(userName);
    }

    public boolean savePasswordByUserName(String userName, String password) {
        return entityDAOFactory.getUserDAO().savePasswordByUserName(userName, password);
    }

    public UserNotifications getNotificationsByUsername(String userName) {
        return entityDAOFactory.getUserDAO().getNotificationsByUsername(userName);
    }

    public void saveNotifications(UserNotifications notifications) {
        entityDAOFactory.getUserDAO().saveNotifications(notifications);
    }

    public UserPictures getUserPicture(User user) {
        UserPictures pictures = new UserPictures();
        pictures.setUserid(user);
        List<UserPictures> list = (List<UserPictures>) entityDAOFactory.getUserDAO().loadEntityByParam(pictures);
        if (list != null) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public List<UserActivity> getUserActivity(User user, int first, int max) {
        UserActivity activity = new UserActivity();
        activity.setUserid(user);
        List<UserActivity> activitys = (List<UserActivity>) entityDAOFactory.getUserDAO().loadEntityByParam(activity, first, max, "activityDate");
        return activitys;
    }

    public List<UserActivity> getArtistActivity(Artist artist, int first, int max) {
        UserActivity activity = new UserActivity();
        activity.setEntityid(artist.getArtistid());
        activity.setEntityType(UserActivity.EntityType.ARTIST.name());
        List<UserActivity> activitys = (List<UserActivity>) entityDAOFactory.getArtistDAO().loadEntityByParam(activity, first, max, "activityDate");
        return activitys;
    }

    public List<UserActivity> getSongActivity(Song song, int first, int max) {
        UserActivity activity = new UserActivity();
        activity.setEntityid(song.getSongid());
        activity.setEntityType(UserActivity.EntityType.SONG.name());
        List<UserActivity> activitys = (List<UserActivity>) entityDAOFactory.getArtistDAO().loadEntityByParam(activity, first, max, "activityDate");
        return activitys;
    }

    public List<UserActivity> getAlbumActivity(Album album, int first, int max) {
        UserActivity activity = new UserActivity();
        activity.setEntityid(album.getAlbumid());
        activity.setEntityType(UserActivity.EntityType.ALBUM.name());
        List<UserActivity> activitys = (List<UserActivity>) entityDAOFactory.getArtistDAO().loadEntityByParam(activity, first, max, "activityDate");
        return activitys;
    }

    public List<UserSimiliar> getUserSimiliar(User user, int first, int max) {
        UserSimiliar similiar = new UserSimiliar();
        similiar.setUserid(user);
        List<UserSimiliar> similiars = (List<UserSimiliar>) entityDAOFactory.getUserDAO().loadEntityByParam(similiar, first, max, "percent");
        similiar = new UserSimiliar();
        similiar.setSimiliarUserid(user);
        List<UserSimiliar> similiars2 = (List<UserSimiliar>) entityDAOFactory.getUserDAO().loadEntityByParam(similiar, first, max, "percent");
        similiars.addAll(similiars2);
        return similiars;
    }
}
