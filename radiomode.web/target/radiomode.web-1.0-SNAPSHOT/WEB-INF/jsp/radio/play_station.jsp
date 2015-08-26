<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>

<c:remove var="listenHistory" scope="session" />
<input id="nextVideoID" type="hidden" value="${nextVideoID}" />
<input id="radioid" type="hidden" value="${radioid}" />
<input id="id" type="hidden" value="${id}" />
<input id="songid" type="hidden" value="${songid}" />

<div id="default_stations_content" class="ui-corner-all">
    <!--
    <div id="default_stations_header" class="ui-corner-all top_header">
        Rock.fm
    </div>
    -->
    <div class="radio_left_content">
        <div id="video_container" class="box_shadow corner_radius_8px">
            <div id="video_header" class="ui-corner-all">
                <a href="artist/${artist}" id="artistName">${artist}</a>
                -
                <span id="songName">${song}</span>
            </div>
            <div id="video_box" class="ui-corner-all">

            </div>
            <!--
            <div class="radio_play_create_station">
                <p class="create_station_radio_information"><span class="create_station_radio_name">Station Name : </span>
                <input class="create_station_radio_name_field" value="AlternativeRock.fm"></input>
                </p>
                <div class="create_station_left_content">
                    <p class="create_station_add_singer_button">
                    <input class="create_station_will_add_singer">

                    </input>
                    <span class="create_station_add_singer_button">
                        Add Artist
                    </span>
                    </p>
                    <p class="create_station_other_singers">
                        <select class="create_station_other_singers_drop">
                            <option class="other_singers_grid_1">Placebo</option>
                            <option class="other_singers_grid_2">Linkinpark</option>
                            <option class="other_singers_grid_1">Placebo</option>
                            <option class="other_singers_grid_2">Linkinpark</option>
                            <option class="other_singers_grid_1">Placebo</option>
                            <option class="other_singers_grid_2">Linkinpark</option>
                            <option class="other_singers_grid_1">Placebo</option>
                            <option class="other_singers_grid_2">Linkinpark</option>

                        </select>

                    </p>

                </div>
                <div class="create_station_right_content">
                <ul class="create_station_added_singers_list">
                    <li class="create_station_added_singers_list_item create_station_added_singers_list_item_1">
                    <img alt=""  class="artist_added_photo" src="static/test/images/artist/radiohead.jpg">
                    <span class="artist_added_name"> Linkinpark </span>
                    </li>
                       <li class="create_station_added_singers_list_item">
                    <img alt=""  class="artist_added_photo" src="static/test/images/artist/radiohead.jpg">
                    <span class="artist_added_name"> Linkinpark </span>
                    </li>
                       <li class="create_station_added_singers_list_item">
                    <img alt=""  class="artist_added_photo" src="static/test/images/artist/radiohead.jpg">
                    <span class="artist_added_name"> Linkinpark </span>
                    </li>
                       <li class="create_station_added_singers_list_item">
                    <img alt=""  class="artist_added_photo" src="static/test/images/artist/radiohead.jpg">
                    <span class="artist_added_name"> Linkinpark </span>
                    </li>
                       <li class="create_station_added_singers_list_item">
                    <img alt=""  class="artist_added_photo" src="static/test/images/artist/radiohead.jpg">
                    <span class="artist_added_name"> Linkinpark </span>
                    </li>
                </ul>
                <p class="singers_you_may_like">
                    This station will play artists like&nbsp;
                    <span class="singer_may_like_span">Placebo,&nbsp;</span>
                    <span class="singer_may_like_span">Radiohead,&nbsp;</span>
                    <span class="singer_may_like_span">Linkinpark,&nbsp;</span>
                    <span class="singer_may_like_span">John Lennon,&nbsp;</span>
                    and&nbsp;
                    <span class="singer_may_like_span">Shakira</span>
                </p>
                </div>

            </div>
            -->


            <div id="video_button" class="ui-corner-all">
                <ul id="button_list">
                    <li id="play_button">
                        <a class="pause_button player_button" name="pauseLinkDefault" href="${pageContext.request.contextPath}/radio#" > <img class="mode_player_large_buttons" src="static/images/buttons/player_buttons/pause.png"/></a>
                        <a class="pause_button player_button" name="pauseLinkHover" href="${pageContext.request.contextPath}/radio#" > <img class="mode_player_large_buttons" src="static/images/buttons/player_buttons/pause.png"/></a>
                        <a class="play_button player_button" name="playLinkDefault" href="${pageContext.request.contextPath}/radio#" ><img  class="mode_player_large_buttons" src="static/images/buttons/player_buttons/play.png"/></a>
                        <a class="play_button player_button" name="playLinkHover" href="${pageContext.request.contextPath}/radio#" > <img class="mode_player_large_buttons" src="static/images/buttons/player_buttons/play.png"/></a>
                    </li>

                    <li id="next_button">
                        <a class="player_button" href="${pageContext.request.contextPath}/radio#" name="nextLinkDefault"><img class="mode_player_large_buttons" src="static/images/buttons/player_buttons/skip.png"/></a>
                        <a  class="player_button" href="${pageContext.request.contextPath}/radio#" name="nextLinkHover"> <img class="mode_player_large_buttons" src="static/images/buttons/player_buttons/volume.png"/></a>
                    </li>
                    <li id="volume_button">
                        <a  class="player_button"  href="${pageContext.request.contextPath}/radio#" name="volumeLinkDefault"><img class="mode_player_large_buttons" src="static/images/buttons/player_buttons/volume.png"/></a>
                        <a  class="player_button" href="${pageContext.request.contextPath}/radio#" name="volumeLinkHover"> <img class="mode_player_large_buttons" src="static/images/buttons/player_buttons/volume.png"/></a>
                    </li>
                    <li id="block_button">
                        <a  class="player_button" title="Block this song" name="blockLinkDefault" href="${pageContext.request.contextPath}/radio#"><img class="block_button_image mode_player_like_heart_buttons"  src="static/images/buttons/player_buttons/block.png"/></a>

                    </li>

                    <li id="like_button">
                        <a title="Love this song" id="likeLinkDefault" name="likeLinkDefault" href="${pageContext.request.contextPath}/radio#"><img class="mode_player_like_heart_buttons" src="static/images/buttons/player_buttons/heart.png"/></a>

                    </li>

                    <li id="more_button">

                    </li>
                </ul>
            </div>
            <div id="song_options">
                <ul id="options_list">

                </ul>
            </div>
        </div>
        <div id="artist_album_song_container" class="ui-corner-all box_shadow">
            
            <div id="radio_photo_slide">
                <!--
                Duration:<span id="videoDuration"></span>
                Current Time:<span id="videoCurrentTime"></span>
                Bytes Total:<span id="bytesTotal"></span>
                Start Bytes:<span id="startBytes"></span> 
                Bytes Loeaded:<span id="bytesLoaded"></span>
                Volume:<span id="volume"></span>
                -->
            </div>
            
            <div class="radio_triple_content_features"></div>
            <div class="radio_triple_content_features"></div>
            <div class="radio_triple_content_features"></div>
        </div>
    </div>
    <div class="radio_right_content">
        <!--TODO: Burasi tekrar acilacak
        <p><a id="createStationLink" href="#" class="brief_buttons blue_default_buttons ui-corner-all">
                <img id="createStation" class="blue_button_icon" alt="" src="static/images/icons/blue_buttons/add_icon_new.png"/>
                Create Artist Radio</a></p>
        -->
        <div id="my_stations" class="radio_right_box_features box_shadow ui-corner-all">
            <a href="#">  <div id="my_stations_header" class="artist_box_header header_shadow">My Stations</div> </a>
            <div  class="play_radio_box_menu box_submenu">
                <ul>
                    <li> <a class=" radio_box_menu_link_1 center_box_submenu_link_1" href="#">Recent Played</a></li>
                    <li> <a class="center_box_submenu_link" href="#">Popular Stations</a></li>

                </ul>
            </div>
            <ul class="radio_fm_list">

                <c:forEach var="radioUser" items="${radioUsers}">
                    <li class="radio_list_grid_1">
                        <a class="radio_list_link" id="${radioUser.radioid.radioid}" href="${pageContext.request.contextPath}/radio#">
                            <c:choose>
                                <c:when test="${radioid ==radioUser.radioid.radioid}">
                                    <b>${radioUser.radioid.name}</b>
                                </c:when>
                                <c:otherwise>
                                    ${radioUser.radioid.name}
                                </c:otherwise>
                            </c:choose>
                        </a>
                    </li>
                </c:forEach>

            </ul>

            <p class="radio_see_more_right_box see_more">
                <a href="#">See all<img src="static/images/icons/forward_icon.png" alt="" class="see_more_icon"></a>
            </p>

        </div>




        <div id="play_default_stations" class="radio_right_box_features box_shadow ui-corner-all">
            <a href="#"> <div  class=" artist_box_header header_shadow">Default Stations</div></a>
            <ul class="radio_fm_list">
                <li class="radio_list_grid_1">
                    <a class="radio_list_link" href="#">brokensword.fm</a>
                </li>
                <!--
                <li class="radio_list_grid_2" >
                    <a class="radio_list_link" href="#">neighbours.fm</a>
                </li
                -->
            </ul>

            <p class="radio_see_more_right_box see_more">
                <a href="#">See all<img src="static/images/icons/forward_icon.png" alt="" class="see_more_icon"></a>
            </p>
        </div>
        <!--
        <div id="play_recommended_stations" class="radio_right_box_features box_shadow ui-corner-all">
            <a href="#"> <div class=" artist_box_header header_shadow">Recommended Stations</div> </a>
            <div  class="play_radio_box_menu box_submenu">
                <ul>
                    <li> <a class=" radio_box_menu_link_1 center_box_submenu_link_1" href="#">Artist</a></li>
                    <li> <a class="center_box_submenu_link" href="#">Genre</a></li>

                </ul>
            </div>
            <ul class="radio_fm_list">
                <li class="radio_list_grid_1">
                    <a class="radio_list_link" href="#">Create placebo radio</a>
                </li>
                <li class="radio_list_grid_2" >
                    <a class="radio_list_link" href="#">Create alternative rock</a>
                </li
            </ul>
        </div>
        -->
        <div class="radio_right_box_features box_shadow ui-corner-all" id="radio_store_box">
            <a href="#"><div id="artist_store_box_header" class="artist_box_header"> Store </div> </a>
        </div>
    </div>
