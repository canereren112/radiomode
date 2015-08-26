<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <script>
            $(document).ready(function(){
                var object = new CREATE_STATION();
                object.autocomplete();
            });
        </script>
    </head>
    <c:remove var="addedArtists" scope="session" />
    <c:remove var="blockedArtists" scope="session" />
    <body>
        <div id="create_station_content" class=" ui-corner-all">
            <div id="create_station_header" class="ui-corner-all top_header"> Create New Station</div>
            <div id="left_division" class="ui-corner-all">
                <div id="add_artist_station" >
                    Station Name:
                    <input type="text" id="station"></input> &nbsp;&nbsp;&nbsp;&nbsp;
                    <br>
                    <br>
                    <br>
                    <input type="text" id="artist"></input> &nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="submit" name="" value="Add Artist" id="add_artist"></input>
                    <br>
                    <div id="resultBox" class="ui-state-highlight ui-corner-all" style="padding: 0pt 0.7em; margin-top: 20px;">
                        <p><span class="ui-icon" style="float: left; margin-right: 0.3em;"></span>
                            <span id="resultText"></span>
                    </div>
                    <br>
                    <br>
                    <p id="create_station_button" align="center">
                        <input type="submit" name="" value="Create Station" id="create_station_button"></input> </p>
                </div>
                <div id="help_content">
                    <p>- Help help help </p>
                    <p>- Help help help </p>
                    <p>- Help help help</p>
                    <p>- Help help help</p>
                    <p>- Help help help</p>
                </div>
            </div>
            <div id="middle_division" class="ui-corner-all">

            </div>
            <!--
            <div id="right_division" class="ui-corner-all">
                <div id="right_division_header" class="top_header ui-corner-all">
                    Rate Songs
                </div>
                <div id="rate_songs_list">
                    <ul type="none">
                        <li> Airbag &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Paranoid Android &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Subterranean Homesick Alien &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Exit Music (For a Film) &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Let Down &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Karma Police &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Fitter Happier  &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Electioneering &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Climbing Up the Walls &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> No Surprises &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> Lucky &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>
                        <li> The Tourist &nbsp;&nbsp;&nbsp;&nbsp;
                            <img src="static/test/images/heart.gif" class="large_heart"/>
                            <img src="static/test/images/heart.gif" class="medium_heart"/>
                            <img src="static/test/images/heart.gif" class="small_heart"/>
                        </li>

                    </ul>

                </div>
            </div>
            -->
        </div>
    </body>
</html>
