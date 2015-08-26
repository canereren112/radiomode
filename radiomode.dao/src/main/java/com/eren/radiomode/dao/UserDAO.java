/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserNotifications;

/**
 *
 * @author work
 */
public interface UserDAO extends IEntityDAO {

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
}
