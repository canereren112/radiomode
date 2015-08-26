/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.UserActivationDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.user.UserActivation;
import java.util.Date;
import java.util.List;

/**
 * UserActivation tablosunun DAO su
 * @author work
 */
public class UserActivationDAOImpl extends EntityDAO implements UserActivationDAO {

    public void saveUser(String email, String userName, String password, String activationNumber) {
        UserActivation userActivation = new UserActivation();
        userActivation.setUserName(userName);
        userActivation.setPassword(password);
        userActivation.setEmail(email);
        userActivation.setActivationNumber(activationNumber);
        userActivation.setActivationDate(new Date());
        userActivation.setStatus(UserActivation.Status.WAITING.name());
        getHibernateTemplate().save(userActivation);
    }

    public boolean existsByUserName(String userName) {
        List<Integer> count = getHibernateTemplate().findByNamedQueryAndNamedParam("UserActivation.findByUserName", "userName", userName);
        if(count.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean existsByEmail(String email) {
        List<Integer> count = getHibernateTemplate().findByNamedQueryAndNamedParam("UserActivation.findByEmail", "email", email);
        if(count.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public UserActivation existsByActivationNumber(String activationNumber) {
        List<UserActivation> list = getHibernateTemplate().findByNamedQueryAndNamedParam("UserActivation.findByActivationNumber", "activationNumber", activationNumber);
        if(list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }
}
