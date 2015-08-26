<%-- 
    Document   : profile_activity
    Created on : 09.Ara.2010, 08:22:04
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
            Activity
        </p>
        <ul class="profile_recent_activity_list">
            <c:forEach var="activity" items="${activities}">
                <li class="profile_recent_activity_list_item">
                    <a class="activity_symbol  ui-state-error-text ui-icon ui-icon-check" href="#"></a>
                    ${activity.activity}
                </li>
            </c:forEach>
        </ul>

        <p class="sub_pages_content_see_more"> <a href="#">See more<img class="see_more_icon" alt="" src="static/images/icons/forward_icon.png"></a></p>
    </div>

</div>