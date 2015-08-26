/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.CountryDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.Country;
import java.util.List;

/**
 *
 * @author work
 */
public class CountryDAOImpl extends EntityDAO implements CountryDAO {

    /**
     * Ulke koduna gore arama yapar
     * @param countryCode ulke kodu
     * @return ulke
     */
    public Country getCountryByCountryCode(String countryCode) {
        List<Country> list = getHibernateTemplate().findByNamedQueryAndNamedParam("Country.findByCountryCode", "countryCode", countryCode);
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public List<Country> getCountryByDisplayLangCode(String displayLangCode) {
        return getHibernateTemplate().findByNamedQueryAndNamedParam("Country.findByDisplayLangCode", "displayLangCode", displayLangCode);
    }

    /**
     * ulke ekleme
     * @param countryCode ulke kodu
     * @param displayCountryCode gorunen ulke kodu
     * @param countryName ulke adi
     * @return basarili mi
     */
    public void addCountry(String countryCode, String displayCountryCode, String countryName) {
            Country country = new Country();
            country.setCountryCode(countryCode);
            country.setDisplayLangCode(displayCountryCode);
            country.setCountry(countryName);
            getHibernateTemplate().save(country);
    }

    /**
     * tum ulke kodlarini doner
     * @return ulke kodlari
     */
    public List<String> getAllCountryCodes() {
        return getHibernateTemplate().findByNamedQuery("Country.findAllCountryCode");
    }
}
