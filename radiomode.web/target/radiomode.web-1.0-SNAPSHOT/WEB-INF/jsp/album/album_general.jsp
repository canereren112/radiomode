<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>

<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript">
            jQuery(document).ready(function() {
                entityid = $('#entityid').val();
                url = 'comment/recent/type/album/entity/' + entityid + '/page/1';
                $('.recent_comments_content').load(url, function() {
                    //$('#deleteCommentForm').attr("action", url + $('#deleteCommentForm').attr("action").toString());
                    $('#commentsURL').val(url);
                });
                calculateBigPageHeight();
            });
        </script>
    <script type="text/javascript" src="static/js/album/album.js"></script>
    </head>

    <body>
        <input type="hidden" id="entityid" value="${album.albumid}" />
        <input type="hidden" id="albumName" value="${album.albumName}" />
        <div id="album_left_part" class="left_content_features">
            <div class="ie_shadow_box">
                <div id="album_singer_brief" class="left_box_features ui-corner-all box_shadow">
                    <span class="album_name_header">
                        <a href="album/${album.albumName}" id="singer_album_name" class="album_brief_header singer_brief_header profileMore">
                        ${album.albumName}
                        </a> -
                        <a href="artist/${album.artistid.name}" id="singer_album_name" class="album_brief_header singer_brief_header">
                            ${album.artistid.name}
                        </a>
                    </span>

                    <div id="singer_album_case" class="album_jewel_case header_shadow">
                        <img id="album_singer_brief_down" class="album_down_features " src="static/images/album/cd_case/jewel_case_back_big.png"/>
                        <img id="album_singer_picture" class="album_picture " src="${album.albumAmazonAsin.coverarturl}"/>
                        <img id="album_singer_brief_front" class="album_front_features " src="static/images/album/cd_case/jewel_case_front_big.png"/></br>
                    </div>

                    <div class="album_singer_brief_buttons">
                        <!--
                        <p><a id="add_albumbox_link" href="album/${album.albumName}#" class="brief_buttons blue_default_buttons ui-corner-all">
                                <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/love_button_new.png"/>
                                Add to my Library </a></p>
                        -->
                        <a  href="#" class="brief_buttons ie_album_blue_default_buttons album_default_buttons blue_default_buttons ui-corner-all">
                            <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/buy_icon_new.png"/>Buy Album </a>
                        <div id="share_stackmenu">
                            <a id="share_artist_link" href="#" class="brief_buttons ie_album_blue_default_buttons album_default_buttons blue_default_buttons ui-corner-all">
                                <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/connected_icon_new.png"/>
                                Share Album </a>
                        </div>
                    </div>
                    <div class="album_singer_brief_statistics">
                        <ul class="album_singer_brief_statistics_list">
                            <li> <span class="singer_brief_statistics_item"> ${album.albumStats.listenCount} </span> Plays </li>
                            <li> <span class="singer_brief_statistics_item"> - </span> Listeners </li>                        
                            <li> <span class="singer_brief_statistics_item"> ${album.albumStats.songCount} </span> Songs </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="ie_shadow_box">
                <div class=" more_information left_box_features ui-corner-all box_shadow">
                    <a href="#">   <div id="more_information_header" class="artist_box_header moreInfoMore"> More Information </div></a>
                    <div id="more_information_content">
                        <table class="album_more_information_table">
                            <tr>

                                <td> <span  class="album_more_information_header">Release Date</span></td>
                                <td><span  class="album_more_information_header">: </span>
                                    17 January 1986</td>

                            </tr>
                            <tr>

                                <td> <span  class="album_more_information_header">Publisher</span></td>
                                <td><span  class="album_more_information_header">: </span>
                                    Sony Music Entratainment</td>

                            </tr>
                            <tr>
                                <td>
                                    <span  class="album_more_information_header">Song Number</span> </td>
                                <td><span  class="album_more_information_header">: </span>
                                    234
                                </td>

                            </tr>
                        </table>
                    </div>
                    <p class="see_more_left_box see_more"> <a class="moreInfoMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>

                </div>
            </div>
        </div>


        <div id="album_right_part" class="right_content_features">
            <div class="ie_shadow_box">
                <div id="album_store_box" class="right_box_features ui-corner-all box_shadow">
                    <a href="#"><div  class="artist_box_header"> Store </div> </a>
                </div>
            </div>
            <div class="ie_shadow_box">
                <div id="album_listeners_box" class="right_box_features ui-corner-all box_shadow">
                    <a href="#"><div  class="artist_box_header listenersMore"> Listeners </div> </a>
                    <div class="top_listeners_content">
                        <ul class="common_friend_list">

                            <c:forEach var="albumFan" items="${albumFans}">
                                <li class="common_friend_list_item"> <a  class="common_friend_photo_link" href="#"><img class="common_profile_photo"src="static/images/user/small/1/brokensword.bmp" /></a>
                                    <br/><a class="common_profile_nickname" href="user/${albumFan.userid.userName}">${albumFan.userid.userName}</a>
                                    <br/><span class="common_profile_location" >${albumFan.userid.locationCity.city}, ${albumFan.userid.locationCity.countryCode.country}</span>
                                </li>
                            </c:forEach>

                        </ul>
                    </div>
                    <p class="see_more_right_box see_more"> <a class="listenersMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                </div>
            </div>
            <div class="ie_shadow_box">
                <div  class="recent_activity right_box_features ui-corner-all box_shadow">
                    <a href="#">  <div id="recent_activity_header" class="artist_box_header activityMore"> Recent Activity </div></a>
                    <div class="recent_activity_content">
                        <ul class="recent_activity_list">

                            <c:forEach var="activity" items="${activities}">
                                <li>
                                    <a class="activity_symbol  ui-state-error-text ui-icon ui-icon-check" href="#"></a>
                                    ${activity.activity}
                                </li>
                            </c:forEach>

                        </ul>
                    </div>

                </div>
                <p class="see_more_right_box see_more"> <a class="activityMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
            </div>

        </div>
        <div id="album_center_part" class=" center_content_features ui-corner-all box_shadow">
            <div class="ie_center_shadow_box">
                <div id="album_song_list_id" class="center_box_height_padding center_box_features">
                    <div id="album_song_list_header" class="center_artist_box_header" >  <a class="center_artist_box_link songsMore" href="#"> Songs</a></div>
                    <div class="duration_listeners_header">
                        <span class="song_list_listeners_link"> Listeners </span>
                        <!--<span class="song_list_duration_link"> Duration </span> -->
                    </div>

                    <ul class="album_song_list">
                        <c:set var="gridNo" value="1" />
                        <c:forEach var="song" items="${songs}">
                            <li id="song_grid_${gridNo}" class="song_list_item album_song_list_grid_${gridNo%2}" >
                                <a href="album/${songs[0].albumid.albumName}"><img class="album_songs_photo"  src="${songs[0].albumid.albumAmazonAsin.coverarturl}"/></a>
                                <span class="song_list_name"> ${song.songName}</span>
                                <span class="album_songs_box_buttons">
                                    <a href="#" class="user_songs_heart">
                                        <img title="Play/Add to queue" class=" user_song_box_buttons_image box_icons user_songs_play_image"  src="static/images/buttons/user_profile_buttons/play_button_blue.png">
                                    </a>
                                    <a href="#" class="user_songs_heart">
                                        <img class=" user_song_box_buttons_image box_icons user_songs_share_image" title="Share this song"  src="static/images/buttons/user_profile_buttons/mail.png">
                                    </a>
                                    <a href="#" class="user_songs_heart">
                                        <img class="user_song_box_buttons_image box_icons user_songs_buy_image" title="Buy this song"  src="static/images/buttons/user_profile_buttons/shopping_cart.png">
                                    </a>

                                </span>
                                <span class="song_list_listened">0 </span>
                               <!-- <span class="song_list_duration duration">${song.songLength}</span> -->
                            </li>
                            <c:set var="gridNo" value="${gridNo + 1}" />
                        </c:forEach>

                    </ul>
                    <div id="song_box_result_box" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
                        <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                            <span id="song_box_result_message"></span>
                    </div>

                    <p class="see_more"> <a class="songsMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                </div>

                <div  class="albums_features center_box_features " >

                    <div  class="center_artist_box_header "><a class="center_artist_box_link albumsMore" href="#">Other Albums</a></div>

                    <ul class="artist_top_album_list_new">
                        <c:forEach var="album" items="${otherAlbums}">
                            <li class="artist_top_album_list_item_new">
                                <a class="album_front_link" title="${album.albumName}" href="album/${album.albumName}">
                                    <img class="artist_top_album_photo song_overlay_shadow " src="${album.albumAmazonAsin.coverarturl}"/>
                                    <img class="artist_top_album_photo_overlay  " src="static/images/overlays/album_overlay.png"/>
                                </a>
                                <span class="artist_top_album_name"><a href="album/${album.albumName}" class="artist_top_album_name_link"> ${album.albumName} </a></span>
                                <!--                            <a  href="#" class="artist_top_album_button brief_buttons blue_default_buttons ui-corner-all">
                                                                <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/buy_icon_new.png"/>
                                                                Buy Album </a>-->
                            </li>
                        </c:forEach>
                    </ul>
                    <p class="see_more"> <a class="albumsMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                </div>
                <!--                <div class="albums_content">
                    <div class="album_list_width"><a href="#">
                <c:forEach var="album" items="${otherAlbums}">
                    <div class="album_jewel_case header_shadow">
                        <img class="album_down_features " src="static/images/album/cd_case/jewel_case_back_big.png"/>
                        <img class="album_picture " src="${album.albumAmazonAsin.coverarturl}"/>
                        <a title="${album.albumName}" href="album/${album.albumName}">
                            <img class="album_front_features " src="static/images/album/cd_case/jewel_case_front_big.png"/></br>
                        </a>
                    </div>
                </c:forEach>
            </a>
        </div>
        <div class="album_detail_information">
            <div class="album_prev_next">
                <a  class="album_prev_link album_change_link" href="#">
                    <img class="back_next_icons" alt="" src="static/images/icons/blue_buttons/back_icon_new.png">
                </a>
                <a  class="album_forw_link album_change_link" href="#">
                    <img class="back_next_icons" alt="" src="static/images/icons/blue_buttons/play_icon_new.png">
                </a> <br></br>
            </div>
            <a href="#" class="album_singer"> In the End, Linkinpark </a>
            <span class="artist_buy_align">
                <p><a  href="#" class="brief_buttons blue_default_buttons ui-corner-all">
                        <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/buy_icon_new.png"/>Buy Album </a></p>
            </span>
        </div>
        <br>
        <p class="see_more"> <a href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/blue_buttons/play_icon_new.png"></a></p>
    </div>-->


                <!--
                <div  class="albums_features center_box_features " >
    
                    <div  class="center_artist_box_header "><a class="center_artist_box_link" href="#"> Similar Albums</a></div>
                    <div class="albums_content">
                        <div class="album_list_width"><a href="#">
    
                <c:forEach var="album" items="${similiarAlbums}">
                    <div class="album_jewel_case header_shadow">
                        <img class="album_down_features " src="static/images/album/cd_case/jewel_case_back_big.png"/>
                        <img class="album_picture " src="${album.albumAmazonAsin.coverarturl}"/>
                        <a title="${album.albumName}" href="album/${album.albumName}">
                            <img class="album_front_features " src="static/images/album/cd_case/jewel_case_front_big.png"/></br>
                        </a>
                    </div>
                </c:forEach>
    
            </a>
        </div>
        <div class="album_detail_information">
            <div class="album_prev_next">
                <a  class="album_prev_link album_change_link" href="#">
                    <img class="back_next_icons" alt="" src="static/images/icons/blue_buttons/back_icon_new.png">
                </a>
                <a  class="album_forw_link album_change_link" href="#">
                    <img class="back_next_icons" alt="" src="static/images/icons/forward_icon.png">
                </a> <br></br>
            </div>
            <a href="#" class="album_singer"> In the End, Linkinpark </a>
            <span class="artist_buy_align">
                <p><a  href="#" class="brief_buttons blue_default_buttons ui-corner-all">
                        <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/buy_icon_new.png"/>Buy Album </a></p>
            </span>
        </div>
        <br>
        <p class="see_more"> <a href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
    </div>
    </div>
                -->

                <div  class="recent_comments center_box_features" >
                    <div class="center_artist_box_header "><a href="#" class="center_artist_box_link commentsMore">Recent Comments</a></div>
                    <div class="recent_comments_content">

                    </div>
                    <p class="see_more"> <a class="commentsMore" href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
                </div>
            </div>
        </div>



    </body>
</html>


