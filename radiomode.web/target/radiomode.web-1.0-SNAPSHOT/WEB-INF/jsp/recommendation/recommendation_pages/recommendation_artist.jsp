<%-- 
    Document   : recommendation_artist
    Created on : 19.Oca.2011, 02:19:42
    Author     : EREN
--%>


<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript">
    jQuery(document).ready(function() {
        calculateBigPageHeight();
    });
</script>
<div class="sub_pages_content_shape">
    <div class="type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">

        <ul class="music_artist_list">
            <c:forEach var="radioArtist" items="${all}">
                <li>
                <div class="artist_list_item_left">
                    <img alt=""  class="music_poster_features"  src="static/images/artist/poster/artist_poster_5.png">
                    <img alt=""  class="recommendation_photo" src="${radioArtist.artistid.pictureSmall}" >
                </div>
                <div class="recommendation_list_item_right">
                    <a href="artist/${radioArtist.artistid.name}" class="music_artist_name_link">${radioArtist.artistid.name}</a>
                    <p class="music_more_information"> ${radioArtist.artistid.artistStats.listenCount} Plays - ${radioArtist.artistid.artistStats.fanCount} Listeners</p>
                    <p class="music_artist_biography">
                        <c:set var="bio" value="${radioArtist.artistid.biography}" ></c:set>
                        
                        <jsp:useBean id="bio" class="java.lang.String"></jsp:useBean>
                        <%
                                    String shortBio = bio;
                                    if (shortBio.length() > 450) {
                                        shortBio = shortBio.substring(0, 450);
                                    }
                        %>
                        <%=shortBio%>
                    </p>
                    <p class="recommended_buttons">
                        <span class="recommended_buttons_1"> <a id="${radioArtist.artistid.artistid}" href="recommendation" class="new_blue_button brief_buttons blue_default_buttons ui-corner-all love_artist">
                                <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/love_button_new.png"/>
                                Love Artist </a> </span>
                        <span class="recommended_buttons_2">
                            <a id="${radioArtist.artistid.artistid}" href="recommendation"  class="new_blue_button brief_buttons blue_default_buttons ui-corner-all block_artist">
                                <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/love_button_new.png"/>
                                Block Artist </a>
                        </span>
                    </p>
                </div>
                </li>
            </c:forEach>
        </ul>
    </div>

</div>
