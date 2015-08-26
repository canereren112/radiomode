/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.edit_profile;

import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.UtilImpl;
import com.eren.radiomode.web.util.Constants;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author work
 */
@Controller
@RequestMapping("//edit_profile/email")
@SessionAttributes("notifications")
public class EditProfileEmailController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String loadEmailPage(Model model, HttpSession session) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        UserNotifications notifications = serviceFactory.getEditProfileService().loadNotifications(userName);
        model.addAttribute("notifications", notifications);
        return "//edit_profile/email";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String editEmailPage(Model model, HttpSession session, @ModelAttribute("notifications") UserNotifications notifications, BindingResult bindingResult, SessionStatus status) {
        try {
            String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
            serviceFactory.getEditProfileService().saveNotifications(notifications);
            status.setComplete();
            model.addAttribute("result", true);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("message.settings.update"));
        } catch (Exception ex) {
            model.addAttribute("result", false);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("error.settings.update"));
        }

        return "redirect://edit_profile/email";
    }
}
