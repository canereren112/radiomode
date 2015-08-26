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
@Table(name = "emaillist")
@NamedQueries({
    @NamedQuery(name = "EmailList.findAll", query = "SELECT e FROM EmailList e"),
    @NamedQuery(name = "EmailList.findByEmailid", query = "SELECT e FROM EmailList e WHERE e.emailid = :emailid"),
    @NamedQuery(name = "EmailList.findByEmailAddress", query = "SELECT e FROM EmailList e WHERE e.emailAddress = :emailAddress"),
    @NamedQuery(name = "EmailList.findByDomainAddress", query = "SELECT e FROM EmailList e WHERE e.domainAddress = :domainAddress"),
    @NamedQuery(name = "EmailList.findByWebsite", query = "SELECT e FROM EmailList e WHERE e.website = :website"),
    @NamedQuery(name = "EmailList.findByUrl", query = "SELECT e FROM EmailList e WHERE e.url = :url"),
    @NamedQuery(name = "EmailList.findByCountryCode", query = "SELECT e FROM EmailList e WHERE e.countryCode = :countryCode")})
public class EmailList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emailid")
    private Integer emailid;
    @Column(name = "emailAddress")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "domainAddress")
    private String domainAddress;
    @Basic(optional = false)
    @Column(name = "website")
    private String website;
    @Column(name = "url")
    private String url;
    @Column(name = "countryCode")
    private String countryCode;

    public static enum Website {

        GOOGLE, YAHOO, ASK, OTHER;

        public String getDescription() {
            switch (this) {
                case GOOGLE:
                    return "www.google.com";
                case YAHOO:
                    return "search.yahoo.com";
                case ASK:
                    return "www.ask.com";
                default:
                    return "other";
            }
        }
    }

    public static enum DomainAddress {

        HOTMAIL, YAHOO, GMAIL, AOL;

        public String getDescription() {
            switch (this) {
                case HOTMAIL:
                    return "@hotmail.com";
                case YAHOO:
                    return "@yahoo.com";
                case GMAIL:
                    return "@gmail.com";
                case AOL:
                    return "@aol.com";
                default:
                    return "other";
            }
        }
    }

    public EmailList() {
    }

    public EmailList(Integer emailid) {
        this.emailid = emailid;
    }

    public EmailList(Integer emailid, String domainAddress, String website) {
        this.emailid = emailid;
        this.domainAddress = domainAddress;
        this.website = website;
    }

    public Integer getEmailid() {
        return emailid;
    }

    public void setEmailid(Integer emailid) {
        this.emailid = emailid;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDomainAddress() {
        return domainAddress;
    }

    public void setDomainAddress(String domainAddress) {
        this.domainAddress = domainAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailid != null ? emailid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailList)) {
            return false;
        }
        EmailList other = (EmailList) object;
        if ((this.emailid == null && other.emailid != null) || (this.emailid != null && !this.emailid.equals(other.emailid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.EmailList[emailid=" + emailid + "]";
    }
}
