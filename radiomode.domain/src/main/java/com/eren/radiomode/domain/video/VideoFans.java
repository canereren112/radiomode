/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.video;

import com.eren.radiomode.domain.user.User;
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
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "videofans")
@NamedQueries({ //@NamedQuery(name = "VideoFans.findAll", query = "SELECT v FROM VideoFans v"),
//@NamedQuery(name = "VideoFans.findById", query = "SELECT v FROM VideoFans v WHERE v.id = :id"), 
//@NamedQuery(name = "VideoFans.findByVideoid", query = "SELECT v FROM VideoFans v WHERE v.videoid = :videoid"), 
//@NamedQuery(name = "VideoFans.findByUserid", query = "SELECT v FROM VideoFans v WHERE v.userid = :userid"), 
//@NamedQuery(name = "VideoFans.findByType", query = "SELECT v FROM VideoFans v WHERE v.type = :type")
})
public class VideoFans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "videoid")
    private Video videoid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "type")
    private String type;

    public static enum Type {

        LIKE, DISLIKE;
    }

    public VideoFans() {
    }

    public VideoFans(Integer id) {
        this.id = id;
    }

    public VideoFans(Integer id, Video videoid, User userid) {
        this.id = id;
        this.videoid = videoid;
        this.userid = userid;
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

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if(!(object instanceof VideoFans)) {
            return false;
        }
        VideoFans other = (VideoFans) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.VideoFans[id=" + id + "]";
    }
}
