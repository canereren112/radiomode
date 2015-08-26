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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author work
 */
@Entity
@Table(name = "message")
@NamedQueries({ //@NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m"),
//@NamedQuery(name = "Message.findById", query = "SELECT m FROM Message m WHERE m.id = :id"), 
//@NamedQuery(name = "Message.findBySenderid", query = "SELECT m FROM Message m WHERE m.senderid = :senderid"), 
//@NamedQuery(name = "Message.findByReceiverid", query = "SELECT m FROM Message m WHERE m.receiverid = :receiverid"), 
//@NamedQuery(name = "Message.findByHeader", query = "SELECT m FROM Message m WHERE m.header = :header"), 
//@NamedQuery(name = "Message.findBySendDate", query = "SELECT m FROM Message m WHERE m.sendDate = :sendDate"), 
//@NamedQuery(name = "Message.findByReadDate", query = "SELECT m FROM Message m WHERE m.readDate = :readDate"), 
//@NamedQuery(name = "Message.findByReplyDate", query = "SELECT m FROM Message m WHERE m.replyDate = :replyDate")
})
public class Message implements Serializable {

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
    @Column(name = "header")
    private String header;
    @Lob
    @Column(name = "content")
    private String content;
    @Column(name = "sendDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(name = "readDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date readDate;
    @Column(name = "replyDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date replyDate;
    @Column(name = "replyid")
    private Integer replyid;

    public Message() {
    }

    public Message(Integer id) {
        this.id = id;
    }

    public Message(Integer id, User senderid, User receiverid) {
        this.id = id;
        this.senderid = senderid;
        this.receiverid = receiverid;
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

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
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
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Message[id=" + id + "]";
    }
}
