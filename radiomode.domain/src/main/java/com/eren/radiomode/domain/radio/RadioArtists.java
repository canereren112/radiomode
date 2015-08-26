/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

import com.eren.radiomode.domain.artist.Artist;
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
@Table(name = "radioartists")
@NamedQueries({ //@NamedQuery(name = "RadioArtists.findAll", query = "SELECT r FROM RadioArtists r"),
//@NamedQuery(name = "RadioArtists.findById", query = "SELECT r FROM RadioArtists r WHERE r.id = :id"), 
//@NamedQuery(name = "RadioArtists.findByRadioid", query = "SELECT r FROM RadioArtists r WHERE r.radioid = :radioid"), 
//@NamedQuery(name = "RadioArtists.findByArtistid", query = "SELECT r FROM RadioArtists r WHERE r.artistid = :artistid")
})
public class RadioArtists implements Serializable {

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
    @Column(name = "status")
    private Boolean status;
    public static boolean STATUS_INCLUDE = true;
    public static boolean STATUS_EXCLUDE = false;

    public RadioArtists() {
    }

    public RadioArtists(Integer id) {
        this.id = id;
    }

    public RadioArtists(Integer id, Radio radioid, Artist artistid) {
        this.id = id;
        this.radioid = radioid;
        this.artistid = artistid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Radio getRadioid() {
        return radioid;
    }

    public void setRadioid(Radio radioid) {
        this.radioid = radioid;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
    }

    public Integer getPlayPercent() {
        return playPercent;
    }

    public void setPlayPercent(Integer playPercent) {
        this.playPercent = playPercent;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
        if (!(object instanceof RadioArtists)) {
            return false;
        }
        RadioArtists other = (RadioArtists) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.RadioArtists[id=" + id + "]";
    }
}
