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
 * @author firat
 */
@Entity
@Table(name = "artistmembers")
@NamedQueries({
    @NamedQuery(name = "ArtistMembers.findAll", query = "SELECT a FROM ArtistMembers a")})
public class ArtistMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "memberName")
    private String memberName;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @Column(name = "fromYear")
    private String fromYear;
    @Column(name = "toYear")
    private String toYear;
    @Basic(optional = false)
    @Column(name = "memberArtistid")
    private Integer memberArtistid;

    public ArtistMembers() {
    }

    public ArtistMembers(Integer id) {
        this.id = id;
    }

    public ArtistMembers(Integer id, Artist artistid, Integer memberArtistid) {
        this.id = id;
        this.artistid = artistid;
        this.memberArtistid = memberArtistid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
    }

    public String getFrom() {
        return fromYear;
    }

    public void setFrom(String from) {
        this.fromYear = from;
    }

    public String getTo() {
        return toYear;
    }

    public void setTo(String to) {
        this.toYear = to;
    }

    public Integer getMemberArtistid() {
        return memberArtistid;
    }

    public void setMemberArtistid(Integer memberArtistid) {
        this.memberArtistid = memberArtistid;
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
        if (!(object instanceof ArtistMembers)) {
            return false;
        }
        ArtistMembers other = (ArtistMembers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ArtistMembers[id=" + id + "]";
    }
}
