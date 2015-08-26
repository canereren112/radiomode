/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.group;

import com.eren.radiomode.domain.artist.Artist;
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
@Table(name = "groupartists")
@NamedQueries({ //@NamedQuery(name = "GroupArtists.findAll", query = "SELECT g FROM GroupArtists g"),
//@NamedQuery(name = "GroupArtists.findById", query = "SELECT g FROM GroupArtists g WHERE g.id = :id"), 
//@NamedQuery(name = "GroupArtists.findByGroupid", query = "SELECT g FROM GroupArtists g WHERE g.groupid = :groupid"), 
//@NamedQuery(name = "GroupArtists.findByArtistid", query = "SELECT g FROM GroupArtists g WHERE g.artistid = :artistid")
})
public class GroupArtists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "groupid")
    private Group groupid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;

    public GroupArtists() {
    }

    public GroupArtists(Integer id) {
        this.id = id;
    }

    public GroupArtists(Integer id, Group groupid, Artist artistid) {
        this.id = id;
        this.groupid = groupid;
        this.artistid = artistid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Group getGroupid() {
        return groupid;
    }

    public void setGroupid(Group groupid) {
        this.groupid = groupid;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
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
        if(!(object instanceof GroupArtists)) {
            return false;
        }
        GroupArtists other = (GroupArtists) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.GroupArtists[id=" + id + "]";
    }
}
