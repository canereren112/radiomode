<%-- 
    Document   : artistSongList
    Created on : 13.Mar.2012, 02:39:45
    Author     : caner
--%>





<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>

<script type="text/javascript" src="static/js/artist/list/artistSongList.js"></script>
<div id="main_list_content">
    <div id="artist_list_container">
        <script type="text/javascript" src="static/js/artist/list/artistSongListDuration.js"></script>

        <ul class="artist_album_song_list">
            <c:set var="gridNo" value="1" />
            <c:forEach var="song" items="${songs}">
                <li id="song_grid_${gridNo}" class="artist_album_song_list_item popular_song_list_grid_${gridNo%2}" >
                    <a href="album/${song.songid.albumid.albumName}" class="artist_album_song_list_picture_link">
                       <!-- <img class="artist_album_song_list_picture" src="${song.songid.albumid.pictureSmall}"/> -->
                        <img class="artist_album_song_list_picture" src="${song.songid.albumid.albumAmazonAsin.coverarturl}"/>
                    </a>

                    <div class="artist_album_center_div">
                        <span class="popular_songs_box_buttons">
                            <a href="#" class="user_songs_heart">
                                <img title="Play/Add to queue" class=" user_song_box_buttons_image box_icons  "  src="static/images/buttons/user_profile_buttons/play_button_blue.png">
                            </a>

                            <a href="#" class="user_songs_heart">
                                <img class="user_song_box_buttons_image box_icons " title="Share this song"  src="static/images/buttons/user_profile_buttons/mail.png">
                            </a>
                            <a href="#" class="user_songs_heart">
                                <img class="user_song_box_buttons_image box_icons " title="Buy this song"  src="static/images/buttons/user_profile_buttons/shopping_cart.png">
                            </a>
                            <!--
                            <a href="#" class="user_songs_heart">
                                <img class="user_songs_heart_image"  src="static/images/buttons/user_profile_buttons/tag_blue.png">
                            </a>
                            -->
                        </span>
                        <span class="artist_album_song_list_name">${song.songid.songName}</span>
                        <span class="artist_album_song_list_listened">${song.listenCount}</span>
                        <span class="artist_album_song_list_duration duration">${song.songid.songLength}</span>
                        <a href="album/${song.songid.albumid.albumName}"><span class="artist_album_song_list_album_name">${song.songid.albumid.albumName}</span></a>
                    </div>
                </li>
                <c:set var="gridNo" value="${gridNo + 1}" />
            </c:forEach>
        </ul>
    </div>
</div>