/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.edit_profile;

import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.web.util.Constants;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author work
 */
@Controller
@RequestMapping("/edit_profile/photo")
public class EditProfilePhotoController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String loadPhotoPage(ModelMap model, HttpSession session) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        User user = serviceFactory.getEditProfileService().loadGeneralProfile(userName);
        model.addAttribute(user);
        return "/edit_profile/photo";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String editPhotoPage(ModelMap model) {
        return "/edit_profile/photo";
    }
}
