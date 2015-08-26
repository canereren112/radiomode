/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.song;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "songstats")
@NamedQueries({ //@NamedQuery(name = "SongStats.findAll", query = "SELECT s FROM SongStats s"),
    //@NamedQuery(name = "SongStats.findById", query = "SELECT s FROM SongStats s WHERE s.id = :id"),
    //@NamedQuery(name = "SongStats.findBySongid", query = "SELECT s FROM SongStats s WHERE s.songid = :songid"),
    //@NamedQuery(name = "SongStats.findByListenCount", query = "SELECT s FROM SongStats s WHERE s.listenCount = :listenCount"),
    //@NamedQuery(name = "SongStats.findByFanCount", query = "SELECT s FROM SongStats s WHERE s.fanCount = :fanCount"),
    //@NamedQuery(name = "SongStats.findByBlockCount", query = "SELECT s FROM SongStats s WHERE s.blockCount = :blockCount"),
    //@NamedQuery(name = "SongStats.findByCommentCount", query = "SELECT s FROM SongStats s WHERE s.commentCount = :commentCount"),
    //@NamedQuery(name = "SongStats.findByAvgListenPercent", query = "SELECT s FROM SongStats s WHERE s.avgListenPercent = :avgListenPercent"),
    //@NamedQuery(name = "SongStats.findByAvgVolumePercent", query = "SELECT s FROM SongStats s WHERE s.avgVolumePercent = :avgVolumePercent")

    @NamedQuery(name = "SongStats.findByArtistid", query = "SELECT ss FROM SongStats ss join ss.songid s JOIN s.artistid a WHERE a.artistid = :artistid"),
    @NamedQuery(name = "SongStats.findNoVideosByArtistid", query = "SELECT ss FROM SongStats ss join ss.songid s JOIN s.artistid a WHERE a.artistid = :artistid AND ss.videoCount = 0")
})
public class SongStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "songid")
    private Song songid;
    @Column(name = "listenCount")
    private Integer listenCount;
    @Column(name = "fanCount")
    private Integer fanCount;
    @Column(name = "blockCount")
    private Integer blockCount;
    @Column(name = "commentCount")
    private Integer commentCount;
    @Column(name = "avgListenPercent")
    private Integer avgListenPercent;
    @Column(name = "avgVolumePercent")
    private Integer avgVolumePercent;
    @Column(name = "popularPercent")
    private Integer popularPercent;
    @Column(name = "videoCount")
    private Integer videoCount;

    public Integer getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    public SongStats() {
    }

    public SongStats(Integer id) {
        this.id = id;
    }

    public SongStats(Integer id, Song songid) {
        this.id = id;
        this.songid = songid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Song getSongid() {
        return songid;
    }

    public void setSongid(Song songid) {
        this.songid = songid;
    }

    public Integer getListenCount() {
        return listenCount;
    }

    public void setListenCount(Integer listenCount) {
        this.listenCount = listenCount;
    }

    public Integer getFanCount() {
        return fanCount;
    }

    public void setFanCount(Integer fanCount) {
        this.fanCount = fanCount;
    }

    public Integer getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(Integer blockCount) {
        this.blockCount = blockCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getAvgListenPercent() {
        return avgListenPercent;
    }

    public void setAvgListenPercent(Integer avgListenPercent) {
        this.avgListenPercent = avgListenPercent;
    }

    public Integer getAvgVolumePercent() {
        return avgVolumePercent;
    }

    public void setAvgVolumePercent(Integer avgVolumePercent) {
        this.avgVolumePercent = avgVolumePercent;
    }

    public Integer getPopularPercent() {
        return popularPercent;
    }

    public void setPopularPercent(Integer popularPercent) {
        this.popularPercent = popularPercent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SongStats)) {
            return false;
        }
        SongStats other = (SongStats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.SongStats[id=" + id + "]";
    }
}
