<%-- 
    Document   : message_read
    Created on : 05.Oca.2011, 02:20:59
    Author     : EREN
--%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript">
    $(document).ready(function() {
        var message_general = new MESSAGE_GENERAL();
        calculateBigPageHeight();
    });
</script>
<div class="sub_pages_content_shape">
    <div class="type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">
        <table class="read_messages">
            <tr>
                <c:set var="content" value="${messageDetail.content}" ></c:set>
                <jsp:useBean id="contentSummary" class="java.lang.String"></jsp:useBean>
                <%
                            String cs = contentSummary;
                            if (cs.length() > 350) {
                                cs = cs.substring(0, 350);
                            }
                %>
                <c:set var="sendDate" value="${messageDetail.sendDate}"></c:set>
                <jsp:useBean id="sendDate" class="java.util.Date"></jsp:useBean>
                <%
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
                            String sendDateStr = format.format(sendDate);
                %>

                <td class="read_messages_table_data_1">

                    <a href="#" class="read_message_friend_photo_link">
                        <img src="${messageDetail.senderid.userPictures.locationSmall}" class="read_message_profile_photo"/>
                    </a>
                </td>
                <td class="read_messages_table_data_2">
                    <a href="user/${messageDetail.senderid.userName}" class="read_message_profile_nickname">${messageDetail.senderid.userName}</a>

                </td>
                <td class="read_messages_table_data_3">
                    <p val="${messageDetail.id}"   class="read_message_profile_header">${messageDetail.content}</p>
                    <span class="read_message_profile_content">

                        <%=cs%>
                    </span>
                </td>
                <td class="read_messages_table_data_4">
                    <span class="read_message_profile_date date_color">
                        <abbr class="timeago" title="<%=sendDateStr%>"></abbr>
                    </span>
                </td>

            </tr>

        </table>
        <a class="message_reply_link" href="#"> Reply </a>
        <div class="message_reply_form">

        </div>




    </div>

</div>
