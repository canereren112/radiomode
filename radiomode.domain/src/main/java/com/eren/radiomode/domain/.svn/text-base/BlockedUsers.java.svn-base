/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain;

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
@Table(name = "blockedusers")
@NamedQueries({ //@NamedQuery(name = "BlockedUsers.findAll", query = "SELECT b FROM BlockedUsers b"),
//@NamedQuery(name = "BlockedUsers.findById", query = "SELECT b FROM BlockedUsers b WHERE b.id = :id"), 
//@NamedQuery(name = "BlockedUsers.findByBlockerid", query = "SELECT b FROM BlockedUsers b WHERE b.blockerid = :blockerid"), 
//@NamedQuery(name = "BlockedUsers.findByBlockedid", query = "SELECT b FROM BlockedUsers b WHERE b.blockedid = :blockedid"), 
//@NamedQuery(name = "BlockedUsers.findByBlockingDate", query = "SELECT b FROM BlockedUsers b WHERE b.blockingDate = :blockingDate")
})
public class BlockedUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "blockerid")
    private User blockerid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "blockedid")
    private User blockedid;
    @Column(name = "blockingDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blockingDate;

    public BlockedUsers() {
    }

    public BlockedUsers(Integer id) {
        this.id = id;
    }

    public BlockedUsers(Integer id, User blockerid, User blockedid) {
        this.id = id;
        this.blockerid = blockerid;
        this.blockedid = blockedid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getBlockerid() {
        return blockerid;
    }

    public void setBlockerid(User blockerid) {
        this.blockerid = blockerid;
    }

    public User getBlockedid() {
        return blockedid;
    }

    public void setBlockedid(User blockedid) {
        this.blockedid = blockedid;
    }

    public Date getBlockingDate() {
        return blockingDate;
    }

    public void setBlockingDate(Date blockingDate) {
        this.blockingDate = blockingDate;
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
        if(!(object instanceof BlockedUsers)) {
            return false;
        }
        BlockedUsers other = (BlockedUsers) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.BlockedUsers[id=" + id + "]";
    }
}
