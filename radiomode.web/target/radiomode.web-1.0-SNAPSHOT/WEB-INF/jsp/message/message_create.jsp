<%-- 
    Document   : create_message
    Created on : 05.Oca.2011, 01:23:43
    Author     : EREN
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript">
    $(document).ready(function() {
        calculateBigPageHeight();
    });
</script>
<div class="sub_pages_content_shape">
    <div class="type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">

        <!--<table class="create_message_table">-->
        <form:form id="createMessagForm" modelAttribute="message"  method="POST" action="messages/create">
            <table class="create_message_table">
                <tr class="create_message_table_row">
                    <td class="create_message_table_data_1">
                        Reciever
                    </td>
                    <td class="create_message_table_data_2">
                        <span class="create_message_table_1_span">:</span>
                        <form:input path="receiverid" class="create_message_reciever" />
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
        </form:form>
        <!--</table>-->
        <input class="create_message_send_link" type="submit" value="Send"/>
    </div>

</div>
