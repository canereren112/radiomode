/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.artist;

import com.eren.radiomode.domain.Country;
import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "artist")
@NamedQueries({
    @NamedQuery(name = "Artist.findAll", query = "SELECT a FROM Artist a"),
    //@NamedQuery(name = "Artist.findByArtistid", query = "SELECT a FROM Artist a WHERE a.artistid = :artistid"),
    //@NamedQuery(name = "Artist.findByCountryCode", query = "SELECT a FROM Artist a WHERE a.countryCode = :countryCode")
    @NamedQuery(name = "Artist.findByName", query = "SELECT a FROM Artist a WHERE a.name = :name"),
    @NamedQuery(name = "Artist.findLikeName", query = "SELECT a FROM Artist a WHERE a.name LIKE :name")
})
public class Artist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "artistid")
    private Integer artistid;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countryCode", referencedColumnName = "countryCode")
    private Country countryCode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statsid")
    private ArtistStats artistStats;
    @Column(name = "beginDate")
    private String beginDate;
    @Column(name = "endDate")
    private String endDate;
    @Column(name = "place")
    private String place;
    @Column(name = "biography")
    private String biography;
    @Column(name = "bioSource")
    private String bioSource;
    @Column(name = "moreInfo")
    private String moreInfo;
    @Column(name = "pictureSmall")
    private String pictureSmall;
    @Column(name = "mbartistid")
    private Integer mbartistid;
    @Column(name = "sortname")
    private String sortname;
    @Column(name = "type")
    private Integer type;

    public Artist() {
    }

    public Artist(Integer artistid) {
        this.artistid = artistid;
    }

    public Artist(Integer artistid, Country countryCode) {
        this.artistid = artistid;
        this.countryCode = countryCode;
    }

    public Integer getArtistid() {
        return artistid;
    }

    public void setArtistid(Integer artistid) {
        this.artistid = artistid;
    }

    public String getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public String getBiography() {
        return biography;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getBioSource() {
        return bioSource;
    }

    public void setBioSource(String bioSource) {
        this.bioSource = bioSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public ArtistStats getArtistStats() {
        return artistStats;
    }

    public void setArtistStats(ArtistStats artistStats) {
        this.artistStats = artistStats;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getMbartistid() {
        return mbartistid;
    }

    public void setMbartistid(Integer mbartistid) {
        this.mbartistid = mbartistid;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artistid != null ? artistid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artist)) {
            return false;
        }
        Artist other = (Artist) object;
        if ((this.artistid == null && other.artistid != null) || (this.artistid != null && !this.artistid.equals(other.artistid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Artist[artistid=" + artistid + "]";
    }
}
