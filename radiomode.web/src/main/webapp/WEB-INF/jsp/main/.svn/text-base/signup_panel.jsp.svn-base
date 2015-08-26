<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<style type="text/css">
    .ui-dialog .ui-state-highlight, .ui-dialog .ui-state-error { padding: .3em;}
</style>

<div id="signup_panel_dialog" title="Join to RadioMode Now!">
    <div   id="signup_panel">
        <div id="signup_div">
            <form id="signupForm" method="post" action="signup2.do">
                <div class="inputs">
                    <label class="label_form" for="userName">User Name        :</label>
                    <input class="text_form required" minLength="6" maxlength="20" name="userName" id="userName" type="text" />
                    <label id="userNameMessage" for="userName"></label>
                </div>
                <div class="inputs">
                    <label class="label_form" for="email">Email            :</label>
                    <input class="text_form email required" maxlength="50" name="email" id="email" type="text" />
                    <label id="emailMessage" for="email"></label>
                </div>
                <div class="inputs">
                    <label class="label_form" for="password"> Password         :</label>
                    <input class="text_form required" minLength="6" maxlength="20" name="password" id="password" type="password" />
                </div>
                <div class="inputs">
                    <label class="label_form" for="password2">Confirm Password :</label>
                    <input class="text_form required" minLength="6" maxlength="20" equalto="#password" name="password2" id="password2" type="password" />
                </div>
                <div class="submit">
                    <input class="ui-button ui-state-default ui-corner-all" name="signupButton" id="signupButton" value="Sign Up" type="submit" />
                </div>
            </form>
            <div>
                Already a member? <a class="link" href="#">Click Here</a>
            </div>
        </div>
        <div id="login_div">
            <form id="loginForm" method="post" action="login">
                <div class="inputs">
                    <label class="label_form" for="username">User Name        :</label>
                    <input class="text_form required" minLength="6" maxlength="20" name="username" id="userName" type="text" />
                    <label id="userNameMessage" for="username"></label>
                </div>
                <div class="inputs">
                    <label class="label_form" for="password"> Password         :</label>
                    <input class="text_form required" minLength="6" maxlength="20" name="password" id="password" type="password" />
                </div>
                <div class="submit">
                    <input class="ui-button ui-state-default ui-corner-all" name="loginButton" id="signupButton" value="Login" type="submit" />
                </div>
            </form>
            <div>
                Not a member? <a class="link" href="#">Click Here</a>
            </div>
        </div>
    </div>
</div
