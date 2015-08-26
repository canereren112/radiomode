/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eren.radiomode.domain.artist;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "artiststats")
@NamedQueries({
//@NamedQuery(name = "ArtistStats.findAll", query = "SELECT a FROM ArtistStats a"), 
//@NamedQuery(name = "ArtistStats.findById", query = "SELECT a FROM ArtistStats a WHERE a.id = :id"), 
//@NamedQuery(name = "ArtistStats.findByArtistid", query = "SELECT a FROM ArtistStats a WHERE a.artistid = :artistid"), 
//@NamedQuery(name = "ArtistStats.findByAlbumCount", query = "SELECT a FROM ArtistStats a WHERE a.albumCount = :albumCount"), 
//@NamedQuery(name = "ArtistStats.findBySongCount", query = "SELECT a FROM ArtistStats a WHERE a.songCount = :songCount"), 
//@NamedQuery(name = "ArtistStats.findByListenCount", query = "SELECT a FROM ArtistStats a WHERE a.listenCount = :listenCount"), 
//@NamedQuery(name = "ArtistStats.findByFanCount", query = "SELECT a FROM ArtistStats a WHERE a.fanCount = :fanCount"), 
//@NamedQuery(name = "ArtistStats.findByBlockCount", query = "SELECT a FROM ArtistStats a WHERE a.blockCount = :blockCount"), 
//@NamedQuery(name = "ArtistStats.findByCommentCount", query = "SELECT a FROM ArtistStats a WHERE a.commentCount = :commentCount"), 
//@NamedQuery(name = "ArtistStats.findByStationCount", query = "SELECT a FROM ArtistStats a WHERE a.stationCount = :stationCount")
})
public class ArtistStats implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @Column(name = "albumCount")
    private Integer albumCount;
    @Column(name = "songCount")
    private Integer songCount;
    @Column(name = "listenCount")
    private Integer listenCount;
    @Column(name = "fanCount")
    private Integer fanCount;
    @Column(name = "blockCount")
    private Integer blockCount;
    @Column(name = "commentCount")
    private Integer commentCount;
    @Column(name = "stationCount")
    private Integer stationCount;

    public ArtistStats() {
    }

    public ArtistStats(Integer id) {
        this.id = id;
    }

    public ArtistStats(Integer id, Artist artistid) {
        this.id = id;
        this.artistid = artistid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
    }

    public Integer getAlbumCount() {
        return albumCount;
    }

    public void setAlbumCount(Integer albumCount) {
        this.albumCount = albumCount;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
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

    public Integer getStationCount() {
        return stationCount;
    }

    public void setStationCount(Integer stationCount) {
        this.stationCount = stationCount;
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
        if(!(object instanceof ArtistStats)) {
            return false;
        }
        ArtistStats other = (ArtistStats) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistStats[id=" + id + "]";
    }

}
