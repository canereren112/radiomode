<%-- 
    Document   : artist_profile_songs
    Created on : 23.Ara.2010, 18:15:48
    Author     : EREN
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<link rel="stylesheet" type="text/css" href="static/css/plugins/paging/jquery.paginate.css" />
<script type="text/javascript" src="static/js/plugins/paging/jquery.paginate.js"></script>
<script type="text/javascript" src="static/js/artist/artist_popular_songs.js"></script>
<div class="sub_pages_content_shape">
    <div class="type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_left_content_shape box_shadow ui-corner-all">
        <p class="sub_page_header">
            Popular Songs
        </p>
        <div id="top_songs_content">
            <div class="artist_album_songs_sub_header">
                <span class="artist_album_song_list_listeners_link"> Listeners </span>
                <span class="artist_album_song_list_duration_link"> Duration </span>
                <span class="artist_album_song_list_album"> Album </span>
            </div>
            <div id="artist_popular_song_list_container">
                <jsp:include page="list/artistSongList.jsp" />
            </div>
        </div>
        <span class="songPageNumberOfArtist">${songPageNumberOfArtist}</span>
        <span class="artistId">${artistId}</span>
        <div class="paging_container">
            <div id="artist_popular_song_paging" class="">                   
            </div>
        </div>
    </div>

</div>
