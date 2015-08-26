<%-- 
    Document   : music_album
    Created on : 19.Oca.2011, 01:57:30
    Author     : EREN
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript">
    $(document).ready(function() {
        var music_album = new MUSIC_ALBUM();
        calculateSmallPageHeight();
    });
</script>
<div class="sub_pages_content_shape sub_pages_content_shape_no_left_menu">
    <div class="type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="<li>"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_without_left_menu  sub_pages_left_content_shape box_shadow ui-corner-all sub_pages_with_top_menu">
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
            <c:forEach items="${albumStats}" var="albumStats">
                <ul class="music_album_list">
                    <li>
                    <div class="album_list_item_left">
                        <img class="music_album_picture song_overlay_shadow" src="${albumStats.albumid.albumAmazonAsin.coverarturl}"/>
                        <img src="static/images/overlays/album_overlay.png" class="music_album_overlay ">
                    </div>
                    <div class="album_list_item_right">
                        <a href="album/${albumStats.albumid.albumName}" class="music_album_name_link">${albumStats.albumid.albumName}</a>
                        <span class="music_album_artist_name"><a href="artist/${albumStats.albumid.artistid.name}">${albumStats.albumid.artistid.name}</a></span>
                        <p class="music_more_information">${albumStats.listenCount} Plays - ${albumStats.fanCount} Listeners</p>
                        <p class="music_more_information">${albumStats.songCount} Songs</p>
                        <p class="music_more_information">Release Date: ${albumStats.albumid.releaseDate}</p>
                    </div>
                    </li>
                </c:forEach>
            </ul>
            <c:forEach items="${albumTags}" var="albumTags">
                <ul class="music_album_list">
                    <li>
                    <div class="album_list_item_left">
                        <div class="artist_album_position album_jewel_case header_shadow">
                            <img class="album_down_features " src="static/images/album/cd_case/jewel_case_back_big.png"/>
                            <img class="album_picture " src="${albumTags.albumid.albumAmazonAsin.coverarturl}"/>
                            <img class="album_front_features " src="static/images/album/cd_case/jewel_case_front_big.png"/></br>
                        </div>

                    </div>
                    <div class="album_list_item_right">
                        <a href="${albumTags.albumid.albumName}" class="music_album_name_link">${albumTags.albumid.albumName}</a>
                        <span class="music_album_artist_name"><a href="${albumTags.albumid.artistid.name}" >${albumTags.albumid.artistid.name}</a></span>
                        <p class="music_more_information">${albumTags.albumid.albumStats.listenCount} Plays - ${albumTags.albumid.albumStats.fanCount} Listeners</p>
                        <p class="music_more_information">${albumTags.albumid.albumStats.songCount} Songs</p>
                        <p class="music_more_information">Release Date: ${albumTags.albumid.releaseDate}</p>
                    </div>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>

</div>
