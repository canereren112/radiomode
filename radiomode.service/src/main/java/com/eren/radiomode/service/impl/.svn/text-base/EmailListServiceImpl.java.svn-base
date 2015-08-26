/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.service.EmailListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class EmailListServiceImpl implements EmailListService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public void saveEmailAddress(String emailAddress, String website, String url, String domainAddress, Country country) {
        entityDAOFactory.getEmailListDAO().saveEmailAddress(emailAddress, website, url, domainAddress, country);
    }

    public String getLastUsedUrl() {
        return entityDAOFactory.getEmailListDAO().getLastUsedUrl();

    }

    public List<String> getAllCountryCodes() {
        return entityDAOFactory.getEmailListDAO().getAllCountryCodes();
    }
}
