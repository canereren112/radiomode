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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author work
 */
@Entity
@Table(name = "userpictures")
@NamedQueries({
    @NamedQuery(name = "UserPictures.findAll", query = "SELECT u FROM UserPictures u"),
    @NamedQuery(name = "UserPictures.findById", query = "SELECT u FROM UserPictures u WHERE u.id = :id"),
    @NamedQuery(name = "UserPictures.findByUserid", query = "SELECT u FROM UserPictures u WHERE u.userid = :userid"),
    @NamedQuery(name = "UserPictures.findByLocationNormal", query = "SELECT u FROM UserPictures u WHERE u.locationNormal = :locationNormal"),
    @NamedQuery(name = "UserPictures.findByLocationSmall", query = "SELECT u FROM UserPictures u WHERE u.locationSmall = :locationSmall"),
    @NamedQuery(name = "UserPictures.findByComment", query = "SELECT u FROM UserPictures u WHERE u.comment = :comment"),
    @NamedQuery(name = "UserPictures.findByUploadDate", query = "SELECT u FROM UserPictures u WHERE u.uploadDate = :uploadDate")})
public class UserPictures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @OneToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    private User userid;
    @Column(name = "locationNormal")
    private String locationNormal;
    @Column(name = "locationSmall")
    private String locationSmall;
    @Column(name = "comment")
    private String comment;
    @Column(name = "uploadDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;

    public UserPictures() {
    }

    public UserPictures(Integer id) {
        this.id = id;
    }

    public UserPictures(Integer id, User userid) {
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

    public String getLocationNormal() {
        return locationNormal;
    }

    public void setLocationNormal(String locationNormal) {
        this.locationNormal = locationNormal;
    }

    public String getLocationSmall() {
        return locationSmall;
    }

    public void setLocationSmall(String locationSmall) {
        this.locationSmall = locationSmall;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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
        if (!(object instanceof UserPictures)) {
            return false;
        }
        UserPictures other = (UserPictures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.UserPictures[id=" + id + "]";
    }
}
