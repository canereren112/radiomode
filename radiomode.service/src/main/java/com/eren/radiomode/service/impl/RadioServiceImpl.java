/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.radio.Radio;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.RadioService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class RadioServiceImpl implements RadioService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<RadioArtistsAll> getRadioArtistsAll(Integer radioid) {
        return entityDAOFactory.getRadioDAO().getRadioArtistsAll(radioid);
    }

    public RadioUsers getRadio(String userName, Integer radioid) {
        return entityDAOFactory.getRadioDAO().getRadio(userName, radioid);

    }

    public RadioUsers getDefaultRadioByUserName(String userName) {
        return entityDAOFactory.getRadioDAO().getDefaultRadioByUserName(userName);

    }

    public List<RadioUsers> getAllRadios(String userName) {
        return entityDAOFactory.getRadioDAO().getAllRadios(userName);
    }
}
