/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.message;

import com.eren.radiomode.domain.Message;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.Constants;
import com.eren.radiomode.service.util.UtilImpl;
import com.eren.radiomode.web.view.JsonView;
import com.eren.radiomode.web.json.Parameter;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author firat
 */
@Controller
@SessionAttributes("message")
public class MessageController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/message")
    public String viewMesages(Model map, HttpSession session) {
        return "message";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/messages/create")
    public String viewMessagesCreate(@RequestParam("senderName") String senderName, Model map, HttpSession session) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        Message message = new Message();
        map.addAttribute("message", message);
        map.addAttribute("senderName", senderName);
        return "message/message_create";
    }

    @RequestMapping(method = RequestMethod.GET, value = "messages/reply/{messageid}")
    public String viewMessagesReply(@PathVariable("messageid") Integer messageid, Model map, HttpSession session) {
        Message replyMessage = new Message();
        replyMessage = serviceFactory.getMessageService().getReplyMessage(messageid.intValue());
        Message newReplyMessage = new Message();
        newReplyMessage.setReceiverid(replyMessage.getSenderid());
        map.addAttribute("newReplyMessage", newReplyMessage);
        return "message/message_reply";
    }

    @RequestMapping(method = RequestMethod.POST, value = "messages/replied")
    public String viewMessagesReply(@ModelAttribute("newReplyMessage") Message newReplyMessage, Model map, HttpSession session) {
//        serviceFactory.getMessageService().saveRepliedMessage(newReplyMessage);
        return "message/message_inbox";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/messages/{messageid}")
    public String viewMessage(@PathVariable("messageid") Integer messageid, Model map, HttpSession session) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        Message messageDetail = serviceFactory.getMessageService().readMessage(user, messageid);
        map.addAttribute("messageDetail", messageDetail);

        return "message/message_read";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/messages/{page}/remove")
    public ModelAndView removeMessage(@RequestParam("checkedMessages") String checkedMessages, @PathVariable("page") String page, Model map, HttpSession session) {
        String[] messages = checkedMessages.split("_");
        ModelAndView view = new ModelAndView(JsonView.instance);
        boolean result = false;
        Parameter param = new Parameter();
//        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        result = serviceFactory.getMessageService().removeMessages(messages);
        param.setName(result + "");
        view.addObject(JsonView.JSON_ROOT, param);
        return view;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/messages/inbox")
    public String viewMessagesInbox(Model map, HttpSession session) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<Message> messages = serviceFactory.getMessageService().getInboxMessages(user, 0, 10);
        map.addAttribute("messages", messages);
        return "message/message_inbox";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/messages/sent")
    public String viewMessagesSent(Model map, HttpSession session) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<Message> messages = serviceFactory.getMessageService().getSentMessages(user, 0, 10);
        map.addAttribute("messages", messages);
        return "message/message_sent";
    }
}
