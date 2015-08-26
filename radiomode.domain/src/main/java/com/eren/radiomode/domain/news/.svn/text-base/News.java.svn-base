/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.news;

import com.eren.radiomode.domain.artist.Artist;
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
@Table(name = "news")
@NamedQueries({ //@NamedQuery(name = "News.findAll", query = "SELECT n FROM News n"),
//@NamedQuery(name = "News.findByNewsid", query = "SELECT n FROM News n WHERE n.newsid = :newsid"),
//@NamedQuery(name = "News.findBySenderid", query = "SELECT n FROM News n WHERE n.senderid = :senderid"), 
//@NamedQuery(name = "News.findByArtistid", query = "SELECT n FROM News n WHERE n.artistid = :artistid"), 
//@NamedQuery(name = "News.findByHeader", query = "SELECT n FROM News n WHERE n.header = :header"), 
//@NamedQuery(name = "News.findBySendDate", query = "SELECT n FROM News n WHERE n.sendDate = :sendDate")
})
public class News implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "newsid")
    private Integer newsid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "senderid")
    private User senderid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @Column(name = "header")
    private String header;
    @Lob
    @Column(name = "content")
    private String content;
    @Column(name = "sendDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;

    public News() {
    }

    public News(Integer newsid) {
        this.newsid = newsid;
    }

    public News(Integer newsid, User senderid, Artist artistid) {
        this.newsid = newsid;
        this.senderid = senderid;
        this.artistid = artistid;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public User getSenderid() {
        return senderid;
    }

    public void setSenderid(User senderid) {
        this.senderid = senderid;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
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
        hash += (newsid != null ? newsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof News)) {
            return false;
        }
        News other = (News) object;
        if ((this.newsid == null && other.newsid != null) || (this.newsid != null && !this.newsid.equals(other.newsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.News[newsid=" + newsid + "]";
    }
}
