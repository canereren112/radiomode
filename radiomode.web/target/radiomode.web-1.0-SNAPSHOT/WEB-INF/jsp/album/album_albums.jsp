<%-- 
    Document   : albums
    Created on : 01.Oca.2011, 17:41:00
    Author     : EREN
--%>

<script type="text/javascript" src="static/js/album/album_albums.js"></script>

<div class="main_sub_menu_list list_shadow">
    <a id="albums_other_albums" class="main_sub_menu_first_item main_sub_menu_link " href="#">
        <span class="sub_menu_link_name"> Other Albums </span>
    </a>
    <a id="albums_similar_albums" class="main_sub_menu_link" href="#">
        <span class="sub_menu_link_name">   Similar Albums </span> 
    </a>

</div>
<span class="album_albums_other_hidden_span"> 
</span>
<span class="album_albums_similar_hidden_span"> 
</span>
<div class="album_albums_list_container">
    <jsp:include page="Albums/album_other_albums.jsp" />
</div>
