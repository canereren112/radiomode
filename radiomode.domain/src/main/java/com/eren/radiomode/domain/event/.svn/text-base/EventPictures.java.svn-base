/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eren.radiomode.domain.event;

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
@Table(name = "eventpictures")
@NamedQueries({@NamedQuery(name = "EventPictures.findAll", query = "SELECT e FROM EventPictures e"), @NamedQuery(name = "EventPictures.findById", query = "SELECT e FROM EventPictures e WHERE e.id = :id"), @NamedQuery(name = "EventPictures.findByEventid", query = "SELECT e FROM EventPictures e WHERE e.eventid = :eventid"), @NamedQuery(name = "EventPictures.findByLocationNormal", query = "SELECT e FROM EventPictures e WHERE e.locationNormal = :locationNormal"), @NamedQuery(name = "EventPictures.findByLocationSmall", query = "SELECT e FROM EventPictures e WHERE e.locationSmall = :locationSmall"), @NamedQuery(name = "EventPictures.findByComment", query = "SELECT e FROM EventPictures e WHERE e.comment = :comment"), @NamedQuery(name = "EventPictures.findByUploadDate", query = "SELECT e FROM EventPictures e WHERE e.uploadDate = :uploadDate")})
public class EventPictures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "eventid")
    private Event eventid;
    @Column(name = "locationNormal")
    private String locationNormal;
    @Column(name = "locationSmall")
    private String locationSmall;
    @Column(name = "comment")
    private String comment;
    @Column(name = "uploadDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;

    public EventPictures() {
    }

    public EventPictures(Integer id) {
        this.id = id;
    }

    public EventPictures(Integer id, Event eventid) {
        this.id = id;
        this.eventid = eventid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Event getEventid() {
        return eventid;
    }

    public void setEventid(Event eventid) {
        this.eventid = eventid;
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
        if(!(object instanceof EventPictures)) {
            return false;
        }
        EventPictures other = (EventPictures) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.EventPictures[id=" + id + "]";
    }

}
