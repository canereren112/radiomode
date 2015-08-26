<%-- 
    Document   : songList
    Created on : 13.Mar.2012, 02:39:45
    Author     : caner
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript" src="static/js/album/list/albumSongList.js"></script>
<ul class="artist_top_song_list">
    <c:set var="gridNo" value="1" />
    <c:forEach var="song" items="${songs}">
        <li id="artist_album_song_${gridNo}" class="artist_album_song_list_item artist_album_song_list_grid_${gridNo%2}" >

            <a href="album/${songs[0].albumid.albumName}">
                <img class="artist_album_song_list_photo" src="${songs[0].albumid.albumAmazonAsin.coverarturl}"/>
            </a>
                <span class="album_album_song_list_name"> ${song.songName}</span>
            <span class="album_more_songs_box_buttons">
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
            <span class="album_album_song_list_listened">${song.songStats.listenCount}</span>
            <span class="album_album_song_list_duration duration">${song.songLength}</span>

        </li>
        <c:set var="gridNo" value="${gridNo + 1}" />
    </c:forEach>

</ul>