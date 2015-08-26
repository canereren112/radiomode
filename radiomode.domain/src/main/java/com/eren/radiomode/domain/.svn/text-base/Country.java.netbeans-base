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
@Table(name = "country")
@NamedQueries({
    //@NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c"),
    //@NamedQuery(name = "Country.findById", query = "SELECT c FROM Country c WHERE c.id = :id"),    
    //@NamedQuery(name = "Country.findByCountry", query = "SELECT c FROM Country c WHERE c.country = :country")
    @NamedQuery(name = "Country.findByCountryCode", query = "SELECT c FROM Country c WHERE c.countryCode = :countryCode"),
    @NamedQuery(name = "Country.findByDisplayLangCode", query = "SELECT c FROM Country c WHERE c.displayLangCode = :displayLangCode"),
    @NamedQuery(name = "Country.findAllCountryCode", query = "SELECT distinct(c.countryCode) FROM Country c")
})
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "countryCode")
    private String countryCode;
    @Basic(optional = false)
    @Column(name = "displayLangCode")
    private String displayLangCode;
    @Column(name = "country")
    private String country;

    public Country() {
    }

    public Country(Integer id) {
        this.id = id;
    }

    public Country(Integer id, String countryCode, String displayLangCode) {
        this.id = id;
        this.countryCode = countryCode;
        this.displayLangCode = displayLangCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDisplayLangCode() {
        return displayLangCode;
    }

    public void setDisplayLangCode(String displayLangCode) {
        this.displayLangCode = displayLangCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        if(!(object instanceof Country)) {
            return false;
        }
        Country other = (Country) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Country[id=" + id + "]";
    }
}
