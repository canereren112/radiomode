<%-- 
    Document   : recommondation
    Created on : 19.Oca.2011, 02:11:08
    Author     : EREN
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>
<html>
    <head>
    <title></title>

    <link rel="stylesheet" type="text/css" href="static/css/music_recommendation.css" />
    <script type="text/javascript" src="static/js/recommendation/recommendation.js"></script>
</head>
<body>
    <jsp:include page="fragments/up_panel.jsp" />
<div class="explorer_margin">
    <div id="recommendation_big_content" class="big_content">
        <div class="left_content">
            <%@include  file="menu/left_recommendation_menu.html" %>
        </div>
        <div class="wrapper">
            <div >
                <jsp:include page="fragments/wrapper_up_panel.jsp" />
            </div>
                <!--            <div class="navigasyon_bar content_shadow ui-corner-all">
                <jsp:include page="fragments/navigasyon_bar.jsp" />
            </div>-->
            <div class="ie_shadow_box">
                <div  id ="recommendation_content" class="content_shape content_shadow ui-corner-all">
                    <jsp:include page="recommendation/recommendation_general.jsp" />
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="fragments/down_panel.jsp" />

</body>
</html>
