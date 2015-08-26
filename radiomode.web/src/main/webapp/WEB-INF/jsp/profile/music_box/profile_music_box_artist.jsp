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
            <c:forEach var="artists" items="${artistMap}">
                <li id="artist_grid_${gridNo}" class="profile_artist_item profile_songs_grid_${gridNo%2}">
                    <a href="#"><img class="user_artist_list_photo"  src="${artists[0].pictureSmall}"></a>
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

</div>
