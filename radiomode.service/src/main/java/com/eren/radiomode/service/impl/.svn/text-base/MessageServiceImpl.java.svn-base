/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Message;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.MessageService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class MessageServiceImpl implements MessageService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<Message> getInboxMessages(User user, int first, int max) {
        Message message = new Message();
        message.setReceiverid(user);
        List<Message> list = entityDAOFactory.getMessageDAO().loadEntityByParam(message, first, max, "sendDate");
        return list;
    }

    public List<Message> getSentMessages(User user, int first, int max) {
        Message message = new Message();
        message.setSenderid(user);
        List<Message> list = entityDAOFactory.getMessageDAO().loadEntityByParam(message, first, max, "sendDate");
        return list;
    }

    public void saveRepliedMessage(Message newRepliedMessage) {
        Date recentDate = new Date();
        newRepliedMessage.setSendDate(recentDate);


        entityDAOFactory.getMessageDAO().saveEntity(newRepliedMessage);
    }

    public void sendMessage(Message message) {
        message.setSendDate(new Date());
        entityDAOFactory.getMessageDAO().saveEntity(message);
    }

    public void replyMessage(Message message, Integer replyid) {
        message.setSendDate(new Date());
        message.setReplyid(replyid);
        entityDAOFactory.getMessageDAO().saveEntity(message);
    }

    public Message getReplyMessage(int messageid) {
        Message reply = (Message) entityDAOFactory.getMessageDAO().loadEntity(Message.class, messageid);
        return reply;
    }

    public Message readMessage(User user, Integer messageid) {
        Message message = new Message(messageid);
        List<Message> list = entityDAOFactory.getMessageDAO().loadEntityByParam(message);
        if (!list.isEmpty()) {
            message = list.get(0);
            if (message.getReceiverid().equals(user)) {
                message.setReadDate(new Date());
            }
            entityDAOFactory.getMessageDAO().saveEntity(message);
            return message;
        }
        return null;
    }

    public void removeMessage(Integer messageid) {
        Message message = new Message(messageid);
        List<Message> list = entityDAOFactory.getMessageDAO().loadEntityByParam(message);
        if (!list.isEmpty()) {
            message = list.get(0);
            entityDAOFactory.getMessageDAO().deleteEntity(message);
        }
    }

    public boolean removeMessages(String[] messages) {
        boolean result = true;
        try {
            for (int i = 0; i < messages.length; i++) {
                if (!("").equals(messages[i])) {
                    removeMessage(Integer.parseInt(messages[i]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
}
