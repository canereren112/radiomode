<%-- 
    Document   : artist_similar_artists
    Created on : 23.Ara.2010, 21:28:46
    Author     : EREN
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<link rel="stylesheet" type="text/css" href="static/css/plugins/paging/jquery.paginate.css" />
<script type="text/javascript" src="static/js/plugins/paging/jquery.paginate.js"></script>
<script type="text/javascript" src="static/js/artist/artist_similiar_artists.js"></script>

<div class="sub_pages_content_shape">
    <div class="type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_left_content_shape box_shadow ui-corner-all">
        <p class="sub_page_header">
            Similar Artsts
        </p>
        <div class="similiar_artist_list_container">
            <jsp:include page="list/artistSimiliarArtistList.jsp" />
        </div>
        <span class="similiarArtistPageNumberOfArtist">${similiarArtistPageNumberOfArtist}</span>
        <span class="artistId">${artistId}</span>
        <div class="paging_container">
            <div id="artist_similiar_artist_paging" class="">                   
            </div>
        </div>
    </div>

</div>