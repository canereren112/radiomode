<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>
<html>
    <head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="static/css/home.css" />
    <script type="text/javascript" src="static/js/home/home.js"></script>
</head>
<body>
    <jsp:include page="fragments/up_panel.jsp" />
<div class="explorer_margin">
    <div id="home_big_content" class="big_content">
        <div  class="wrapper">
            <div id="up_panel_home">
                <jsp:include page="fragments/wrapper_up_panel.jsp" />
            </div>
            <div class="ie_shadow_box">
                <div  id ="home_content" class="content_shape content_shadow ui-corner-all">
                    <jsp:include page="home/home_general.jsp" />
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="fragments/down_panel.jsp" />

</body>
</html>

