/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.event;

import com.eren.radiomode.domain.City;
import com.eren.radiomode.domain.user.User;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "event")
@NamedQueries({ //@NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e"),
//@NamedQuery(name = "Event.findByEventid", query = "SELECT e FROM Event e WHERE e.eventid = :eventid"),
//@NamedQuery(name = "Event.findBySenderid", query = "SELECT e FROM Event e WHERE e.senderid = :senderid"), 
//@NamedQuery(name = "Event.findByHeader", query = "SELECT e FROM Event e WHERE e.header = :header"), 
//@NamedQuery(name = "Event.findByPlace", query = "SELECT e FROM Event e WHERE e.place = :place"), 
//@NamedQuery(name = "Event.findByCityid", query = "SELECT e FROM Event e WHERE e.cityid = :cityid"), 
//@NamedQuery(name = "Event.findByEventLink", query = "SELECT e FROM Event e WHERE e.eventLink = :eventLink"), 
//@NamedQuery(name = "Event.findBySenderDate", query = "SELECT e FROM Event e WHERE e.senderDate = :senderDate"), 
//@NamedQuery(name = "Event.findByEventDate", query = "SELECT e FROM Event e WHERE e.eventDate = :eventDate")
})
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "eventid")
    private Integer eventid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "senderid")
    private User senderid;
    @Column(name = "header")
    private String header;
    @Lob
    @Column(name = "content")
    private String content;
    @Column(name = "place")
    private String place;
    @ManyToOne
    @JoinColumn(name = "cityid")
    private City cityid;
    @Column(name = "eventLink")
    private String eventLink;
    @Column(name = "senderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date senderDate;
    @Column(name = "eventDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statsid")
    private EventStats eventStats;

    public Event() {
    }

    public Event(Integer eventid) {
        this.eventid = eventid;
    }

    public Event(Integer eventid, User senderid) {
        this.eventid = eventid;
        this.senderid = senderid;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public User getSenderid() {
        return senderid;
    }

    public void setSenderid(User senderid) {
        this.senderid = senderid;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public City getCityid() {
        return cityid;
    }

    public void setCityid(City cityid) {
        this.cityid = cityid;
    }

    public String getEventLink() {
        return eventLink;
    }

    public void setEventLink(String eventLink) {
        this.eventLink = eventLink;
    }

    public Date getSenderDate() {
        return senderDate;
    }

    public void setSenderDate(Date senderDate) {
        this.senderDate = senderDate;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public EventStats getEventStats() {
        return eventStats;
    }

    public void setEventStats(EventStats eventStats) {
        this.eventStats = eventStats;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventid != null ? eventid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eventid == null && other.eventid != null) || (this.eventid != null && !this.eventid.equals(other.eventid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Event[eventid=" + eventid + "]";
    }
}
