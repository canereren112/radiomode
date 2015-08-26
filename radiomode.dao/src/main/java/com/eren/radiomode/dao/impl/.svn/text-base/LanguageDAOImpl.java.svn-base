/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.LanguageDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.Language;
import java.util.List;

/**
 *
 * @author work
 */
public class LanguageDAOImpl extends EntityDAO implements LanguageDAO {

    /**
     * Yeni dil ekleme
     * @param langCode dil kodu
     * @param displayLangCode gorunen dil kodu
     * @param langName dil
     * @return basarili/basarisiz
     */
    public void addLanguage(String langCode, String displayLangCode, String langName) {
        Language language = new Language();
        language.setLangCode(langCode);
        language.setDisplayLangCode(displayLangCode);
        language.setLanguage(langName);
        getHibernateTemplate().save(language);
    }

    /**
     * tum dil kodlarini dondurur
     * @return dil kodlari
     */
    public List<String> getAllLangCodes() {
        return getHibernateTemplate().findByNamedQuery("Language.findAllLangCode");
    }
}
