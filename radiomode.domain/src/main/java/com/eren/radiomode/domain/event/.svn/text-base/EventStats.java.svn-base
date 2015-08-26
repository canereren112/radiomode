/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eren.radiomode.domain.event;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "eventstats")
@NamedQueries({
//@NamedQuery(name = "EventStats.findAll", query = "SELECT e FROM EventStats e"), 
//@NamedQuery(name = "EventStats.findById", query = "SELECT e FROM EventStats e WHERE e.id = :id"), 
//@NamedQuery(name = "EventStats.findByEventid", query = "SELECT e FROM EventStats e WHERE e.eventid = :eventid"), 
//@NamedQuery(name = "EventStats.findByFanYesCount", query = "SELECT e FROM EventStats e WHERE e.fanYesCount = :fanYesCount"), 
//@NamedQuery(name = "EventStats.findByFanNoCount", query = "SELECT e FROM EventStats e WHERE e.fanNoCount = :fanNoCount"), 
//@NamedQuery(name = "EventStats.findByFanMaybeCount", query = "SELECT e FROM EventStats e WHERE e.fanMaybeCount = :fanMaybeCount"), 
//@NamedQuery(name = "EventStats.findByCommentCount", query = "SELECT e FROM EventStats e WHERE e.commentCount = :commentCount")
})
public class EventStats implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "eventid")
    private Event eventid;
    @Column(name = "fanYesCount")
    private Integer fanYesCount;
    @Column(name = "fanNoCount")
    private Integer fanNoCount;
    @Column(name = "fanMaybeCount")
    private Integer fanMaybeCount;
    @Column(name = "commentCount")
    private Integer commentCount;

    public EventStats() {
    }

    public EventStats(Integer id) {
        this.id = id;
    }

    public EventStats(Integer id, Event eventid) {
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

    public Integer getFanYesCount() {
        return fanYesCount;
    }

    public void setFanYesCount(Integer fanYesCount) {
        this.fanYesCount = fanYesCount;
    }

    public Integer getFanNoCount() {
        return fanNoCount;
    }

    public void setFanNoCount(Integer fanNoCount) {
        this.fanNoCount = fanNoCount;
    }

    public Integer getFanMaybeCount() {
        return fanMaybeCount;
    }

    public void setFanMaybeCount(Integer fanMaybeCount) {
        this.fanMaybeCount = fanMaybeCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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
        if(!(object instanceof EventStats)) {
            return false;
        }
        EventStats other = (EventStats) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.EventStats[id=" + id + "]";
    }

}
