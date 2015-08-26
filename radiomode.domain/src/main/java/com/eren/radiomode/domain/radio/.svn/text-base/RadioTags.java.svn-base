/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

import com.eren.radiomode.domain.Tag;
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
@Table(name = "radiotags")
@NamedQueries({ //@NamedQuery(name = "RadioTags.findAll", query = "SELECT r FROM RadioTags r"),
//@NamedQuery(name = "RadioTags.findById", query = "SELECT r FROM RadioTags r WHERE r.id = :id"), 
//@NamedQuery(name = "RadioTags.findByRadioid", query = "SELECT r FROM RadioTags r WHERE r.radioid = :radioid"), 
//@NamedQuery(name = "RadioTags.findByTag", query = "SELECT r FROM RadioTags r WHERE r.tag = :tag"), 
//@NamedQuery(name = "RadioTags.findByTagPercent", query = "SELECT r FROM RadioTags r WHERE r.tagPercent = :tagPercent")
})
public class RadioTags implements Serializable {

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
    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tag tagid;
    @Column(name = "count")
    private Integer count;

    public RadioTags() {
    }

    public RadioTags(Integer id) {
        this.id = id;
    }

    public RadioTags(Integer id, Radio radioid) {
        this.id = id;
        this.radioid = radioid;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Tag getTagid() {
        return tagid;
    }

    public void setTagid(Tag tagid) {
        this.tagid = tagid;
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
        if (!(object instanceof RadioTags)) {
            return false;
        }
        RadioTags other = (RadioTags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.RadioTags[id=" + id + "]";
    }
}
