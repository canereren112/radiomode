/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.domain.user.UserPictures;
import com.eren.radiomode.domain.user.UserSimiliar;
import java.util.List;

/**
 *
 * @author work
 */
public interface UserService {

    /**
     * kullanici adi kontrolu yapar
     * @param userName kullanici adi
     * @return var/yok
     */
    boolean existsByUserName(String userName);

    /**
     * eposta kontrolu yapar
     * @param email eposta
     * @return var/yok
     */
    boolean existsByEmail(String email);

    /**
     * kullanici adina gore User nesnesini dondurur
     * @param userName kullanici adi
     * @return User nesnesi
     */
    User getUserByUsername(String userName);

    void saveUser(User user);

    String getPasswordByUserName(String userName);

    boolean savePasswordByUserName(String userName, String password);

    UserNotifications getNotificationsByUsername(String userName);

    void saveNotifications(UserNotifications notifications);

    UserPictures getUserPicture(User user);

    List<UserActivity> getUserActivity(User user, int first, int max);

    List<UserActivity> getArtistActivity(Artist artist, int first, int max);

    List<UserActivity> getSongActivity(Song song, int first, int max);

    List<UserActivity> getAlbumActivity(Album album, int first, int max);

    public List<UserSimiliar> getUserSimiliar(User user, int first, int max);
}
