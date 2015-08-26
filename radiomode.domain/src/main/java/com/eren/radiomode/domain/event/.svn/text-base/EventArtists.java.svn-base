/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.event;

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
@Table(name = "eventartists")
@NamedQueries({ //@NamedQuery(name = "EventArtists.findAll", query = "SELECT e FROM EventArtists e"),
//@NamedQuery(name = "EventArtists.findById", query = "SELECT e FROM EventArtists e WHERE e.id = :id"), 
//@NamedQuery(name = "EventArtists.findByEventid", query = "SELECT e FROM EventArtists e WHERE e.eventid = :eventid"), 
//@NamedQuery(name = "EventArtists.findByArtistid", query = "SELECT e FROM EventArtists e WHERE e.artistid = :artistid")
})
public class EventArtists implements Serializable {

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
    @JoinColumn(name = "artistid")
    private Artist artistid;

    public EventArtists() {
    }

    public EventArtists(Integer id) {
        this.id = id;
    }

    public EventArtists(Integer id, Event eventid, Artist artistid) {
        this.id = id;
        this.eventid = eventid;
        this.artistid = artistid;
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
        if(!(object instanceof EventArtists)) {
            return false;
        }
        EventArtists other = (EventArtists) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.EventArtists[id=" + id + "]";
    }
}
