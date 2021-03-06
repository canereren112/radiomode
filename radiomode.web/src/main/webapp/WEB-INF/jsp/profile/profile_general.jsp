<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript" src="static/js/profile/profile.js"></script>
<html>
    <head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        jQuery(document).ready(function() {
            calculateBigPageHeight();
        });
    </script>
</head>

<c:set var="birthDate" value="${user.birthDate}"></c:set>
<jsp:useBean id="birthDate" class="java.util.Date"></jsp:useBean>
<c:set var="lastLoginDate" value="${user.lastLoginDate}" ></c:set>
<jsp:useBean id="lastLoginDate" class="java.util.Date"></jsp:useBean>
<c:set var="gender" value="${user.gender}" ></c:set>
<jsp:useBean id="gender" class="java.lang.String"></jsp:useBean>
<%
            //TODO burasi degistirilecek
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthDate);
            int birthYear = calendar.get(Calendar.YEAR);
            calendar.setTime(new java.util.Date());
            int age = calendar.get(Calendar.YEAR) - birthYear;
            String genderString = "";
            if (gender.equals("M")) {
                genderString = "Male";
            } else {
                genderString = "Female";
            }
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
            String lastLoginDateStr = format.format(lastLoginDate);
%>

<script type="text/javascript">
    jQuery(document).ready(function() {        
        var entityid = $('#entityid').val();
        url = 'comment/recent/type/user/entity/' + entityid + '/page/1';
        $('#recent_user_comments').load(url, function() {
            //$('#deleteCommentForm').attr("action", url + $('#deleteCommentForm').attr("action").toString());
            $('#commentsURL').val(url);
        });
    });
</script>

<body>
<input type="hidden" id="entityid" value="${user.userid}" />
<input type="hidden" id="profileUser" value="${user.userName}" />
<input type="hidden" id="loginUser" value="${sessionScope.userName}" />
<div id="profile_left_part" class="left_content_features">
    <div class="ie_shadow_box">
        <div id="user_photo_box" class="left_box_features ui-corner-all box_shadow">
            <p class="singer_brief_header">
                ${user.userName}
            </p>
            <div id="photo_container">
                <a href="#">

                    <img id ="profile_photo" class="" src="${user.userPictures.locationSmall}"/>
                    <img src="static/images/overlays/profile_overlay.png" class="profile_photo_outline">
                </a>
                <div id="photo_right_information">
                    <p class="photo_right_text"> <%=age%>, <%=genderString%>  </p>
                    <p class="photo_right_text"> ${user.locationCity.city},${user.locationCity.countryCode.country} </p>
                    <div class="photo_right_down">
                        <p class="photo_listening_text"> Last Login:  </p>
                        <p class="photo_right_text"> <abbr class="timeago" title="<%=lastLoginDateStr%>"></abbr> </p>
                    </div>
                </div>
                <c:if test="${sessionScope.userName == user.userName}">
                    <a id="user_edit_link" href="edit_profile">
                        <img height="17px" src="static/test/images/icons/edit_profile.png"/>Edit Profile
                    </a>
                </c:if>
            </div>
            <c:if test="${sessionScope.userName != user.userName}">
                <div id="user_buttons">
                    <p><a id="addAsFriend" href="#" class="brief_buttons blue_default_buttons ui-corner-all json">

                            <img  class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/add_icon_new.png"/>
                            Add as Friend</a></p>
                    <p><a  href="#" class="brief_buttons blue_default_buttons ui-corner-all">
                            <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/send_email_new.png"/>
                            Send Message </a></p>
                    <p><a  href="user/${user.userName}#recent_user_comments" class="brief_buttons blue_default_buttons ui-corner-all">
                            <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/comment_icon_new.png"/>
                            Write Comment </a></p>

                </div>
            </c:if>
            <div class="user_singer_brief_statistics">
                <ul class="user_singer_brief_statistics_list">
                    <li> <span class="user_brief_statistics_item"> ${user.userStats.listenCount} </span> Plays </li>
                    <li> <span class="user_brief_statistics_item"> -- </span> Songs </li>
                    <li> <span class="user_brief_statistics_item"> -- </span> Comments </li>
                </ul>
            </div>

        </div>
    </div>
    <div class="ie_shadow_box">
        <div id="user_about_me_box" class="left_box_features ui-corner-all box_shadow">
            <a href="#">
                <div class="artist_box_header about_me_More"> About Me </div>
            </a>
            <div id="user_about_me_content">
                ${about_me}
            </div>
            <p class="see_more_left_box see_more"> <a class="about_me_More" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>


        </div>
    </div>
    <div class="ie_shadow_box">
        <div id="user_recent_activity" class="recent_activity left_box_features ui-corner-all box_shadow">
            <a href="#"> <div id="user_recent_activity_box_header" class="artist_box_header activity_More"> Recent Activity </div>
            </a>

            <ul id="user_recent_activity_list">
                <c:forEach var="activity" items="${activities}">
                    <li>
                        <a class="activity_symbol  ui-state-error-text ui-icon ui-icon-check" href="#"></a>
                        ${activity.activity}
                    </li>
                </c:forEach>
            </ul>

            <p class="see_more_left_box see_more"> <a  class="activity_More"  href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
        </div>
    </div>
