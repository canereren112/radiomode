/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.FriendList;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.FriendListService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class FriendListServiceImpl implements FriendListService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<FriendList> getFriendList(User user, int first, int max) {
        FriendList friendList = new FriendList();
        friendList.setReceiverid(user);
        friendList.setResult(FriendList.Result.ACCEPTED.toString());
        List<FriendList> friendLists = (List<FriendList>) entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList, first, max, "resultDate");
        friendList = new FriendList();
        friendList.setSenderid(user);
        friendList.setResult(FriendList.Result.ACCEPTED.toString());
        List<FriendList> friendLists2 = (List<FriendList>) entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList, first, max, "resultDate");
        friendLists.addAll(friendLists2);
        return friendLists;
    }

    public List<FriendList> getFriendListRequests(User user, int first, int max) {
        FriendList friendList = new FriendList();
        friendList.setReceiverid(user);
        friendList.setResult(FriendList.Result.WAITING.toString());
        List<FriendList> friendLists = (List<FriendList>) entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList, first, max, "resultDate");
        friendList = new FriendList();
        friendList.setSenderid(user);
        friendList.setResult(FriendList.Result.WAITING.toString());
        List<FriendList> friendLists2 = (List<FriendList>) entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList, first, max, "resultDate");
        friendLists.addAll(friendLists2);
        return friendLists;
    }

    public void addFriend(String sender, String receiver) {
        User sendUser = entityDAOFactory.getUserDAO().getUserByUsername(sender);
        User receiveUser = entityDAOFactory.getUserDAO().getUserByUsername(receiver);
        FriendList friendList = new FriendList();
        friendList.setSenderid(sendUser);
        friendList.setReceiverid(receiveUser);
        friendList.setSendDate(new Date());
        friendList.setResult(FriendList.Result.WAITING.name());
        entityDAOFactory.getFriendListDAO().saveEntity(friendList);
    }

    public void removeFriend(String sender, String receiver) {
        User sendUser = entityDAOFactory.getUserDAO().getUserByUsername(sender);
        User receiveUser = entityDAOFactory.getUserDAO().getUserByUsername(receiver);
        FriendList friendList = new FriendList();
        friendList.setSenderid(sendUser);
        friendList.setReceiverid(receiveUser);
        List<FriendList> list = entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList);
        entityDAOFactory.getFriendListDAO().deleteEntity(list);
        friendList = new FriendList();
        friendList.setSenderid(receiveUser);
        friendList.setReceiverid(sendUser);
        List<FriendList> list2 = entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList);
        entityDAOFactory.getFriendListDAO().deleteEntity(list2);
        entityDAOFactory.getFriendListDAO().saveEntity(friendList);
        sendUser.getUserStats().setFriendCount(sendUser.getUserStats().getFriendCount() - 1);
        receiveUser.getUserStats().setFriendCount(receiveUser.getUserStats().getFriendCount() - 1);
        entityDAOFactory.getUserDAO().saveEntity(sendUser);
        entityDAOFactory.getUserDAO().saveEntity(receiveUser);
    }

    public void acceptFriend(String sender, String receiver) {
        User sendUser = entityDAOFactory.getUserDAO().getUserByUsername(sender);
        User receiveUser = entityDAOFactory.getUserDAO().getUserByUsername(receiver);
        FriendList friendList = new FriendList();
        friendList.setSenderid(sendUser);
        friendList.setReceiverid(receiveUser);
        List<FriendList> list = entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList);
        if (list.size() > 0) {
            friendList = list.get(0);
            friendList.setResultDate(new Date());
            friendList.setResult(FriendList.Result.ACCEPTED.name());
            entityDAOFactory.getFriendListDAO().saveEntity(friendList);
            sendUser.getUserStats().setFriendCount(sendUser.getUserStats().getFriendCount() + 1);
            receiveUser.getUserStats().setFriendCount(receiveUser.getUserStats().getFriendCount() + 1);
            entityDAOFactory.getUserDAO().saveEntity(sendUser);
            entityDAOFactory.getUserDAO().saveEntity(receiveUser);
        }
    }

    public void rejectFriend(String sender, String receiver) {
        User sendUser = entityDAOFactory.getUserDAO().getUserByUsername(sender);
        User receiveUser = entityDAOFactory.getUserDAO().getUserByUsername(receiver);
        FriendList friendList = new FriendList();
        friendList.setSenderid(sendUser);
        friendList.setReceiverid(receiveUser);
        List<FriendList> list = entityDAOFactory.getFriendListDAO().loadEntityByParam(friendList);
        if (list.size() > 0) {
            friendList = list.get(0);
            friendList.setResultDate(new Date());
            friendList.setResult(FriendList.Result.REJECTED.name());
            entityDAOFactory.getFriendListDAO().saveEntity(friendList);
        }
    }
}
