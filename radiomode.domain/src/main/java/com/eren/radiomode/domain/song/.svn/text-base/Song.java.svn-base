/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.song;

import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.artist.Artist;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "song")
@NamedQueries({
    //@NamedQuery(name = "Song.findById", query = "SELECT s FROM Song s WHERE s.songid = :songid"),
    //@NamedQuery(name = "Song.findByAlbumid", query = "SELECT s FROM Song s WHERE s.albumid = :albumid"),
    //@NamedQuery(name = "Song.findBySongName", query = "SELECT s FROM Song s WHERE s.songName = :songName"),
    //@NamedQuery(name = "Song.findByMinuteLength", query = "SELECT s FROM Song s WHERE s.minuteLength = :minuteLength"),
    //@NamedQuery(name = "Song.findBySecondLength", query = "SELECT s FROM Song s WHERE s.secondLength = :secondLength"),
    //@NamedQuery(name = "Song.findByLyricsBy", query = "SELECT s FROM Song s WHERE s.lyricsBy = :lyricsBy"),
    //@NamedQuery(name = "Song.findByMusicBy", query = "SELECT s FROM Song s WHERE s.musicBy = :musicBy")
    @NamedQuery(name = "Song.findAll", query = "SELECT s FROM Song s"),
    @NamedQuery(name = "Song.findByArtistid", query = "SELECT s FROM Song s join s.artistid a WHERE a.id = :artistid")
})
public class Song implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "songid")
    private Integer songid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "albumid")
    private Album albumid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @Column(name = "songName")
    private String songName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statsid")
    private SongStats songStats;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lyricsBy")
    private Lyrics lyricsBy;
    @OneToMany(mappedBy = "songid", fetch = FetchType.LAZY)
    private List<Composition> musicBy;
    @OneToMany(mappedBy = "songid", targetEntity = SongFans.class, fetch = FetchType.LAZY)
    private List<SongFans> songFans;
    @Column(name = "mbtrackid")
    private Integer mbtrackid;
    @Column(name = "mbartistid")
    private Integer mbartistid;
    @Column(name = "songLength")
    private Integer songLength;
    @Column(name = "mbalbumid")
    private Integer mbalbumid;
    @Column(name = "sequence")
    private Integer sequence;

    public Song() {
    }

    public Song(Integer songid) {
        this.songid = songid;
    }

    public Song(Integer songid, Album albumid, Artist artistid) {
        this.songid = songid;
        this.albumid = albumid;
        this.artistid = artistid;
    }

    public List<SongFans> getSongFans() {
        return songFans;
    }

    public void setSongFans(List<SongFans> songFans) {
        this.songFans = songFans;
    }

    public Integer getSongid() {
        return songid;
    }

    public void setSongid(Integer songid) {
        this.songid = songid;
    }

    public Album getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Album albumid) {
        this.albumid = albumid;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Integer getSongLength() {
        return songLength;
    }

    public void setSongLength(Integer songLength) {
        this.songLength = songLength;
    }

    public Integer getMbalbumid() {
        return mbalbumid;
    }

    public void setMbalbumid(Integer mbalbumid) {
        this.mbalbumid = mbalbumid;
    }

    public Integer getMbartistid() {
        return mbartistid;
    }

    public void setMbartistid(Integer mbartistid) {
        this.mbartistid = mbartistid;
    }

    public Integer getMbtrackid() {
        return mbtrackid;
    }

    public void setMbtrackid(Integer mbtrackid) {
        this.mbtrackid = mbtrackid;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Lyrics getLyricsBy() {
        return lyricsBy;
    }

    public void setLyricsBy(Lyrics lyricsBy) {
        this.lyricsBy = lyricsBy;
    }

    public List<Composition> getMusicBy() {
        return musicBy;
    }

    public void setMusicBy(List<Composition> musicBy) {
        this.musicBy = musicBy;
    }

    public SongStats getSongStats() {
        return songStats;
    }

    public void setSongStats(SongStats songStats) {
        this.songStats = songStats;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (songid != null ? songid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Song)) {
            return false;
        }
        Song other = (Song) object;
        if ((this.songid == null && other.songid != null) || (this.songid != null && !this.songid.equals(other.songid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Song[songid=" + songid + "]";
    }
}
