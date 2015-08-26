<%-- 
    Document   : album_more_information
    Created on : 01.Oca.2011, 14:59:46
    Author     : EREN
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript">
    jQuery(document).ready(function() {
        calculateBigPageHeight();
    });
</script>
<div class="sub_pages_content_shape">
    <div class="type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
        <a href="#"><div class="artist_box_header"> Store </div> </a>
    </div>
    <div  class="sub_pages_left_content_shape box_shadow ui-corner-all">
        <p class="sub_page_header">
            More information
        </p>
        <table class="album_more_information_table">
            <tr>

                <td> <span  class="album_more_information_header">Release Date</span></td>
                <td><span  class="album_more_information_header">: </span>
                    17 January 1986</td>

            </tr>
            <tr>

                <td> <span  class="album_more_information_header">Publisher</span></td>
                <td><span  class="album_more_information_header">: </span>
                    Sony Music Entratainment</td>

            </tr>
            <tr>
                <td>
                    <span  class="album_more_information_header">Song Number</span> </td>
                <td><span  class="album_more_information_header">: </span>
                    234
                </td>

            </tr>
        </table>
    </div>

</div>
