<%-- 
    Document   : artist_listeners
    Created on : 23.Ara.2010, 23:13:49
    Author     : EREN
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<link rel="stylesheet" type="text/css" href="static/css/plugins/paging/jquery.paginate.css" />
<script type="text/javascript" src="static/js/plugins/paging/jquery.paginate.js"></script>
<script type="text/javascript" src="static/js/artist/artist_listeners.js"></script>

<div class="sub_pages_content_shape">
    <div class="type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_left_content_shape box_shadow ui-corner-all">
        <p class="sub_page_header">
            Listeners
        </p>
        
           <div class="artist_listener_list_container">
               <jsp:include page="list/artistListenerList.jsp" />
            </div>

        <span class="fanPageNumberOfArtist">${fanPageNumberOfArtist}</span>
        <span class="artistId">${artistId}</span>
        
        <div class="paging_container">
            <div id="artist_listeners_paging" class="">                   
            </div>
        </div>
    </div>

</div>