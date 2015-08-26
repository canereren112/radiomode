/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.genre;

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
@Table(name = "genreartists")
@NamedQueries({
    @NamedQuery(name = "GenreArtists.findAll", query = "SELECT g FROM GenreArtists g"),
    @NamedQuery(name = "GenreArtists.findById", query = "SELECT g FROM GenreArtists g WHERE g.id = :id"),
    @NamedQuery(name = "GenreArtists.findByArtistid", query = "SELECT g FROM GenreArtists g WHERE g.artistid = :artistid"),
    @NamedQuery(name = "GenreArtists.findByGenreid", query = "SELECT g FROM GenreArtists g WHERE g.genreid = :genreid"),
    @NamedQuery(name = "GenreArtists.findByPercent", query = "SELECT g FROM GenreArtists g WHERE g.percent = :percent")})
public class GenreArtists implements Serializable {

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
    @JoinColumn(name = "genreid")
    private Genre genreid;
    @Basic(optional = false)
    @Column(name = "percent")
    private short percent;

    public GenreArtists() {
    }

    public GenreArtists(Integer id) {
        this.id = id;
    }

    public GenreArtists(Integer id, Artist artistid, Genre genreid, short percent) {
        this.id = id;
        this.artistid = artistid;
        this.genreid = genreid;
        this.percent = percent;
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

    public Genre getGenreid() {
        return genreid;
    }

    public void setGenreid(Genre genreid) {
        this.genreid = genreid;
    }

    public short getPercent() {
        return percent;
    }

    public void setPercent(short percent) {
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
        if (!(object instanceof GenreArtists)) {
            return false;
        }
        GenreArtists other = (GenreArtists) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.GenreArtists[id=" + id + "]";
    }
}