</div>


<div id="profile_right_part" class="right_content_features">
    <div class="ie_shadow_box">
        <div id="user_store_box" class="right_box_features ui-corner-all box_shadow">
            <a href="#"><div class="artist_box_header" id="artist_store_box_header"> Store </div> </a>
        </div>
    </div>

    <div class="ie_shadow_box">
        <div id="user_friends_box" class="right_friend_box right_box_features ui-corner-all box_shadow">
            <a href="#"><div class="artist_box_header profile_friendsMore" id="artist_store_box_header"> Friends </div> </a>

            <ul class="common_friend_list">
                <c:forEach var="friendList" items="${friendLists}">
                    <c:choose>
                        <c:when test="${friendList.receiverid.userName == user.userName}">
                            <c:set var="friend" value="${friendList.senderid}" />
                        </c:when>
                        <c:otherwise>
                            <c:set var="friend" value="${friendList.receiverid}" />
                        </c:otherwise>
                    </c:choose>
                    <li class="common_friend_list_item">

                        <a  class="common_friend_photo_link" href="user/${friend.userName}">
                            <img class="profile_general_photo_outline"src="static/images/song/profile_outline.png"/>
                            <img class="common_profile_photo"src="${friend.userPictures.locationSmall}" /></a>
                        <br/><a class="common_profile_nickname" href="user/${friend.userName}">${friend.userName}</a>
                        <br/><span class="common_profile_location" >${friend.locationCity.city},${friend.locationCity.countryCode.country}</span>
                    </li>
                </c:forEach>
            </ul>

            <p class="see_more_right_box see_more"> <a class="profile_friendsMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
        </div>
    </div>
    <div class="ie_shadow_box">
        <div id="user_neighbours_box" class="right_friend_box right_box_features ui-corner-all box_shadow">
            <a href="#"><div class="artist_box_header profile_neighboursMore" id="artist_store_box_header"> Neighbours </div> </a>

            <ul class="common_friend_list">
                <c:forEach var="neighbourList" items="${neighbours}">
                    <c:choose>
                        <c:when test="${neighbourList.userid.userName == user.userName}">
                            <c:set var="neighbour" value="${neighbourList.similiarUserid}" />
                        </c:when>
                        <c:otherwise>
                            <c:set var="neighbour" value="${neighbourList.userid}" />
                        </c:otherwise>
                    </c:choose>
                    <li class="common_friend_list_item">
                        <a  class="common_friend_photo_link" href="user/${neighbour.userName}">
                            <img class="profile_general_photo_outline"src="static/images/song/profile_outline.png"/>
                            <img class="common_profile_photo"src="${neighbour.userPictures.locationSmall}" /></a>
                        <br/><a class="common_profile_nickname" href="user/${neighbour.userName}">${neighbour.userName}</a>
                        <br/><span class="common_profile_location" >${neighbour.locationCity.city},${neighbour.locationCity.countryCode.country}</span>
                    </li>
                </c:forEach>
            </ul>

            <p class="see_more_right_box see_more"> <a class="profile_neighboursMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>

        </div>
    </div>


