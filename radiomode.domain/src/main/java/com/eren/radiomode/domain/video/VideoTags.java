/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.video;

import com.eren.radiomode.domain.Tag;
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
@Table(name = "videotags")
@NamedQueries({ //@NamedQuery(name = "VideoTags.findAll", query = "SELECT v FROM VideoTags v"),
//@NamedQuery(name = "VideoTags.findById", query = "SELECT v FROM VideoTags v WHERE v.id = :id"), 
//@NamedQuery(name = "VideoTags.findByVideoid", query = "SELECT v FROM VideoTags v WHERE v.videoid = :videoid"), 
//@NamedQuery(name = "VideoTags.findByTag", query = "SELECT v FROM VideoTags v WHERE v.tag = :tag"), 
//@NamedQuery(name = "VideoTags.findByTagPercent", query = "SELECT v FROM VideoTags v WHERE v.tagPercent = :tagPercent")
})
public class VideoTags implements Serializable {

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
    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tag tagid;
    @Column(name = "count")
    private Integer count;

    public VideoTags() {
    }

    public VideoTags(Integer id) {
        this.id = id;
    }

    public VideoTags(Integer id, Video videoid) {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Tag getTagid() {
        return tagid;
    }

    public void setTagid(Tag tagid) {
        this.tagid = tagid;
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
        if (!(object instanceof VideoTags)) {
            return false;
        }
        VideoTags other = (VideoTags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomodedata.domain.VideoTags[id=" + id + "]";
    }
}
