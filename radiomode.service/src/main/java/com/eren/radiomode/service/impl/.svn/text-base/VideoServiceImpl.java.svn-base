/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.album.AlbumTags;
import com.eren.radiomode.domain.artist.ArtistTags;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.song.SongTags;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.domain.video.VideoStats;
import com.eren.radiomode.service.VideoService;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.google.gdata.client.youtube.YouTubeService;
import com.google.gdata.data.youtube.VideoEntry;
import com.google.gdata.data.youtube.YouTubeMediaGroup;
import com.google.gdata.util.ServiceException;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import sample.youtube.YouTubeReadonlyClient;

/**
 *
 * @author work
 */
public class VideoServiceImpl implements VideoService {

    @Autowired
    ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    public List<Video> getVideosBySong(Song song) {
        return serviceFactory.getEntityDAOFactory().getVideoDAO().getVideosBySong(song);
    }

    public List<VideoStats> getVideoStatsBySong(Song song) {
        return serviceFactory.getEntityDAOFactory().getVideoDAO().getVideoStatsBySong(song);
    }

    public Video saveVideo(Song song, String title, String videoNumber, int index, Short duration) {
        return serviceFactory.getEntityDAOFactory().getVideoDAO().saveVideo(song, title, videoNumber, index, duration);
    }

    public void saveVideoTags(Video video, String tag) {
        serviceFactory.getEntityDAOFactory().getVideoDAO().saveVideoTags(video, tag);
    }

    public void saveYoutubeVideoBySong(Song song) throws IOException, ServiceException {
        YouTubeService myService = new YouTubeService("radiomode",
                "AI39si7W1iqAN8Lpj9gW5EVBDk9Iyl19LfVkXJQP2HHDP3MryPQAv5EpZRUs0NWwfdzYZVbLoY9GkXOI6LFK69jRhX_jhYoQ2g");
        String searchTerm = song.getArtistid().getName() + " - " + song.getSongName();
        List<VideoEntry> entrys = YouTubeReadonlyClient.searchFeed(myService, searchTerm);
        int index = 0;
        for (VideoEntry entry : entrys) {
            if (index >= 5) {
                break;
            }
            index++;

            YouTubeMediaGroup mediaGroup = entry.getMediaGroup();
            String thumbnail = "";
            if (mediaGroup.getThumbnails().size() > 0) {
                thumbnail = mediaGroup.getThumbnails().get(0).getUrl();
            }
            //mediaGroup.get
            Video video = serviceFactory.getVideoService().saveVideo(song, entry.getTitle().getPlainText(),
                    mediaGroup.getVideoId(), index, mediaGroup.getDuration().shortValue());
            //TODO savevideostats diye metoda cekilecek sonra
            VideoStats stats = new VideoStats();
            stats.setVideoid(video);
            stats.setAvgListenPercent(100);
            stats.setAvgVolumePercent(100);
            stats.setBlockCount(0);
            stats.setCommentCount(0);
            stats.setFanCount(0);
            stats.setListenCount(0);
            stats.setPopularPercent(50);
            stats.setWrongCount(0);
            serviceFactory.getEntityDAOFactory().getVideoDAO().saveEntity(stats);

            //TODO burasi acilacak sonra
//            for (String keyword : mediaGroup.getKeywords().getKeywords()) {
//                serviceFactory.getVideoService().saveVideoTags(video, keyword);
//                Tag tag = serviceFactory.getTagService().findTagByName(keyword);
//                if (tag != null) {
//                    if (!song.getSongName().contains(tag.getName()) && !song.getAlbumid().getAlbumName().contains(tag.getName())
//                            && !song.getArtistid().getName().contains(tag.getName()) && !song.getArtistid().getSortname().contains(tag.getName())) {
//
//                        tag.setRefcount(tag.getRefcount() + 3);
//                        serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(tag);
//
//                        SongTags songTags = new SongTags();
//                        songTags.setSongid(song);
//                        songTags.setTagid(tag);
//                        List<SongTags> songList = serviceFactory.getEntityDAOFactory().getTagDAO().loadEntityByParam(songTags);
//                        if (songList.size() > 0) {
//                            songList.get(0).setCount(songList.get(0).getCount() + 1);
//                            serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(songList.get(0));
//                        } else {
//                            songTags.setCount(1);
//                            serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(songTags);
//                        }
//
//                        AlbumTags albumTags = new AlbumTags();
//                        albumTags.setAlbumid(song.getAlbumid());
//                        albumTags.setTagid(tag);
//                        List<AlbumTags> albumList = serviceFactory.getEntityDAOFactory().getTagDAO().loadEntityByParam(albumTags);
//                        if (songList.size() > 0) {
//                            albumList.get(0).setCount(albumList.get(0).getCount() + 1);
//                            serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(albumList.get(0));
//                        } else {
//                            albumTags.setCount(1);
//                            serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(albumTags);
//                        }
//
//                        ArtistTags artistTags = new ArtistTags();
//                        artistTags.setArtistid(song.getArtistid());
//                        artistTags.setTagid(tag);
//                        List<ArtistTags> artistList = serviceFactory.getEntityDAOFactory().getTagDAO().loadEntityByParam(artistTags);
//                        if (artistList.size() > 0) {
//                            artistList.get(0).setCount(artistList.get(0).getCount() + 1);
//                            serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(artistList.get(0));
//                        } else {
//                            artistTags.setCount(1);
//                            serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(artistTags);
//                        }
//                    }
//                }
//            }

            //songStat.setVideoCount(songStat.getVideoCount() + 1);
        }
        //serviceFactory.getEntityDAOFactory().getTagDAO().saveEntity(songStat);
    }
}
