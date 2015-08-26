/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import java.util.List;

/**
 *
 * @author work
 */
public interface LanguageDAO extends IEntityDAO {

    /**
     * Yeni dil ekleme
     * @param langCode dil kodu
     * @param displayLangCode gorunen dil kodu
     * @param langName dil
     * @return
     */
    void addLanguage(String langCode, String displayLangCode, String langName);

    /**
     * tum dil kodlarini dondurur
     * @return dil kodlari
     */
    List<String> getAllLangCodes();
}
