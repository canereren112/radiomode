<%-- 
    Document   : music_song
    Created on : 19.Oca.2011, 01:57:15
    Author     : EREN
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript">
    $(document).ready(function() {
        var music_song = new MUSIC_SONG();
        calculateSmallPageHeight();
    });
</script>
<div class="sub_pages_content_shape sub_pages_content_shape_no_left_menu">
    <div class="type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="<li>"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_without_left_menu sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">
        <div class="music_genres_part">
            <span class="music_genres_header"> ALL </span>
            <ul class="music_genres_list">
                <li class="music_genre_link"><a href="#">acoustic</a></li>
                <li><a class="music_genre_link" href="#">ambient</a></li>
                <li><a class="music_genre_link" href="#">blues</a></li>
                <li><a class="music_genre_link" href="#">classical</a></li>
                <li><a class="music_genre_link" href="#">country</a></li>
                <li><a class="music_genre_link" href="#">electronic</a></li>
                <li><a class="music_genre_link" href="#">emo</a></li>
                <li><a class="music_genre_link" href="#">folk</a></li>
                <li><a class="music_genre_link" href="#">hardcore</a></li>
                <li><a class="music_genre_link" href="#">hip hop</a></li>
                <li><a class="music_genre_link" href="#">indie</a></li>
                <li><a class="music_genre_link" href="#">jazz</a></li>
                <li><a class="music_genre_link" href="#">latin</a></li>
                <li><a class="music_genre_link" href="#">metal</a></li>
                <li><a class="music_genre_link" href="#">pop</a></li>
                <li><a class="music_genre_link" href="#">punk</a></li>
                <li><a class="music_genre_link" href="#">reggae</a></li>
                <li><a class="music_genre_link" href="#">rnb</a></li>
                <li><a class="music_genre_link" href="#">rock</a></li>
                <li><a class="music_genre_link" href="#">techno</a></li>
                <li><a class="music_genre_link" href="#">soul</a></li>
                <li><a class="music_genre_link" href="#">soundtrack</a></li>
                <li><a class="music_genre_link" href="#">world</a></li>
                <li><a class="music_genre_link" href="#">60s</a></li>
                <li><a class="music_genre_link" href="#">70s</a></li>
                <li><a class="music_genre_link" href="#">80s</a></li>
                <li><a class="music_genre_link" href="#">90s</a></li>
            </ul>
        </div>

        <div class="music_right_part">

            <c:forEach items="${songStats}" var="songStats">
                <ul class="music_song_list">
                    <li>
                    <div class="song_list_item_left">

                        <img alt=""  class="music_song_photo song_overlay_shadow" src="${songStats.songid.albumid.albumAmazonAsin.coverarturl}" >
                        <img src="static/images/overlays/song_overlay.png" class="music_song_overlay">
                    </div>
                    <div class="song_list_item_right">
                        <a href="artist/${songStats.songid.artistid.name}" class="music_song_name_link">${songStats.songid.artistid.name}</a> - ${songStats.songid.songName}
                        <p class="music_more_information"> ${songStats.listenCount} Plays - ${songStats.fanCount} Listeners</p>

                    </div>
                    </li>

                </ul>
            </c:forEach>

            <c:forEach items="${songTags}" var="songTags">
                <ul class="music_song_list">
                    <li>
                    <div class="song_list_item_left">

                        <img alt=""  class="box_shadow music_song_photo" src="${songTags.songid.albumid.albumAmazonAsin.coverarturl}" >
                    </div>
                    <div class="song_list_item_right">
                        <a href="artist/${songTags.songid.artistid.name}" class="music_song_name_link">${songTags.songid.artistid.name}</a> - ${songTags.songid.songName}
                        <p class="music_more_information"> ${songTags.songid.songStats.listenCount} Plays - ${songTags.songid.songStats.fanCount} Listeners</p>

                    </div>
                    </li>

                </ul>
            </c:forEach>


        </div>
    </div>

</div>
