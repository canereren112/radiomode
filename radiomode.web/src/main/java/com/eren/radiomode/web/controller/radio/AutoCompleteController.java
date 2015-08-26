/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.radio;

import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.service.RadioCreateService;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.web.view.AutoCompleteView;
import com.eren.radiomode.web.view.JsonView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Artist v.s autocomplete controller i
 * @author work
 */
@Controller
public class AutoCompleteController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }


    @RequestMapping("/autocomplete_artists.do")
    public ModelAndView autocompleteArtists(@RequestParam("q") String query,
            @RequestParam("limit") int limit) {
        List<Artist> artists = serviceFactory.getRadioCreateService().loadArtistsLikeName(query, limit);
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (Artist artist : artists) {
            map.put(artist.getArtistid(), artist.getName());
        }
        AutoCompleteView.instance.setMap(map);
        ModelAndView view = new ModelAndView(AutoCompleteView.instance);
        return view;
    }
}
