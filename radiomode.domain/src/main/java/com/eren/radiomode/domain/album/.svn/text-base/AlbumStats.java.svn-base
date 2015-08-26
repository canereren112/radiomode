/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.album;

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
@Table(name = "albumstats")
@NamedQueries({ //@NamedQuery(name = "AlbumStats.findAll", query = "SELECT a FROM AlbumStats a"),
//@NamedQuery(name = "AlbumStats.findById", query = "SELECT a FROM AlbumStats a WHERE a.id = :id"), 
//@NamedQuery(name = "AlbumStats.findByAlbumid", query = "SELECT a FROM AlbumStats a WHERE a.albumid = :albumid"), 
//@NamedQuery(name = "AlbumStats.findBySongCount", query = "SELECT a FROM AlbumStats a WHERE a.songCount = :songCount"), 
//@NamedQuery(name = "AlbumStats.findByListenCount", query = "SELECT a FROM AlbumStats a WHERE a.listenCount = :listenCount"), 
//@NamedQuery(name = "AlbumStats.findByFanCount", query = "SELECT a FROM AlbumStats a WHERE a.fanCount = :fanCount"), 
//@NamedQuery(name = "AlbumStats.findByBlockCount", query = "SELECT a FROM AlbumStats a WHERE a.blockCount = :blockCount"), 
//@NamedQuery(name = "AlbumStats.findByCommentCount", query = "SELECT a FROM AlbumStats a WHERE a.commentCount = :commentCount")
})
public class AlbumStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "albumid")
    private Album albumid;
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

    public AlbumStats() {
    }

    public AlbumStats(Integer id) {
        this.id = id;
    }

    public AlbumStats(Integer id, Album albumid) {
        this.id = id;
        this.albumid = albumid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Album getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Album albumid) {
        this.albumid = albumid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlbumStats)) {
            return false;
        }
        AlbumStats other = (AlbumStats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.AlbumStats[id=" + id + "]";
    }
}
