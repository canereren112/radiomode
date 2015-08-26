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
@Table(name = "usernotifications")
@NamedQueries({
    //@NamedQuery(name = "UserNotifications.findAll", query = "SELECT n FROM UserNotifications n"),
    //@NamedQuery(name = "UserNotifications.findById", query = "SELECT n FROM UserNotifications n WHERE n.id = :id"),
    //@NamedQuery(name = "UserNotifications.findByNoSend", query = "SELECT n FROM UserNotifications n WHERE n.noSend = :noSend"),
    //@NamedQuery(name = "UserNotifications.findByWeeklyNewsLetter", query = "SELECT n FROM UserNotifications n WHERE n.weeklyNewsLetter = :weeklyNewsLetter"),
    //@NamedQuery(name = "UserNotifications.findByIncomingMessage", query = "SELECT n FROM UserNotifications n WHERE n.incomingMessage = :incomingMessage"),
    //@NamedQuery(name = "UserNotifications.findByFriendshipRequest", query = "SELECT n FROM UserNotifications n WHERE n.friendshipRequest = :friendshipRequest"),
    //@NamedQuery(name = "UserNotifications.findByWallComment", query = "SELECT n FROM UserNotifications n WHERE n.wallComment = :wallComment"),
    //@NamedQuery(name = "UserNotifications.findByStationComment", query = "SELECT n FROM UserNotifications n WHERE n.stationComment = :stationComment"),
    //@NamedQuery(name = "UserNotifications.findByConcertAlert", query = "SELECT n FROM UserNotifications n WHERE n.concertAlert = :concertAlert")
    @NamedQuery(name = "UserNotifications.findByUserName", query = "SELECT n FROM UserNotifications n join n.userid u WHERE u.userName = :userName")
})
public class UserNotifications implements Serializable {

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
    @Column(name = "noSend")
    private Boolean noSend;
    @Column(name = "weeklyNewsLetter")
    private Boolean weeklyNewsLetter;
    @Column(name = "incomingMessage")
    private Boolean incomingMessage;
    @Column(name = "friendshipRequest")
    private Boolean friendshipRequest;
    @Column(name = "wallComment")
    private Boolean wallComment;
    @Column(name = "stationComment")
    private Boolean stationComment;
    @Column(name = "concertAlert")
    private Boolean concertAlert;

    public UserNotifications() {
    }

    public UserNotifications(Integer id) {
        this.id = id;
    }

    public UserNotifications(Integer id, User userid) {
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

    public Boolean getNoSend() {
        return noSend;
    }

    public void setNoSend(Boolean noSend) {
        this.noSend = noSend;
    }

    public Boolean getWeeklyNewsLetter() {
        return weeklyNewsLetter;
    }

    public void setWeeklyNewsLetter(Boolean weeklyNewsLetter) {
        this.weeklyNewsLetter = weeklyNewsLetter;
    }

    public Boolean getIncomingMessage() {
        return incomingMessage;
    }

    public void setIncomingMessage(Boolean incomingMessage) {
        this.incomingMessage = incomingMessage;
    }

    public Boolean getFriendshipRequest() {
        return friendshipRequest;
    }

    public void setFriendshipRequest(Boolean friendshipRequest) {
        this.friendshipRequest = friendshipRequest;
    }

    public Boolean getWallComment() {
        return wallComment;
    }

    public void setWallComment(Boolean wallComment) {
        this.wallComment = wallComment;
    }

    public Boolean getStationComment() {
        return stationComment;
    }

    public void setStationComment(Boolean stationComment) {
        this.stationComment = stationComment;
    }

    public Boolean getConcertAlert() {
        return concertAlert;
    }

    public void setConcertAlert(Boolean concertAlert) {
        this.concertAlert = concertAlert;
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
        if(!(object instanceof UserNotifications)) {
            return false;
        }
        UserNotifications other = (UserNotifications) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Notifications[id=" + id + "]";
    }
}
