/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.album;

import com.eren.radiomode.domain.artist.Artist;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author work
 */
@Entity
@Table(name = "album")
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "albumid")
    private Integer albumid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @Column(name = "albumName")
    private String albumName;
    @Column(name = "label")
    private Integer label;
    @Column(name = "price")
    private String price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statsid")
    private AlbumStats albumStats;
    @Column(name = "pictureSmall")
    private String pictureSmall;
    @Column(name = "attributes")
    private Integer attributes;
    @Column(name = "language")
    private Integer language;
    @Column(name = "mbartistid")
    private Integer mbartistid;
    @Column(name = "country")
    private Integer country;
    @Column(name = "releaseDate")
    private String releaseDate;
    @Column(name = "mbalbumid")
    private Integer mbalbumid;
    @Column(name = "mbreleaseid")
    private Integer mbreleaseid;
    @OneToOne(mappedBy = "albumid")
    private AlbumAmazonAsin albumAmazonAsin;

    public Album() {
    }

    public Album(Integer albumid) {
        this.albumid = albumid;
    }

    public Album(Integer albumid, Artist artistid) {
        this.albumid = albumid;
        this.artistid = artistid;
    }

    public Integer getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
    }

    public String getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public AlbumStats getAlbumStats() {
        return albumStats;
    }

    public void setAlbumStats(AlbumStats albumStats) {
        this.albumStats = albumStats;
    }

    public Integer getAttributes() {
        return attributes;
    }

    public void setAttributes(Integer attributes) {
        this.attributes = attributes;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
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

    public Integer getMbreleaseid() {
        return mbreleaseid;
    }

    public void setMbreleaseid(Integer mbreleaseid) {
        this.mbreleaseid = mbreleaseid;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public AlbumAmazonAsin getAlbumAmazonAsin() {
        return albumAmazonAsin;
    }

    public void setAlbumAmazonAsin(AlbumAmazonAsin albumAmazonAsin) {
        this.albumAmazonAsin = albumAmazonAsin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (albumid != null ? albumid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.albumid == null && other.albumid != null) || (this.albumid != null && !this.albumid.equals(other.albumid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Album[albumid=" + albumid + "]";
    }
}
