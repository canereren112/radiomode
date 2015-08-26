/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.user;

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
@Table(name = "userstats")
@NamedQueries({ //@NamedQuery(name = "UserStats.findAll", query = "SELECT u FROM UserStats u"),
//@NamedQuery(name = "UserStats.findById", query = "SELECT u FROM UserStats u WHERE u.id = :id"), 
//@NamedQuery(name = "UserStats.findByUserid", query = "SELECT u FROM UserStats u WHERE u.userid = :userid"), 
//@NamedQuery(name = "UserStats.findByArtistLikeCount", query = "SELECT u FROM UserStats u WHERE u.artistLikeCount = :artistLikeCount"), 
//@NamedQuery(name = "UserStats.findByArtistBlockCount", query = "SELECT u FROM UserStats u WHERE u.artistBlockCount = :artistBlockCount"), 
//@NamedQuery(name = "UserStats.findByStationLikeCount", query = "SELECT u FROM UserStats u WHERE u.stationLikeCount = :stationLikeCount"), 
//@NamedQuery(name = "UserStats.findBySongLikeCount", query = "SELECT u FROM UserStats u WHERE u.songLikeCount = :songLikeCount"), 
//@NamedQuery(name = "UserStats.findBySongBlockCount", query = "SELECT u FROM UserStats u WHERE u.songBlockCount = :songBlockCount"), 
//@NamedQuery(name = "UserStats.findByListenCount", query = "SELECT u FROM UserStats u WHERE u.listenCount = :listenCount"), 
//@NamedQuery(name = "UserStats.findByFriendCount", query = "SELECT u FROM UserStats u WHERE u.friendCount = :friendCount")
})
public class UserStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "artistLikeCount")
    private Integer artistLikeCount;
    @Column(name = "artistBlockCount")
    private Integer artistBlockCount;
    @Column(name = "stationLikeCount")
    private Integer stationLikeCount;
    @Column(name = "albumLikeCount")
    private Integer albumLikeCount;
    @Column(name = "albumBlockCount")
    private Integer albumBlockCount;
    @Column(name = "songLikeCount")
    private Integer songLikeCount;
    @Column(name = "songBlockCount")
    private Integer songBlockCount;
    @Column(name = "listenCount")
    private Integer listenCount;
    @Column(name = "friendCount")
    private Integer friendCount;
    @Column(name = "commentCount")
    private Integer commentCount;

    public UserStats() {
    }

    public UserStats(Integer id) {
        this.id = id;
    }

    public UserStats(Integer id, User userid) {
        this.id = id;
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public Integer getArtistLikeCount() {
        return artistLikeCount;
    }

    public void setArtistLikeCount(Integer artistLikeCount) {
        this.artistLikeCount = artistLikeCount;
    }

    public void setArtistLikeCount(int artistLikeCount) {
        this.artistLikeCount = new Integer((short) artistLikeCount);
    }

    public Integer getArtistBlockCount() {
        return artistBlockCount;
    }

    public void setArtistBlockCount(Integer artistBlockCount) {
        this.artistBlockCount = artistBlockCount;
    }

    public Integer getStationLikeCount() {
        return stationLikeCount;
    }

    public void setStationLikeCount(Integer stationLikeCount) {
        this.stationLikeCount = stationLikeCount;
    }

    public Integer getAlbumLikeCount() {
        return albumLikeCount;
    }

    public void setAlbumLikeCount(Integer albumLikeCount) {
        this.albumLikeCount = albumLikeCount;
    }

    public void setAlbumLikeCount(int albumLikeCount) {
        this.albumLikeCount = new Integer((short) albumLikeCount);
    }

    public Integer getAlbumBlockCount() {
        return albumBlockCount;
    }

    public void setAlbumBlockCount(Integer albumBlockCount) {
        this.albumBlockCount = albumBlockCount;
    }

    public Integer getSongLikeCount() {
        return songLikeCount;
    }

    public void setSongLikeCount(Integer songLikeCount) {
        this.songLikeCount = songLikeCount;
    }

    public void setSongLikeCount(int songLikeCount) {
        this.songLikeCount = new Integer((short) songLikeCount);
    }

    public Integer getSongBlockCount() {
        return songBlockCount;
    }

    public void setSongBlockCount(Integer songBlockCount) {
        this.songBlockCount = songBlockCount;
    }

    public Integer getListenCount() {
        return listenCount;
    }

    public void setListenCount(Integer listenCount) {
        this.listenCount = listenCount;
    }

    public Integer getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(Integer friendCount) {
        this.friendCount = friendCount;
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
        if (!(object instanceof UserStats)) {
            return false;
        }
        UserStats other = (UserStats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.UserStats[id=" + id + "]";
    }
}
