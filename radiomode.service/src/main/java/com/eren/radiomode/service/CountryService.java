/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.Country;
import java.util.List;

/**
 *
 * @author work
 */
public interface CountryService {

    /**
     * Ulke koduna gore arama yapar
     * @param countryCode ulke kodu
     * @return ulke
     */
    Country getCountryByCountryCode(String countryCode);

    /**
     * istenilen dilde olmak uzere tum ulkeleri dondurur
     * @param displayLangCode dil
     * @return ulke listesi
     */
    List<Country> getCountryByDisplayLangCode(String displayLangCode);

    /**
     * ulke ekleme
     * @param countryCode ulke kodu
     * @param displayCountryCode gorunen ulke kodu
     * @param countryName ulke adi
     * @return basarili mi
     */
    void addCountry(String countryCode, String displayCountryCode, String countryName);

    /**
     * tum ulke kodlarini doner
     * @return ulke kodlari
     */
    List<String> getAllCountryCodes();
}
