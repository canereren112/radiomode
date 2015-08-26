/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

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
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author work
 */
@Entity
@Table(name = "radio")
@NamedQueries({
    //@NamedQuery(name = "Radio.findAll", query = "SELECT r FROM Radio r"),
    //@NamedQuery(name = "Radio.findByOwnerid", query = "SELECT r FROM Radio r WHERE r.ownerid = :ownerid")
    @NamedQuery(name = "Radio.findByRadioid", query = "SELECT r FROM Radio r WHERE r.radioid = :radioid")
})
public class Radio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "radioid")
    private Integer radioid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "ownerid")
    private User ownerid;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "createdDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @Column(name = "modifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Radio() {
    }

    public Radio(Integer radioid) {
        this.radioid = radioid;
    }

    public Radio(Integer radioid, User ownerid) {
        this.radioid = radioid;
        this.ownerid = ownerid;
    }

    public Integer getRadioid() {
        return radioid;
    }

    public void setRadioid(Integer radioid) {
        this.radioid = radioid;
    }

    public User getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(User ownerid) {
        this.ownerid = ownerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (radioid != null ? radioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Radio)) {
            return false;
        }
        Radio other = (Radio) object;
        if ((this.radioid == null && other.radioid != null) || (this.radioid != null && !this.radioid.equals(other.radioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Radio[radioid=" + radioid + "]";
    }
}
