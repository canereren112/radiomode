<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<div id="added_artists">
    <div id="selected_artists_header" class="top_header ui-corner-all"> Selected Artists</div>
    <div class="artist_element_div">
        <c:forEach var="artist" items="${sessionScope.addedArtists}">
            &nbsp;&nbsp;&nbsp;&nbsp;
            <img src="static/test/images/caner.jpg" align="middle" class="artist_station_photo"> </img>
            ${artist}
            <div class="like_line"></div> <div class="dislike_line"></div>
        </div>
    </c:forEach>
</div>
<div id="blocked_artists">
    <div id="blocked_artists_header" class="top_header ui-corner-all"> Blocked Artists</div>    
    <div class="artist_element_div">
        <c:forEach var="artist" items="${sessionScope.blockedArtists}">
            &nbsp;&nbsp;&nbsp;&nbsp;
            <img src="static/test/images/caner.jpg" align="middle" class="artist_station_photo"> </img>
            ${artist}
            <div class="like_line"></div> <div class="dislike_line"></div>
        </div>
    </c:forEach>
</div>
<div id="recommended_artists">
    <div id="recommended_artists_header" class="top_header ui-corner-all"> Recommonded Artists</div>
    <div class="artist_element_div">
        <c:forEach var="artist" items="${allArtists}">
            &nbsp;&nbsp;&nbsp;&nbsp;
            <img src="static/test/images/caner.jpg" align="middle" class="artist_station_photo"> </img>
            ${artist.artistid.name}
            <div class="like_line"></div> <div class="dislike_line"></div>
        </c:forEach>
    </div>
</div>
