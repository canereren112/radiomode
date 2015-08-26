<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>
<html>
    <head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="static/css/edit_profile.css" />
    <!--[if IE]>
	 <link rel="stylesheet" type="text/css" href="static/css/ie-css/ie-edit_profile.css" />

         <![endif]-->
    <script type="text/javascript" src="static/js/edit_profile/edit_profile.js"></script>
    

  
</head>
<body>
    <jsp:include page="fragments/up_panel.jsp" />
<div class="explorer_margin">
    <div id="edit_profile_big_content" class="big_content">
        <div class="left_content">
            <%@include  file="menu/left_edit_profile_menu.html" %>
        </div>
        <div class="wrapper">
            <div id="up_panel_edit_profile">
                <jsp:include page="fragments/wrapper_up_panel.jsp" />
            </div>
<!--            <div class="navigasyon_bar content_shadow ui-corner-all">
                <jsp:include page="fragments/navigasyon_bar.jsp" />
            </div>-->
            <div class="ie_shadow_box">
                <div  id ="edit_profile_content" class="content_shape content_shadow ui-corner-all">
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="fragments/down_panel.jsp" />

</body>
</html>