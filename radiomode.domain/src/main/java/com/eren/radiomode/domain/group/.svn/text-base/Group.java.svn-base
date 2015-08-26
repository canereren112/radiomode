/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.group;

import com.eren.radiomode.domain.user.User;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "group")
@NamedQueries({ //@NamedQuery(name = "Group.findAll", query = "SELECT g FROM Group g"),
//@NamedQuery(name = "Group.findByGroupid", query = "SELECT g FROM Group g WHERE g.groupid = :groupid"),
//@NamedQuery(name = "Group.findByGroupName", query = "SELECT g FROM Group g WHERE g.groupName = :groupName"),
//@NamedQuery(name = "Group.findByCreaterid", query = "SELECT g FROM Group g WHERE g.createrid = :createrid")
})
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "groupid")
    private Integer groupid;
    @Column(name = "groupName")
    private String groupName;
    @Lob
    @Column(name = "definition")
    private String definition;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "createrid")
    private User createrid;

    public Group() {
    }

    public Group(Integer groupid) {
        this.groupid = groupid;
    }

    public Group(Integer groupid, User createrid) {
        this.groupid = groupid;
        this.createrid = createrid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public User getCreaterid() {
        return createrid;
    }

    public void setCreaterid(User createrid) {
        this.createrid = createrid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupid != null ? groupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Group)) {
            return false;
        }
        Group other = (Group) object;
        if ((this.groupid == null && other.groupid != null) || (this.groupid != null && !this.groupid.equals(other.groupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Groups[groupid=" + groupid + "]";
    }
}
