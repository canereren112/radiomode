/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.profile;

import com.eren.radiomode.domain.FriendList;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.domain.user.UserSimiliar;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.UtilImpl;
import com.eren.radiomode.web.json.ResultMessage;
import com.eren.radiomode.web.view.JsonView;
import java.util.List;
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
 * Kullanicinin profil sayfalarinin denetleyicisi
 * @author work
 */
@Controller
public class ViewProfileController {

    @Autowired
    public ServiceFactory serviceFactory;
    public String errorMessage = "";

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}")
    public String viewProfile(@PathVariable("userName") String userName, Model map, HttpSession session) {
        //String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<UserActivity> activities = serviceFactory.getUserService().getUserActivity(user, 0, 5);
        List<FriendList> friendLists = serviceFactory.getFriendListService().getFriendList(user, 0, 4);//will return 5 friends
        List<UserSimiliar> neighbours = (List<UserSimiliar>) serviceFactory.getUserService().getUserSimiliar(user, 0, 5);
        List songMap = serviceFactory.getListenHistoryService().getMostListenedSongs(user, 0, 10);
        List artistMap = serviceFactory.getListenHistoryService().getMostListenedArtists(user, 0, 10);
        List albumMap = serviceFactory.getListenHistoryService().getMostListenedAlbums(user, 0, 10);
        //TODO Recently Listened acildiginda burasi da acilacak
        //List<ListenHistory> songList = serviceFactory.getListenHistoryService().getRecentlyListenedSongs(user, 0, 10);

        map.addAttribute(user);
        map.addAttribute("activities", activities);
        map.addAttribute("friendLists", friendLists);
        map.addAttribute("neighbours", neighbours);
        map.addAttribute("songMap", songMap);
        map.addAttribute("artistMap", artistMap);
        map.addAttribute("albumMap", albumMap);
        if (user.getAboutMe().length() > 600) {
            map.addAttribute("about_me", user.getAboutMe().substring(0, 600));
        } else {
            map.addAttribute("about_me", user.getAboutMe());
        }
        return "profile";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/general")
    public String viewProfileGeneral(@PathVariable("userName") String userName, Model map, HttpSession session) {
        //String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<UserActivity> activities = serviceFactory.getUserService().getUserActivity(user, 0, 5);
        List<FriendList> friendLists = serviceFactory.getFriendListService().getFriendList(user, 0, 4);//will return 5 friends
        List<UserSimiliar> neighbours = (List<UserSimiliar>) serviceFactory.getUserService().getUserSimiliar(user, 0, 5);
        List songMap = serviceFactory.getListenHistoryService().getMostListenedSongs(user, 0, 10);
        List artistMap = serviceFactory.getListenHistoryService().getMostListenedArtists(user, 0, 10);
        List albumMap = serviceFactory.getListenHistoryService().getMostListenedAlbums(user, 0, 10);
        //TODO Recently Listened acildiginda burasi da acilacak
        //List<ListenHistory> songList = serviceFactory.getListenHistoryService().getRecentlyListenedSongs(user, 0, 10);

        map.addAttribute(user);
        map.addAttribute("activities", activities);
        map.addAttribute("friendLists", friendLists);
        map.addAttribute("neighbours", neighbours);
        map.addAttribute("songMap", songMap);
        map.addAttribute("artistMap", artistMap);
        map.addAttribute("albumMap", albumMap);
        if (user.getAboutMe().length() > 600) {
            map.addAttribute("about_me", user.getAboutMe().substring(0, 600));
        } else {
            map.addAttribute("about_me", user.getAboutMe());
        }
        return "profile/profile_general";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/about_me")
    public String viewProfileAboutMe(@PathVariable("userName") String userName, Model map, HttpSession session) {
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        map.addAttribute("about_me", user.getAboutMe());
        return "profile/profile_about_me";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/activity/page/{page}")
    public String viewProfileActivity(@PathVariable("userName") String userName, @PathVariable("page") Integer page, Model map, HttpSession session) {
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<UserActivity> activities = serviceFactory.getUserService().getUserActivity(user, (page - 1) * 20, 20);
        map.addAttribute("activities", activities);
        return "profile/profile_activity";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/friends/page/{page}")
    public String viewProfileFriends(@PathVariable("userName") String userName, @PathVariable("page") Integer page, Model map, HttpSession session) {
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<FriendList> friendLists = serviceFactory.getFriendListService().getFriendList(user, (page - 1) * 20, 20);
        map.addAttribute("friendLists", friendLists);
        return "profile/profile_friends";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/neighbours/page/{page}")
    public String viewProfileNeighbours(@PathVariable("userName") String userName, @PathVariable("page") Integer page, Model map, HttpSession session) {
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List<UserSimiliar> neighbours = (List<UserSimiliar>) serviceFactory.getUserService().getUserSimiliar(user, (page - 1) * 20, 20);
        map.addAttribute("neighbours", neighbours);
        return "profile/profile_neighbours";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/songbox/page/{page}")
    public String viewProfileSongBox(@PathVariable("userName") String userName, @PathVariable("page") Integer page, Model map, HttpSession session) {
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List songMap = serviceFactory.getListenHistoryService().getMostListenedSongs(user, (page - 1) * 40, 40);
        map.addAttribute("songMap", songMap);
        return "profile/music_box/profile_music_box_song";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/artistbox/page/{page}")
    public String viewProfileArtistBox(@PathVariable("userName") String userName, @PathVariable("page") Integer page, Model map, HttpSession session) {
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List artistMap = serviceFactory.getListenHistoryService().getMostListenedArtists(user, (page - 1) * 40, 40);
        map.addAttribute("artistMap", artistMap);
        return "profile/music_box/profile_music_box_artist";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userName}/albumBox/page/{page}")
    public String viewProfileAlbumBox(@PathVariable("userName") String userName, @PathVariable("page") Integer page, Model map, HttpSession session) {
        User user = serviceFactory.getViewProfileService().loadProfileMain(userName);
        List albumMap = serviceFactory.getListenHistoryService().getMostListenedArtists(user, (page - 1) * 40, 40);
        map.addAttribute("albumMap", albumMap);
        return "profile/music_box/profile_music_box_album";
    }
}
