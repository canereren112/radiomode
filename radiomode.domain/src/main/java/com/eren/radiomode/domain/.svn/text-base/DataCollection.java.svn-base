/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain;

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
@Table(name = "datacollection")
@NamedQueries({
    @NamedQuery(name = "DataCollection.findAll", query = "SELECT d FROM DataCollection d"),
    @NamedQuery(name = "DataCollection.findById", query = "SELECT d FROM DataCollection d WHERE d.id = :id"),
    @NamedQuery(name = "DataCollection.findByDatatypeid", query = "SELECT d FROM DataCollection d WHERE d.datatypeid = :datatypeid"),
    @NamedQuery(name = "DataCollection.findByWebpageid", query = "SELECT d FROM DataCollection d WHERE d.id = :webpageid"),
    @NamedQuery(name = "DataCollection.findByReferenceid", query = "SELECT d FROM DataCollection d WHERE d.referenceid = :referenceid"),
    @NamedQuery(name = "DataCollection.findByIsSearched", query = "SELECT d FROM DataCollection d WHERE d.isSearched = :isSearched")})
public class DataCollection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "datatypeid")
    private Integer datatypeid;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "webpageid")
    private WebPages webpageid;
    @Basic(optional = false)
    @Column(name = "referenceid")
    private Integer referenceid;
    @Column(name = "isSearched")
    private String isSearched;

    public DataCollection() {
    }

    public DataCollection(Integer id) {
        this.id = id;
    }

    public DataCollection(Integer id, Integer datatypeid, WebPages webpageid, Integer referenceid) {
        this.id = id;
        this.datatypeid = datatypeid;
        this.webpageid = webpageid;
        this.referenceid = referenceid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDatatypeid() {
        return datatypeid;
    }

    public void setDatatypeid(Integer datatypeid) {
        this.datatypeid = datatypeid;
    }

    public WebPages getWebpageid() {
        return webpageid;
    }

    public void setWebpageid(WebPages webpageid) {
        this.webpageid = webpageid;
    }

    public int getReferenceid() {
        return referenceid;
    }

    public void setReferenceid(Integer referenceid) {
        this.referenceid = referenceid;
    }

    public String getIsSearched() {
        return isSearched;
    }

    public void setIsSearched(String isSearched) {
        this.isSearched = isSearched;
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
        if (!(object instanceof DataCollection)) {
            return false;
        }
        DataCollection other = (DataCollection) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.DataCollection[id=" + id + "]";
    }
}
