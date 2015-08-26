/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.edit_profile;

import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.UtilImpl;
import com.eren.radiomode.web.util.Constants;
import com.eren.radiomode.web.util.ViewConstants;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author work
 */
@Controller
@RequestMapping("//edit_profile/password")
public class EditProfilePasswordController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String loadPasswordPage(ModelMap model, HttpSession session) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        if (userName.equals("")) {
            return ViewConstants.ERROR_AUTH_VIEW;
        }
        String password = serviceFactory.getEditProfileService().loadPassword(userName);
        model.addAttribute("password", password);
        return "//edit_profile/password";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String editPasswordPage(ModelMap model, HttpSession session, @RequestParam("newPassword") String newPassword, SessionStatus status) {
        try {
            String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
            serviceFactory.getEditProfileService().savePassword(userName, newPassword);
            status.setComplete();
            model.addAttribute("result", true);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("message.settings.update"));
        } catch (Exception ex) {
            model.addAttribute("result", false);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("error.settings.update"));
        }
        return "redirect://edit_profile/password";
    }
}