</div>



<!--
 <ul id="button_list">
                    <li id="play_button">
                        <a name="pauseLinkDefault" href="#" class="play"> <img src="static/images/buttons/player_buttons/pausePause-Button-(Gray).png"></img></a>
                        <a name="pauseLinkHover" href="#" class="play"> <img src="static/images/buttons/Pause-Button-(Blue).png"></img></a>
                        <a name="playLinkDefault" href="#" class="play"> <img src="static/images/buttons/Play-Button-(Gray).png"></img></a>
                        <a name="playLinkHover" href="#" class="play"> <img src="static/images/buttons/Play-Button-(Blue).png"></img></a>
                    </li>
                    <li id="stop_button">
                        <a name="stopLinkDefault" href="#"> <img src="static/images/buttons/Stop-Button-(Gray).png">  </img></a>
                        <a name="stopLinkHover" href="#"> <img src="static/images/buttons/Stop-Button-(Blue).png">  </img></a>
                    </li>
                    <li id="next_button">
                        <a href="#" name="nextLinkDefault"> <img src="static/images/buttons/Forward-Button-(Gray).png"></img></a>
                        <a href="#" name="nextLinkHover"> <img src="static/images/buttons/Forward-Button-(Blue).png"></img></a>
                    </li>
                    <li id="like_button">
                        <a name="likeLinkDefault" href="#"><img src="static/images/buttons/Heart-Button-(Dark-Red).png"></img></a>
                        <a name="likeLinkHover" href="#"><img src="static/images/buttons/Heart-Button-(Light-Red).png"></img></a>
                    </li>
                    <li id="block_button">
                        <a name="blockLinkDefault" href="#"><img src="static/images/buttons/Block-Button-(Dark-Red).png"></img></a>
                        <a name="blockLinkHover" href="#"><img src="static/images/buttons/Block-Button-(Light-Red).png"></img></a>
                    </li>
                    <li id="more_button">

                    </li>
                </ul>
-->