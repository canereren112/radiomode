/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.artist;

import com.eren.radiomode.domain.user.User;
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
@Table(name = "artistfans")
@NamedQueries({ //@NamedQuery(name = "ArtistFans.findAll", query = "SELECT a FROM ArtistFans a"),
//@NamedQuery(name = "ArtistFans.findById", query = "SELECT a FROM ArtistFans a WHERE a.id = :id"), 
//@NamedQuery(name = "ArtistFans.findByArtistid", query = "SELECT a FROM ArtistFans a WHERE a.artistid = :artistid"), 
//@NamedQuery(name = "ArtistFans.findByUserid", query = "SELECT a FROM ArtistFans a WHERE a.userid = :userid"), 
//@NamedQuery(name = "ArtistFans.findByType", query = "SELECT a FROM ArtistFans a WHERE a.type = :type")
})
public class ArtistFans implements Serializable {

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
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "type")
    private String type;

    public static enum Type {

        LIKE, DISLIKE
    }

    public ArtistFans() {
    }

    public ArtistFans(Integer id) {
        this.id = id;
    }

    public ArtistFans(Integer id, Artist artistid, User userid) {
        this.id = id;
        this.artistid = artistid;
        this.userid = userid;
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

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if(!(object instanceof ArtistFans)) {
            return false;
        }
        ArtistFans other = (ArtistFans) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistFans[id=" + id + "]";
    }
}
