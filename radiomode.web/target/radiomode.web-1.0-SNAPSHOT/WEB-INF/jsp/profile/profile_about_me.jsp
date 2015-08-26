<%--
    Document   : about_me
    Created on : 06.Ara.2010, 13:22:53
    Author     : EREN
--%>
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
            About Me
        </p>
        <div class="sub_about_me_text">
            ${about_me}
        </div>
        <!--
        <c:if test="${sessionScope.userName == user.userName}">
            <a class="sub_about_me_edit_button" href="edit_profile">
                <img src="static/images/buttons/gray_buttons/gray_button_default.png" class="sub_about_me_button_image">
                <span class="sub_about_me_reply_button_link">Edit</span>
            </a>
        </c:if>
        -->
    </div>

</div>