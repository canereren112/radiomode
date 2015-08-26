/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.impl;

import com.eren.radiomode.dao.VideoDAO;
import com.eren.radiomode.dao.parent.EntityDAO;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.WebPages;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.domain.video.VideoStats;
import com.eren.radiomode.domain.video.VideoTags;
import java.util.List;

/**
 *
 * @author work
 */
public class VideoDAOImpl extends EntityDAO implements VideoDAO {

    public Video saveVideo(Song song, String title, String videoNumber, int index, int duration) {
        if (title.length() > 100) {
            title = title.substring(0, 100);
        } else {
            title = title.substring(0, title.length());
        }
        Video video = new Video();
        video.setSongid(song);
        video.setTitle(title);
        video.setVideoNumber(videoNumber);
        video.setSearchIndex(index);
        //TODO 1 yerine dinamik metoda youtube webpage nesnesi parametre olarak eklenmeli
        video.setWebsite(new WebPages(1));
        video.setVideotype(Video.VideoType.OTHER.name());
        video.setDuration(duration);
        getHibernateTemplate().save(video);
        return video;
    }

    public List<Video> getVideosBySong(Song song) {
        List<Video> videos = getHibernateTemplate().findByNamedQueryAndNamedParam("Video.findBySongid", "songid", song.getSongid());
        return videos;
    }

    public List<VideoStats> getVideoStatsBySong(Song song) {
        List<VideoStats> videos = getHibernateTemplate().findByNamedQueryAndNamedParam("VideoStats.findBySongid", "songid", song.getSongid());
        return videos;
    }

    //TODO testi yapilacak!
    public void saveVideoTags(Video video, String tag) {
        tag = tag.toLowerCase();
        VideoTags videoTags = new VideoTags();
        Tag tagObject = new Tag();
        tagObject.setName(tag);
        List<Tag> tags = this.loadEntityByParam(tagObject);
        if (tags.size() > 0) {
            tagObject = tags.get(0);
            
            videoTags.setTagid(tagObject);
            videoTags.setVideoid(video);
            List<VideoTags> videoTagList = this.loadEntityByParam(videoTags);
            if (videoTagList.size() > 0) {
                videoTags = videoTagList.get(0);
                videoTags.setCount(videoTags.getCount() + 1);
                this.saveEntity(videoTags);
                return;
            }
        } else {
            tagObject.setRefcount(new Integer(0));
            this.saveEntity(tagObject);
        }

        videoTags.setTagid(tagObject);
        videoTags.setVideoid(video);
        videoTags.setCount(new Integer(1));
        this.saveEntity(videoTags);
    }
}
