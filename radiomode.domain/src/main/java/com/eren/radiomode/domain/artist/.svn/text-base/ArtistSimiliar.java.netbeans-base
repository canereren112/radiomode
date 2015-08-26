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
@Table(name = "artistsimiliar")
@NamedQueries({
    //@NamedQuery(name = "ArtistSimiliar.findAll", query = "SELECT a FROM ArtistSimiliar a"),
    //@NamedQuery(name = "ArtistSimiliar.findById", query = "SELECT a FROM ArtistSimiliar a WHERE a.id = :id"),
    //@NamedQuery(name = "ArtistSimiliar.findByArtistid", query = "SELECT a FROM ArtistSimiliar a WHERE a.artistid = :artistid"),
    //@NamedQuery(name = "ArtistSimiliar.findBySimiliarArtistid", query = "SELECT a FROM ArtistSimiliar a WHERE a.similiarArtistid = :similiarArtistid"),
    //@NamedQuery(name = "ArtistSimiliar.findBySimiliarPercent", query = "SELECT a FROM ArtistSimiliar a WHERE a.similiarPercent = :similiarPercent")
    @NamedQuery(name = "ArtistSimiliar.findByArtistName", query = "SELECT ass FROM ArtistSimiliar ass JOIN ass.artistid a JOIN ass.similiarArtistid s WHERE a.name = ? OR s.name = ?")
})
public class ArtistSimiliar implements Serializable {

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
    @JoinColumn(name = "similiarArtistid")
    private Artist similiarArtistid;
    @Column(name = "percent")
    private Integer similiarPercent;

    public ArtistSimiliar() {
    }

    public ArtistSimiliar(Integer id) {
        this.id = id;
    }

    public ArtistSimiliar(Integer id, Artist artistid, Artist similiarArtistid) {
        this.id = id;
        this.artistid = artistid;
        this.similiarArtistid = similiarArtistid;
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

    public Artist getSimiliarArtistid() {
        return similiarArtistid;
    }

    public void setSimiliarArtistid(Artist similiarArtistid) {
        this.similiarArtistid = similiarArtistid;
    }

    public Integer getSimiliarPercent() {
        return similiarPercent;
    }

    public void setSimiliarPercent(Integer similiarPercent) {
        this.similiarPercent = similiarPercent;
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
        if(!(object instanceof ArtistSimiliar)) {
            return false;
        }
        ArtistSimiliar other = (ArtistSimiliar) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistSimiliar[id=" + id + "]";
    }
}
