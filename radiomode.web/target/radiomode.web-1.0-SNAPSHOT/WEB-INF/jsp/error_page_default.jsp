<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>
<html>
    <head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="static/css/main.css" />
    <!--[if IE]>
	 <link rel="stylesheet" type="text/css" href="static/css/ie-css/ie-main.css" />
 <![endif]-->
    <script type="text/javascript" src="static/js/main/main.js"></script>
    <script type="text/javascript" src="static/js/plugins/validate/jquery.validate.min.js"></script>
</head>
<body>
    <jsp:include page="fragments/up_panel.jsp" />
<div class="explorer_margin">
    <div id="main_big_content" class="big_content">
        <div class="wrapper">
            <div id="up_panel_main">
                <jsp:include page="fragments/wrapper_up_panel.jsp" />
            </div>
<!--            <div class="navigasyon_bar content_shadow ui-corner-all">
                <jsp:include page="fragments/navigasyon_bar.jsp" />
            </div>-->
            <div class="ie_shadow_box">
                <div  id ="main_content" class="content_shape content_shadow ui-corner-all">
                    <p>Sorry, an error occured, please try again later.</p>
                </div>
            </div>

        </div>
    </div>
</div>

<jsp:include page="fragments/down_panel.jsp" />

</body>
</html>
