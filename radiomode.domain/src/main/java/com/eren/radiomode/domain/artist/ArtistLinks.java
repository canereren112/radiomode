/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eren.radiomode.domain.artist;

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
@Table(name = "artistlinks")
@NamedQueries({
//@NamedQuery(name = "ArtistLinks.findAll", query = "SELECT a FROM ArtistLinks a"), 
//@NamedQuery(name = "ArtistLinks.findById", query = "SELECT a FROM ArtistLinks a WHERE a.id = :id"), 
//@NamedQuery(name = "ArtistLinks.findByArtistid", query = "SELECT a FROM ArtistLinks a WHERE a.artistid = :artistid"), 
//@NamedQuery(name = "ArtistLinks.findByType", query = "SELECT a FROM ArtistLinks a WHERE a.type = :type"), 
//@NamedQuery(name = "ArtistLinks.findByUrl", query = "SELECT a FROM ArtistLinks a WHERE a.url = :url")
})
public class ArtistLinks implements Serializable {
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
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;

    public static enum Type {
        OFFICIAL, FAN, LABEL, OTHER;
    }

    public ArtistLinks() {
    }

    public ArtistLinks(Integer id) {
        this.id = id;
    }

    public ArtistLinks(Integer id, Artist artistid, String type, String url) {
        this.id = id;
        this.artistid = artistid;
        this.type = type;
        this.url = url;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        if(!(object instanceof ArtistLinks)) {
            return false;
        }
        ArtistLinks other = (ArtistLinks) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistLinks[id=" + id + "]";
    }

}
