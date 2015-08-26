/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Language;
import com.eren.radiomode.service.LanguageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    /**
     * Yeni dil ekleme
     * @param langCode dil kodu
     * @param displayLangCode gorunen dil kodu
     * @param langName dil
     * @return basarili/basarisiz
     */
    public void addLanguage(String langCode, String displayLangCode, String langName) {
        entityDAOFactory.getLanguageDAO().addLanguage(langCode, displayLangCode, langName);
    }

    /**
     * tum dil kodlarini dondurur
     * @return dil kodlari
     */
    public List<String> getAllLangCodes() {
        return entityDAOFactory.getLanguageDAO().getAllLangCodes();
    }
}
