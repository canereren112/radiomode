/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.service.CommentService;
import com.eren.radiomode.domain.Comments;
import com.eren.radiomode.domain.user.User;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author firat
 */
public class CommentServiceImpl implements CommentService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public void postComment(String commentType, int entityid, User sender, String comment) {
        Comments comments = new Comments();
        comments.setSenderid(sender);
        comments.setComment(comment);
        comments.setCommentDate(new Date());
        comments.setCommentType(commentType.toUpperCase());
        comments.setEntityid(entityid);

        //TODO buranin testi yapilacak
        sender.getUserStats().setCommentCount(sender.getUserStats().getCommentCount() + 1);
        entityDAOFactory.getUserDAO().saveEntity(sender);

        entityDAOFactory.getCommentDAO().saveEntity(comments);
    }

    public void deleteComment(int commentid, User sender) {
        Comments comment = (Comments) entityDAOFactory.getCommentDAO().loadEntity(Comments.class, commentid);

        //TODO buranin testi yapilacak
        sender.getUserStats().setCommentCount(sender.getUserStats().getCommentCount() - 1);
        entityDAOFactory.getUserDAO().saveEntity(sender);

        entityDAOFactory.getCommentDAO().deleteEntity(comment);
    }

    public List<Comments> getRecentComments(String commentType, int entityid) {
        Comments comments = new Comments();
        comments.setCommentType(commentType.toUpperCase());
        comments.setEntityid(entityid);
        List<Comments> commentsList = (List<Comments>) entityDAOFactory.getUserDAO().loadEntityByParam(comments, 0, 5, "commentDate");
        return commentsList;
    }

    public List<Comments> getAllComments(String commentType, int entityid, int page) {
        Comments comments = new Comments();
        comments.setCommentType(commentType.toUpperCase());
        comments.setEntityid(entityid);
        List<Comments> commentsList = (List<Comments>) entityDAOFactory.getUserDAO().loadEntityByParam(comments, (page - 1) * 10, 10, "commentDate");
        return commentsList;
    }
}
