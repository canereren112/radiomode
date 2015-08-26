/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.radio;

import com.eren.radiomode.domain.user.User;
import java.io.Serializable;
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

/**
 *
 * @author work
 */
@Entity
@Table(name = "radiousers")
@NamedQueries({
    @NamedQuery(name = "RadioUsers.findAll", query = "SELECT r FROM RadioUsers r"),
    //@NamedQuery(name = "RadioUsers.findById", query = "SELECT r FROM RadioUsers r WHERE r.id = :id"),    
    //@NamedQuery(name = "RadioUsers.findByIsDefault", query = "SELECT r FROM RadioUsers r WHERE r.isDefault = :isDefault"),
    //@NamedQuery(name = "RadioUsers.findByUserType", query = "SELECT r FROM RadioUsers r WHERE r.userType = :userType")
    @NamedQuery(name = "RadioUsers.findByUserNameOrderByDate", query = "SELECT ru FROM RadioUsers ru JOIN ru.userid u JOIN ru.radioid r WHERE u.userName = :userName ORDER BY r.createdDate"),
    @NamedQuery(name = "RadioUsers.findByRadioidAndUserName", query = "SELECT ru FROM RadioUsers ru JOIN ru.userid u JOIN ru.radioid r WHERE r.id = :radioid AND u.userName = :userName"),
    @NamedQuery(name = "RadioUsers.findDefaultByUserName", query = "SELECT ru FROM RadioUsers ru JOIN ru.userid u WHERE ru.isDefault=true AND u.userName = :userName")
})
public class RadioUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "radioid")
    private Radio radioid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid;
    @Basic(optional = false)
    @Column(name = "isDefault")
    private Boolean isDefault;
    @Basic(optional = false)
    @Column(name = "userType")
    private String userType;
    public static boolean DEFAULT = true;
    public static boolean NON_DEFAULT = false;
    public static String DEFAULT_STRING = "DEFAULT";

    public static enum UserType {

        OWNER, USER;
    }

    public RadioUsers() {
    }

    public RadioUsers(Integer id) {
        this.id = id;
    }

    public RadioUsers(Integer id, Radio radioid, User userid, boolean isDefault, String userType) {
        this.id = id;
        this.radioid = radioid;
        this.userid = userid;
        this.isDefault = isDefault;
        this.userType = userType;
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

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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
        if(!(object instanceof RadioUsers)) {
            return false;
        }
        RadioUsers other = (RadioUsers) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.RadioUsers[id=" + id + "]";
    }
}
