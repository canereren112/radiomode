/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.music;

import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.album.AlbumStats;
import com.eren.radiomode.domain.album.AlbumTags;
import com.eren.radiomode.domain.artist.ArtistStats;
import com.eren.radiomode.domain.artist.ArtistTags;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.song.SongTags;
import com.eren.radiomode.service.parent.ServiceFactory;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author firat
 */
@Controller
public class MusicController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/music")
    public String viewMusic(Model map, HttpSession session) {
        return "music";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/music/artists/genre/{tagName}")
    public String viewArtists(@PathVariable("tagName") String tagName, Model map, HttpSession session) {
        if (tagName == null || tagName.equals("all")) {
            List<ArtistStats> artistStats = serviceFactory.getArtistService().getTopArtists(0, 7);
            map.addAttribute("artistStats", artistStats);
        } else {
            Tag tag = serviceFactory.getTagService().findTagByName(tagName);
            List<ArtistTags> artistTags = serviceFactory.getArtistService().getTopArtistsByTag(tag, 0, 7);
            map.addAttribute("artistTags", artistTags);
        }
        return "music/music_artist";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/music/albums/genre/{tagName}")
    public String viewAlbums(@PathVariable("tagName") String tagName, Model map, HttpSession session) {
        if (tagName == null || tagName.equals("all")) {
            List<AlbumStats> albumStats = serviceFactory.getAlbumService().getTopAlbums(0, 7);
            map.addAttribute("albumStats", albumStats);
        } else {
            Tag tag = serviceFactory.getTagService().findTagByName(tagName);
            List<AlbumTags> albumTags = serviceFactory.getAlbumService().getTopAlbumsByTag(tag, 0, 7);
            map.addAttribute("albumTags", albumTags);
        }
        return "music/music_album";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/music/songs/genre/{tagName}")
    public String viewSongs(@PathVariable("tagName") String tagName, Model map, HttpSession session) {
        if (tagName == null || tagName.equals("all")) {
            List<SongStats> songStats = serviceFactory.getSongService().getTopSongs(0, 7);
            map.addAttribute("songStats", songStats);
        } else {
            Tag tag = serviceFactory.getTagService().findTagByName(tagName);
            List<SongTags> songTags = serviceFactory.getSongService().getTopSongsByTag(tag, 0, 7);
            map.addAttribute("songTags", songTags);
        }
        return "music/music_song";
    }
}
