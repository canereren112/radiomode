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
@Table(name = "friendlist")
@NamedQueries({ //@NamedQuery(name = "FriendList.findAll", query = "SELECT f FROM FriendList f"),
//@NamedQuery(name = "FriendList.findById", query = "SELECT f FROM FriendList f WHERE f.id = :id"), 
//@NamedQuery(name = "FriendList.findBySenderid", query = "SELECT f FROM FriendList f WHERE f.senderid = :senderid"), 
//@NamedQuery(name = "FriendList.findByReceiverid", query = "SELECT f FROM FriendList f WHERE f.receiverid = :receiverid"), 
//@NamedQuery(name = "FriendList.findByResult", query = "SELECT f FROM FriendList f WHERE f.result = :result"), 
//@NamedQuery(name = "FriendList.findBySendDate", query = "SELECT f FROM FriendList f WHERE f.sendDate = :sendDate"), 
//@NamedQuery(name = "FriendList.findByResultDate", query = "SELECT f FROM FriendList f WHERE f.resultDate = :resultDate")
})
public class FriendList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "senderid")
    private User senderid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "receiverid")
    private User receiverid;
    @Basic(optional = false)
    @Column(name = "result")
    private String result;
    @Column(name = "sendDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(name = "resultDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date resultDate;

    public static enum Result {

        WAITING, ACCEPTED, REJECTED;
    }

    public FriendList() {
    }

    public FriendList(Integer id) {
        this.id = id;
    }

    public FriendList(Integer id, User senderid, User receiverid, String result) {
        this.id = id;
        this.senderid = senderid;
        this.receiverid = receiverid;
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getSenderid() {
        return senderid;
    }

    public void setSenderid(User senderid) {
        this.senderid = senderid;
    }

    public User getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(User receiverid) {
        this.receiverid = receiverid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
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
        if(!(object instanceof FriendList)) {
            return false;
        }
        FriendList other = (FriendList) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.FriendList[id=" + id + "]";
    }
}
