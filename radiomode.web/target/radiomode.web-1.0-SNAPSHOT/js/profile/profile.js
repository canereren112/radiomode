/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


var option = {
    x:     0,
    y:      0,
    radius: 6,
    color:  "#cccccc"
}

$(document).ready(function(){
     
    var profileUser = $('#profileUser').val();
    $('.profile_general').click(function(){
        $('#profile_content').load('user/' + profileUser + '/general');
        return false;
    });

    $('.about_me_More').click(function(){
        
        $('#profile_content').load('user/' + profileUser + '/about_me');
        return false;
    });
    $('.profile_music_boxMore,.profile_song_boxMore').click(function(){
        
        $('#profile_content').load('user/' + profileUser + '/songbox/page/1');
        return false;
    });
    $('.profile_artist_boxMore').click(function(){
       
        $('#profile_content').load('user/' + profileUser + '/artistbox/page/1');
        return false;
    });
    $('.profile_album_boxMore').click(function(){
       
        $('#profile_content').load('user/' + profileUser + '/albumbox/page/1');
        return false;
    });
    $('.activity_More').click(function(){
        
        $('#profile_content').load('user/' + profileUser + '/activity/page/1');
        return false;
    });
    var entityid = $('#entityid').val();
    var url = 'comment/all/type/user/entity/' + entityid + '/page/1';
    $('.all_commentsMore').click(function(){
        $('#profile_content').load(url, function() {
            $('#commentsURL').val(url);
        });
        return false;
    });
    $('.profile_friendsMore').click(function(){
      
        $('#profile_content').load('user/' + profileUser + '/friends/page/1');
        return false;
    });
    $('.profile_neighboursMore').click(function(){
              
        $('#profile_content').load('user/' + profileUser + '/neighbours/page/1');
        return false;
    });



    if ($.browser.msie) {
    //        $(".center_artist_box_link").textShadow(option);
    //        $('#profile_brief').boxShadow( 0, 0, 3, "#cccccc");
    //        $('#user_store_box').boxShadow( 0, 0, 3, "#aaaaaa");
      
    }
   

    $("#song_box_result_box").hide();
    $("#artist_box_result_box").hide();
    $("#album_box_result_box").hide();
    $(".box_icons").hide();
    
    $('.profile_songs_grid_0,.profile_songs_grid_1').hover(function() {
        //$(".user_songs_heart_image").hide();
        var name = "#" + $(this).attr("id");
        name = name + " .box_icons";
        $(name).show();
    }, function() {
        var name = "#" + $(this).attr("id");
        name = name + " .box_icons";
        $(name).hide();
    });

    $(".user_songs_play_image").click(function(){
        var song_id = $(this).attr("id");
        var song_name = $(this).attr("name");
        $.getJSON("song/play", {
            songid: song_id
        }, function(json){
            $("#song_box_result_box").show();
            $("#song_box_result_message").html(json.message.description.toString() + song_name);
        });
    });

    $("#addAsFriend").click(function(){
        var loginUser = $("#loginUser").val();
        var profileUser = $("#profileUser").val();
        $.getJSON("friendlist/add", {
            sender: loginUser,
            receiver: profileUser
        }, function(json){           
            var message = json.message.description.toString();
            alert(message);
        });
    });
    calculateBigPageHeight();
    prepareGeneral();
})