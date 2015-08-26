/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain;

import com.eren.radiomode.domain.group.Group;
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
import javax.persistence.Lob;
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
@Table(name = "forum")
@NamedQueries({ //@NamedQuery(name = "Forum.findAll", query = "SELECT f FROM Forum f"),
//@NamedQuery(name = "Forum.findByid", query = "SELECT f FROM Forum f WHERE f.forumid = :forumid"),
//@NamedQuery(name = "Forum.findByGroupid", query = "SELECT f FROM Forum f WHERE f.groupid = :groupid"), 
//@NamedQuery(name = "Forum.findBySenderid", query = "SELECT f FROM Forum f WHERE f.senderid = :senderid"), 
//@NamedQuery(name = "Forum.findByHeader", query = "SELECT f FROM Forum f WHERE f.header = :header"), 
//@NamedQuery(name = "Forum.findBySendDate", query = "SELECT f FROM Forum f WHERE f.sendDate = :sendDate")
})
public class Forum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "forumid")
    private Integer forumid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "groupid")
    private Group groupid;
    @ManyToOne
    @JoinColumn(name = "senderid")
    private User senderid;
    @Column(name = "header")
    private String header;
    @Lob
    @Column(name = "content")
    private String content;
    @Column(name = "sendDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;

    public Forum() {
    }

    public Forum(Integer forumid) {
        this.forumid = forumid;
    }

    public Forum(Integer forumid, Group groupid) {
        this.forumid = forumid;
        this.groupid = groupid;
    }

    public Integer getForumid() {
        return forumid;
    }

    public void setForumid(Integer forumid) {
        this.forumid = forumid;
    }

    public Group getGroupid() {
        return groupid;
    }

    public void setGroupid(Group groupid) {
        this.groupid = groupid;
    }

    public User getSenderid() {
        return senderid;
    }

    public void setSenderid(User senderid) {
        this.senderid = senderid;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (forumid != null ? forumid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Forum)) {
            return false;
        }
        Forum other = (Forum) object;
        if ((this.forumid == null && other.forumid != null) || (this.forumid != null && !this.forumid.equals(other.forumid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Forum[forumid=" + forumid + "]";
    }
}
