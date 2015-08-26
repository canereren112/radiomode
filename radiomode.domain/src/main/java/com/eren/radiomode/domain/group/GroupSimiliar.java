/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.group;

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
@Table(name = "groupsimiliar")
@NamedQueries({
    @NamedQuery(name = "GroupSimiliar.findAll", query = "SELECT g FROM GroupSimiliar g"),
    @NamedQuery(name = "GroupSimiliar.findById", query = "SELECT g FROM GroupSimiliar g WHERE g.id = :id"),
    @NamedQuery(name = "GroupSimiliar.findByGroupid", query = "SELECT g FROM GroupSimiliar g WHERE g.groupid = :groupid"),
    @NamedQuery(name = "GroupSimiliar.findBySimiliarGroupid", query = "SELECT g FROM GroupSimiliar g WHERE g.similiarGroupid = :similiarGroupid"),
    @NamedQuery(name = "GroupSimiliar.findByPercent", query = "SELECT g FROM GroupSimiliar g WHERE g.percent = :percent")})
public class GroupSimiliar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "groupid")
    private Group groupid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "similiarGroupid")
    private Group similiarGroupid;
    @Column(name = "percent")
    private Integer percent;

    public GroupSimiliar() {
    }

    public GroupSimiliar(Integer id) {
        this.id = id;
    }

    public GroupSimiliar(Integer id, Group groupid, Group similiarGroupid) {
        this.id = id;
        this.groupid = groupid;
        this.similiarGroupid = similiarGroupid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Group getGroupid() {
        return groupid;
    }

    public void setGroupid(Group groupid) {
        this.groupid = groupid;
    }

    public Group getSimiliarGroupid() {
        return similiarGroupid;
    }

    public void setSimiliarGroupid(Group similiarGroupid) {
        this.similiarGroupid = similiarGroupid;
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
        if (!(object instanceof GroupSimiliar)) {
            return false;
        }
        GroupSimiliar other = (GroupSimiliar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.GroupSimiliar[id=" + id + "]";
    }
}
