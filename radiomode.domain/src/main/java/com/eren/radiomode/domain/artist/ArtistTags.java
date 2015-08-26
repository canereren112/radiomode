/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.artist;

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
@Table(name = "artisttags")
@NamedQueries({ //@NamedQuery(name = "ArtistTags.findAll", query = "SELECT a FROM ArtistTags a"),
//@NamedQuery(name = "ArtistTags.findById", query = "SELECT a FROM ArtistTags a WHERE a.id = :id"), 
//@NamedQuery(name = "ArtistTags.findByArtistid", query = "SELECT a FROM ArtistTags a WHERE a.artistid = :artistid"), 
//@NamedQuery(name = "ArtistTags.findByTag", query = "SELECT a FROM ArtistTags a WHERE a.tag = :tag"), 
//@NamedQuery(name = "ArtistTags.findByTagPercent", query = "SELECT a FROM ArtistTags a WHERE a.tagPercent = :tagPercent")
})
public class ArtistTags implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @Column(name = "mbartistid")
    private Integer mbartistid;
    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tag tagid;
    @Column(name = "count")
    private Integer count;

    public ArtistTags() {
    }

    public ArtistTags(Integer id) {
        this.id = id;
    }

    public ArtistTags(Integer id, Artist artistid) {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMbartistid() {
        return mbartistid;
    }

    public void setMbartistid(Integer mbartistid) {
        this.mbartistid = mbartistid;
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
        if (!(object instanceof ArtistTags)) {
            return false;
        }
        ArtistTags other = (ArtistTags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistTags[id=" + id + "]";
    }
}
