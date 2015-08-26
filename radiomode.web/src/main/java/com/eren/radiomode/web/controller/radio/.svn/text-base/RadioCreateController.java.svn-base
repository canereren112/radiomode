/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.radio;

import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.radio.Radio;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.Constants;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author work
 */
@Controller
public class RadioCreateController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/radio/new")
    public String loadCreatePage(Model model) {
        return "/radio/create_station";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/radio/new")
    public String editCreatePage(@ModelAttribute("radio") Radio radio, Model model) {

        return "/radio/create_station";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/radio/create")
    public String createArtistRadio(@RequestParam("artistName") String artistName, Model model, HttpSession session) {
        artistName = artistName.replace('_', ' ');
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        serviceFactory.getRadioCreateService().createArtistRadio(artist, user);
        return "radio";
    }
}
