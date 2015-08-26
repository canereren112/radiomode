<%-- 
    Document   : message_reply
    Created on : 31.Tem.2011, 12:19:21
    Author     : caner
--%>

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

        <!--<table class="create_message_table">-->
        <form:form id="replyMessageForm" modelAttribute="newReplyMessage"  method="POST" action="messages/replied">
            <table class="create_message_table">
                <tr class="create_message_table_row">
                    <td class="create_message_table_data_1">
                        Reciever
                    </td>
                    <td class="create_message_table_data_2">
                        <span class="create_message_table_1_span">:</span>
                        <form:input path="receiverid.userName" class="reply_message_reciever" />
                    </td>
                </tr>
                <tr class="create_message_table_row">
                    <td class="create_messsage_content_data_1 create_message_table_data_1">
                        Message
                    </td>
                    <td class="create_message_table_data_2">
                        <span class="create_message_table_1_span">:</span>
                        <form:textarea path="content" class="create_message_content" />
                    </td>
                </tr>
            </table>
            <input class="reply_message_send_form_link" type="submit" value="Send"/>
        </form:form>
        <!--</table>-->

    </div>

</div>
