<%-- 
    Document   : artistListenerList
    Created on : 11.Haz.2012, 15:03:37
    Author     : caner
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
 
<html>
    <head>
    <script type="text/javascript" src="static/js/artist/list/artistListenersList.js"></script>
</head>

<body>


    <table class="artist_listener_table">
        <c:set var="gridNo" value="1" />
        <c:forEach var="artistFan" items="${artistFans}">
            <c:set var="birthDate" value="${artistFan.userid.birthDate}"></c:set>
            <jsp:useBean id="birthDate" class="java.util.Date"></jsp:useBean>
            <c:set var="gender" value="${artistFan.userid.gender}" ></c:set>
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


            <c:if test="${gridNo%3 == 1}">
                <tr class="artist_listener_table_row">
                </c:if>

                <td class="artist_listener_table_data">
                    <a href="user/${artistFan.userid.userName}" class="artist_friend_photo_link">
                        <img alt=""  src="static/images/user/small/1/brokensword.bmp" class="artist_profile_photo"/>
                    </a>
            <div class="artist_listener_right_inf">
                <a href="user/${artistFan.userid.userName}" class="artist_profile_nickname">${artistFan.userid.userName}</a>
                <!--<span class="artist_profile_listens">125 Listened</span>-->
                <span class="artist_profile_age_gender"><%=age%>, <%=genderString%></span>
                <span class="artist_profile_location">${artistFan.userid.locationCity.city}, ${artistFan.userid.locationCity.countryCode.country}</span>
            </div>
        </td>
        <c:if test="${gridNo%3 == 0}">
        </tr>
    </c:if>
    <c:set var="gridNo" value="${gridNo + 1}" />
</c:forEach>

</table>
</body>
</html>