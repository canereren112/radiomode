<%-- 
    Document   : artist_more_information
    Created on : 23.Ara.2010, 23:12:47
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
        <table class="artist_more_information_table">
            <tr>

                <td> <span  class="artist_more_information_header">Group members</span></td>
                <td><span  class="artist_more_information_header">: </span>
                    Chester Bennington, Brad Delson, Rob Bourdon, Joe Hahn, Dave Farrell</td>

            </tr>
            <tr>

                <td> <span  class="artist_more_information_header">Active Years</span></td>
                <td><span  class="artist_more_information_header">: </span>
                    1996 - Present</td>

            </tr>
            <tr>
                <td>
                    <span  class="artist_more_information_header">Links</span> </td>
                <td><span  class="artist_more_information_header">: </span>
                    <a href="#" class="artist_more_information_links_url">www.linkinpark.com</a>,&nbsp;&nbsp;&nbsp;
                    <a href="#" class="artist_more_information_links_url">http://tr.wikipedia.org/wiki/Linkin_Park</a></td>

            </tr>
        </table>
    </div>

</div>
