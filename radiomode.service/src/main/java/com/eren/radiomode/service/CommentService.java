/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service;

import com.eren.radiomode.domain.Comments;
import com.eren.radiomode.domain.user.User;
import java.util.List;

/**
 *
 * @author firat
 */
public interface CommentService {

    void postComment(String commentType, int entityid, User sender, String comment);

    void deleteComment(int commentid, User sender);

    List<Comments> getRecentComments(String commentType, int entityid);

    List<Comments> getAllComments(String commentType, int entityid, int page);
}
