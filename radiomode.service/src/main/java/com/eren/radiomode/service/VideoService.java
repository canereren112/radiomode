/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.domain.video.VideoStats;
import com.google.gdata.util.ServiceException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author work
 */
public interface VideoService {

    Video saveVideo(Song song, String title, String videoNumber, int index, Short duration);

    List<Video> getVideosBySong(Song song);

    List<VideoStats> getVideoStatsBySong(Song song);

    void saveVideoTags(Video video, String tag);

    void saveYoutubeVideoBySong(Song song) throws IOException, ServiceException;
}
