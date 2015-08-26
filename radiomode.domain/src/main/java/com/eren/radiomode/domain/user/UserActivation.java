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
@Table(name = "useractivation")
@NamedQueries({
    //@NamedQuery(name = "UserActivation.findAll", query = "SELECT u FROM UserActivation u"),
    //@NamedQuery(name = "UserActivation.findById", query = "SELECT u FROM UserActivation u WHERE u.id = :id"),
    @NamedQuery(name = "UserActivation.findByEmail", query = "SELECT u FROM UserActivation u WHERE u.email = :email"),
    @NamedQuery(name = "UserActivation.findByUserName", query = "SELECT u FROM UserActivation u WHERE u.userName = :userName"),
    @NamedQuery(name = "UserActivation.findByActivationNumber", query = "SELECT u FROM UserActivation u WHERE u.activationNumber = :activationNumber")
    //@NamedQuery(name = "UserActivation.findByPassword", query = "SELECT u FROM UserActivation u WHERE u.password = :password"),    
})
public class UserActivation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "email")
    private String email;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "activationNumber")
    private String activationNumber;
    @Column(name = "activationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activationDate;
    @Column(name = "status")
    private String status;

    public static enum Status {

        WAITING, ACTIVATED, TIMEOUT;
    }

    public UserActivation() {
    }

    public UserActivation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActivationNumber() {
        return activationNumber;
    }

    public void setActivationNumber(String activationNumber) {
        this.activationNumber = activationNumber;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
        if(!(object instanceof UserActivation)) {
            return false;
        }
        UserActivation other = (UserActivation) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.UserActivation[id=" + id + "]";
    }
}
