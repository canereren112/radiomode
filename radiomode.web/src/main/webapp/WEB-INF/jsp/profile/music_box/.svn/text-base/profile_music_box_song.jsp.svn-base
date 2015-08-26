<%-- 
    Document   : music_box
    Created on : 07.Ara.2010, 07:44:59
    Author     : EREN
--%>

<jsp:include page="../profile_music.jsp" />
<div class="sub_pages_content_shape">
    <div class="type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">

        <ul class="profile_list_general">
            <c:set var="gridNo" value="1" />
            <c:forEach var="songs" items="${songMap}">
                <li id="song_grid_${gridNo}" class="profile_songs_item profile_songs_grid_${gridNo%2}">
                    <a href="#"><img class="user_songs_photo"  src="${songs[0].albumid.albumAmazonAsin.coverarturl}"></a>
                    <span class="singer_and_song_name">
                        <a href="artist/${songs[0].artistid.name}" class="user_songs_singer_name">${songs[0].artistid.name}</a> - <span class="user_songs_song_name">${songs[0].songName}</span>
                    </span>
                    <span class="user_songs_box_buttons">
                        <a href="#" class="user_songs_heart">
                            <img title="Play/Add to queue" class=" user_song_box_buttons_image box_icons user_songs_heart_image"  src="static/images/buttons/user_profile_buttons/play_button_blue.png">
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

</div>
