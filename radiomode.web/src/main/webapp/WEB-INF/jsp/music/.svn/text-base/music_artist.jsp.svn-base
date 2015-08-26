<%-- 
    Document   : music_artist
    Created on : 19.Oca.2011, 01:57:05
    Author     : EREN
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript">
    $(document).ready(function() {
        var music_artist = new MUSIC_ARTIST();
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
            <ul class="music_artist_list">

                <c:forEach items="${artistStats}" var="artistStats">
                    <li>
                    <div class="artist_list_item_left">
                        <img src="static/images/overlays/person_overlay.png"  class="music_overlay_features" >
                        <img alt=""  class="music_photo song_overlay_shadow" src="${artistStats.artistid.pictureSmall}" >
                    </div>
                    <div class="artist_list_item_right">
                        <a href="artist/${artistStats.artistid.name}" class="music_artist_name_link">${artistStats.artistid.name}</a>
                        <p class="music_more_information"> ${artistStats.listenCount} Plays - ${artistStats.fanCount} Listeners</p>
                        <p class="music_artist_biography">
                            <c:set var="bio" value="${artistStats.artistid.biography}" ></c:set>
                            <jsp:useBean id="bio" class="java.lang.String"></jsp:useBean>
                            <%
                                        String shortBio = bio;
                                        if (shortBio.length() > 350) {
                                            shortBio = shortBio.substring(0, 350);
                                        }
                            %>
                            <%=shortBio%>
                        </p>

                    </div>
                    </li>
                </c:forEach>

                <c:forEach items="${artistTags}" var="artistTags">
                    <li>
                    <div class="artist_list_item_left">
                        <img alt=""  class="music_poster_features"  src="static/images/artist/poster/artist_poster_5.png">
                        <img alt=""  class="music_photo" src="${artistTags.artistid.pictureSmall}" >
                    </div>
                    <div class="artist_list_item_right">
                        <a href="artist/${artistTags.artistid.name}" class="music_artist_name_link">${artistTags.artistid.name}</a>
                        <p class="music_more_information"> ${artistTags.artistid.artistStats.listenCount} Plays - ${artistTags.artistid.artistStats.fanCount} Listeners</p>
                        <p class="music_artist_biography">
                            <c:set var="bio2" value="${artistTags.artistid.biography}" ></c:set>
                            <jsp:useBean id="bio2" class="java.lang.String"></jsp:useBean>
                            <%
                                        String shortBio2 = bio2;
                                        if (shortBio2.length() > 350) {
                                            shortBio2 = shortBio2.substring(0, 350);
                                        }
                            %>
                            <%=shortBio2%>
                        </p>

                    </div>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>

</div>
