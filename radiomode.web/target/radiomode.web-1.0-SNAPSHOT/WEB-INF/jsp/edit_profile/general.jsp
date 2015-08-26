<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<script type="text/javascript" src="static/js/profile/profile.js"></script>
<html>
    <head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        $(document).ready(function() {            
            var general = new GENERAL();
            //$("input:checkbox, input:radio, input:file").uniform();
            
        });
    </script>
</head>

<c:set var="birthDate" value="${user.birthDate}"></c:set>
<jsp:useBean id="birthDate" class="java.util.Date"></jsp:useBean>
<c:set var="gender" value="${user.gender}" ></c:set>
<jsp:useBean id="gender" class="java.lang.String"></jsp:useBean>
<%

            //TODO burasi degistirilecek
            session.setAttribute("userName", "brokensword");
            String birthDateStr = birthDate.toString();
            int age = 2009 - Integer.parseInt(birthDateStr.substring(0, 4));
            String genderString = "";
            if (gender.equals("M")) {
                genderString = "Male";
            } else if (gender.equals("F")) {
                genderString = "Female";
            } else {
                genderString = "Other";
            }

%>

<body>
<input type="hidden" name="genderHidden" value="${user.gender}" />
<input type="hidden" name="countryCodeHidden" value="${user.country.countryCode}" />
<input type="hidden" name="resultHidden" value="${param.result}" />
<input type="hidden" name="dayHidden" value="${dateModel.day}" />
<input type="hidden" name="monthHidden" value="${dateModel.month}" />
<input type="hidden" name="yearHidden" value="${dateModel.year}" />

<div class="setting_store_box type2_store_box_with_top_menu type2_store_box general_store_box right_box_features ui-corner-all box_shadow">
    <a href="#"><div class="artist_box_header"> Store </div> </a>
</div>
<div class="sub_pages_settings sub_pages_with_top_menu sub_pages_left_content_shape box_shadow ui-corner-all">

    <div id="resultBox" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
        <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
            <span id="resultMessage">${param.resultMessage}</span>
    </div>
    
    <form:form id="editProfileGeneralForm" modelAttribute="user" method="POST" action="edit_profile/general">
        <table class="setting_general">
            <tbody>
                <tr class="setting_general_tr">
                    <td class="setting_general_td_left">
                        <span>
                            Name :
                        </span>
                    </td>
                    <td class="setting_general_td_right">
            <input type="text" name="name" value="${user.name}"/>
            </td>
            </tr>
            <tr class="setting_general_tr">
                <td class="setting_general_td_left">
                    <span > Surname :

                    </span>
                </td>
                <td class="setting_general_td_right">
            <input  type="text" name="surname" value="${user.surname}"/>
            </td>
            </tr>
            <tr class="setting_general_tr">
                <td class="setting_general_td_left">
                    <span>
                        Gender : 
                    </span>
                </td>
                <td class="setting_general_td_right">
            <input type="radio" id="male" name="gender" value="Male"/> Male
            <input type="radio" id="female" name="gender" value="Female"/> Female
            <input type="radio" id="other" name="gender" value="Other"/> Other 
            </td>
            </tr>
            <tr class="setting_general_tr">
                <td class="setting_general_td_left">
                    Country :
                </td>
                <td class="setting_general_td_right">
                    <select class="selector" id="countryCode" name="countryCode" name="countryList">
                        <c:forEach var="country" items="${countryList}">
                            <option value="${country.countryCode}">${country.country}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr class="setting_general_tr">
                <td class="setting_general_td_left">
                    Date of birth :
                </td>
                <td class="setting_general_td_right">

                    <select id="day" name="day">
                        <c:forEach var="i" begin="1" end="31" step="1" >
                            <option value="${i}">${i}</option>
                        </c:forEach>
                    </select>
                    <select id="month" name="month">
                        <c:forEach var="i" begin="1" end="12" step="1" >
                            <option value="${i}">${i}</option>
                        </c:forEach>
                    </select>
                    <select id="year" name="year">
                        <c:set var="count" value="110" />
                        <c:forEach var="i" begin="1900" end="2010" step="1" >
                            <option value="${i + count}">${i + count}</option>
                            <c:set var="count" value="${count-2}" />
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr class="setting_general_tr">
                <td class="setting_general_td_left">
                    Web Page : 
                </td>
                <td class="setting_general_td_right">
            <input  type="text" name="webPage" value="${user.webPage}"/>
            </td>
            </tr>
            <tr class="setting_general_tr">
                <td class="setting_general_td_left">
                    <span class="about_me_text"> About me :</span>
                </td>
                <td class="setting_general_td_right">
                    <textarea class="about_me_text_area" name="aboutMe" cols="45" rows="4">${user.aboutMe}</textarea>

                </td>
            </tr>
            </tbody>
        </table>



        <div id="save_button">
            <input type="submit" name="editButton" value="Save All" />
        </div>
    </form:form>

</div>


</body>
</html>
