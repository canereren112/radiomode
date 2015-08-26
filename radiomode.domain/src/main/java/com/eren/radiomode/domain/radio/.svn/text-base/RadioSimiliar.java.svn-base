/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

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
@Table(name = "radiosimiliar")
@NamedQueries({
    @NamedQuery(name = "RadioSimiliar.findAll", query = "SELECT r FROM RadioSimiliar r"),
    @NamedQuery(name = "RadioSimiliar.findById", query = "SELECT r FROM RadioSimiliar r WHERE r.id = :id"),
    @NamedQuery(name = "RadioSimiliar.findByRadioid", query = "SELECT r FROM RadioSimiliar r WHERE r.radioid = :radioid"),
    @NamedQuery(name = "RadioSimiliar.findBySimiliarRadioid", query = "SELECT r FROM RadioSimiliar r WHERE r.similiarRadioid = :similiarRadioid"),
    @NamedQuery(name = "RadioSimiliar.findByPercent", query = "SELECT r FROM RadioSimiliar r WHERE r.percent = :percent")})
public class RadioSimiliar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "radioid")
    private Radio radioid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "similiarRadioid")
    private Radio similiarRadioid;
    @Column(name = "percent")
    private Integer percent;

    public RadioSimiliar() {
    }

    public RadioSimiliar(Integer id) {
        this.id = id;
    }

    public RadioSimiliar(Integer id, Radio radioid, Radio similiarRadioid) {
        this.id = id;
        this.radioid = radioid;
        this.similiarRadioid = similiarRadioid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Radio getRadioid() {
        return radioid;
    }

    public void setRadioid(Radio radioid) {
        this.radioid = radioid;
    }

    public Radio getSimiliarRadioid() {
        return similiarRadioid;
    }

    public void setSimiliarRadioid(Radio similiarRadioid) {
        this.similiarRadioid = similiarRadioid;
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
        if (!(object instanceof RadioSimiliar)) {
            return false;
        }
        RadioSimiliar other = (RadioSimiliar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.RadioSimiliar[id=" + id + "]";
    }
}
