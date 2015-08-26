<%-- 
    Document   : album_activity
    Created on : 01.Oca.2011, 15:14:13
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

    </div>

</div>
