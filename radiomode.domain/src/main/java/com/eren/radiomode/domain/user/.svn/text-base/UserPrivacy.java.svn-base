/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.user;

import com.eren.radiomode.domain.user.User;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "userprivacy")
@NamedQueries({ //@NamedQuery(name = "UserPrivacy.findAll", query = "SELECT p FROM UserPrivacy p"),
//@NamedQuery(name = "UserPrivacy.findById", query = "SELECT p FROM UserPrivacy p WHERE p.id = :id"),
//@NamedQuery(name = "UserPrivacy.findByUserid", query = "SELECT p FROM UserPrivacy p WHERE p.userid = :userid"),
//@NamedQuery(name = "UserPrivacy.findByProfileVisibility", query = "SELECT p FROM UserPrivacy p WHERE p.profileVisibility = :profileVisibility"),
//@NamedQuery(name = "UserPrivacy.findByListenHistoryVisibility", query = "SELECT p FROM UserPrivacy p WHERE p.listenHistoryVisibility = :listenHistoryVisibility"),
//@NamedQuery(name = "UserPrivacy.findByRecentActivityVisibility", query = "SELECT p FROM UserPrivacy p WHERE p.recentActivityVisibility = :recentActivityVisibility"),
//@NamedQuery(name = "UserPrivacy.findByReceiveMessagePermission", query = "SELECT p FROM UserPrivacy p WHERE p.receiveMessagePermission = :receiveMessagePermission")
})
public class UserPrivacy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "userid")
    private User userid;
    @Column(name = "profileVisibility")
    private String profileVisibility;
    @Column(name = "listenHistoryVisibility")
    private String listenHistoryVisibility;
    @Column(name = "recentActivityVisibility")
    private String recentActivityVisibility;
    @Column(name = "receiveMessagePermission")
    private String receiveMessagePermission;

    public static enum PrivacyType {

        ALL, FRIENDS, CONTACTS, NOONE;
    }

    public UserPrivacy() {
    }

    public UserPrivacy(Integer id) {
        this.id = id;
    }

    public UserPrivacy(Integer id, User userid) {
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

    public String getProfileVisibility() {
        return profileVisibility;
    }

    public void setProfileVisibility(String profileVisibility) {
        this.profileVisibility = profileVisibility;
    }

    public String getListenHistoryVisibility() {
        return listenHistoryVisibility;
    }

    public void setListenHistoryVisibility(String listenHistoryVisibility) {
        this.listenHistoryVisibility = listenHistoryVisibility;
    }

    public String getRecentActivityVisibility() {
        return recentActivityVisibility;
    }

    public void setRecentActivityVisibility(String recentActivityVisibility) {
        this.recentActivityVisibility = recentActivityVisibility;
    }

    public String getReceiveMessagePermission() {
        return receiveMessagePermission;
    }

    public void setReceiveMessagePermission(String receiveMessagePermission) {
        this.receiveMessagePermission = receiveMessagePermission;
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
        if(!(object instanceof UserPrivacy)) {
            return false;
        }
        UserPrivacy other = (UserPrivacy) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Privacy[id=" + id + "]";
    }
}
