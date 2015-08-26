/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.domain.user;

import com.eren.radiomode.domain.City;
import com.eren.radiomode.domain.Country;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "user")
@NamedQueries({
    //@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    //@NamedQuery(name = "User.findByUserid", query = "SELECT u FROM User u WHERE u.userid = :userid"),
    //@NamedQuery(name = "User.findByRoleName", query = "SELECT u FROM User u WHERE u.roleName = :roleName"),    
    //@NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    //@NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email"),
    //@NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name"),
    //@NamedQuery(name = "User.findBySurname", query = "SELECT u FROM User u WHERE u.surname = :surname"),
    //@NamedQuery(name = "User.findByGender", query = "SELECT u FROM User u WHERE u.gender = :gender"),
    //@NamedQuery(name = "User.findByAboutMe", query = "SELECT u FROM User u WHERE u.aboutMe = :aboutMe"),
    //@NamedQuery(name = "User.findByBirthDate", query = "SELECT u FROM User u WHERE u.birthDate = :birthDate"),
    //@NamedQuery(name = "User.findByMembershipDate", query = "SELECT u FROM User u WHERE u.membershipDate = :membershipDate"),
    //@NamedQuery(name = "User.findByLastLoginDate", query = "SELECT u FROM User u WHERE u.lastLoginDate = :lastLoginDate"),
    //@NamedQuery(name = "User.findByPlayingSong", query = "SELECT u FROM User u WHERE u.playingSong = :playingSong"),
    //@NamedQuery(name = "User.findByCountry", query = "SELECT u FROM User u WHERE u.country = :country"),
    //@NamedQuery(name = "User.findByLocationCity", query = "SELECT u FROM User u WHERE u.locationCity = :locationCity"),
    //@NamedQuery(name = "User.findByLocationCountry", query = "SELECT u FROM User u WHERE u.locationCountry = :locationCountry"),
    //@NamedQuery(name = "User.findByWebPage", query = "SELECT u FROM User u WHERE u.webPage = :webPage"),
    //@NamedQuery(name = "User.findByUploadDate", query = "SELECT u FROM User u WHERE u.uploadDate = :uploadDate"),
    //@NamedQuery(name = "User.findByUserName", query = "SELECT u FROM User u WHERE u.userName = :userName"),
    @NamedQuery(name = "User.findByUserName", query = "SELECT u FROM User u WHERE u.userName = :userName"),
    @NamedQuery(name = "User.findPasswordByUserName", query = "SELECT u.password FROM User u WHERE u.userName = :userName"),
    @NamedQuery(name = "User.checkByUserName", query = "SELECT count(u.userid) FROM User u WHERE u.userName = :userName"),
    @NamedQuery(name = "User.checkByEmail", query = "SELECT count(u.userid) FROM User u WHERE u.email = :email")
//@NamedQuery(name = "User.checkByEmail", query = "SELECT count(u.userid) FROM User u inner join fetch u.userPictures p WHERE u.email = :email")
})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Basic(optional = false)
    @Column(name = "roleName")
    private String roleName = RoleName.USER.name();
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Column(name = "aboutMe")
    private String aboutMe;
    @Column(name = "birthDate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "membershipDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date membershipDate;
    @Column(name = "lastLoginDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country", referencedColumnName = "countryCode")
    private Country country;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "locationCity")
    private City locationCity;
    @Column(name = "webPage")
    private String webPage;
    @Column(name = "point")
    private Integer point;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statsid")
    private UserStats userStats;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contributionid")
    private UserContributions userContributions;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notificationid")
    private UserNotifications userNotifications;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pictureid")
    private UserPictures userPictures;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "privacyid")
    private UserPrivacy userPrivacy;

    public static enum RoleName {

        USER, MODERATOR;
    }

    public static enum Gender {

        M, F, O;
    }

    public User() {
    }

    public User(Integer userid) {
        this.userid = userid;
    }

    public User(Integer userid, String roleName, String gender) {
        this.userid = userid;
        this.roleName = roleName;
        this.gender = gender;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(City locationCity) {
        this.locationCity = locationCity;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public UserStats getUserStats() {
        return userStats;
    }

    public void setUserStats(UserStats userStats) {
        this.userStats = userStats;
    }

    public UserContributions getUserContributions() {
        return userContributions;
    }

    public void setUserContributions(UserContributions userContributions) {
        this.userContributions = userContributions;
    }

    public UserNotifications getUserNotifications() {
        return userNotifications;
    }

    public void setUserNotifications(UserNotifications userNotifications) {
        this.userNotifications = userNotifications;
    }

    public UserPictures getUserPictures() {
        return userPictures;
    }

    public void setUserPictures(UserPictures userPictures) {
        this.userPictures = userPictures;
    }

    public UserPrivacy getUserPrivacy() {
        return userPrivacy;
    }

    public void setUserPrivacy(UserPrivacy userPrivacy) {
        this.userPrivacy = userPrivacy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.radiomode.domain.User[userid=" + userid + "]";
    }
}
