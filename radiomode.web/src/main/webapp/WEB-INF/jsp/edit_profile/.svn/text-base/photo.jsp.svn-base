<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<html>
    <head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        $(document).ready(function() {
            var photo = new PHOTO();
        });
    </script>
</head>
<body>
<input type="hidden" name="resultHidden" value="${param.result}" />
<div class="setting_store_box type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
    <a href="#"><div class="artist_box_header"> Store </div> </a>
</div>
<div class="sub_pages_settings sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">
    <div id="edit_profile_general_brief_box"  class="ui-corner-all">
        <div id="resultBox" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
            <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                <span id="resultMessage">${param.resultMessage}</span>
        </div>
        <form:form id="editProfilePhotoForm" modelAttribute="user" method="POST" action="edit_profile/photo">
            <div id="photo_edit">
                <img id="general_profile_photo" src="${user.userPictures.locationSmall}"/>
                <input type="file" name=""/>
                <input type="submit" value="Upload" name=""/>
            </div>
            <div id="about_me_text_box">
                <div id="save_button">
                    <input type="submit" name=" " value="Save All" />
                </div>
            </div>
        </form:form>
    </div>
</div>

</body>
</html>
