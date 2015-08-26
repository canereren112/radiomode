/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.song;

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
@Table(name = "songfans")
@NamedQueries({ //@NamedQuery(name = "SongFans.findAll", query = "SELECT s FROM SongFans s"),
//@NamedQuery(name = "SongFans.findById", query = "SELECT s FROM SongFans s WHERE s.id = :id"), 
//@NamedQuery(name = "SongFans.findBySongid", query = "SELECT s FROM SongFans s WHERE s.songid = :songid"), 
//@NamedQuery(name = "SongFans.findByUserid", query = "SELECT s FROM SongFans s WHERE s.userid = :userid"), 
//@NamedQuery(name = "SongFans.findByType", query = "SELECT s FROM SongFans s WHERE s.type = :type")
})
public class SongFans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "songid")
    private Song songid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "type")
    private String type;

    public static enum Type {

        LIKE, DISLIKE
    }

    public SongFans() {
    }

    public SongFans(Integer id) {
        this.id = id;
    }

    public SongFans(Integer id, Song songid, User userid) {
        this.id = id;
        this.songid = songid;
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Song getSongid() {
        return songid;
    }

    public void setSongid(Song songid) {
        this.songid = songid;
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
        if(!(object instanceof SongFans)) {
            return false;
        }
        SongFans other = (SongFans) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.SongFans[id=" + id + "]";
    }
}
