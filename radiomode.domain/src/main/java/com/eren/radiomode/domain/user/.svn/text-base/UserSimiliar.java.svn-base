/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.user;

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
@Table(name = "usersimiliar")
@NamedQueries({
    @NamedQuery(name = "UserSimiliar.findAll", query = "SELECT u FROM UserSimiliar u"),
    @NamedQuery(name = "UserSimiliar.findById", query = "SELECT u FROM UserSimiliar u WHERE u.id = :id"),
    @NamedQuery(name = "UserSimiliar.findByUserid", query = "SELECT u FROM UserSimiliar u WHERE u.userid = :userid"),
    @NamedQuery(name = "UserSimiliar.findBySimiliarUserid", query = "SELECT u FROM UserSimiliar u WHERE u.similiarUserid = :similiarUserid"),
    @NamedQuery(name = "UserSimiliar.findByPercent", query = "SELECT u FROM UserSimiliar u WHERE u.percent = :percent")})
public class UserSimiliar implements Serializable {

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
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "similiarUserid")
    private User similiarUserid;
    @Column(name = "percent")
    private Integer percent;

    public UserSimiliar() {
    }

    public UserSimiliar(Integer id) {
        this.id = id;
    }

    public UserSimiliar(Integer id, User userid, User similiarUserid) {
        this.id = id;
        this.userid = userid;
        this.similiarUserid = similiarUserid;
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

    public User getSimiliarUserid() {
        return similiarUserid;
    }

    public void setSimiliarUserid(User similiarUserid) {
        this.similiarUserid = similiarUserid;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
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
        if (!(object instanceof UserSimiliar)) {
            return false;
        }
        UserSimiliar other = (UserSimiliar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.UserSimiliar[id=" + id + "]";
    }
}
