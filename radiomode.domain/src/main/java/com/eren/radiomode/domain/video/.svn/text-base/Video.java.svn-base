/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.video;

import com.eren.radiomode.domain.WebPages;
import com.eren.radiomode.domain.song.Song;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "video")
@NamedQueries({ //@NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v"),
    //@NamedQuery(name = "Video.findByVideoid", query = "SELECT v FROM Video v WHERE v.videoid = :videoid"),
    //@NamedQuery(name = "Video.findByVideotype", query = "SELECT v FROM Video v WHERE v.videotype = :videotype"),
    //@NamedQuery(name = "Video.findByWebsite", query = "SELECT v FROM Video v WHERE v.website = :website"),
    //@NamedQuery(name = "Video.findByUrl", query = "SELECT v FROM Video v WHERE v.videoNumber = :videoNumber"),
    //@NamedQuery(name = "Video.findBySearchIndex", query = "SELECT v FROM Video v WHERE v.searchIndex = :searchIndex")

    @NamedQuery(name = "Video.findBySongid", query = "SELECT v FROM Video v JOIN v.songid s WHERE s.songid = :songid")
})
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "videoid")
    private Integer videoid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "songid")
    private Song songid;
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "videotype")
    private String videotype;
    @Basic(optional = false)
    @JoinColumn(name = "website")
    @ManyToOne
    private WebPages website;
    @Column(name = "videoNumber")
    private String videoNumber;
    @Column(name = "searchIndex")
    private Integer searchIndex;
    @Column(name = "duration")
    private Integer duration;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statsid")
    private VideoStats videoStats;

    public static enum VideoType {

        OFFICIAL, LIVE, AMATEUR, OTHER;
    }

    public Video() {
    }

    public Video(Integer videoid) {
        this.videoid = videoid;
    }

    public Video(Integer videoid, Song songid, String videotype, WebPages website) {
        this.videoid = videoid;
        this.songid = songid;
        this.videotype = videotype;
        this.website = website;
    }

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public Song getSongid() {
        return songid;
    }

    public void setSongid(Song songid) {
        this.songid = songid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideotype() {
        return videotype;
    }

    public void setVideotype(String videotype) {
        this.videotype = videotype;
    }

    public WebPages getWebsite() {
        return website;
    }

    public void setWebsite(WebPages website) {
        this.website = website;
    }

    public String getVideoNumber() {
        return videoNumber;
    }

    public void setVideoNumber(String videoNumber) {
        this.videoNumber = videoNumber;
    }

    public Integer getSearchIndex() {
        return searchIndex;
    }

    public void setSearchIndex(Integer searchIndex) {
        this.searchIndex = searchIndex;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public VideoStats getVideoStats() {
        return videoStats;
    }

    public void setVideoStats(VideoStats videoStats) {
        this.videoStats = videoStats;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (videoid != null ? videoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Video)) {
            return false;
        }
        Video other = (Video) object;
        if ((this.videoid == null && other.videoid != null) || (this.videoid != null && !this.videoid.equals(other.videoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Video[videoid=" + videoid + "]";
    }
}
