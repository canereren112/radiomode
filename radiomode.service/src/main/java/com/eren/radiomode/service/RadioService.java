/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.radio.RadioUsers;
import java.util.List;

/**
 *
 * @author work
 */
public interface RadioService {

    RadioUsers getRadio(String userName, Integer radioid);

    RadioUsers getDefaultRadioByUserName(String userName);

    List<RadioUsers> getAllRadios(String userName);

    List<RadioArtistsAll> getRadioArtistsAll(Integer radioid);
}
