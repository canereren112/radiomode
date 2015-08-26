/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.parent;

import com.eren.radiomode.dao.AlbumDAO;
import com.eren.radiomode.dao.ArtistDAO;
import com.eren.radiomode.dao.BlockedUsersDAO;
import com.eren.radiomode.dao.CityDAO;
import com.eren.radiomode.dao.CommentDAO;
import com.eren.radiomode.dao.ConcertRequestDAO;
import com.eren.radiomode.dao.ContentDAO;
import com.eren.radiomode.dao.CountryDAO;
import com.eren.radiomode.dao.DataCollectionDAO;
import com.eren.radiomode.dao.EmailListDAO;
import com.eren.radiomode.dao.EventDAO;
import com.eren.radiomode.dao.ForumDAO;
import com.eren.radiomode.dao.FriendListDAO;
import com.eren.radiomode.dao.GenreDAO;
import com.eren.radiomode.dao.GroupDAO;
import com.eren.radiomode.dao.LanguageDAO;
import com.eren.radiomode.dao.ListenHistoryDAO;
import com.eren.radiomode.dao.MessageDAO;
import com.eren.radiomode.dao.NewsDAO;
import com.eren.radiomode.dao.RadioDAO;
import com.eren.radiomode.dao.SongDAO;
import com.eren.radiomode.dao.TagDAO;
import com.eren.radiomode.dao.UserActivationDAO;
import com.eren.radiomode.dao.UserDAO;
import com.eren.radiomode.dao.VideoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Tum DAO arayuzlerini barindirir
 * @author work
 */
public class EntityDAOFactory {

    @Autowired
    private AlbumDAO albumDAO;
    @Autowired
    private ArtistDAO artistDAO;
    @Autowired
    private BlockedUsersDAO blockedUsersDAO;
    @Autowired
    private CityDAO cityDAO;
    @Autowired
    private ConcertRequestDAO concertRequestDAO;
    @Autowired
    private ContentDAO contentDAO;
    @Autowired
    private CountryDAO countryDAO;
    @Autowired
    private DataCollectionDAO dataCollectionDAO;
    @Autowired
    private EmailListDAO emailListDAO;
    @Autowired
    private EventDAO eventDAO;
    @Autowired
    private ForumDAO forumDAO;
    @Autowired
    private FriendListDAO friendListDAO;
    @Autowired
    private GenreDAO genreDAO;
    @Autowired
    private GroupDAO groupDAO;
    @Autowired
    private LanguageDAO languageDAO;
    @Autowired
    private ListenHistoryDAO listenHistoryDAO;
    @Autowired
    private MessageDAO messageDAO;
    @Autowired
    private NewsDAO newsDAO;
    @Autowired
    private RadioDAO radioDAO;
    @Autowired
    private SongDAO songDAO;
    @Autowired
    private UserActivationDAO userActivationDAO;
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private VideoDAO videoDAO;
    @Autowired
    private CommentDAO commentDAO;
    @Autowired
    private TagDAO tagDAO;

    public TagDAO getTagDAO() {
        return tagDAO;
    }

    public void setTagDAO(TagDAO tagDAO) {
        this.tagDAO = tagDAO;
    }

    public CommentDAO getCommentDAO() {
        return commentDAO;
    }

    public void setCommentDAO(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }

    public ArtistDAO getArtistDAO() {
        return artistDAO;
    }

    public void setArtistDAO(ArtistDAO artistDAO) {
        this.artistDAO = artistDAO;
    }

    public CityDAO getCityDAO() {
        return cityDAO;
    }

    public void setCityDAO(CityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }

    public CountryDAO getCountryDAO() {
        return countryDAO;
    }

    public void setCountryDAO(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    public LanguageDAO getLanguageDAO() {
        return languageDAO;
    }

    public void setLanguageDAO(LanguageDAO languageDAO) {
        this.languageDAO = languageDAO;
    }

    public ListenHistoryDAO getListenHistoryDAO() {
        return listenHistoryDAO;
    }

    public void setListenHistoryDAO(ListenHistoryDAO listenHistoryDAO) {
        this.listenHistoryDAO = listenHistoryDAO;
    }

    public RadioDAO getRadioDAO() {
        return radioDAO;
    }

    public void setRadioDAO(RadioDAO radioDAO) {
        this.radioDAO = radioDAO;
    }

    public SongDAO getSongDAO() {
        return songDAO;
    }

    public void setSongDAO(SongDAO songDAO) {
        this.songDAO = songDAO;
    }

    public UserActivationDAO getUserActivationDAO() {
        return userActivationDAO;
    }

    public void setUserActivationDAO(UserActivationDAO userActivationDAO) {
        this.userActivationDAO = userActivationDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public VideoDAO getVideoDAO() {
        return videoDAO;
    }

    public void setVideoDAO(VideoDAO videoDAO) {
        this.videoDAO = videoDAO;
    }

    public AlbumDAO getAlbumDAO() {
        return albumDAO;
    }

    public void setAlbumDAO(AlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }

    public BlockedUsersDAO getBlockedUsersDAO() {
        return blockedUsersDAO;
    }

    public void setBlockedUsersDAO(BlockedUsersDAO blockedUsersDAO) {
        this.blockedUsersDAO = blockedUsersDAO;
    }

    public ConcertRequestDAO getConcertRequestDAO() {
        return concertRequestDAO;
    }

    public void setConcertRequestDAO(ConcertRequestDAO concertRequestDAO) {
        this.concertRequestDAO = concertRequestDAO;
    }

    public ContentDAO getContentDAO() {
        return contentDAO;
    }

    public void setContentDAO(ContentDAO contentDAO) {
        this.contentDAO = contentDAO;
    }

    public DataCollectionDAO getDataCollectionDAO() {
        return dataCollectionDAO;
    }

    public void setDataCollectionDAO(DataCollectionDAO dataCollectionDAO) {
        this.dataCollectionDAO = dataCollectionDAO;
    }

    public EmailListDAO getEmailListDAO() {
        return emailListDAO;
    }

    public void setEmailListDAO(EmailListDAO emailListDAO) {
        this.emailListDAO = emailListDAO;
    }

    public EventDAO getEventDAO() {
        return eventDAO;
    }

    public void setEventDAO(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    public ForumDAO getForumDAO() {
        return forumDAO;
    }

    public void setForumDAO(ForumDAO forumDAO) {
        this.forumDAO = forumDAO;
    }

    public FriendListDAO getFriendListDAO() {
        return friendListDAO;
    }

    public void setFriendListDAO(FriendListDAO friendListDAO) {
        this.friendListDAO = friendListDAO;
    }

    public GenreDAO getGenreDAO() {
        return genreDAO;
    }

    public void setGenreDAO(GenreDAO genreDAO) {
        this.genreDAO = genreDAO;
    }

    public GroupDAO getGroupDAO() {
        return groupDAO;
    }

    public void setGroupDAO(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }

    public MessageDAO getMessageDAO() {
        return messageDAO;
    }

    public void setMessageDAO(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    public NewsDAO getNewsDAO() {
        return newsDAO;
    }

    public void setNewsDAO(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }
}
