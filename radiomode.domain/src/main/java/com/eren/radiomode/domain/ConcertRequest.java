/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain;

import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.user.User;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author work
 */
@Entity
@Table(name = "concertrequest")
@NamedQueries({ //@NamedQuery(name = "ConcertRequest.findAll", query = "SELECT c FROM ConcertRequest c"),
//@NamedQuery(name = "ConcertRequest.findById", query = "SELECT c FROM ConcertRequest c WHERE c.id = :id"), 
//@NamedQuery(name = "ConcertRequest.findByArtistid", query = "SELECT c FROM ConcertRequest c WHERE c.artistid = :artistid"), 
//@NamedQuery(name = "ConcertRequest.findByUserid", query = "SELECT c FROM ConcertRequest c WHERE c.userid = :userid"), 
//@NamedQuery(name = "ConcertRequest.findByComment", query = "SELECT c FROM ConcertRequest c WHERE c.comment = :comment"), 
//@NamedQuery(name = "ConcertRequest.findByCityid", query = "SELECT c FROM ConcertRequest c WHERE c.cityid = :cityid"), 
//@NamedQuery(name = "ConcertRequest.findByCountryCode", query = "SELECT c FROM ConcertRequest c WHERE c.countryCode = :countryCode"), 
//@NamedQuery(name = "ConcertRequest.findByRequestDate", query = "SELECT c FROM ConcertRequest c WHERE c.requestDate = :requestDate")
})
public class ConcertRequest implements Serializable {

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
    @ManyToOne
    @Basic(optional = false)
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "comment")
    private Character comment;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "cityid")
    private City cityid;
    @Basic(optional = false)
    @Column(name = "requestDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;

    public ConcertRequest() {
    }

    public ConcertRequest(Integer id) {
        this.id = id;
    }

    public ConcertRequest(Integer id, Artist artistid, User userid, City cityid) {
        this.id = id;
        this.artistid = artistid;
        this.userid = userid;
        this.cityid = cityid;
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

    public Character getComment() {
        return comment;
    }

    public void setComment(Character comment) {
        this.comment = comment;
    }

    public City getCityid() {
        return cityid;
    }

    public void setCityid(City cityid) {
        this.cityid = cityid;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
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
        if(!(object instanceof ConcertRequest)) {
            return false;
        }
        ConcertRequest other = (ConcertRequest) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ConcertRequest[id=" + id + "]";
    }
}
