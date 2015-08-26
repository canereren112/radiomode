/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain;

import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.video.Video;
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
@Table(name = "listenhistory")
@NamedQueries({ //@NamedQuery(name = "ListenHistory.findAll", query = "SELECT l FROM ListenHistory l"),
    //@NamedQuery(name = "ListenHistory.findById", query = "SELECT l FROM ListenHistory l WHERE l.id = :id"),
    //@NamedQuery(name = "ListenHistory.findByUserid", query = "SELECT l FROM ListenHistory l WHERE l.userid = :userid"),
    //@NamedQuery(name = "ListenHistory.findByRadioid", query = "SELECT l FROM ListenHistory l WHERE l.radioid = :radioid"),  
    //@NamedQuery(name = "ListenHistory.findByVideoid", query = "SELECT l FROM ListenHistory l WHERE l.videoid = :videoid"),
    //@NamedQuery(name = "ListenHistory.findByListenPercent", query = "SELECT l FROM ListenHistory l WHERE l.listenPercent = :listenPercent"),
    //@NamedQuery(name = "ListenHistory.findByVolumePercent", query = "SELECT l FROM ListenHistory l WHERE l.volumePercent = :volumePercent"),
    //@NamedQuery(name = "ListenHistory.findByListenDate", query = "SELECT l FROM ListenHistory l WHERE l.listenDate = :listenDate")
    @NamedQuery(name = "ListenHistory.findByUseridAndRadioid", query = "SELECT l FROM ListenHistory l JOIN l.radioUsersid ru JOIN ru.userid u JOIN ru.radioid r WHERE l.status=true AND u.id = :userid AND r.id = :radioid"),
    @NamedQuery(name = "ListenHistory.findNextByUseridAndRadioid", query = "SELECT l FROM ListenHistory l JOIN l.radioUsersid ru JOIN ru.userid u JOIN ru.radioid r WHERE l.status=false AND u.id = :userid AND r.id = :radioid")
})
public class ListenHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "radioUsersid")
    private RadioUsers radioUsersid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "videoid")
    private Video videoid;
    @Column(name = "listenPercent")
    private Integer listenPercent;
    @Column(name = "volumePercent")
    private Integer volumePercent;
    @Column(name = "listenDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date listenDate;
    @Column(name = "status")
    private Boolean status;
    public static boolean LISTENED = true;
    public static boolean NON_LISTENED = false;

    public ListenHistory() {
    }

    public ListenHistory(Integer id) {
        this.id = id;
    }

    public ListenHistory(Integer id, RadioUsers radioUsersid, Video videoid) {
        this.id = id;
        this.radioUsersid = radioUsersid;
        this.videoid = videoid;
        this.status = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RadioUsers getRadioUsersid() {
        return radioUsersid;
    }

    public void setRadioUsersid(RadioUsers radioUsersid) {
        this.radioUsersid = radioUsersid;
    }

    public Video getVideoid() {
        return videoid;
    }

    public void setVideoid(Video videoid) {
        this.videoid = videoid;
    }

    public Integer getListenPercent() {
        return listenPercent;
    }

    public void setListenPercent(Integer listenPercent) {
        this.listenPercent = listenPercent;
    }

    public Integer getVolumePercent() {
        return volumePercent;
    }

    public void setVolumePercent(Integer volumePercent) {
        this.volumePercent = volumePercent;
    }

    public Date getListenDate() {
        return listenDate;
    }

    public void setListenDate(Date listenDate) {
        this.listenDate = listenDate;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
        if (!(object instanceof ListenHistory)) {
            return false;
        }
        ListenHistory other = (ListenHistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.ListenHistory[id=" + id + "]";
    }
}
