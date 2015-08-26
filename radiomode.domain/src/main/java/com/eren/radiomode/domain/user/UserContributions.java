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
@Table(name = "usercontributions")
@NamedQueries({ //@NamedQuery(name = "UserContributions.findAll", query = "SELECT u FROM UserContributions u"),
//@NamedQuery(name = "UserContributions.findById", query = "SELECT u FROM UserContributions u WHERE u.id = :id"), 
//@NamedQuery(name = "UserContributions.findByUserid", query = "SELECT u FROM UserContributions u WHERE u.userid = :userid"), 
//@NamedQuery(name = "UserContributions.findByCommentCount", query = "SELECT u FROM UserContributions u WHERE u.commentCount = :commentCount"), 
//@NamedQuery(name = "UserContributions.findByTagCount", query = "SELECT u FROM UserContributions u WHERE u.tagCount = :tagCount"), 
//@NamedQuery(name = "UserContributions.findByEventCount", query = "SELECT u FROM UserContributions u WHERE u.eventCount = :eventCount"), 
//@NamedQuery(name = "UserContributions.findByNewsCount", query = "SELECT u FROM UserContributions u WHERE u.newsCount = :newsCount"), 
//@NamedQuery(name = "UserContributions.findByArtistCount", query = "SELECT u FROM UserContributions u WHERE u.artistCount = :artistCount"), 
//@NamedQuery(name = "UserContributions.findByAlbumCount", query = "SELECT u FROM UserContributions u WHERE u.albumCount = :albumCount"), 
//@NamedQuery(name = "UserContributions.findBySongCount", query = "SELECT u FROM UserContributions u WHERE u.songCount = :songCount"), 
//@NamedQuery(name = "UserContributions.findByPictureCount", query = "SELECT u FROM UserContributions u WHERE u.pictureCount = :pictureCount"), 
//@NamedQuery(name = "UserContributions.findByBioCount", query = "SELECT u FROM UserContributions u WHERE u.bioCount = :bioCount")
})
public class UserContributions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    private User userid;
    @Column(name = "commentCount")
    private Integer commentCount;
    @Column(name = "tagCount")
    private Integer tagCount;
    @Column(name = "eventCount")
    private Integer eventCount;
    @Column(name = "newsCount")
    private Integer newsCount;
    @Column(name = "artistCount")
    private Integer artistCount;
    @Column(name = "albumCount")
    private Integer albumCount;
    @Column(name = "songCount")
    private Integer songCount;
    @Column(name = "pictureCount")
    private Integer pictureCount;
    @Column(name = "bioCount")
    private Integer bioCount;

    public UserContributions() {
    }

    public UserContributions(Integer id) {
        this.id = id;
    }

    public UserContributions(Integer id, User userid) {
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

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getTagCount() {
        return tagCount;
    }

    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public Integer getNewsCount() {
        return newsCount;
    }

    public void setNewsCount(Integer newsCount) {
        this.newsCount = newsCount;
    }

    public Integer getArtistCount() {
        return artistCount;
    }

    public void setArtistCount(Integer artistCount) {
        this.artistCount = artistCount;
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

    public Integer getPictureCount() {
        return pictureCount;
    }

    public void setPictureCount(Integer pictureCount) {
        this.pictureCount = pictureCount;
    }

    public Integer getBioCount() {
        return bioCount;
    }

    public void setBioCount(Integer bioCount) {
        this.bioCount = bioCount;
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
        if (!(object instanceof UserContributions)) {
            return false;
        }
        UserContributions other = (UserContributions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.UserContributions[id=" + id + "]";
    }
}
