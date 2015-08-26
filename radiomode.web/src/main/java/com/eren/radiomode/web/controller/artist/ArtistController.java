/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.artist;

import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.artist.ArtistFans;
import com.eren.radiomode.domain.artist.ArtistPictures;
import com.eren.radiomode.domain.artist.ArtistSimiliar;
import com.eren.radiomode.domain.artist.ArtistStats;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongStats;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.web.util.UtilImpl;
import java.util.ArrayList;
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
public class ArtistController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}")
    public String viewArtist(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        List<UserActivity> activities = serviceFactory.getUserService().getArtistActivity(artist, 0, 10);
        List<Album> albums = serviceFactory.getAlbumService().getAlbumsByArtist(artist, 0, 4);
        List<ArtistFans> artistFans = serviceFactory.getArtistService().getArtistFans(artist, 0, 5);
        //List songs = serviceFactory.getListenHistoryService().getMostListenedSongsByArtist(artist, 0, 10);
        List<SongStats> songs = serviceFactory.getSongService().getTopSongsByArtist(artist, 0, 10);
        List<ArtistSimiliar> similiars = serviceFactory.getArtistService().getSimiliarArtists(artist, 0, 5);

        serviceFactory.getArtistService().saveArtistBioAndPicture(artist);
        for (ArtistSimiliar similiar : similiars) {
            serviceFactory.getArtistService().saveArtistBioAndPicture(similiar.getSimiliarArtistid());
        }

        //List<ArtistSimiliar> similiars = new ArrayList<ArtistSimiliar>();
        ArtistStats stats = artist.getArtistStats();
        map.addAttribute("artist", artist);
        map.addAttribute("activities", activities);
        map.addAttribute("albums", albums);
        String biography = artist.getBiography();
        if (biography != null && artist.getBiography().length() > 800) {
            biography = biography.substring(0, 800);
        }
        String moreInfo = artist.getMoreInfo();
        if (moreInfo != null && moreInfo.length() > 400) {
            moreInfo = moreInfo.substring(0, 400);
        }
        map.addAttribute("moreInfo", moreInfo);
        map.addAttribute("biography", biography);
        map.addAttribute("artistFans", artistFans);
        map.addAttribute("songs", songs);
        map.addAttribute("similiars", similiars);
        return "artist";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/general")
    public String viewArtistGeneral(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        List<UserActivity> activities = serviceFactory.getUserService().getArtistActivity(artist, 0, 10);
        List<Album> albums = serviceFactory.getAlbumService().getAlbumsByArtist(artist, 0, 4);
        List<ArtistFans> artistFans = serviceFactory.getArtistService().getArtistFans(artist, 0, 5);
        //List songs = serviceFactory.getListenHistoryService().getMostListenedSongsByArtist(artist, 0, 10);
        List<SongStats> songs = serviceFactory.getSongService().getTopSongsByArtist(artist, 0, 10);
        List<ArtistSimiliar> similiars = serviceFactory.getArtistService().getSimiliarArtists(artist, 0, 5);

        serviceFactory.getArtistService().saveArtistBioAndPicture(artist);
        for (ArtistSimiliar similiar : similiars) {
            serviceFactory.getArtistService().saveArtistBioAndPicture(similiar.getSimiliarArtistid());
        }

        //List<ArtistSimiliar> similiars = new ArrayList<ArtistSimiliar>();
        ArtistStats stats = artist.getArtistStats();
        map.addAttribute("artist", artist);
        map.addAttribute("activities", activities);
        map.addAttribute("albums", albums);
        String biography = artist.getBiography();
        if (biography != null && artist.getBiography().length() > 800) {
            biography = biography.substring(0, 800);
        }
        String moreInfo = artist.getMoreInfo();
        if (moreInfo != null && moreInfo.length() > 400) {
            moreInfo = moreInfo.substring(0, 400);
        }
        map.addAttribute("moreInfo", moreInfo);
        map.addAttribute("biography", biography);
        map.addAttribute("artistFans", artistFans);
        map.addAttribute("songs", songs);
        map.addAttribute("similiars", similiars);
        return "artist/artist_general";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/activity")
    public String viewArtistActivity(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        List<UserActivity> activities = serviceFactory.getUserService().getArtistActivity(artist, 0, 10);
        map.addAttribute("activities", activities);
        return "artist/artist_activity";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/albums")
    public String viewArtistAlbums(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Integer artistID;
        Integer pageSize = 4;
        Integer albumNumberOfArtist;
        Integer albumPageNumberOfArtist;

        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        artistID = artist.getArtistid();
        albumNumberOfArtist = serviceFactory.getAlbumService().getAlbumNumberOfArtist(artistID);
        List<Album> albums = serviceFactory.getAlbumService().getAlbumsByArtist(artist, 0, pageSize.intValue());



        if ((albumNumberOfArtist % pageSize) == 0) {
            albumPageNumberOfArtist = (albumNumberOfArtist / pageSize);
        } else {
            albumPageNumberOfArtist = (albumNumberOfArtist / pageSize) + 1;
        }


        map.addAttribute("albums", albums);
        map.addAttribute("artistId", artistID);
        map.addAttribute("albumPageNumberOfArtist", albumPageNumberOfArtist);
        return "artist/artist_albums";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artistList/albums/{currentPage}/artistNO/{artistID}")
    public String viewArtistAlbumList(@PathVariable Integer currentPage, @PathVariable Integer artistID, Model map, HttpSession session) {
        Artist artist = new Artist(artistID);
        Integer firstIndex;
        Integer pageSize = 4;
        firstIndex = ((currentPage * pageSize) - pageSize);

        List<Album> albums = serviceFactory.getAlbumService().getAlbumsByArtist(artist, firstIndex.intValue(), pageSize.intValue());
        map.addAttribute("albums", albums);
        return "artist/list/artistAlbumList";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/biography")
    public String viewArtistBiography(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        map.addAttribute("biography", artist.getBiography());
        return "artist/artist_biography";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/more_info")
    public String viewArtistMoreInfo(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        map.addAttribute("moreInfo", artist.getMoreInfo());
        return "artist/artist_more_information";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/songs")
    public String viewArtistSongs(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Integer artistId;
        Integer songNumberOfArtist;
        Integer songPageNumberOfArtist;
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        artistId = artist.getArtistid();
        songNumberOfArtist = serviceFactory.getSongService().getSongNumberOfArtist(artistId);
        //List songs = serviceFactory.getListenHistoryService().getMostListenedSongsByArtist(artist, 0, 10);
        //List<SongStats> songs = serviceFactory.getSongService().getTopSongsByArtist(artist, 0, 10);


        List<SongStats> songs = serviceFactory.getSongService().getSongsOfArtistByPage(artist, 1);

        songPageNumberOfArtist = (songNumberOfArtist / 10) + 1;
        map.addAttribute("songs", songs);
        map.addAttribute("artistId", artistId);
        map.addAttribute("songPageNumberOfArtist", songPageNumberOfArtist);
        return "artist/artist_popular_songs";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artistList/songs/{currentPage}/artistNO/{artistID}")
    public String viewArtistSongList(@PathVariable Integer currentPage, @PathVariable Integer artistID, Model map, HttpSession session) {
        Artist artist = new Artist(artistID);

        List<SongStats> songs = serviceFactory.getSongService().getSongsOfArtistByPage(artist, currentPage);
        map.addAttribute("songs", songs);
        return "artist/list/artistSongList";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/similiars")
    public String viewArtistSimiliars(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Integer artistID;
        Integer similiarArtistPageNumberOfArtist;
        Integer similiarArtistNumberOfArtist;
        Integer pageSize = 5;


        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        List<ArtistSimiliar> similiars = serviceFactory.getArtistService().getSimiliarArtists(artist, 0, pageSize.intValue());

        for (ArtistSimiliar similiar : similiars) {
            serviceFactory.getArtistService().saveArtistBioAndPicture(similiar.getSimiliarArtistid());
        }

        String biography = artist.getBiography();
        if (biography != null && artist.getBiography().length() > 50) {
            biography = biography.substring(0, 50);
        }


        artistID = artist.getArtistid();
        similiarArtistNumberOfArtist = serviceFactory.getArtistService().getSimiliarArtistNumberOfAnArtist(artistID);

        if ((similiarArtistNumberOfArtist % pageSize) == 0) {
            similiarArtistPageNumberOfArtist = (similiarArtistNumberOfArtist / pageSize);
        } else {
            similiarArtistPageNumberOfArtist = (similiarArtistNumberOfArtist / pageSize) + 1;
        }

        map.addAttribute("similiars", similiars);
        map.addAttribute("artistId", artistID);
        map.addAttribute("similiarArtistPageNumberOfArtist", similiarArtistPageNumberOfArtist);
        return "artist/artist_similiar_artists";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artistList/similiarArtist/{currentPage}/artistNO/{artistID}")
    public String viewArtistSimiliarArtistList(@PathVariable Integer currentPage, @PathVariable Integer artistID, Model map, HttpSession session) {
        Artist artist = new Artist(artistID);
        Integer firstIndex;
        Integer pageSize = 5;
        firstIndex = ((currentPage * pageSize) - pageSize);

        List<ArtistSimiliar> similiars = serviceFactory.getArtistService().getSimiliarArtists(artist, firstIndex.intValue(), pageSize.intValue());

        for (ArtistSimiliar similiar : similiars) {
            //   serviceFactory.getArtistService().saveArtistBioAndPicture(similiar.getSimiliarArtistid());
        }

        map.addAttribute("similiars", similiars);
        return "artist/list/artistSimiliarArtistList";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artist/{artistName}/listeners")
    public String viewArtistListeners(@PathVariable("artistName") String artistName, Model map, HttpSession session) {
        artistName = UtilImpl.rewriteParams(artistName);
        Integer pageSize = 6;
        Integer fanNumberOfArtist;
        Integer fanPageNumberOfArtist;
        Integer artistID;

        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        artistID = artist.getArtistid();
        List<ArtistFans> artistFans = serviceFactory.getArtistService().getArtistFans(artist, 0, pageSize.intValue());

        fanNumberOfArtist = serviceFactory.getArtistService().getFanNumberOfAnArtist(artistID);


        if ((fanNumberOfArtist % pageSize) == 0) {
            fanPageNumberOfArtist = (fanNumberOfArtist / pageSize);
        } else {
            fanPageNumberOfArtist = (fanNumberOfArtist / pageSize) + 1;
        }

        map.addAttribute("fanPageNumberOfArtist", fanPageNumberOfArtist);
        map.addAttribute("artistId", artistID);
        map.addAttribute("artistFans", artistFans);
        return "artist/artist_listeners";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/artistList/listeners/{currentPage}/artistNO/{artistID}")
    public String viewArtistListenersList(@PathVariable Integer currentPage, @PathVariable("artistID") Integer artistID, Model map, HttpSession session) {
        Artist artist = new Artist(artistID);
        Integer firstIndex;
        Integer pageSize = 6;
        firstIndex = ((currentPage * pageSize) - pageSize);

        List<ArtistFans> artistFans = serviceFactory.getArtistService().getArtistFans(artist, firstIndex.intValue(), pageSize.intValue());
        map.addAttribute("artistFans", artistFans);
        return "artist/list/artistListenerList";
    }
}
