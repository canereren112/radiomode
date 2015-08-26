/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.Country;
import java.util.List;

/**
 *
 * @author work
 */
public interface EmailListDAO extends IEntityDAO {

    public void saveEmailAddress(String emailAddress, String website, String url, String domainAddress, Country country);

    public String getLastUsedUrl();

    public List<String> getAllCountryCodes();
}
