/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.user.UserActivation;
import com.eren.radiomode.service.SignUpService;
import com.eren.radiomode.dao.util.Constants;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.domain.user.UserActivity;
import com.eren.radiomode.domain.user.UserNotifications;
import com.eren.radiomode.domain.user.UserPictures;
import com.eren.radiomode.domain.user.UserStats;
import com.eren.radiomode.service.util.SendMail;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SendMail sendMail;
    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public SendMail getSendMail() {
        return sendMail;
    }

    public void setSendMail(SendMail sendMail) {
        this.sendMail = sendMail;
    }

    public void signupUser(String email, String userName, String password, String activationNumber) {
        entityDAOFactory.getUserActivationDAO().saveUser(email, userName, password, activationNumber);
    }

    public String checkUserName(String userName) {
        boolean existsUser = entityDAOFactory.getUserDAO().existsByUserName(userName);
        boolean existsUserActivation = entityDAOFactory.getUserActivationDAO().existsByUserName(userName);
        if (existsUser == true) {
            return "false";
        }
        if (existsUserActivation == true) {
            return "false";
        }
        return "true";
    }

    public String checkEmail(String email) {
        boolean existsUser = entityDAOFactory.getUserDAO().existsByEmail(email);
        boolean existsUserActivation = entityDAOFactory.getUserActivationDAO().existsByEmail(email);
        if (existsUser == true) {
            return "false";
        }
        if (existsUserActivation == true) {
            return "false";
        }
        return "true";
    }

    public boolean sendActivationEmail(String email, String userName, String password, String activationNumber) {
        String subject = "RadioMode account verification";
        String body = "Hi " + userName + "," + "<br/>" + "<br/>"
                + "Welcome to RadioMode. Just follow this link"
                + " to verify your email address and start using www. radiomode .com." + "<br/>" + "<br/>"
                + "<a href=\"http://localhost:8084/radiomode/signup/activate.do?userid=" + activationNumber + "\">Click Here!</a>" + "<br/>" + "<br/>"
                + " Here is your account details:" + "<br/>"
                + " User Name: " + userName + "<br/>"
                + " Password : " + password + "<br/>" + "<br/>" + "<br/>"
                + " Best Regards," + "<br/>"
                + " The RadioMode Team";
        String htmlBody = "<html><body>" + body + "</body></html>";
        return sendMail.sendHTMLMail(Constants.MAIL_FROM, email, subject, body);
    }

    public String activateUser(String userid) {
        UserActivation activation = entityDAOFactory.getUserActivationDAO().existsByActivationNumber(userid);
        if (activation == null) {
            return null;
        }
        if (activation.getStatus().equals(UserActivation.Status.WAITING.name())) {
            //TODO user tablosundaki statsid, privacyid v.s leri de doldur.
            activation.setStatus(UserActivation.Status.ACTIVATED.name());
            entityDAOFactory.getUserActivationDAO().saveEntity(activation);

            User user = new User();
            user.setEmail(activation.getEmail());
            user.setUserName(activation.getUserName());
            user.setPassword(activation.getPassword());
            user.setMembershipDate(new java.util.Date());
            user.setRoleName(User.RoleName.USER.name());
            //TODO varsayilan boyle olacak, testini yap!
            user.setUserPictures(new UserPictures(1));
            //TODO contributions v.s tablolari da doldurulacak
            //TODO Uye olurken cinsiyet de sorulacak ve burasi dinamiklestirilecek
            user.setGender(User.Gender.O.name());
            entityDAOFactory.getUserActivationDAO().saveEntity(user);

            UserStats stats = new UserStats();
            stats.setUserid(user);
            stats.setAlbumBlockCount(0);
            stats.setAlbumLikeCount(0);
            stats.setArtistBlockCount(0);
            stats.setArtistLikeCount(0);
            stats.setCommentCount(0);
            stats.setFriendCount(0);
            stats.setListenCount(0);
            stats.setSongBlockCount(0);
            stats.setSongLikeCount(0);
            stats.setStationLikeCount(0);
            entityDAOFactory.getUserActivationDAO().saveEntity(stats);

            UserNotifications notifications = new UserNotifications();
            notifications.setUserid(user);
            notifications.setConcertAlert(Boolean.TRUE);
            notifications.setFriendshipRequest(Boolean.TRUE);
            notifications.setIncomingMessage(Boolean.TRUE);
            notifications.setNoSend(Boolean.FALSE);
            notifications.setStationComment(Boolean.TRUE);
            notifications.setWallComment(Boolean.TRUE);
            notifications.setWeeklyNewsLetter(Boolean.TRUE);
            entityDAOFactory.getUserActivationDAO().saveEntity(notifications);
            
        }
        return activation.getUserName();
    }

    public boolean loginUser(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        List<User> list = entityDAOFactory.getUserDAO().loadEntityByParam(user);
        if (!list.isEmpty()) {
            user = list.get(0);
            user.setLastLoginDate(new java.util.Date());
            entityDAOFactory.getUserDAO().saveEntity(user);
            return true;
        }
        return false;
    }
}
