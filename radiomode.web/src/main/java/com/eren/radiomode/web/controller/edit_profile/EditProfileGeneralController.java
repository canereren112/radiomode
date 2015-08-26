/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.edit_profile;

import com.eren.radiomode.domain.Country;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.UtilImpl;
import com.eren.radiomode.web.model.SimpleDateModel;
import com.eren.radiomode.web.util.Constants;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author work
 */
@Controller
@RequestMapping("/edit_profile/general")
@SessionAttributes(value = "user")
public class EditProfileGeneralController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String loadGeneralPage(ModelMap model, HttpSession session, HttpServletRequest request) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        User user = serviceFactory.getEditProfileService().loadGeneralProfile(userName);

        List<Country> countryList = serviceFactory.getEditProfileService().loadCountryList();
        model.addAttribute(user);
        model.addAttribute(countryList);
        if (user.getBirthDate() != null) {
            model.addAttribute("dateModel", new SimpleDateModel(user.getBirthDate()));
        } else {
            model.addAttribute("dateModel",null);
        }
        return "/edit_profile/general";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String editGeneralPage(ModelMap model, @RequestParam("day") int day, @RequestParam("month") int month,
            @RequestParam("year") int year, @RequestParam("countryCode") String countryCode, @ModelAttribute("user") User user,
            BindingResult bindingResult, SessionStatus status) throws ParseException {
        try {
            SimpleDateModel dateModel = new SimpleDateModel(day, month, year);
            Date birthDate = dateModel.getDate();
            user.setBirthDate(birthDate);
            serviceFactory.getEditProfileService().editGeneralProfile(user, countryCode);
            status.setComplete();
            model.addAttribute("result", true);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("message.settings.update"));
        } catch (Exception ex) {
            model.addAttribute("result", false);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("error.settings.update"));
        }
        return "redirect:/edit_profile/general";
    }
}
