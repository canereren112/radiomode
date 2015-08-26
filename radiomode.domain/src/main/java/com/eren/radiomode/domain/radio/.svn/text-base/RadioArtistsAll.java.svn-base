/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

import com.eren.radiomode.domain.artist.Artist;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author work
 */
@Entity
@Table(name = "radioartistsall")
@NamedQueries({ //@NamedQuery(name = "RadioArtistsAll.findAll", query = "SELECT r FROM RadioArtistsAll r"),
    //@NamedQuery(name = "RadioArtistsAll.findById", query = "SELECT r FROM RadioArtistsAll r WHERE r.id = :id"),
    //@NamedQuery(name = "RadioArtistsAll.findByArtistid", query = "SELECT r FROM RadioArtistsAll r WHERE r.artistid = :artistid"),
    //@NamedQuery(name = "RadioArtistsAll.findByPlayPercent", query = "SELECT r FROM RadioArtistsAll r WHERE r.playPercent = :playPercent"),
    //@NamedQuery(name = "RadioArtistsAll.findByStatus", query = "SELECT r FROM RadioArtistsAll r WHERE r.status = :status"),
    //@NamedQuery(name = "RadioArtistsAll.findByModifiedTime", query = "SELECT r FROM RadioArtistsAll r WHERE r.modifiedTime = :modifiedTime")

    @NamedQuery(name = "RadioArtistsAll.findByRadioid", query = "SELECT raa FROM RadioArtistsAll raa JOIN raa.radioid r WHERE r.radioid = :radioid")
})
public class RadioArtistsAll implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "radioid")
    private Radio radioid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @Basic(optional = false)
    @Column(name = "playPercent")
    private Integer playPercent;
    @Basic(optional = false)
    @Column(name = "count")
    private Integer count;

    public RadioArtistsAll() {
    }

    public RadioArtistsAll(Integer id) {
        this.id = id;
    }

    public RadioArtistsAll(Integer id, Radio radioid, Artist artistid, Integer playPercent, Integer count) {
        this.id = id;
        this.radioid = radioid;
        this.artistid = artistid;
        this.playPercent = playPercent;
        this.count = count;
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

    public Radio getRadioid() {
        return radioid;
    }

    public void setRadioid(Radio radioid) {
        this.radioid = radioid;
    }

    public Integer getPlayPercent() {
        return playPercent;
    }

    public void setPlayPercent(Integer playPercent) {
        this.playPercent = playPercent;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        if (!(object instanceof RadioArtistsAll)) {
            return false;
        }
        RadioArtistsAll other = (RadioArtistsAll) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.RadioArtistsAll[id=" + id + "]";
    }
}
