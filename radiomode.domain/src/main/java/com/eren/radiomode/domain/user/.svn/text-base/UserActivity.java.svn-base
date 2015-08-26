/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.user;

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
@Table(name = "useractivity")
@NamedQueries({ //@NamedQuery(name = "UserActivity.findAll", query = "SELECT u FROM UserActivity u"),
//@NamedQuery(name = "UserActivity.findById", query = "SELECT u FROM UserActivity u WHERE u.id = :id"), 
//@NamedQuery(name = "UserActivity.findByUserid", query = "SELECT u FROM UserActivity u WHERE u.userid = :userid"), 
//@NamedQuery(name = "UserActivity.findByActivityType", query = "SELECT u FROM UserActivity u WHERE u.activityType = :activityType"), 
//@NamedQuery(name = "UserActivity.findByActionType", query = "SELECT u FROM UserActivity u WHERE u.actionType = :actionType"), 
//@NamedQuery(name = "UserActivity.findByActivity", query = "SELECT u FROM UserActivity u WHERE u.activity = :activity"), 
//@NamedQuery(name = "UserActivity.findByActivityDate", query = "SELECT u FROM UserActivity u WHERE u.activityDate = :activityDate")
})
public class UserActivity implements Serializable {

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
    @Column(name = "activityType")
    private String activityType;
    @Basic(optional = false)
    @Column(name = "actionType")
    private String actionType;
    @Column(name = "activity")
    private String activity;
    @Basic(optional = false)
    @Column(name = "activityDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activityDate;
    @Column(name = "entityType")
    private String entityType;
    @Column(name = "entityid")
    private Integer entityid;

    public static enum ActionType {

        INSERT, UPDATE, DELETE;
    }

    public static enum ActivityType {

        LOVE, TAG, BUY, SHARE, COMMENT, PROFILE, PICTURE, FRIEND;
    }

    public static enum EntityType {

        ARTIST, ALBUM, SONG;
    }

    public UserActivity() {
    }

    public UserActivity(Integer id) {
        this.id = id;
    }

    public UserActivity(Integer id, User userid, String actionType, Date activityDate) {
        this.id = id;
        this.userid = userid;
        this.actionType = actionType;
        this.activityDate = activityDate;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Integer getEntityid() {
        return entityid;
    }

    public void setEntityid(Integer entityid) {
        this.entityid = entityid;
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

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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
        if (!(object instanceof UserActivity)) {
            return false;
        }
        UserActivity other = (UserActivity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.UserActivity[id=" + id + "]";
    }
}
