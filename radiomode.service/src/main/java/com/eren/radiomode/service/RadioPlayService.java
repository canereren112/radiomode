/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.radio.RadioUsers;
import java.util.List;

/**
 *
 * @author work
 */
public interface RadioPlayService {

    public ListenHistory loadNextVideo(String userName, String radioid);

    boolean addNextVideos(String userName, Integer radioid);

    void updateLastVideo(int id, int listenPercent, int volumePercent);

    List<RadioUsers> getRadioUsers(String userName);
}
