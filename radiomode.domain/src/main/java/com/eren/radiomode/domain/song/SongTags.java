/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.song;

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
@Table(name = "songtags")
@NamedQueries({ //@NamedQuery(name = "SongTags.findAll", query = "SELECT s FROM SongTags s"),
//@NamedQuery(name = "SongTags.findById", query = "SELECT s FROM SongTags s WHERE s.id = :id"), 
//@NamedQuery(name = "SongTags.findBySongid", query = "SELECT s FROM SongTags s WHERE s.songid = :songid"), 
//@NamedQuery(name = "SongTags.findByTag", query = "SELECT s FROM SongTags s WHERE s.tag = :tag"), 
//@NamedQuery(name = "SongTags.findByTagPercent", query = "SELECT s FROM SongTags s WHERE s.tagPercent = :tagPercent")
})
public class SongTags implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "songid")
    private Song songid;
    @Column(name = "mbtrackid")
    private Integer mbtrackid;
    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tag tagid;
    @Column(name = "count")
    private Integer count;

    public SongTags() {
    }

    public SongTags(Integer id) {
        this.id = id;
    }

    public SongTags(Integer id, Song songid) {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMbtrackid() {
        return mbtrackid;
    }

    public void setMbtrackid(Integer mbtrackid) {
        this.mbtrackid = mbtrackid;
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
        if (!(object instanceof SongTags)) {
            return false;
        }
        SongTags other = (SongTags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.SongTags[id=" + id + "]";
    }
}
