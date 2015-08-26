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
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "artistsimiliarstats")
@NamedQueries({ //@NamedQuery(name = "ArtistSimiliarStats.findAll", query = "SELECT a FROM ArtistSimiliarStats a"),
//@NamedQuery(name = "ArtistSimiliarStats.findById", query = "SELECT a FROM ArtistSimiliarStats a WHERE a.id = :id"), 
//@NamedQuery(name = "ArtistSimiliarStats.findByArtistid", query = "SELECT a FROM ArtistSimiliarStats a WHERE a.artistid = :artistid"), 
//@NamedQuery(name = "ArtistSimiliarStats.findBySimiliartistid", query = "SELECT a FROM ArtistSimiliarStats a WHERE a.similiartistid = :similiartistid"), 
//@NamedQuery(name = "ArtistSimiliarStats.findByCommonFanCount", query = "SELECT a FROM ArtistSimiliarStats a WHERE a.commonFanCount = :commonFanCount")
})
public class ArtistSimiliarStats implements Serializable {

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
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "similiartistid")
    private Artist similiartistid;
    @Column(name = "commonFanCount")
    private Integer commonFanCount;

    public ArtistSimiliarStats() {
    }

    public ArtistSimiliarStats(Integer id) {
        this.id = id;
    }

    public ArtistSimiliarStats(Integer id, Artist artistid, Artist similiartistid) {
        this.id = id;
        this.artistid = artistid;
        this.similiartistid = similiartistid;
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

    public Artist getSimiliartistid() {
        return similiartistid;
    }

    public void setSimiliartistid(Artist similiartistid) {
        this.similiartistid = similiartistid;
    }

    public Integer getCommonFanCount() {
        return commonFanCount;
    }

    public void setCommonFanCount(Integer commonFanCount) {
        this.commonFanCount = commonFanCount;
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
        if(!(object instanceof ArtistSimiliarStats)) {
            return false;
        }
        ArtistSimiliarStats other = (ArtistSimiliarStats) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistSimiliarStats[id=" + id + "]";
    }
}
