/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.recommendation;

import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.parent.ServiceFactory;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author firat
 */
@Controller
public class RecommendationController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/recommendation")
    public String viewRecommendations(Model map, HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<RadioArtistsAll> all = serviceFactory.getArtistService().getRecommendedArtists(user, 0, 10);
        map.addAttribute("all", all);
        return "recommendation";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/recommendation/artists")
    public String viewRecommendedArtists(Model map, HttpSession session) {
        return "music/recommendation_pages/recommendation_artist";
    }
}
