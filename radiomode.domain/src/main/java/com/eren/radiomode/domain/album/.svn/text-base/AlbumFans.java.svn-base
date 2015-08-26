/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eren.radiomode.domain.album;

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
@Table(name = "albumfans")
@NamedQueries({
//@NamedQuery(name = "AlbumFans.findAll", query = "SELECT a FROM AlbumFans a"), 
//@NamedQuery(name = "AlbumFans.findById", query = "SELECT a FROM AlbumFans a WHERE a.id = :id"), 
//@NamedQuery(name = "AlbumFans.findByAlbumid", query = "SELECT a FROM AlbumFans a WHERE a.albumid = :albumid"), 
//@NamedQuery(name = "AlbumFans.findByUserid", query = "SELECT a FROM AlbumFans a WHERE a.userid = :userid"), 
//@NamedQuery(name = "AlbumFans.findByType", query = "SELECT a FROM AlbumFans a WHERE a.type = :type")
})
public class AlbumFans implements Serializable {
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
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "type")
    private String type;

    public static enum Type {

        LIKE, DISLIKE
    }

    public AlbumFans() {
    }

    public AlbumFans(Integer id) {
        this.id = id;
    }

    public AlbumFans(Integer id, Album albumid, User userid) {
        this.id = id;
        this.albumid = albumid;
        this.userid = userid;
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
        if(!(object instanceof AlbumFans)) {
            return false;
        }
        AlbumFans other = (AlbumFans) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.AlbumFans[id=" + id + "]";
    }

}
