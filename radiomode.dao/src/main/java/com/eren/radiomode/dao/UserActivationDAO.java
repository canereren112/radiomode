/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.user.UserActivation;

/**
 * UserActivation tablosunun DAO su
 * @author work
 */
public interface UserActivationDAO extends IEntityDAO {

    /**
     * kullaniciyi kaydeder
     * @param email eposta
     * @param userName kullanici adi
     * @param password sifre
     * @param activationNumber aktivasyon no
     */
    void saveUser(String email, String userName, String password, String activationNumber);

    /**
     *  kullanici adi kontrolu yapar
     * @param userName kullanici adi
     * @return var/yok
     */
    boolean existsByUserName(String userName);

    /**
     * eposta kontrolu yapar
     * @param email eposta
     * @return var/yok
     */
    boolean existsByEmail(String email);

    /**
     * akitavsyon no kontrolu yapar
     * @param activationNumber aktivasyon no
     * @return NONE,WAITING,ACTIVATED,TIMEOUT
     */
    UserActivation existsByActivationNumber(String activationNumber);
}
