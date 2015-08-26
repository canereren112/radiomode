/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class CountryServiceImpl implements CountryService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    /**
     * Ulke koduna gore arama yapar
     * @param countryCode ulke kodu
     * @return ulke
     */
    public Country getCountryByCountryCode(String countryCode) {
        return entityDAOFactory.getCountryDAO().getCountryByCountryCode(countryCode);

    }

    public List<Country> getCountryByDisplayLangCode(String displayLangCode) {
        return entityDAOFactory.getCountryDAO().getCountryByDisplayLangCode(displayLangCode);
    }

    /**
     * ulke ekleme
     * @param countryCode ulke kodu
     * @param displayCountryCode gorunen ulke kodu
     * @param countryName ulke adi
     * @return basarili mi
     */
    public void addCountry(String countryCode, String displayCountryCode, String countryName) {
        entityDAOFactory.getCountryDAO().addCountry(countryCode, displayCountryCode, countryName);
    }

    /**
     * tum ulke kodlarini doner
     * @return ulke kodlari
     */
    public List<String> getAllCountryCodes() {
        return entityDAOFactory.getCountryDAO().getAllCountryCodes();
    }
}
