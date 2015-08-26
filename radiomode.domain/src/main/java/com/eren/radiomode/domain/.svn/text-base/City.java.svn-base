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
@Table(name = "city")
@NamedQueries({ //@NamedQuery(name = "City.findAll", query = "SELECT c FROM City c"),
//@NamedQuery(name = "City.findById", query = "SELECT c FROM City c WHERE c.id = :id"),
//@NamedQuery(name = "City.findByCountryCode", query = "SELECT c FROM City c WHERE c.countryCode = :countryCode"),
//@NamedQuery(name = "City.findByLangDisplayCode", query = "SELECT c FROM City c WHERE c.langDisplayCode = :langDisplayCode"),
//@NamedQuery(name = "City.findByCity", query = "SELECT c FROM City c WHERE c.city = :city"
})
public class City implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "countryCode", referencedColumnName="countryCode")
    private Country countryCode;
    @ManyToOne
    @JoinColumn(name = "displayLangCode", referencedColumnName="langCode")
    private Language displayLangCode;
    @Column(name = "city")
    private String city;

    public City() {
    }

    public City(Integer id) {
        this.id = id;
    }

    public City(Integer id, Country countryCode, Language displayLangCode) {
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

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public Language getDisplayLangCode() {
        return displayLangCode;
    }

    public void setDisplayLangCode(Language displayLangCode) {
        this.displayLangCode = displayLangCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        if(!(object instanceof City)) {
            return false;
        }
        City other = (City) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.City[id=" + id + "]";
    }
}
