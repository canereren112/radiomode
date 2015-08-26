/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.video;

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
@Table(name = "videostats")
@NamedQueries({
    //@NamedQuery(name = "VideoStats.findAll", query = "SELECT v FROM VideoStats v"),
    //@NamedQuery(name = "VideoStats.findById", query = "SELECT v FROM VideoStats v WHERE v.id = :id"),
    //@NamedQuery(name = "VideoStats.findByVideoid", query = "SELECT v FROM VideoStats v WHERE v.videoid = :videoid"),
    //@NamedQuery(name = "VideoStats.findByListenCount", query = "SELECT v FROM VideoStats v WHERE v.listenCount = :listenCount"),
    //@NamedQuery(name = "VideoStats.findByFanCount", query = "SELECT v FROM VideoStats v WHERE v.fanCount = :fanCount"),
    //@NamedQuery(name = "VideoStats.findByBlockCount", query = "SELECT v FROM VideoStats v WHERE v.blockCount = :blockCount"),
    //@NamedQuery(name = "VideoStats.findByCommentCount", query = "SELECT v FROM VideoStats v WHERE v.commentCount = :commentCount"),
    //@NamedQuery(name = "VideoStats.findByWrongCount", query = "SELECT v FROM VideoStats v WHERE v.wrongCount = :wrongCount"),
    //@NamedQuery(name = "VideoStats.findByAvgListenPercent", query = "SELECT v FROM VideoStats v WHERE v.avgListenPercent = :avgListenPercent"),
    //@NamedQuery(name = "VideoStats.findByAvgVolumePercent", query = "SELECT v FROM VideoStats v WHERE v.avgVolumePercent = :avgVolumePercent")
    @NamedQuery(name = "VideoStats.findBySongid", query = "SELECT vs FROM VideoStats vs JOIN vs.videoid v JOIN v.songid s WHERE s.id = :songid")
})
public class VideoStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "videoid")
    private Video videoid;
    @Column(name = "listenCount")
    private Integer listenCount;
    @Column(name = "fanCount")
    private Integer fanCount;
    @Column(name = "blockCount")
    private Integer blockCount;
    @Column(name = "commentCount")
    private Integer commentCount;
    @Column(name = "wrongCount")
    private Integer wrongCount;
    @Column(name = "avgListenPercent")
    private Integer avgListenPercent;
    @Column(name = "avgVolumePercent")
    private Integer avgVolumePercent;
    @Column(name = "popularPercent")
    private Integer popularPercent;

    public VideoStats() {
    }

    public VideoStats(Integer id) {
        this.id = id;
    }

    public VideoStats(Integer id, Video videoid) {
        this.id = id;
        this.videoid = videoid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Video getVideoid() {
        return videoid;
    }

    public void setVideoid(Video videoid) {
        this.videoid = videoid;
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

    public Integer getWrongCount() {
        return wrongCount;
    }

    public void setWrongCount(Integer wrongCount) {
        this.wrongCount = wrongCount;
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
        if(!(object instanceof VideoStats)) {
            return false;
        }
        VideoStats other = (VideoStats) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.VideoStats[id=" + id + "]";
    }
}
