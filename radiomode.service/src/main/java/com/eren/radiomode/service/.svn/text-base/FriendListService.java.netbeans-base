/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.FriendList;
import com.eren.radiomode.domain.user.User;
import java.util.List;

/**
 *
 * @author work
 */
public interface FriendListService {

    List<FriendList> getFriendList(User user, int first, int max);

    List<FriendList> getFriendListRequests(User user, int first, int max);

    void addFriend(String sender, String receiver);

    void removeFriend(String sender, String receiver);

    void acceptFriend(String sender, String receiver);

    void rejectFriend(String sender, String receiver);
}
