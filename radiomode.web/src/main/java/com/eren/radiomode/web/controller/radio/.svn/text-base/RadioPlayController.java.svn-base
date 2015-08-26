/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.radio;

import com.eren.radiomode.domain.ListenHistory;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.service.RadioPlayService;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.web.util.Constants;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/radio/{radioid}/play")
@SessionAttributes("listenHistory")
public class RadioPlayController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String loadPlayPage(Model model, HttpSession session, @PathVariable("radioid") String radioId,
            @RequestParam("lastVideoID") String lastVideoID, @RequestParam("id") Integer id, SessionStatus status) {
        String userName = session.getAttribute(Constants.SESSION_USERNAME).toString();
        //TODO hata cikmasi durumunda edit_profile tarzında hata mesajını gönder
        //TODO skip edilmesi durumunda dinleme yuzdesi 40 70 neyse boyle yazdirilacak boylece 50 nin altindakiler dinlenmemis sayılacak
        // yeni video bilgileri cekilir
        if (id != null) {
            serviceFactory.getRadioPlayService().updateLastVideo((int) id, 100, 100);
        }
        if (lastVideoID != null && !lastVideoID.equals("")) {
            Video lastVideo = new Video();
            lastVideo.setVideoNumber(lastVideoID);
            List<Video> list = serviceFactory.getEntityDAOFactory().getVideoDAO().loadEntityByParam(lastVideo);
            lastVideo = list.get(0);
            //TODO userStats listenCount da arttırılacak. bir de simdiki yanlıs bilgilerde duzeltilecek
            lastVideo.getSongid().getSongStats().setListenCount(lastVideo.getSongid().getSongStats().getListenCount() + 1);
            lastVideo.getSongid().getArtistid().getArtistStats().setListenCount(lastVideo.getSongid().getArtistid().getArtistStats().getListenCount() + 1);
            lastVideo.getSongid().getAlbumid().getAlbumStats().setListenCount(lastVideo.getSongid().getAlbumid().getAlbumStats().getListenCount() + 1);
            serviceFactory.getEntityDAOFactory().getVideoDAO().saveEntity(lastVideo);
        }

        ListenHistory listenHistory = serviceFactory.getRadioPlayService().loadNextVideo(userName, radioId);
        String videoNumber = listenHistory.getVideoid().getVideoNumber();
        Integer realRadioid = listenHistory.getRadioUsersid().getRadioid().getRadioid();
        model.addAttribute("nextVideoID", videoNumber);
        model.addAttribute("songid", listenHistory.getVideoid().getSongid().getSongid());
        model.addAttribute("id", listenHistory.getId());
        model.addAttribute("radioid", realRadioid);
        model.addAttribute("song", listenHistory.getVideoid().getSongid().getSongName());
        model.addAttribute("artist", listenHistory.getVideoid().getSongid().getArtistid().getName());
        model.addAttribute("listenHistory", listenHistory);

        // radio bilgileri cekilir
        List<RadioUsers> radioUsers = serviceFactory.getRadioPlayService().getRadioUsers(userName);
        model.addAttribute("radioUsers", radioUsers);

        //ListenHistory lastListened = (ListenHistory) model.get("listenHistory");

        return "/radio/play_station";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String editPlayPage(ModelMap model) {
        return "/radio/play_station";
    }
}
