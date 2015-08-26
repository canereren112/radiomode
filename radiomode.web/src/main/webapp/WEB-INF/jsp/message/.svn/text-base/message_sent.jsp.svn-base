<%-- 
    Document   : message_sent
    Created on : 02.Oca.2011, 18:10:25
    Author     : EREN
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
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
        <div class="messages_header_links_div">
            <a href=""  class="message_all messages_header_links json">
                All
            </a>
            <a href="#" class="message_unread messages_header_links json">
                Unread
            </a>
            <a href="#" class="message_unread messages_header_links json">
                Read
            </a>
            <a href="#" class="message_none messages_header_links json">
                None
            </a>
            <a href="#" class="message_delete  messages_header_links json" method="POST" action="/messages/remove/{messageid}">
                Delete
            </a>
            <a href="#" class="create_message_link  messages_header_links json">
                Create Message
            </a>

        </div>

        <table class="messages_table">

            <c:forEach var="message" items="${messages}">
                <c:set var="content" value="${message.content}" ></c:set>
                <jsp:useBean id="contentSummary" class="java.lang.String"></jsp:useBean>
                <%
                            String cs = contentSummary;
                            if (cs.length() > 40) {
                                cs = cs.substring(0, 40);
                            }
                %>
                <c:set var="sendDate" value="${message.sendDate}"></c:set>
                <jsp:useBean id="sendDate" class="java.util.Date"></jsp:useBean>
                <%
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
                            String sendDateStr = format.format(sendDate);
                %>
                <c:choose>
                    <c:when test="${message.readDate==null}">
                        <tr class="messages_table_row_unreaded messages_table_row">
                        </c:when>
                        <c:otherwise>
                        <tr class="messages_table_row">
                        </c:otherwise>
                    </c:choose>


                    <td class="messages_check_box">
                        <!--
                                                <a href="#" class="message_read_check">
                                                    <img alt=""  src="" class="message_read_check_photo"/>

                                                </a>-->
                <input id="${message.id}" class="message_checkbox" type="checkbox" value="" name=""/>
                <input type="hidden" class="page" value="sent"/>

                </td>
                <td class="messages_table_data_1">

                    <a href="user/${message.receiverid.userName}"  class="message_friend_photo_link">
                        <img src="static/images/song/profile_outline.png" class="message_profile_frame"/>
                        <img src="${message.senderid.userPictures.locationSmall}" class="message_profile_photo"/>
                    </a>

                </td>
                <td class="messages_table_data_2">
                    <a href="user/${message.receiverid.userName}" class="message_profile_nickname">${message.receiverid.userName}</a>

                </td>
                <td class="messages_table_data_3">
                    <a val="${message.id}" href="#" class="message_profile_header">${message.content}</a>
                    <span class="message_profile_content">

                        <%=cs%>
                    </span>
                </td>
                <td class="messages_table_data_4">
                    <span class="message_profile_date date_color">
                        <abbr class="timeago" title="<%=sendDateStr%>"></abbr>
                    </span>
                </td>
                </tr>
            </c:forEach>

        </table>

    </div>

</div>
