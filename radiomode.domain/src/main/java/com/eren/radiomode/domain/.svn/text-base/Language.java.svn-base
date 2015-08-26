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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author work
 */
@Entity
@Table(name = "language")
@NamedQueries({
    //@NamedQuery(name = "Language.findAll", query = "SELECT l FROM Language l"),
    //@NamedQuery(name = "Language.findByLangCode", query = "SELECT l FROM Language l WHERE l.langCode = :langCode"),
    //@NamedQuery(name = "Language.findById", query = "SELECT l FROM Language l WHERE l.id = :id"),
    //@NamedQuery(name = "Language.findByDisplayLangCode", query = "SELECT l FROM Language l WHERE l.displayLangCode = :displayLangCode"),
    //@NamedQuery(name = "Language.findByLanguage", query = "SELECT l FROM Language l WHERE l.language = :language")
    @NamedQuery(name = "Language.findAllLangCode", query = "SELECT distinct(l.langCode) FROM Language l")
})
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "langCode")
    private String langCode;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "displayLangCode")
    private String displayLangCode;
    @Column(name = "language")
    private String language;

    public Language() {
    }

    public Language(Integer id) {
        this.id = id;
    }

    public Language(Integer id, String langCode, String displayLangCode) {
        this.id = id;
        this.langCode = langCode;
        this.displayLangCode = displayLangCode;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayLangCode() {
        return displayLangCode;
    }

    public void setDisplayLangCode(String displayLangCode) {
        this.displayLangCode = displayLangCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
        if(!(object instanceof Language)) {
            return false;
        }
        Language other = (Language) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Language[id=" + id + "]";
    }
}
