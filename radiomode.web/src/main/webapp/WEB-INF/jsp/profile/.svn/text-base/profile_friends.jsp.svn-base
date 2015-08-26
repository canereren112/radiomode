<%-- 
    Document   : profile_friends
    Created on : 07.Ara.2010, 11:04:13
    Author     : EREN
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
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
            Friends
        </p>
        <div class="profile_friends_sub_content">
            <ul class="profile_friend_list">
                <c:forEach var="friendList" items="${friendLists}">
                    <c:choose>
                        <c:when test="${friendList.receiverid.userName == user.userName}">
                            <c:set var="friend" value="${friendList.senderid}" />
                        </c:when>
                        <c:otherwise>
                            <c:set var="friend" value="${friendList.receiverid}" />
                        </c:otherwise>
                    </c:choose>
                    <c:set var="birthDate" value="${friend.birthDate}"></c:set>
                    <jsp:useBean id="birthDate" class="java.util.Date"></jsp:useBean>
                    <c:set var="gender" value="${friend.gender}" ></c:set>
                    <jsp:useBean id="gender" class="java.lang.String"></jsp:useBean>

                    <%
                                //TODO burasi degistirilecek
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime(birthDate);
                                int birthYear = calendar.get(Calendar.YEAR);
                                calendar.setTime(new java.util.Date());
                                int age = calendar.get(Calendar.YEAR) - birthYear;
                                String genderString = "";
                                if (gender.equals("M")) {
                                    genderString = "Male";
                                } else {
                                    genderString = "Female";
                                }
                    %>
                    <li class="profile_friend_list_item">
                        <a class="profile_friend_whole_link ui-corner-all" href="#">
                            <div class="profile_friend_list_container"><a href="#" class="profile_friend_photo_link">
                                    <img src="static/images/song/profile_outline.png" class="profile_general_photo_outline">
                                    <img src="${friend.userPictures.locationSmall}" class="profile_profile_photo"/>
                                </a>
                                <span class="profile_profile_nickname"><a href="user/${friend.userName}">
                                        ${friend.userName}
                                    </a></span>
                                <span class="profile_profile_age_gender"> <%=age%>, <%=genderString%></span>
                                <span class="profile_profile_location">${friend.locationCity.city}, ${friend.locationCity.countryCode.country}</span>
                            </div>
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>
    
</div>