/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.radio;

import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.UtilImpl;
import com.eren.radiomode.web.json.ResultMessage;
import com.eren.radiomode.web.view.JsonView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author work
 */
@Controller
public class LoadArtistsController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/radio/add_artist.do")
    public String addArtist(ModelMap modelMap, HttpSession session, @RequestParam("artist") String artistName,
            @RequestParam("artistid") Integer artistid) {
        System.out.println("addArtist start:" + System.currentTimeMillis() + " for: " + artistName);

        Map<Integer, String> addedArtists = (Map<Integer, String>) session.getAttribute("addedArtists");
        Map<Integer, String> blockedArtists = (Map<Integer, String>) session.getAttribute("addedArtists");
        if (addedArtists == null) {
            addedArtists = new TreeMap<Integer, String>();
        }
        if (blockedArtists == null) {
            blockedArtists = new TreeMap<Integer, String>();
        }

        addedArtists.put(artistid, artistName);
        session.setAttribute("addedArtists", addedArtists);
        List<RadioArtistsAll> allArtists = serviceFactory.getRadioCreateService().loadSimiliarArtists(addedArtists, blockedArtists);
        modelMap.addAttribute("allArtists", allArtists);

        System.out.println("addArtist stop:" + System.currentTimeMillis() + " for: " + artistName);
        return "/radio/add_artist";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/radio/remove_artist.do")
    public ModelAndView removeArtist(HttpSession session, @RequestParam("artist") String artistName) {
        List<String> addedArtists = (List<String>) session.getAttribute("addedArtists");
        List<String> blockedArtists = (List<String>) session.getAttribute("blockedArtists");
        if (blockedArtists == null) {
            blockedArtists = new ArrayList<String>();
        }
        blockedArtists.add(artistName);
        ModelAndView view = new ModelAndView(JsonView.instance);
        return view;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/radio/check_artist.do")
    public ModelAndView checkArtist(HttpSession session, @RequestParam("artist") String artistName) {
        System.out.println("checkArtist start:" + System.currentTimeMillis() + " for: " + artistName);

        ModelAndView view = new ModelAndView(JsonView.instance);
        ResultMessage message = new ResultMessage();
        Map<Integer, String> addedArtists = (Map<Integer, String>) session.getAttribute("addedArtists");
        String artistCheck = "true";
        Artist artist = serviceFactory.getRadioCreateService().loadArtist(artistName);
        if (artist == null) {
            message.setDescription(UtilImpl.loadMessageProperty("warning.artistNameNotFound"));
            message.setCode("warning.artistNameNotFound");
        } else {
            if (addedArtists == null) {
                addedArtists = new TreeMap<Integer, String>();
            } else {
                if (addedArtists.values().contains(artistName)) {
                    message.setDescription(UtilImpl.loadMessageProperty("warning.artistNameAlreadySelected"));
                    message.setCode("warning.artistNameAlreadySelected");
                }
            }
        }
        message.setName(artist.getArtistid().toString());
        view.addObject(JsonView.JSON_ROOT, message);

        System.out.println("checkArtist stop:" + System.currentTimeMillis() + " for: " + artistName);
        return view;
    }
}
