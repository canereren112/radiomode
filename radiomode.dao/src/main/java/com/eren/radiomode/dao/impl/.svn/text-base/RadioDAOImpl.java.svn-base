/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.RadioDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.radio.RadioUsers;
import java.util.List;

/**
 *
 * @author work
 */
public class RadioDAOImpl extends EntityDAO implements RadioDAO {

    public List<RadioArtistsAll> getRadioArtistsAll(Integer radioid) {
        return getHibernateTemplate().findByNamedQueryAndNamedParam("RadioArtistsAll.findByRadioid", "radioid", radioid);
    }

    public RadioUsers getRadio(String userName, Integer radioid) {
        String[] paramNames = {"radioid", "userName"};
        Object[] paramValues = {radioid, userName};
        List<RadioUsers> radios = getHibernateTemplate().findByNamedQueryAndNamedParam("RadioUsers.findByRadioidAndUserName", paramNames, paramValues);
        if(radios.size() > 0) {
            return radios.get(0);
        } else {
            return null;
        }
    }

    public RadioUsers getDefaultRadioByUserName(String userName) {
        List<RadioUsers> radios = getHibernateTemplate().findByNamedQueryAndNamedParam("RadioUsers.findDefaultByUserName", "userName", userName);
        if(radios.size() > 0) {
            return radios.get(0);
        } else {
            return null;
        }
    }

    public List<RadioUsers> getAllRadios(String userName) {
        List<RadioUsers> radios = getHibernateTemplate().findByNamedQueryAndNamedParam("RadioUsers.findByUserNameOrderByDate", "userName", userName);
        return radios;
    }
}
