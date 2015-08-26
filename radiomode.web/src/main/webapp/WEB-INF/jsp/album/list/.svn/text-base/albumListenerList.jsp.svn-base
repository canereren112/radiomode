<%-- 
    Document   : albumListenerList
    Created on : 07.Tem.2012, 02:45:02
    Author     : caner
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript" src="static/js/album/list/albumListenersList.js"></script>

 <table class="artist_listener_table">
            <c:set var="gridNo" value="1" />
            <c:forEach var="albumFan" items="${albumFans}">
                <c:set var="birthDate" value="${albumFan.userid.birthDate}"></c:set>
                <jsp:useBean id="birthDate" class="java.util.Date"></jsp:useBean>
                <c:set var="gender" value="${albumFan.userid.gender}" ></c:set>
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
                        <a href="#" class="artist_friend_photo_link">
                            <img alt=""  src="static/images/user/small/1/brokensword.bmp" class="artist_profile_photo"/>
                        </a>
                <div class="artist_listener_right_inf">
                    <a href="user/${albumFan.userid.userName}" class="artist_profile_nickname">${albumFan.userid.userName}</a>
                    <!--<span class="artist_profile_listens">125 Listened</span>-->
                    <span class="artist_profile_age_gender"><%=age%>, <%=genderString%></span>
                    <span class="artist_profile_location">${albumFan.userid.locationCity.city}, ${albumFan.userid.locationCity.countryCode.country}</span>
                </div>
                </td>
                <c:if test="${gridNo%3 == 0}">
                    </tr>
                </c:if>
                <c:set var="gridNo" value="${gridNo + 1}" />
            </c:forEach>


        </table>