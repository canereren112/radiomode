/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "radiostats")
@NamedQueries({ //@NamedQuery(name = "RadioStats.findAll", query = "SELECT r FROM RadioStats r"),
//@NamedQuery(name = "RadioStats.findById", query = "SELECT r FROM RadioStats r WHERE r.id = :id"), 
//@NamedQuery(name = "RadioStats.findByRadioid", query = "SELECT r FROM RadioStats r WHERE r.radioid = :radioid"), 
//@NamedQuery(name = "RadioStats.findByFanCount", query = "SELECT r FROM RadioStats r WHERE r.fanCount = :fanCount"), 
//@NamedQuery(name = "RadioStats.findByBlockCount", query = "SELECT r FROM RadioStats r WHERE r.blockCount = :blockCount"), 
//@NamedQuery(name = "RadioStats.findByListenCount", query = "SELECT r FROM RadioStats r WHERE r.listenCount = :listenCount"), 
//@NamedQuery(name = "RadioStats.findByCommentCount", query = "SELECT r FROM RadioStats r WHERE r.commentCount = :commentCount")
})
public class RadioStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "radioid")
    private Radio radioid;
    @Column(name = "fanCount")
    private Integer fanCount;
    @Basic(optional = false)
    @Column(name = "blockCount")
    private Integer blockCount;
    @Basic(optional = false)
    @Column(name = "listenCount")
    private Integer listenCount;
    @Basic(optional = false)
    @Column(name = "commentCount")
    private Integer commentCount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statsid")
    private RadioStats radioStats;

    public RadioStats() {
    }

    public RadioStats(Integer id) {
        this.id = id;
    }

    public RadioStats(Integer id, Radio radioid, Integer blockCount, Integer listenCount, Integer commentCount) {
        this.id = id;
        this.radioid = radioid;
        this.blockCount = blockCount;
        this.listenCount = listenCount;
        this.commentCount = commentCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Radio getRadioid() {
        return radioid;
    }

    public void setRadioid(Radio radioid) {
        this.radioid = radioid;
    }

    public Integer getFanCount() {
        return fanCount;
    }

    public void setFanCount(Integer fanCount) {
        this.fanCount = fanCount;
    }

    public Integer getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(Integer blockCount) {
        this.blockCount = blockCount;
    }

    public Integer getListenCount() {
        return listenCount;
    }

    public void setListenCount(Integer listenCount) {
        this.listenCount = listenCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public RadioStats getRadioStats() {
        return radioStats;
    }

    public void setRadioStats(RadioStats radioStats) {
        this.radioStats = radioStats;
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
        if (!(object instanceof RadioStats)) {
            return false;
        }
        RadioStats other = (RadioStats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.RadioStats[id=" + id + "]";
    }
}
