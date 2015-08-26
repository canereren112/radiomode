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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author firat
 */
@Entity
@Table(name = "album_amazon_asin")
public class AlbumAmazonAsin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "mbalbumid")
    private Integer mbalbumid;
    @Column(name = "asin")
    private String asin;
    @Column(name = "coverarturl")
    private String coverarturl;
    @Column(name = "lastupdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "albumid")
    private Album albumid;

    public AlbumAmazonAsin() {
    }

    public AlbumAmazonAsin(Integer id) {
        this.id = id;
    }

    public AlbumAmazonAsin(Integer id, Integer mbalbumid, Date lastupdate) {
        this.id = id;
        this.mbalbumid = mbalbumid;
        this.lastupdate = lastupdate;
    }

    public Album getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Album albumid) {
        this.albumid = albumid;
    }

    public Integer getMbalbumid() {
        return mbalbumid;
    }

    public void setMbalbumid(Integer mbalbumid) {
        this.mbalbumid = mbalbumid;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getCoverarturl() {
        return coverarturl;
    }

    public void setCoverarturl(String coverarturl) {
        this.coverarturl = coverarturl;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof AlbumAmazonAsin)) {
            return false;
        }
        AlbumAmazonAsin other = (AlbumAmazonAsin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.AlbumAmazonAsin[id=" + id + "]";
    }
}
