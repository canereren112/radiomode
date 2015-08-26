/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.album;

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
@Table(name = "albumpictures")
@NamedQueries({
    @NamedQuery(name = "AlbumPictures.findAll", query = "SELECT a FROM AlbumPictures a"),
    @NamedQuery(name = "AlbumPictures.findById", query = "SELECT a FROM AlbumPictures a WHERE a.id = :id"),
    @NamedQuery(name = "AlbumPictures.findByAlbumid", query = "SELECT a FROM AlbumPictures a WHERE a.albumid = :albumid"),
    @NamedQuery(name = "AlbumPictures.findByUploadedBy", query = "SELECT a FROM AlbumPictures a WHERE a.uploadedBy = :uploadedBy"),
    @NamedQuery(name = "AlbumPictures.findByLocationNormal", query = "SELECT a FROM AlbumPictures a WHERE a.locationNormal = :locationNormal"),
    @NamedQuery(name = "AlbumPictures.findByLocationSmall", query = "SELECT a FROM AlbumPictures a WHERE a.locationSmall = :locationSmall"),
    @NamedQuery(name = "AlbumPictures.findByComment", query = "SELECT a FROM AlbumPictures a WHERE a.comment = :comment"),
    @NamedQuery(name = "AlbumPictures.findByUploadDate", query = "SELECT a FROM AlbumPictures a WHERE a.uploadDate = :uploadDate")})
public class AlbumPictures implements Serializable {

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
    @Column(name = "uploadedBy")
    private String uploadedBy;
    @Column(name = "locationNormal")
    private String locationNormal;
    @Column(name = "locationSmall")
    private String locationSmall;
    @Column(name = "comment")
    private String comment;
    @Column(name = "uploadDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;

    public AlbumPictures() {
    }

    public AlbumPictures(Integer id) {
        this.id = id;
    }

    public AlbumPictures(Integer id, Album albumid) {
        this.id = id;
        this.albumid = albumid;
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

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlbumPictures)) {
            return false;
        }
        AlbumPictures other = (AlbumPictures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.AlbumPictures[id=" + id + "]";
    }
}
