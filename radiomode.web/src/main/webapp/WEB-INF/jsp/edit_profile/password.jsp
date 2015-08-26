<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<html>
    <head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        $(document).ready(function() {
            var password = new PASSWORD();
        });
    </script>
</head>
<body>
<input type="hidden" name="resultHidden" value="${param.result}" />
<div class="setting_store_box type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
    <a href="#"><div class="artist_box_header"> Store </div> </a>
</div>
<div class="sub_pages_settings sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">
    <div id="edit_profile_password_box" class="ui-corner-all">
        <div id="resultBox" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
            <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                <span id="resultMessage">${param.resultMessage}</span>
        </div>
        <form id="editProfilePasswordForm" method="POST" action="edit_profile/password">
            <table class="password_table">
                <tr >
                    <td class="password_table_td_left">
                        Current Password :
                    </td>
                    <td class="password_table_td_right">
                <input class="password" type="text" name="password" value="${password}"/>
                </td>
                </tr>
                <tr >
                    <td class="password_table_td_left">
                        New Password :
                    </td>
                    <td class="password_table_td_right">
                <input class="password" type="text" name="newPassword" value=""/>
                </td>
                </tr>
                <tr >
                    <td class="password_table_td_left">
                        Confirm New Password :
                    </td>
                    <td class="password_table_td_right">
                <input class="password" type="text" name="newPassword2" value=""/>
                </td>
                </tr>

            </table>

            <div id ="change_password">
                <input type="submit" name="editButton" value="Change Password"/>
            </div>
        </form>
    </div>
</div>

</body>
</html>
