/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.EmailListDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.EmailList;
import java.util.List;

/**
 *
 * @author work
 */
public class EmailListDAOImpl extends EntityDAO implements EmailListDAO {

    public void saveEmailAddress(String emailAddress, String website, String url, String domainAddress, Country country) {
            EmailList emailList = new EmailList();
            emailList.setWebsite(website);
            emailList.setUrl(url);
            emailList.setEmailAddress(emailAddress);
            emailList.setDomainAddress(domainAddress);
            emailList.setCountryCode(country.getCountryCode());
            getHibernateTemplate().save(emailList);
    }

    public String getLastUsedUrl() {
        String selectLastURL = "SELECT e FROM EmailList e order by e.emailid desc limit 0,1";
        List<EmailList> list = getHibernateTemplate().find(selectLastURL);
        if (list.size() > 0) {
            return list.get(0).getUrl();
        } else {
            return null;
        }
    }

    public List<String> getAllCountryCodes() {
        return getHibernateTemplate().findByNamedQuery("EmailList.findAllCountryCodes");
    }
}
