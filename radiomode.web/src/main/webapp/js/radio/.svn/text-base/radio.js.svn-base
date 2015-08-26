$(document).ready(function(){    
    $('#radio_content').load('radio/DEFAULT/play?lastVideoID=&id=5', function(){
        //var player =  new YoutubePlayer();
        loadPlayer();
        var playStation = new PLAY_STATION();
    });

    $('#playLink').click(function(){
        $('#radio_content').load('radio/DEFAULT/play?lastVideoID=&id=5', function(){
            //var player =  new YoutubePlayer();
            loadPlayer();
            var playStation = new PLAY_STATION();
        });
    });
    calculateSmallPageHeight();
    prepareGeneral();
});

function PLAY_STATION() {
    $('#createStationLink').click(function(){
        $('#radio_content').load('radio/new');
        return false;
    });
    
    $('#editStation').click(function(){
        $('#radio_content').load('radio/new');
    });

    $("ul#toolbar_list li").hover(
        function(){
            $(this).addClass("ui-state-hover");
        },
        function(){
            $(this).removeClass("ui-state-hover");
        }).mousedown(
        function(){
            $(this).addClass("ui-state-active");
        }).mouseup(
        function(){
            $(this).removeClass("ui-state-active");
        });

    $("#play_button a").click(function() {
        //if($(this).attr("class") =='pause_button progress' || $(this).attr("class") =='pause_button') {
        if($(this).hasClass("pause_button")) {
            //if($(this).attr("name") == 'playLinkHover') {
            //$("#play_button a").removeClass("play").addClass("pause").html("<img src=\"static/images/buttons/Pause-Button-(Gray).png\" />");
            $("a[name='playLinkDefault']").hide();
            $("a[name='pauseLinkDefault']").hide();
            $("a[name$='pauseLinkHover']").hide();
            $("a[name='playLinkHover']").show();
            pauseVideo();
        } else {
            //$("#play_button a").removeClass("pause").addClass("play").html("<img src=\"static/images/buttons/Play-Button-(Gray).png\" />");
            $("a[name='playLinkDefault']").hide();
            $("a[name='pauseLinkDefault']").hide();
            $("a[name$='pauseLinkHover']").show();
            $("a[name='playLinkHover']").hide();
            playVideo();
        }
        $(this).addClass("clicked");
    });

    $("#next_button a").click(function() {
        //var val = "aa";
        var val = $("#nextVideoID").val() + "&id=" + $("#id").val();
        var param = '?lastVideoID=' + val;
        var url = 'radio/' + $("#radioid").val() + '/play';
        $('#radio_content').load(url + param, function(){
            loadPlayer();
            var play = new PLAY_STATION();
        });
    });

    $(".radio_list_link").click(function() {
        //var val = "aa";
        var val = $("#nextVideoID").val() + "&id=" + $("#id").val();
        var param = '?lastVideoID=' + val;
        var url = 'radio/' + $(this).attr("id") + '/play';
        $('#radio_content').load(url + param, function(){
            loadPlayer();
            var play = new PLAY_STATION();
        });
    });

    $("#block_button a").click(function() {
        //var val = "aa";
        var val = $("#nextVideoID").val() + "&id=" + $("#id").val();
        var param = '?lastVideoID=' + val;
        var url = 'radio/' + $("#radioid").val() + '/play';
        //TODO burda servera gidip song block listesine eklenecek
        $('#radio_content').load(url + param, function(){
            loadPlayer();
            var play = new PLAY_STATION();
        });
    });

    //    $("#next_button a").hover(function() {
    //        $("#next_button a").html("<img src=\"static/images/buttons/Forward-Button-(Blue).png\"></img>");
    //    }, function() {
    //        $("#next_button a").html("<img src=\"static/images/buttons/Forward-Button-(Gray).png\"></img>");
    //    });

    $("a[name$='Hover']").hide();
    $("a[name='playLinkDefault']").hide();

    //TODO burasi tekrar acilacak
    //    $("a[name$='Default']").hover(function() {
    //        if(!$(this).hasClass("progress")) {
    //            $(this).next().addClass("progress");
    //            $(this).hide();
    //            $(this).next().show();
    //        }
    //    //        if($(this).attr("class") == 'pause_button')
    //    //            $(this).children("img").attr("src", "static/images/buttons/player_buttons/play.png");
    //    //        else
    //    //            $(this).children("img").attr("src", "static/images/buttons/player_buttons/pause.png");
    //    }, function() {
    //        $(this).hide();
    //        $(this).next().show();
    //        //        if($(this).attr("class") == 'pause_button')
    //        //            $(this).children("img").attr("src", "static/images/buttons/player_buttons/play.png");
    //        //        else
    //        //            $(this).children("img").attr("src", "static/images/buttons/player_buttons/pause.png");
    //        $(this).removeClass("progress");
    //    });

    //    $("a[name$='Hover']").hover(function() {
    //        if(!$(this).hasClass("progress")) {
    //            $(this).next().addClass("progress");
    //            $(this).hide();
    //            $(this).prev().show();
    //        }
    //    }, function() {
    //        if(!$(this).hasClass("clicked")) {
    //            $(this).hide();
    //            $(this).prev().show();
    //            $(this).removeClass("progress");
    //        } else {
    //            $(this).removeClass("clicked");
    //        }
    //    });

    $("#likeLinkDefault").click(function(){
        //alert(message + artistName);
        alert('You loved this song');
        songid = $("#songid").val();
        $.getJSON("song/love", {
            songid: songid
        }, function(json){
            message = json.message.description.toString();
        });
    });
}


// create_station scriptleri

/**
* create_station.jsp sinifi
* Comment
*/
function CREATE_STATION() {

    this.checkArtist = function(json) {
        var artistName =  $("#artist").val();
        var desc = new String(json.message.description.toString());
        desc = desc.replace("?", artistName);
        if(json.message.code.toString() == "warning.artistNameAlreadySelected") {
            $('#resultText').html(desc);
            $('span.ui-icon').addClass("ui-icon-alert");
            $('#resultBox').addClass("ui-state-error").show();
        } else if(json.message.code.toString() == "warning.artistNameNotFound") {
            $('#resultText').html(desc);
            $('span.ui-icon').addClass("ui-icon-alert");
            $('#resultBox').addClass("ui-state-error").show();
        } else {
            $('#resultBox').hide();
            $('#resultText').html("");
            var url = "radio/add_artist.do?artist="+artistName+
            "&artistid="+json.message.name.toString();
            url = encodeURI(url);
            $("#middle_division").load(url);
        }
        $("#artist").val("");
    }

    $('#resultBox').hide();

    this.autocomplete = function() {
        $("#artist").autocomplete("autocomplete_artists.do", {
            max: 10
        });

        $("#artist").result(function(event, data, formatted){
            var object = new CREATE_STATION();
            var artistName = $("#artist").val();
            $.getJSON("radio/check_artist.do", {
                artist: artistName
            }, object.checkArtist);
        });
    }
}