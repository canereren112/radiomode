/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.common;

import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.web.json.ResultMessage;
import com.eren.radiomode.web.view.JsonView;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author firat
 */
@Controller
public class AlbumBoxController {

    @Autowired
    public ServiceFactory serviceFactory;
    public String errorMessage = "";

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/love")
    public ModelAndView loveAlbum(@RequestParam("albumid") Integer albumid, HttpSession session, Model model) throws IOException {
        ModelAndView view = new ModelAndView(JsonView.instance);
        ResultMessage message = new ResultMessage();
        String userName = (String) session.getAttribute("userName");
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        serviceFactory.getAlbumService().loveAlbum(albumid, user);
        message.setDescription("You loved ");
        view.addObject(JsonView.JSON_ROOT, message);
        return view;
    }
}
