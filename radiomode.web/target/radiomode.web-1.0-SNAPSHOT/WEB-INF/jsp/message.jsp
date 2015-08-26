<%-- 
    Document   : message
    Created on : 02.Oca.2011, 16:59:25
    Author     : EREN
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>
<html>
    <head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="static/css/message.css" />
    <script type="text/javascript" src="static/js/message/message.js"></script>
    <!--[if IE]>
	 <link rel="stylesheet" type="text/css" href="static/css/ie-css/ie-artist.css" />

     <![endif]-->

</head>
<body>
    <jsp:include page="fragments/up_panel.jsp" />
<div class="explorer_margin">

    <div id="message_big_content" class="big_content">

        <div class="wrapper">
            <div >
                <jsp:include page="fragments/wrapper_up_panel.jsp" />
            </div>
<!--            <div class="navigasyon_bar content_shadow ui-corner-all">
                <jsp:include page="fragments/navigasyon_bar.jsp" />
            </div>-->
            <div class="ie_shadow_box">
                <div  id ="message_content" class="content_shape content_shadow ui-corner-all">

                    <div class="main_sub_menu_list list_shadow">
                        <a id="inbox_link" class="main_sub_menu_first_item main_sub_menu_link " href="#">
                            Inbox
                        </a>
                        <a id="sent_link" class="main_sub_menu_link" href="#">
                            Sent
                        </a>
                    </div>


                    <div id="message_down_content">

                    </div>
                </div>
            </div>

        </div>
    </div>
</div>

<jsp:include page="fragments/down_panel.jsp" />

</body>
</html>
