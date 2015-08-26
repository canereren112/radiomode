/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.UserDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.dao.util.QueryConstants;
import com.eren.radiomode.domain.user.UserNotifications;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author work
 */
public class UserDAOImpl extends EntityDAO implements UserDAO {

    public boolean existsByUserName(String userName) {
        List<Long> count = getHibernateTemplate().findByNamedQueryAndNamedParam("User.checkByUserName", "userName", userName);
        if (count.get(0).longValue() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean existsByEmail(String email) {
        List<Long> count = getHibernateTemplate().findByNamedQueryAndNamedParam("User.checkByEmail", "email", email);
        if (count.get(0).longValue() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public User getUserByUsername(String userName) {
        List<User> users = getHibernateTemplate().findByNamedQueryAndNamedParam("User.findByUserName", "userName", userName);
//        System.out.println(users.get(0).getPlayingSong().getSongName());
//        System.out.println(users.get(0).getUserPictures().get(0).getLocationNormal());
//        DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
//
//        getHibernateTemplate().initialize(users.get(0));
//        getHibernateTemplate().initialize(users.get(0).getUserPictures());
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    public void saveUser(User user) {
        getHibernateTemplate().saveOrUpdate(user);
    }

    public String getPasswordByUserName(String userName) {
        List<String> password = getHibernateTemplate().findByNamedQueryAndNamedParam("User.findPasswordByUserName",
                "userName", userName);
        if (password.size() > 0) {
            return password.get(0);
        } else {
            return null;
        }
    }

    public boolean savePasswordByUserName(String userName, String password) {
        int result = getHibernateTemplate().bulkUpdate(QueryConstants.updatePasswordByUserName,
                new Object[]{password, userName});
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    public UserNotifications getNotificationsByUsername(String userName) {
        List<UserNotifications> notificationsList = getHibernateTemplate().findByNamedQueryAndNamedParam("UserNotifications.findByUserName",
                "userName", userName);
        if (notificationsList.size() > 0) {
            return notificationsList.get(0);
        } else {
            return null;
        }
    }

    public void saveNotifications(UserNotifications notifications) {
        getHibernateTemplate().saveOrUpdate(notifications);
    }
}
