<%-- 
    Document   : albumAlbumsList
    Created on : 12.Haz.2012, 18:18:35
    Author     : caner
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<div class="sub_pages_content_shape">
   <div class="type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">
        <table class="artist_album_page_table">
            <c:set var="gridNo" value="1" />
            <c:forEach var="album" items="${otherAlbums}">
                <c:if test="${gridNo%2 == 1}">
                    <tr class="artist_album_page_table_row">
                    </c:if>
                    <td class="artist_album_page_table_data">
                        <a href="album/${album.albumName}"><div class="artist_album_position">
                                <!--  <img class="album_down_features " src="static/images/album/cd_case/jewel_case_back_big.png"/>
                                  <img class="album_picture " src="${album.albumAmazonAsin.coverarturl}"/>
                                  <img class="album_front_features " src="static/images/album/cd_case/jewel_case_front_big.png"/></br> -->
                                <img src="static/images/overlays/album_overlay.png" class="artist_album_overlay ">
                                <img class="artist_album_picture  song_overlay_shadow " src="${album.albumAmazonAsin.coverarturl}"/>

                            </div>
                        </a>
                <div class="artist_albums_information">
                    <span class="artist_album_name_link">  <a href="album/${album.albumName}" >${album.albumName}</a></span>
                    <span class="artist_singer_name_link"> <a href="artist/${album.artistid.name}">${album.artistid.name}</a></span>
                    <p class="artist_album_buy">
                        <a  href="#" class="blue_buy_button brief_buttons blue_default_buttons ui-corner-all">
                            <img class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/buy_icon_new.png"/>
                            Buy Album </a>
                    </p>
                    <p class="artist_album_publisher_name"></p>
                    <p class="artist_album_songs_number">${album.albumStats.songCount} songs</p>
                    <p class="artist_album_rel_date">Release Date : ${album.releaseDate}</p>
                </div>
                </td>
                <c:if test="${gridNo%2 != 1}">
                    </tr>
                </c:if>
                <c:set var="gridNo" value="${gridNo + 1}" />
            </c:forEach>
        </table>

    </div>

</div>
