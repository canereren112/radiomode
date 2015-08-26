/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.ViewProfileService;
import com.eren.radiomode.service.exception.RadioModeException;
import com.eren.radiomode.service.util.UtilImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class ViewProfileServiceImpl implements ViewProfileService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public User loadProfileMain(String userName) {
        User user = entityDAOFactory.getUserDAO().getUserByUsername(userName);
        if (user == null) {
            String info = " info: userName=" + userName;
            throw new RadioModeException(UtilImpl.loadMessageProperty("error.user.not.found") + info);
        }
        return user;
    }
}
