<%-- 
    Document   : album_listeners
    Created on : 01.Oca.2011, 15:14:04
    Author     : EREN
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<link rel="stylesheet" type="text/css" href="static/css/plugins/paging/jquery.paginate.css" />
<script type="text/javascript" src="static/js/plugins/paging/jquery.paginate.js"></script>
<script type="text/javascript" src="static/js/album/album_listeners.js"></script>

<div class="sub_pages_content_shape">
    <div class="type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_left_content_shape box_shadow ui-corner-all">
        <p class="sub_page_header">
            Listeners
        </p>
           <div class="album_listener_list_container">
               <jsp:include page="list/albumListenerList.jsp" />
            </div>

        <span class="fanPageNumberOfAlbum">${fanPageNumberOfAlbum}</span>
        <span class="listenerAlbumID">${albumID}</span>
        
        <div class="paging_container">
            <div id="album_listeners_paging" class="">                   
            </div>
        </div>

    </div>

</div>
