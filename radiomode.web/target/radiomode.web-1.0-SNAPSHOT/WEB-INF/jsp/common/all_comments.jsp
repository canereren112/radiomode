<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@page import="java.text.SimpleDateFormat"%>
<script type="text/javascript" src="static/js/core.js"></script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        $(document).ready(function() {
            $('#postFromRecentCommentForm').ajaxForm({
                type: 'POST',
                target: '#recent_user_comments',
                beforeSubmit: function(formData, jqForm, options){
                    if($("#limitMessage").html() == '')
                        return false;
                    return true;
                }
            });

            $("#deleteCommentForm").ajaxForm({
                type: 'POST',
                target: '#recent_user_comments'
            });

            //$('#deleteCommentForm').attr('action', $('#commentsURL').val() + $('#deleteCommentForm').attr('action'));
            $('#commentsURL').val(url);
            showResultMessage();
            calculateBigPageHeight();
        });
    </script>
    <title>JSP Page</title>
</head>
<body>
<input type="hidden" id="commentsURL" name="commentsURL" value="" />
<div class="sub_pages_content_shape">
    <div class="type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_left_content_shape box_shadow ui-corner-all">
        <div class="center_artist_box_header center_comment_box_header"><a href="#" class="center_artist_box_link">All Comments</a></div>
        <div class="recent_comments_content">
            <ul class="recent_comments_list">
                <li id="comments_first_item" class="general_comments_list_first_item recent_comments_default_list_item">
                <div id="resultBox" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
                    <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                        <span id="resultMessage">${param.resultMessage}</span>
                </div>
                <form:form name="postFromRecentCommentForm" id="postFromRecentCommentForm"  method="POST" action="" onsubmit="return false;">

                    <div class="comments_profile_photo_container">
                        <img src="static/images/song/profile_outline.png" class="profile_general_photo_outline">
                        <img class="recent_comments_photo" src="${sessionScope.picture}"/>
                    </div>
                    <textarea id="comment" name="comment" class="first_item_all_comments_field comments_field"></textarea>
                    <span id="limitMessage"></span>
                    <!--
                    <span id="recent_comments_reply_first_item" class="recent_comments_reply">
                        <a href="javascript:document.postFromRecentCommentForm.submit()"
                           onmouseover="document.postFromRecentCommentForm.send_button.src='static/images/buttons/gray_buttons/gray_button_default.png'"
                           onmouseout="document.postFromRecentCommentForm.send_button.src='static/images/buttons/gray_buttons/gray_button_default.png'"
                           onclick="return val_form_this_page()" class="recent_comments_reply_button">
                            <img class="recent_comments_button_image" src="static/images/buttons/gray_buttons/gray_button_default.png" name="send_button"/>
                            <span class="comments_reply_button_link">Send</span>

                        </a></span>
                    -->
                    <input id="sendComment2" class="brief_buttons blue_default_buttons ui-corner-all" type="submit" name="replyButton" value="Send" />
                </form:form>
                </li>
                <c:forEach var="comment" items="${comments}">
                    <c:set var="commentDate" value="${comment.commentDate}" ></c:set>
                    <jsp:useBean id="commentDate" class="java.util.Date"></jsp:useBean>
                    <%
                                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
                                String commentDateStr = format.format(commentDate);
                                commentDateStr = commentDateStr.replace(' ', 'T');
                    %>
                    <li class="comments_replied_list_item recent_comments_default_list_item">
                    <div class="comments_profile_photo_container">
                        <a class="recent_comments_photo_link" href="user/${comment.senderid.userName}">
                            <img src="static/images/song/profile_outline.png" class="profile_general_photo_outline">
                            <img class="recent_comments_photo" src="${comment.senderid.userPictures.locationSmall}"/></a></div>
                    <div class="comments_field">
                        <a class="recent_comments_nick_name" href="user/${comment.senderid.userName}">${comment.senderid.userName}</a>:  ${comment.comment}
                        <c:if test="${sessionScope.userName == comment.senderid.userName}">
                            <form:form name="deleteCommentForm" id="deleteCommentForm" onsubmit="return true;" method="DELETE" action="">
                                <input type="image" class="comment_delete_button" alt="delete" src="static/images/icons/delete.png">
                                <input type="hidden" id="commentid" name="commentid" value="${comment.id}" />
                            </form:form>
                        </c:if>
                    </div>
                    <span class="recent_comments_date"> <abbr class="timeago" title="<%=commentDateStr%>"></abbr> </span>
                    <!--
                    <span class="recent_comments_reply">
                        <a href="#" class="recent_comments_view_all_link"> View all </a>
                        <a href="#" class="recent_comments_reply_link"> Reply </a></span>
                    </li>
                    -->
                </c:forEach>
            </ul>
        </div>
    </div>

</div>
</body>
</html>
