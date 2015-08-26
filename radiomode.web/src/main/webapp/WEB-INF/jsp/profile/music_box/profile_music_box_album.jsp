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
            <c:forEach var="albums" items="${albumMap}">
                <li id="album_grid_${gridNo}" class="profile_album_item profile_songs_grid_${gridNo%2}">
                    <a href="#"><img class="user_album_list_photo"  src="${albums[0].albumAmazonAsin.coverarturl}"></a>
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
   
</div>
