/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

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
@Table(name = "radiofans")
@NamedQueries({ //@NamedQuery(name = "RadioFans.findAll", query = "SELECT r FROM RadioFans r"),
//@NamedQuery(name = "RadioFans.findById", query = "SELECT r FROM RadioFans r WHERE r.id = :id"), 
//@NamedQuery(name = "RadioFans.findByRadioid", query = "SELECT r FROM RadioFans r WHERE r.radioid = :radioid"), 
//@NamedQuery(name = "RadioFans.findByUserid", query = "SELECT r FROM RadioFans r WHERE r.userid = :userid"), 
//@NamedQuery(name = "RadioFans.findByType", query = "SELECT r FROM RadioFans r WHERE r.type = :type")
})
public class RadioFans implements Serializable {

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
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "type")
    private String type;

    public static enum Type {

        LIKE, DISLIKE
    }

    public RadioFans() {
    }

    public RadioFans(Integer id) {
        this.id = id;
    }

    public RadioFans(Integer id, Radio radioid, User userid) {
        this.id = id;
        this.radioid = radioid;
        this.userid = userid;
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

    public User getUserid() {
        return userid;
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
        if(!(object instanceof RadioFans)) {
            return false;
        }
        RadioFans other = (RadioFans) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.RadioFans[id=" + id + "]";
    }
}
