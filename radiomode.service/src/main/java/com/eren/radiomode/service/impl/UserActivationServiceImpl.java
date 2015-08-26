/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.user.UserActivation;
import com.eren.radiomode.service.UserActivationService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserActivation tablosunun DAO su
 * @author work
 */
public class UserActivationServiceImpl implements UserActivationService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public void saveUser(String email, String userName, String password, String activationNumber) {
        entityDAOFactory.getUserActivationDAO().saveUser(email, userName, password, activationNumber);
    }

    public boolean existsByUserName(String userName) {
        return entityDAOFactory.getUserActivationDAO().existsByUserName(userName);
    }

    public boolean existsByEmail(String email) {
        return entityDAOFactory.getUserActivationDAO().existsByEmail(email);
    }

    public UserActivation existsByActivationNumber(String activationNumber) {
        return entityDAOFactory.getUserActivationDAO().existsByActivationNumber(activationNumber);
    }
}
