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
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "eventsimiliar")
@NamedQueries({
    @NamedQuery(name = "EventSimiliar.findAll", query = "SELECT e FROM EventSimiliar e"),
    @NamedQuery(name = "EventSimiliar.findById", query = "SELECT e FROM EventSimiliar e WHERE e.id = :id"),
    @NamedQuery(name = "EventSimiliar.findByEventid", query = "SELECT e FROM EventSimiliar e WHERE e.eventid = :eventid"),
    @NamedQuery(name = "EventSimiliar.findBySimiliarEventid", query = "SELECT e FROM EventSimiliar e WHERE e.similiarEventid = :similiarEventid"),
    @NamedQuery(name = "EventSimiliar.findByPercent", query = "SELECT e FROM EventSimiliar e WHERE e.percent = :percent")})
public class EventSimiliar implements Serializable {

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
    @JoinColumn(name = "similiarEventid")
    private Event similiarEventid;
    @Column(name = "percent")
    private Integer percent;

    public EventSimiliar() {
    }

    public EventSimiliar(Integer id) {
        this.id = id;
    }

    public EventSimiliar(Integer id, Event eventid, Event similiarEventid) {
        this.id = id;
        this.eventid = eventid;
        this.similiarEventid = similiarEventid;
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

    public Event getSimiliarEventid() {
        return similiarEventid;
    }

    public void setSimiliarEventid(Event similiarEventid) {
        this.similiarEventid = similiarEventid;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
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
        if (!(object instanceof EventSimiliar)) {
            return false;
        }
        EventSimiliar other = (EventSimiliar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.EventSimiliar[id=" + id + "]";
    }
}
