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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author firat
 */
@Entity
@Table(name = "lyrics")
@NamedQueries({
    @NamedQuery(name = "Lyrics.findAll", query = "SELECT l FROM Lyrics l")})
public class Lyrics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "poetid")
    private Integer poetid;
    @Column(name = "poetName")
    private String poetName;
    @Lob
    @Column(name = "lyrics")
    private String lyrics;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "songid")
    private Song songid;

    public Lyrics() {
    }

    public Lyrics(Integer id) {
        this.id = id;
    }

    public Lyrics(Integer id, Song songid) {
        this.id = id;
        this.songid = songid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoetid() {
        return poetid;
    }

    public void setPoetid(Integer poetid) {
        this.poetid = poetid;
    }

    public String getPoetName() {
        return poetName;
    }

    public void setPoetName(String poetName) {
        this.poetName = poetName;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Song getSongid() {
        return songid;
    }

    public void setSongid(Song songid) {
        this.songid = songid;
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
        if (!(object instanceof Lyrics)) {
            return false;
        }
        Lyrics other = (Lyrics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Lyrics[id=" + id + "]";
    }
}
