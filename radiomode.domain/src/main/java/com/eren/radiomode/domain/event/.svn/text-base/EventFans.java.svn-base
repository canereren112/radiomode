/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.event;

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
@Table(name = "eventfans")
@NamedQueries({ //@NamedQuery(name = "EventFans.findAll", query = "SELECT e FROM EventFans e"),
//@NamedQuery(name = "EventFans.findById", query = "SELECT e FROM EventFans e WHERE e.id = :id"), 
//@NamedQuery(name = "EventFans.findByEventid", query = "SELECT e FROM EventFans e WHERE e.eventid = :eventid"), 
//@NamedQuery(name = "EventFans.findByUserid", query = "SELECT e FROM EventFans e WHERE e.userid = :userid"), 
//@NamedQuery(name = "EventFans.findByType", query = "SELECT e FROM EventFans e WHERE e.type = :type")
})
public class EventFans implements Serializable {

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
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "type")
    private String type;

    public static enum Type {

        YES, NO, MAYBE;
    }

    public EventFans() {
    }

    public EventFans(Integer id) {
        this.id = id;
    }

    public EventFans(Integer id, Event eventid, User userid) {
        this.id = id;
        this.eventid = eventid;
        this.userid = userid;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
        if(!(object instanceof EventFans)) {
            return false;
        }
        EventFans other = (EventFans) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.EventFans[id=" + id + "]";
    }
}
