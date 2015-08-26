/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.common;

//import com.eren.radiomode.domain.Comments;
import com.eren.radiomode.domain.Comments;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.UtilImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author firat
 */
@Controller
public class CommentController {

    @Autowired
    public ServiceFactory serviceFactory;
    public String errorMessage = "";

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.POST, value = "comment/{commentPage}/type/{commentType}/entity/{entityid}/page/{pageNumber}")
    public String postComment(@PathVariable("commentPage") String commentPage, @PathVariable("entityid") int entityid,
            @PathVariable("commentType") String commentType, @RequestParam("comment") String comment, @PathVariable("pageNumber") int pageNumber,
            HttpSession session, Model model) throws IOException {

        try {
            comment = comment.trim();
            if (comment.equals("")) {
                model.addAttribute("result", false);
                model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("warning.text.empty"));
            } else {
                String userName = session.getAttribute("userName").toString();
                User sender = serviceFactory.getUserService().getUserByUsername(userName);
                serviceFactory.getCommentService().postComment(commentType, entityid, sender, comment);
                model.addAttribute("result", true);
                model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("message.settings.update"));
            }
        } catch (Exception ex) {
            model.addAttribute("result", false);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("error.settings.update"));
        }
        return "redirect:/comment/" + commentPage + "/type/" + commentType + "/entity/" + entityid + "/page/" + pageNumber;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "comment/{commentPage}/type/{commentType}/entity/{entityid}/page/{pageNumber}")
    public String deleteComment(@RequestParam("commentid") int commentid, @PathVariable("commentPage") String commentPage, @PathVariable("entityid") int entityid,
            @PathVariable("pageNumber") int pageNumber, @PathVariable("commentType") String commentType, HttpSession session, Model model) throws IOException {

        try {
            String userName = session.getAttribute("userName").toString();
            User sender = serviceFactory.getUserService().getUserByUsername(userName);
            serviceFactory.getCommentService().deleteComment(commentid, sender);
            model.addAttribute("result", true);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("message.settings.update"));
        } catch (Exception ex) {
            model.addAttribute("result", false);
            model.addAttribute("resultMessage", UtilImpl.loadMessageProperty("error.settings.update"));
        }
        return "redirect:/comment/" + commentPage + "/type/" + commentType + "/entity/" + entityid + "/page/" + pageNumber;
    }

    @RequestMapping(method = RequestMethod.GET, value = "comment/{commentPage}/type/{commentType}/entity/{entityid}/page/{pageNumber}")
    public String loadComments(@PathVariable("commentPage") String commentPage, @PathVariable("entityid") int entityid,
            @PathVariable("commentType") String commentType, @PathVariable("pageNumber") int pageNumber, Model map, HttpSession session) {

        if (commentPage.equals("recent")) {
            List<Comments> comments = serviceFactory.getCommentService().getRecentComments(commentType, entityid);
            map.addAttribute("comments", comments);
            return "common/recent_comments";
        } else {
            List<Comments> comments = serviceFactory.getCommentService().getAllComments(commentType, entityid, pageNumber);
            map.addAttribute("comments", comments);
            return "common/all_comments";
        }
    }
}
