<%-- 
    Document   : test
    Created on : 08-Jan-2010, 08:37:01
    Author     : work
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="static/js/jquery-1.3.2.min.js" ></script>
        <script type="text/javascript" src="static/js/swfobject.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                loadPlayer();
            });
            /*
             * Chromeless player has no controls.
             */

            // Update a particular HTML element with a new value
            function updateHTML(elmId, value) {
                document.getElementById(elmId).innerHTML = value;
            }

            // This function is called when an error is thrown by the player
            function onPlayerError(errorCode) {
                alert("An error occured of type:" + errorCode);
            }

            // This function is called when the player changes state
            function onPlayerStateChange(newState) {
                updateHTML("playerState", newState);
            }

            // Display information about the current state of the player
            function updatePlayerInfo() {
                // Also check that at least one function exists since when IE unloads the
                // page, it will destroy the SWF before clearing the interval.
                if(ytplayer && ytplayer.getDuration) {
                    updateHTML("videoDuration", ytplayer.getDuration());
                    updateHTML("videoCurrentTime", ytplayer.getCurrentTime());
                    updateHTML("bytesTotal", ytplayer.getVideoBytesTotal());
                    updateHTML("startBytes", ytplayer.getVideoStartBytes());
                    updateHTML("bytesLoaded", ytplayer.getVideoBytesLoaded());
                    updateHTML("volume", ytplayer.getVolume());
                }
            }

            // Allow the user to set the volume from 0-100
            function setVideoVolume() {
                var volume = parseInt(document.getElementById("volumeSetting").value);
                if(isNaN(volume) || volume < 0 || volume > 100) {
                    alert("Please enter a valid volume between 0 and 100.");
                }
                else if(ytplayer){
                    ytplayer.setVolume(volume);
                }
            }

            function playVideo() {
                if (ytplayer) {
                    ytplayer.playVideo();
                }
            }

            function pauseVideo() {
                if (ytplayer) {
                    ytplayer.pauseVideo();
                }
            }

            function muteVideo() {
                if(ytplayer) {
                    ytplayer.mute();
                }
            }

            function unMuteVideo() {
                if(ytplayer) {
                    ytplayer.unMute();
                }
            }


            // This function is automatically called by the player once it loads
            function onYouTubePlayerReady() {
                ytplayer = document.getElementById("ytPlayer");
                // This causes the updatePlayerInfo function to be called every 250ms to
                // get fresh data from the player
                //setInterval(updatePlayerInfo, 250);
                //updatePlayerInfo();
                ytplayer.addEventListener("onStateChange", "onPlayerStateChange");
                ytplayer.addEventListener("onError", "onPlayerError");
                //Load an initial video into the player
                ytplayer.cueVideoById("O5I3RPbS8aI");
            }

            // The "main method" of this sample. Called when someone clicks "Run".
            function loadPlayer() {
                // Lets Flash from another domain call JavaScript
                var params = { allowScriptAccess: "always" };
                // The element id of the Flash embed
                var atts = { id: "ytPlayer" };
                // All of the magic handled by SWFObject (http://code.google.com/p/swfobject/)
                swfobject.embedSWF("http://www.youtube.com/apiplayer?" +
                    "&enablejsapi=1&version=3",
                "videoDiv", "480", "295", "8", null, null, params, atts);
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div id="videoDiv" class="ui-corner-all">
            Loading ...
        </div>
    </body>
</html>
