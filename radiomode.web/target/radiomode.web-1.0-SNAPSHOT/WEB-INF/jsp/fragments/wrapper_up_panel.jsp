<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<div id="up_panel_top">

    <a id="up_panel_center_up_logo" href="main">
        <img src= "static/images/header/logo_white_blue_5.png" class="radiomode_logo"/>
    </a>

    <ul id="rm_menu_list_name" class="rm_menu_list">

        <li class="rm_menu_list_item"><span class="menu_name_hidden">Radio</span></li>
        <li class="rm_menu_list_item"><span class="menu_name_hidden">Music</span></li>
        <!--
        <li class="rm_menu_list_item"><span class="menu_name_hidden">Home </span></li>
        <li class="rm_menu_list_item"><span class="menu_name_hidden">Settings</span></li>
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="#">People</a></li>
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="#">Events</a></li>
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="#">Help Us</a></li>
        -->
    </ul>
    <spring:url value="user/{userName}" var="profileUrl">
        <spring:param name="userName" value="${sessionScope.userName}" />
    </spring:url>
    <ul class="rm_menu_list">
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="radio"><span class="menu_name">Radio</span></a></li>
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="music"><span class="menu_name">Music</span></a></li>
        <!--
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="main"><span class="menu_name">Home </span></a></li>
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="#">People</a></li>
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="#">Events</a></li>
        <li class="rm_menu_list_item"><a class="rm_menu_list_link" href="#">Help Us</a></li>
        -->
    </ul>

    <div class="main_search">
        <textarea class="main_search_area"></textarea>
        <img src= "static/images/icons/search/search.png" class="main_search_icon"/>
    </div>


    <div class="main_sign_login">
        <div id="sign_login_container">
            <c:choose>
                <c:when test="${sessionScope.userName != null}">


                    <!--<a href="#"> <img class="photo_test" src="static/test/images/profile_menu/comment.png"/></a>
                    <a href="#"> <img class="photo_test" src="static/test/images/profile_menu/contact.png"/></a>
                    <a href="#"> <img class="photo_test" src="static/test/images/profile_menu/message.png"/></a>
                    <a href="#"> <img class="photo_test" src="static/test/images/profile_menu/music.png"/></a> -->

                    <span  class="after_login_span">
                        <a  class="rm_menu_list_login" href="${fn:escapeXml(profileUrl)}">${sessionScope.userName}</a>
                        <a  href="#" class="expand_login_button json"><img class="panel_drop_down_icon"src="static/test/images/profile_menu/panel_drop_down.png"/> </a>

                    </span>

                    <ul  id ="expanded_login" class="after_login_panel">
                        <li class="rm_menu_login_list_first_item"> <a  class="rm_menu_list_login" href="${fn:escapeXml(profileUrl)}">${sessionScope.userName}</a>
                            <a  href="#" class="expand_login_button json"><img class="panel_drop_down_icon"src="static/test/images/profile_menu/panel_drop_down.png"/> </a>
                        </li>
                        <li class="rm_menu_login_list_item rm_menu_login_list_second_item"> <a class="rm_menu_list_login" href="#">Home</a> </li>
                        <li class="rm_menu_login_list_item"> <a class="rm_menu_list_login" href="${fn:escapeXml(profileUrl)}">Profile</a> </li>
                        <li class="rm_menu_login_list_item"> <a class="rm_menu_list_login" href="edit_profile">Settings</a> </li>
                        <li class="rm_menu_login_list_item"> <a  class="rm_menu_list_login" href="recommendation">Recommended</a> </li>
                        <li class="rm_menu_login_list_item"> <a class="rm_menu_list_login" href="message">Inbox</a> </li>
                        <li class="rm_menu_login_list_item"> <a class="rm_menu_list_login" href="#">Notifications</a> </li>
                        <li id="after_login_panel_list_item_last" class="rm_menu_login_list_item"> <a class="rm_menu_list_login" href="logout">Logout</a> </li>

                    </ul>
                    <a class="home_notifications json" href="#">Notifications(3)</a>

                    <ul class="notification_list">
                        <li>
                        <div class="notification_list_left_part notification_list_left_part_1">
                            <a class="notification_icon_link" href="#"> <img class="notification_icon" src="static/images/home/sticker_128/user.png"/></a>
                        </div>
                        <div class="notification_list_right_part notification_list_right_part_1">
                            <ul class="fr_list">
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> added you as a friend...<br/>
                                    <a class="fr_yes_no" href="#">yes</a>,
                                    <a class="fr_yes_no" href="#">no</a> ?
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> added you as a friend...<br/>
                                    <a class="fr_yes_no" href="#">yes</a>,
                                    <a class="fr_yes_no" href="#">no</a> ?
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                            </ul>
                            <p class="see_more_notification see_more"> <a href="#">See more<img class="see_more_notification_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                        </div>
                        </li>
                        <li>
                        <div class="notification_list_left_part">
                            <a class="notification_icon_link" href="#"> <img class="notification_icon" src="static/images/home/sticker_128/mail.png"/></a>
                        </div>
                        <div class="notification_list_right_part">
                            <ul class="fr_list">
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> sent you a message...
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> sent you a message...
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                            </ul>
                            <p class="see_more_notification see_more"> <a href="#">See more<img class="see_more_notification_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                        </div>
                        </li>
                        <li>
                        <div class="notification_list_left_part">
                            <a class="notification_icon_link" href="#"> <img class="notification_icon" src="static/images/home/sticker_128/comment.png"/></a>
                        </div>
                        <div class="notification_list_right_part">
                            <ul class="fr_list">
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> wrote on your wall...
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> wrote on your wall...
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                            </ul>
                            <p class="see_more_notification see_more"> <a href="#">See more<img class="see_more_notification_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                        </div>
                        </li>
                        <li>
                        <div class="notification_list_left_part">
                            <a class="notification_icon_link" href="#"> <img class="notification_icon" src="static/images/home/sticker_128/globe.png"/></a>
                        </div>
                        <div class="notification_list_right_part">
                            <ul class="fr_list">
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> shared <a href="#">linkinpark</a>...
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                                <li>
                                <img class="notification_profile_photo" src="static/test/images/artist/ahmet_1.jpg"/>
                                <span class="friend_request_text">
                                    <a class="fr_nick_request"href="#">bellion</a> shared <a href="#">linkinpark</a>...
                                </span>
                                <span class="friend_request_date">
                                    22.12.2010
                                </span>
                                </li>
                            </ul>
                            <p class="see_more_notification see_more"> <a href="#">See more<img class="see_more_notification_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                        </div>
                        </li>
                    </ul>

                </c:when>
                <c:otherwise>

                    <a id="sign_up" class="menu_login json" href="#">
                        <span class="menu_login_span">Sign Up </span>
                    </a>


                    <a id="login" class="menu_login json" href="#">
                        <span class="menu_login_span">Login </span>
                    </a>

                </c:otherwise>
            </c:choose>
        </div>
    </div>



</div>
