/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.genre;

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
@Table(name = "genresimiliar")
@NamedQueries({
    @NamedQuery(name = "GenreSimiliar.findAll", query = "SELECT g FROM GenreSimiliar g"),
    @NamedQuery(name = "GenreSimiliar.findById", query = "SELECT g FROM GenreSimiliar g WHERE g.id = :id"),
    @NamedQuery(name = "GenreSimiliar.findByGenreid", query = "SELECT g FROM GenreSimiliar g WHERE g.genreid = :genreid"),
    @NamedQuery(name = "GenreSimiliar.findBySimiliarGenreid", query = "SELECT g FROM GenreSimiliar g WHERE g.similiarGenreid = :similiarGenreid"),
    @NamedQuery(name = "GenreSimiliar.findByPercent", query = "SELECT g FROM GenreSimiliar g WHERE g.percent = :percent")})
public class GenreSimiliar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "genreid")
    private Genre genreid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "similiarGenreid")
    private Genre similiarGenreid;
    @Column(name = "percent")
    private Integer percent;

    public GenreSimiliar() {
    }

    public GenreSimiliar(Integer id) {
        this.id = id;
    }

    public GenreSimiliar(Integer id, Genre genreid, Genre similiarGenreid) {
        this.id = id;
        this.genreid = genreid;
        this.similiarGenreid = similiarGenreid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Genre getGenreid() {
        return genreid;
    }

    public void setGenreid(Genre genreid) {
        this.genreid = genreid;
    }

    public Genre getSimiliarGenreid() {
        return similiarGenreid;
    }

    public void setSimiliarGenreid(Genre similiarGenreid) {
        this.similiarGenreid = similiarGenreid;
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
        if (!(object instanceof GenreSimiliar)) {
            return false;
        }
        GenreSimiliar other = (GenreSimiliar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.GenreSimiliar[id=" + id + "]";
    }
}
