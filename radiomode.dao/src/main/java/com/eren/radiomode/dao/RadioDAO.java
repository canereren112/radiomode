/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.radio.RadioUsers;
import java.util.List;

/**
 *
 * @author work
 */
public interface RadioDAO extends IEntityDAO {

    RadioUsers getRadio(String userName, Integer radioid);

    RadioUsers getDefaultRadioByUserName(String userName);

    List<RadioUsers> getAllRadios(String userName);

    List<RadioArtistsAll> getRadioArtistsAll(Integer radioid);
}
