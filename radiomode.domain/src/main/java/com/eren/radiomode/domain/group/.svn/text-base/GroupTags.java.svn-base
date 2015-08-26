/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.group;

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
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "grouptags")
@NamedQueries({ //@NamedQuery(name = "GroupTags.findAll", query = "SELECT g FROM GroupTags g"),
//@NamedQuery(name = "GroupTags.findById", query = "SELECT g FROM GroupTags g WHERE g.id = :id"), 
//@NamedQuery(name = "GroupTags.findByGroupid", query = "SELECT g FROM GroupTags g WHERE g.groupid = :groupid"), 
//@NamedQuery(name = "GroupTags.findByTag", query = "SELECT g FROM GroupTags g WHERE g.tag = :tag"), 
//@NamedQuery(name = "GroupTags.findByTagPercent", query = "SELECT g FROM GroupTags g WHERE g.tagPercent = :tagPercent")
})
public class GroupTags implements Serializable {

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
    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tag tagid;
    @Column(name = "count")
    private Integer count;

    public GroupTags() {
    }

    public GroupTags(Integer id) {
        this.id = id;
    }

    public GroupTags(Integer id, Group groupid) {
        this.id = id;
        this.groupid = groupid;
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
        if (!(object instanceof GroupTags)) {
            return false;
        }
        GroupTags other = (GroupTags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.GroupTags[id=" + id + "]";
    }
}
