/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.EditProfileService;
import com.eren.radiomode.dao.util.Constants;
import com.eren.radiomode.service.exception.RadioModeException;
import com.eren.radiomode.service.util.UtilImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class EditProfileServiceImpl implements EditProfileService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<Country> loadCountryList() {
        return entityDAOFactory.getCountryDAO().getCountryByDisplayLangCode(Constants.EN_LANG);
    }

    public User loadGeneralProfile(String userName) {
        User user = entityDAOFactory.getUserDAO().getUserByUsername(userName);
        if (user == null) {
            String info = " info: userName=" + userName;
            throw new RadioModeException(UtilImpl.loadExceptionProperty("error.user.not.found") + info);
        }
        return user;
    }

    public void editGeneralProfile(User user, String countryCode) throws Exception {
        Country country = entityDAOFactory.getCountryDAO().getCountryByCountryCode(countryCode);
        user.setCountry(country);
        entityDAOFactory.getUserDAO().saveUser(user);
        }

    public String loadPassword(String userName) {
        return entityDAOFactory.getUserDAO().getPasswordByUserName(userName);
    }

    public boolean savePassword(String userName, String password) {
        return entityDAOFactory.getUserDAO().savePasswordByUserName(userName, password);
    }

    public UserNotifications loadNotifications(String userName) {
        return entityDAOFactory.getUserDAO().getNotificationsByUsername(userName);
    }

    public void saveNotifications(UserNotifications notifications) {
        entityDAOFactory.getUserDAO().saveNotifications(notifications);
    }
}
