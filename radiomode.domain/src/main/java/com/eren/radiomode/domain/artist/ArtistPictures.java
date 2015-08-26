/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.artist;

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
@Table(name = "artistpictures")
@NamedQueries({ //    @NamedQuery(name = "ArtistPictures.findAll", query = "SELECT a FROM ArtistPictures a"),
//    @NamedQuery(name = "ArtistPictures.findById", query = "SELECT a FROM ArtistPictures a WHERE a.id = :id"),
//    @NamedQuery(name = "ArtistPictures.findByArtistid", query = "SELECT a FROM ArtistPictures a WHERE a.artistid = :artistid"),
//    @NamedQuery(name = "ArtistPictures.findByUploadedBy", query = "SELECT a FROM ArtistPictures a WHERE a.uploadedBy = :uploadedBy"),
//    @NamedQuery(name = "ArtistPictures.findByLocationNormal", query = "SELECT a FROM ArtistPictures a WHERE a.locationNormal = :locationNormal"),
//    @NamedQuery(name = "ArtistPictures.findByLocationSmall", query = "SELECT a FROM ArtistPictures a WHERE a.locationSmall = :locationSmall"),
//    @NamedQuery(name = "ArtistPictures.findByComment", query = "SELECT a FROM ArtistPictures a WHERE a.comment = :comment"),
//    @NamedQuery(name = "ArtistPictures.findByUploadDate", query = "SELECT a FROM ArtistPictures a WHERE a.uploadDate = :uploadDate")
})
public class ArtistPictures implements Serializable {

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
    @Column(name = "uploadedBy")
    private String uploadedBy;
    @Column(name = "locationBig")
    private String locationBig;
    @Column(name = "locationNormal")
    private String locationNormal;
    @Column(name = "locationSmall")
    private String locationSmall;
    @Column(name = "comment")
    private String comment;
    @Column(name = "uploadDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;
    @Column(name = "isDefault")
    private Boolean isDefault;
    @Column(name = "width")
    private Integer width;
    @Column(name = "height")
    private Integer height;
    @Column(name = "searchIndex")
    private Integer searchIndex;

    public ArtistPictures() {
    }

    public ArtistPictures(Integer id) {
        this.id = id;
    }

    public ArtistPictures(Integer id, Artist artistid) {
        this.id = id;
        this.artistid = artistid;
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

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getLocationBig() {
        return locationBig;
    }

    public void setLocationBig(String locationBig) {
        this.locationBig = locationBig;
    }

    public String getLocationNormal() {
        return locationNormal;
    }

    public void setLocationNormal(String locationNormal) {
        this.locationNormal = locationNormal;
    }

    public String getLocationSmall() {
        return locationSmall;
    }

    public void setLocationSmall(String locationSmall) {
        this.locationSmall = locationSmall;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSearchIndex() {
        return searchIndex;
    }

    public void setSearchIndex(Integer searchIndex) {
        this.searchIndex = searchIndex;
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
        if (!(object instanceof ArtistPictures)) {
            return false;
        }
        ArtistPictures other = (ArtistPictures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistPictures[id=" + id + "]";
    }
}
