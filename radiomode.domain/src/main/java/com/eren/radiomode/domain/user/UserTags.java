/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.user;

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
@Table(name = "usertags")
@NamedQueries({ //@NamedQuery(name = "UserTags.findAll", query = "SELECT u FROM UserTags u"),
//@NamedQuery(name = "UserTags.findById", query = "SELECT u FROM UserTags u WHERE u.id = :id"), 
//@NamedQuery(name = "UserTags.findByUserid", query = "SELECT u FROM UserTags u WHERE u.userid = :userid"), 
//@NamedQuery(name = "UserTags.findByTag", query = "SELECT u FROM UserTags u WHERE u.tag = :tag"), 
//@NamedQuery(name = "UserTags.findByTagPercent", query = "SELECT u FROM UserTags u WHERE u.tagPercent = :tagPercent")
})
public class UserTags implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid;
    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tag tagid;
    @Column(name = "count")
    private Integer count;

    public UserTags() {
    }

    public UserTags(Integer id) {
        this.id = id;
    }

    public UserTags(Integer id, User userid) {
        this.id = id;
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
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
        if (!(object instanceof UserTags)) {
            return false;
        }
        UserTags other = (UserTags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.UserTags[id=" + id + "]";
    }
}