</div>

<div id="profile_center_part" class="center_content_features box_shadow">
    <div class="ie_center_shadow_box">
        <!--
        <div id="musical_background_box" class="center_box_features">
            <div  id="center_musical_background_link" class="center_artist_box_header "><a class="center_artist_box_link" href="#">Musical Background</a></div>
            <p class="see_more"> <a href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
        </div>
        -->

        <div id="user_song_box" class="center_box_features">
            <div  class="center_artist_box_header_1 center_artist_box_header "><a class="center_artist_box_link profile_song_boxMore" href="#">Song Box</a></div>

            <div class="box_submenu">
                <ul>
                    <li> <a class="center_box_submenu_link_1 center_box_submenu_link" href="#">Recently Listened</a></li>
                    <li> <a class="center_box_submenu_link" href="#">Most Listened</a></li>
                    <!--<li> <a class="center_box_submenu_link" href="#">Loved</a></li>-->
                </ul>
            </div>
            <div id="user_songs_box_content">
                <ul class="profile_list_general">
                    <c:set var="gridNo" value="1" />
                    <c:forEach var="songs" items="${songMap}">
                        <li id="song_grid_${gridNo}" class="profile_songs_item profile_songs_grid_${gridNo%2}">
                            <a href="album/${songs[0].albumid.albumName}"><img class="user_songs_photo"  src="${songs[0].albumid.albumAmazonAsin.coverarturl}"></a>
                            <span class="singer_and_song_name">
                                <a href="artist/${songs[0].artistid.name}" class="user_songs_singer_name">${songs[0].artistid.name}</a> 
                                - 
                                <span href="#" class="user_songs_song_name">${songs[0].songName}</span>
                            </span>
                            <span class="user_songs_box_buttons">
                                <a href="#" class="user_songs_heart">
                                    <img title="Play/Add to queue" class=" user_song_box_buttons_image box_icons user_songs_play_image"  src="static/images/buttons/user_profile_buttons/play_button_blue.png">
                                </a>
                                <!--
                                <a href="#" class="user_songs_heart json">
                                    <img id="${songs[0].songid}" name="${songs[0].songName}" class=" user_song_box_buttons_image box_icons user_songs_heart_image" title="Love this song"  src="static/images/buttons/user_profile_buttons/blue_heart.png">
                                </a>
                                -->
                                <a href="#" class="user_songs_heart">
                                    <img class=" user_song_box_buttons_image box_icons user_songs_share_image" title="Share this song"  src="static/images/buttons/user_profile_buttons/mail.png">
                                </a>
                                <a href="#" class="user_songs_heart">
                                    <img class="user_song_box_buttons_image box_icons user_songs_buy_image" title="Buy this song"  src="static/images/buttons/user_profile_buttons/shopping_cart.png">
                                </a>
                                <!--
                                <a href="#" class="user_songs_heart">
                                    <img class="user_songs_heart_image"  src="static/images/buttons/user_profile_buttons/tag_blue.png">
                                </a>
                                -->
                            </span>
                            <span class="user_songs_box_listened_date_song"> ${songs[1]}</span>
                        </li>
                        <c:set var="gridNo" value="${gridNo + 1}" />
                    </c:forEach>

                </ul>
            </div>
            <div id="song_box_result_box" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
                <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                    <span id="song_box_result_message"></span>
            </div>
            <p class="see_more"> <a class="profile_song_boxMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
        </div>

        <div id="user_artist_box" class="center_box_features">
            <div  class="center_artist_box_header "><a class="center_artist_box_link profile_artist_boxMore" href="#">Artist Box</a></div>

            <div id="user_artist_box_content">
                <ul class="profile_list_general">

                    <c:set var="gridNo" value="1" />
                    <c:forEach var="artists" items="${artistMap}">
                        <li id="artist_grid_${gridNo}" class="profile_artist_item profile_songs_grid_${gridNo%2}">
                            <a href="artist/${artists[0].name}"><img class="user_artist_list_photo"  src="${artists[0].pictureSmall}"></a>
                            <span class="user_artist_name">
                                <a href="artist/${artists[0].name}" class="user_songs_singer_name">${artists[0].name}</a>
                            </span>
                            <span class="user_artist_box_buttons">
                                <!--
                                <a href="#" class="user_songs_heart json">
                                    <img id="${artists[0].artistid}" name="${artists[0].name}" class="box_icons user_artists_heart_image" title="Love this artist"  src="static/images/buttons/user_profile_buttons/blue_heart.png">
                                </a>
                                -->
                                <a href="#" class="user_songs_heart">
                                    <img class="box_icons user_songs_share_image" title="Share this artist"  src="static/images/buttons/user_profile_buttons/mail.png">
                                </a>
                                <!--
                                <a href="#" class="user_songs_heart">
                                    <img class="user_songs_heart_image"  src="static/images/buttons/user_profile_buttons/tag_blue.png">
                                </a>
                                -->
                            </span>
                            <span class="user_songs_box_listened_date_artist"> ${artists[1]}</span>
                        </li>
                        <c:set var="gridNo" value="${gridNo + 1}" />
                    </c:forEach>

                </ul>
            </div>
            <div id="artist_box_result_box" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
                <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                    <span id="artist_box_result_message"></span>
            </div>
            <p class="see_more"> <a class="profile_artist_boxMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
        </div>
        <div id="user_album_box" class="center_box_features ">
            <a href="#"><div  class="center_artist_box_header "><a class="center_artist_box_link profile_album_boxMore" href="#">Album Box</a></div></a>

            <div id="user_album_box_content">
                <ul class="profile_list_general">

                    <c:set var="gridNo" value="1" />
                    <c:forEach var="albums" items="${albumMap}">
                        <li id="album_grid_${gridNo}" class="profile_album_item profile_songs_grid_${gridNo%2}">
                            <a href="album/${albums[0].albumName}" ><img class="user_album_list_photo"  src="${albums[0].albumAmazonAsin.coverarturl}"></a>
                            <span class="user_album_span">
                                <a href="artist/${albums[0].artistid.name}" class="user_album_artist_name">${albums[0].artistid.name}</a> -
                                <a href="album/${albums[0].albumName}" class="user_album_name">${albums[0].albumName}</a>
                            </span>
                            <span class="user_album_box_buttons">
                                <!--
                                <a href="#" class="user_songs_heart json">
                                    <img id="${albums[0].albumid}" name="${albums[0].albumName}" class="box_icons user_albums_heart_image" title="Love this album"  src="static/images/buttons/user_profile_buttons/blue_heart.png">
                                </a>
                                -->
                                <a href="#" class="user_songs_heart">
                                    <img class="box_icons user_songs_share_image" title="Share this album"  src="static/images/buttons/user_profile_buttons/mail.png">
                                </a>
                                <a href="#" class="user_songs_heart">
                                    <img class="box_icons user_songs_buy_image" title="Buy this album"  src="static/images/buttons/user_profile_buttons/shopping_cart.png">
                                </a>
                                <!--
                                <a href="#" class="user_songs_heart">
                                    <img class="user_songs_heart_image"  src="static/images/buttons/user_profile_buttons/tag_blue.png">
                                </a>
                                -->

                            </span>
                            <span class="user_songs_box_listened_date_album"> ${albums[1]}</span>
                        </li>
                        <c:set var="gridNo" value="${gridNo + 1}" />
                    </c:forEach>

                </ul>
            </div>
            <div id="album_box_result_box" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
                <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                    <span id="album_box_result_message"></span>
            </div>
            <p class="see_more"> <a class="profile_album_boxMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
        </div>
        <div class="center_artist_box_header "><a href="#" class="center_artist_box_link commentsMore">Recent Comments</a></div>
        <div id="recent_user_comments" class="recent_comments center_box_features" >

        </div>

    </div>
</div>

</body>
</html>
