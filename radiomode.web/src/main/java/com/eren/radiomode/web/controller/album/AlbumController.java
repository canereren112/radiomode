/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.album;

import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.album.AlbumFans;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.web.util.UtilImpl;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author firat
 */
@Controller
public class AlbumController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/{albumName}")
    public String viewAlbum(@PathVariable("albumName") String albumName, Model map, HttpSession session) {
        albumName = UtilImpl.rewriteParams(albumName);
        Album album = serviceFactory.getAlbumService().getAlbumByName(albumName);
        List<UserActivity> activities = serviceFactory.getUserService().getAlbumActivity(album, 0, 10);
        List<AlbumFans> albumFans = serviceFactory.getAlbumService().getAlbumFans(album, 0, 5);
        List<Album> otherAlbums = serviceFactory.getAlbumService().getAlbumsByArtist(album.getArtistid(), 0, 5);
        if (otherAlbums.contains(album)) {
            otherAlbums.remove(album);
        } else if (otherAlbums.size() == 5) {
            otherAlbums.remove(otherAlbums.size() - 1);
        }
        //TODO similiarAlbums cekilecek
        List<Song> songs = serviceFactory.getSongService().getSongsByAlbum(album);
        map.addAttribute("album", album);
        map.addAttribute("songs", songs);
        map.addAttribute("activities", activities);
        map.addAttribute("albumFans", albumFans);
        map.addAttribute("otherAlbums", otherAlbums);
        //map.addAttribute("similiarAlbums", similiarAlbums);
        return "album";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/{albumName}/general")
    public String viewAlbumGeneral(@PathVariable("albumName") String albumName, Model map, HttpSession session) {
        albumName = UtilImpl.rewriteParams(albumName);
        Album album = serviceFactory.getAlbumService().getAlbumByName(albumName);
        List<UserActivity> activities = serviceFactory.getUserService().getAlbumActivity(album, 0, 10);
        List<AlbumFans> albumFans = serviceFactory.getAlbumService().getAlbumFans(album, 0, 5);
        List<Album> otherAlbums = serviceFactory.getAlbumService().getAlbumsByArtist(album.getArtistid(), 0, 5);
        if (otherAlbums.contains(album)) {
            otherAlbums.remove(album);
        } else if (otherAlbums.size() == 5) {
            otherAlbums.remove(otherAlbums.size() - 1);
        }
        //TODO similiarAlbums cekilecek
        List<Song> songs = serviceFactory.getSongService().getSongsByAlbum(album);
        map.addAttribute("album", album);
        map.addAttribute("songs", songs);
        map.addAttribute("activities", activities);
        map.addAttribute("albumFans", albumFans);
        map.addAttribute("otherAlbums", otherAlbums);
        //map.addAttribute("similiarAlbums", similiarAlbums);
        return "album/album_general";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/{albumName}/albums")
    public String viewAlbumAlbums(@PathVariable("albumName") String albumName, Model map, HttpSession session) {
        Integer albumID;
        albumName = UtilImpl.rewriteParams(albumName);
        Album album = serviceFactory.getAlbumService().getAlbumByName(albumName);
        albumID = album.getAlbumid();

        List<Album> otherAlbums = serviceFactory.getAlbumService().getAlbumsByArtist(album.getArtistid(), 0, 11);
        if (otherAlbums.contains(album)) {
            otherAlbums.remove(album);
        } else if (otherAlbums.size() == 11) {
            otherAlbums.remove(otherAlbums.size() - 1);
        }

        map.addAttribute("albumID", albumID);
        map.addAttribute("otherAlbums", otherAlbums);
        return "album/album_albums";
    }
    
     @RequestMapping(method = RequestMethod.GET, value = "/album/otherAlbums/{albumID}")
    public String viewAlbumOtherAlbums(@PathVariable Integer albumID, Model map, HttpSession session) {
         
        Album album = new Album(albumID);

        List<Album> otherAlbums = serviceFactory.getAlbumService().getAlbumsByArtist(album.getArtistid(), 0, 11);
        if (otherAlbums.contains(album)) {
            otherAlbums.remove(album);
        } else if (otherAlbums.size() == 11) {
            otherAlbums.remove(otherAlbums.size() - 1);
        }

        map.addAttribute("albumID", albumID);
        map.addAttribute("otherAlbums", otherAlbums);
        return "album/album_albums";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/{albumName}/activity")
    public String viewAlbumActivity(@PathVariable("albumName") String albumName, Model map, HttpSession session) {
        albumName = UtilImpl.rewriteParams(albumName);
        Album album = serviceFactory.getAlbumService().getAlbumByName(albumName);
        List<UserActivity> activities = serviceFactory.getUserService().getAlbumActivity(album, 0, 10);
        map.addAttribute("activities", activities);
        return "album/album_activity";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/{albumName}/listeners")
    public String viewAlbumListeners(@PathVariable("albumName") String albumName, Model map, HttpSession session) {
        albumName = UtilImpl.rewriteParams(albumName);        
        Integer pageSize = 6;
        Integer fanNumberOfAlbum;
        Integer fanPageNumberOfAlbum;
        Integer albumID;

        Album album = serviceFactory.getAlbumService().getAlbumByName(albumName);
        albumID = album.getAlbumid();
        List<AlbumFans> albumFans = serviceFactory.getAlbumService().getAlbumFans(album, 0, pageSize.intValue());
        fanNumberOfAlbum = serviceFactory.getAlbumService().getFanNumberOfAnAlbum(albumID);
        
        
        if ((fanNumberOfAlbum % pageSize) == 0) {
            fanPageNumberOfAlbum = (fanNumberOfAlbum / pageSize);
        } else {
            fanPageNumberOfAlbum = (fanNumberOfAlbum / pageSize) + 1;
        }
        
        map.addAttribute("fanPageNumberOfAlbum", fanPageNumberOfAlbum);
        map.addAttribute("albumID", albumID);
        map.addAttribute("albumFans", albumFans);
        return "album/album_listeners";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/albumList/listeners/{currentPage}/albumNO/{albumID}")
    public String viewAlbumListenersList(@PathVariable Integer currentPage, @PathVariable("albumID") Integer albumID, Model map) {
        Album album = new Album(albumID);
        Integer firstIndex;
        Integer pageSize = 6;
        firstIndex = ((currentPage * pageSize) - pageSize);

        List<AlbumFans> albumFans = serviceFactory.getAlbumService().getAlbumFans(album, firstIndex.intValue(), pageSize.intValue());
        map.addAttribute("albumFans", albumFans);
        return "album/list/albumListenerList";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/{albumName}/more_info")
    public String viewAlbumMoreInfo(@PathVariable("albumName") String albumName, Model map, HttpSession session) {
        albumName = UtilImpl.rewriteParams(albumName);
        //TODO
        return "album/album_more_information";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/album/{albumName}/songs")
    public String viewAlbumSongs(@PathVariable("albumName") String albumName, Model map, HttpSession session) {

        albumName = UtilImpl.rewriteParams(albumName);
        Integer albumiD;
        Integer songNumberOfAlbum;
        Integer songPageNumberOfAlbum;
        List<Song> songs;

        // Ilk kez cagrildigi zaman
        Album album = serviceFactory.getAlbumService().getAlbumByName(albumName);
        songs = serviceFactory.getSongService().getSongOfAlbumByPage(album, 1);
        songNumberOfAlbum = serviceFactory.getSongService().getNumberOfSongs(album.getAlbumid());
        albumiD = album.getAlbumid();

        songPageNumberOfAlbum = (songNumberOfAlbum / 10) + 1;


        map.addAttribute("songPageNumberOfAlbum", songPageNumberOfAlbum);
        map.addAttribute("songs", songs);
        map.addAttribute("albumiD", albumiD);
        return "album/album_song_list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/albumList/songs/{currentPage}/albumNO/{albumID}")
    public String viewAbumList(@PathVariable Integer currentPage, @PathVariable Integer albumID, Model map, HttpSession session) {
        Album album = new Album();
        album.setAlbumid(albumID);

        List<Song> songs = serviceFactory.getSongService().getSongOfAlbumByPage(album, currentPage);
        map.addAttribute("songs", songs);
        return "album/list/albumSongList";
    }
}
