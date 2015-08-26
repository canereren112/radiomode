/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.domain.user.User;
import java.util.List;

/**
 * edit_profile sayfasi islemleri
 * @author work
 */
public interface EditProfileService {

    /**
     * Varsayilan dilde tum ulkeleri dondurur
     * @return ulke listesi
     */
    List<Country> loadCountryList();

    /**
     * Porfil sayfasi icin gerekli bilgileri dondurur
     * @param userName kullanici adi
     * @return User Nesnesi
     */
    User loadGeneralProfile(String userName);

    void editGeneralProfile(User user, String countryCode) throws Exception;

    String loadPassword(String userName);

    boolean savePassword(String userName, String password);

    UserNotifications loadNotifications(String userName);

    void saveNotifications(UserNotifications notifications);
}
