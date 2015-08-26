/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.song.Song;
import com.eren.radiomode.domain.video.Video;
import com.eren.radiomode.domain.video.VideoStats;
import java.util.List;

/**
 *
 * @author work
 */
public interface VideoDAO extends IEntityDAO {

    Video saveVideo(Song song, String title, String videoNumber, int index, int duration);

    List<Video> getVideosBySong(Song song);

    List<VideoStats> getVideoStatsBySong(Song song);

    void saveVideoTags(Video video, String tag);
}
