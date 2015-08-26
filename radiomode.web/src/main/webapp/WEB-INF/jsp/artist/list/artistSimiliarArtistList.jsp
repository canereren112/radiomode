<%-- 
    Document   : artistSimiliarArtistList
    Created on : 27.Nis.2012, 20:32:31
    Author     : caner
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript" src="static/js/artist/list/artistSimiliarArtistList.js"></script>

<table class="artist_populer_table">
    <c:set var="gridNo" value="1" />
    <c:forEach var="similiar" items="${similiars}">
        <c:choose>
            <c:when test="${similiar.artistid.artistid == artistid}">
                <c:set var="similiarArtist" value="${similiar.similiarArtistid}" />
            </c:when>
            <c:otherwise>
                <c:set var="similiarArtist" value="${similiar.artistid}" />
            </c:otherwise>
        </c:choose>
        <tr class="artist_similar_table_row">
            <c:set var="bio" value="${similiarArtist.biography}" ></c:set>
            <jsp:useBean id="bio" class="java.lang.String"></jsp:useBean>
            <%
                String shortBio = bio;
                if (shortBio.length() > 350) {
                    shortBio = shortBio.substring(0, 350);
                }
            %>
            <td class="artist_similar_table_data">
                <a href="artist/${similiarArtist.name}">
                    <img alt=""  class="artist_similar_photo song_overlay_shadow" src="${similiarArtist.pictureSmall}">
                        <img src="static/images/overlays/person_overlay.png" class=" artist_similar_poster_features">
                            </a>
                            <div class="artist_similar_information_div">
                                <span class="artist_similar_name_link"><a href="artist/${similiarArtist.name}">${similiarArtist.name}</a></span>
                                <p class="music_more_information"> ${similiarArtist.artistStats.listenCount} Plays - ${similiarArtist.artistStats.fanCount} Listeners</p>
                                <c:set var="bio" value="<%=shortBio%>" />
                                <p class="artist_similar_brief">
                                    ${bio}
                                </p>
                            </div>
                            </td>
                            </tr>
                            <c:set var="gridNo" value="${gridNo + 1}" />
                        </c:forEach>


  </table>
