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
@Table(name = "content")
@NamedQueries({
//@NamedQuery(name = "Content.findAll", query = "SELECT c FROM Content c"), 
//@NamedQuery(name = "Content.findById", query = "SELECT c FROM Content c WHERE c.id = :id"), 
//@NamedQuery(name = "Content.findByContentType", query = "SELECT c FROM Content c WHERE c.contentType = :contentType"), 
//@NamedQuery(name = "Content.findByContent", query = "SELECT c FROM Content c WHERE c.content = :content"), 
//@NamedQuery(name = "Content.findByDisplayLangCode", query = "SELECT c FROM Content c WHERE c.displayLangCode = :displayLangCode")
})
public class Content implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "contentType")
    private String contentType;
    @Column(name = "content")
    private String content;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "displayLangCode")
    private Language displayLangCode;

    public static enum ContentType {
        ALBUM, ARTIST;
    }

    public Content() {
    }

    public Content(Integer id) {
        this.id = id;
    }

    public Content(Integer id, String contentType, Language displayLangCode) {
        this.id = id;
        this.contentType = contentType;
        this.displayLangCode = displayLangCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Language getDisplayLangCode() {
        return displayLangCode;
    }

    public void setDisplayLangCode(Language displayLangCode) {
        this.displayLangCode = displayLangCode;
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
        if(!(object instanceof Content)) {
            return false;
        }
        Content other = (Content) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.Content[id=" + id + "]";
    }

}
