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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "groupfans")
@NamedQueries({ //@NamedQuery(name = "GroupFans.findAll", query = "SELECT g FROM GroupFans g"),
//@NamedQuery(name = "GroupFans.findById", query = "SELECT g FROM GroupFans g WHERE g.id = :id"), 
//@NamedQuery(name = "GroupFans.findByGroupid", query = "SELECT g FROM GroupFans g WHERE g.groupid = :groupid"), 
//@NamedQuery(name = "GroupFans.findByUserid", query = "SELECT g FROM GroupFans g WHERE g.userid = :userid"), 
//@NamedQuery(name = "GroupFans.findByType", query = "SELECT g FROM GroupFans g WHERE g.type = :type")
})
public class GroupFans implements Serializable {

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
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "type")
    private String type;

    public static enum Type {

        MEMBER, NONMEMBER;
    }

    public GroupFans() {
    }

    public GroupFans(Integer id) {
        this.id = id;
    }

    public GroupFans(Integer id, Group groupid, User userid) {
        this.id = id;
        this.groupid = groupid;
        this.userid = userid;
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
        if(!(object instanceof GroupFans)) {
            return false;
        }
        GroupFans other = (GroupFans) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.GroupFans[id=" + id + "]";
    }
}
