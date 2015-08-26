/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.album;

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
@Table(name = "albumsimiliar")
@NamedQueries({
    @NamedQuery(name = "AlbumSimiliar.findAll", query = "SELECT a FROM AlbumSimiliar a"),
    @NamedQuery(name = "AlbumSimiliar.findById", query = "SELECT a FROM AlbumSimiliar a WHERE a.id = :id"),
    @NamedQuery(name = "AlbumSimiliar.findByAlbumid", query = "SELECT a FROM AlbumSimiliar a WHERE a.albumid = :albumid"),
    @NamedQuery(name = "AlbumSimiliar.findBySimiliarAlbumid", query = "SELECT a FROM AlbumSimiliar a WHERE a.similiarAlbumid = :similiarAlbumid"),
    @NamedQuery(name = "AlbumSimiliar.findByPercent", query = "SELECT a FROM AlbumSimiliar a WHERE a.percent = :percent")})
public class AlbumSimiliar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "albumid")
    private Album albumid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "similiarAlbumid")
    private Album similiarAlbumid;
    @Column(name = "percent")
    private Integer percent;

    public AlbumSimiliar() {
    }

    public AlbumSimiliar(Integer id) {
        this.id = id;
    }

    public AlbumSimiliar(Integer id, Album albumid, Album similiarAlbumid) {
        this.id = id;
        this.albumid = albumid;
        this.similiarAlbumid = similiarAlbumid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Album getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Album albumid) {
        this.albumid = albumid;
    }

    public Album getSimiliarAlbumid() {
        return similiarAlbumid;
    }

    public void setSimiliarAlbumid(Album similiarAlbumid) {
        this.similiarAlbumid = similiarAlbumid;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
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
        if (!(object instanceof AlbumSimiliar)) {
            return false;
        }
        AlbumSimiliar other = (AlbumSimiliar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.AlbumSimiliar[id=" + id + "]";
    }
}
