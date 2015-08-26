/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.song;

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
@Table(name = "songsimiliar")
@NamedQueries({
    @NamedQuery(name = "SongSimiliar.findAll", query = "SELECT s FROM SongSimiliar s"),
    @NamedQuery(name = "SongSimiliar.findById", query = "SELECT s FROM SongSimiliar s WHERE s.id = :id"),
    @NamedQuery(name = "SongSimiliar.findBySongid", query = "SELECT s FROM SongSimiliar s WHERE s.songid = :songid"),
    @NamedQuery(name = "SongSimiliar.findBySimiliarSongid", query = "SELECT s FROM SongSimiliar s WHERE s.similiarSongid = :similiarSongid"),
    @NamedQuery(name = "SongSimiliar.findByPercent", query = "SELECT s FROM SongSimiliar s WHERE s.percent = :percent")})
public class SongSimiliar implements Serializable {

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
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "similiarSongid")
    private Song similiarSongid;
    @Column(name = "percent")
    private Integer percent;

    public SongSimiliar() {
    }

    public SongSimiliar(Integer id) {
        this.id = id;
    }

    public SongSimiliar(Integer id, Song songid, Song similiarSongid) {
        this.id = id;
        this.songid = songid;
        this.similiarSongid = similiarSongid;
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

    public Song getSimiliarSongid() {
        return similiarSongid;
    }

    public void setSimiliarSongid(Song similiarSongid) {
        this.similiarSongid = similiarSongid;
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
        if (!(object instanceof SongSimiliar)) {
            return false;
        }
        SongSimiliar other = (SongSimiliar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.SongSimiliar[id=" + id + "]";
    }
}
