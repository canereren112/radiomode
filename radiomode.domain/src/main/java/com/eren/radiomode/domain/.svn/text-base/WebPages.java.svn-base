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
@Table(name = "webpages")
@NamedQueries({ //@NamedQuery(name = "WebPages.findAll", query = "SELECT w FROM WebPages w"),
//@NamedQuery(name = "WebPages.findByid", query = "SELECT w FROM WebPages w WHERE w.webpageid = :webpageid"),
//@NamedQuery(name = "WebPages.findByUrl", query = "SELECT w FROM WebPages w WHERE w.url = :url"), 
//@NamedQuery(name = "WebPages.findByWebsitename", query = "SELECT w FROM WebPages w WHERE w.websitename = :websitename")
})
public class WebPages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "websiteid")
    private Integer webpageid;
    @Column(name = "url")
    private String url;
    @Column(name = "websitename")
    private String websitename;

    public WebPages() {
    }

    public WebPages(Integer webpageid) {
        this.webpageid = webpageid;
    }

    public Integer getWebpageid() {
        return webpageid;
    }

    public void setWebpageid(Integer webpageid) {
        this.webpageid = webpageid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebsitename() {
        return websitename;
    }

    public void setWebsitename(String websitename) {
        this.websitename = websitename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webpageid != null ? webpageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebPages)) {
            return false;
        }
        WebPages other = (WebPages) object;
        if ((this.webpageid == null && other.webpageid != null) || (this.webpageid != null && !this.webpageid.equals(other.webpageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.WebPages[webpageid=" + webpageid + "]";
    }
}
