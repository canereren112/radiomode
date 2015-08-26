/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.common;

import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.UtilImpl;
import com.eren.radiomode.web.json.ResultMessage;
import com.eren.radiomode.web.view.JsonView;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author firat
 */
@Controller
public class FriendListController {

    @Autowired
    public ServiceFactory serviceFactory;
    public String errorMessage = "";

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/friendlist/add")
    public ModelAndView addFriend(@RequestParam("sender") String sender, @RequestParam("receiver") String receiver, Model map, HttpSession session) {
        ModelAndView view = new ModelAndView(JsonView.instance);
        ResultMessage message = new ResultMessage();
        serviceFactory.getFriendListService().addFriend(sender, receiver);
        message.setDescription(UtilImpl.loadMessageProperty("message.addFriend"));
        view.addObject(JsonView.JSON_ROOT, message);
        return view;
    }
}
