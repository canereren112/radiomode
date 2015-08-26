$(document).ready(function(){
    //$('#artist_content').load('artist/general');
    albumid =  $("#entityid").val();
    albumName = $("#albumName").val();
    albumName = albumName.replace(" ", "_");
    albumName = albumName.replace(" ", "_");
    albumName = albumName.replace(" ", "_");
    albumName = albumName.replace(" ", "_");
    //    albumName = albumName.replace("\u0131", "i");
    //    albumName = albumName.replace("\u015f", "s");
    //    albumName = albumName.replace("ö", "o");
    //    albumName = albumName.replace("ü", "u");
    //    albumName = albumName.replace("ç", "c");
    //    albumName = albumName.repl\u011fce("\u011f", "g");
    $('.profileMore').click(function(){
        $('#album_content').load('album/'+albumName+'/general');
        return false;
    });
    $('.moreInfoMore').click(function(){
        $('#album_content').load('album/'+albumName+'/more_info');
        return false;
    });
    $('.albumsMore').click(function(){
        $('#album_content').load('album/'+albumName+'/albums');
        return false;
    });
    $('.listenersMore').click(function(){
        $('#album_content').load('album/'+albumName+'/listeners');
        return false;
    });
    $('.songsMore').click(function(){
        $('#album_content').load('album/'+albumName+'/songs');
        return false;
    });
    $('.activityMore').click(function(){
        $('#album_content').load('album/'+albumName+'/activity');
        return false;
    });
    var url = 'comment/all/type/album/entity/' + albumid + '/page/1';
    $('.commentsMore').click(function(){
        $('#album_content').load(url, function() {
            $('#commentsURL').val(url);
        });
        return false;
    });

    $("#song_box_result_box").hide();
    $(".box_icons").hide();
    $('.album_song_list_grid_0,.album_song_list_grid_1').hover(function() {
        //$(".user_songs_heart_image").hide();
        var name = "#" + $(this).attr("id");
        name = name + " .box_icons";
        $(name).show();
    }, function() {
        var name = "#" + $(this).attr("id");
        name = name + " .box_icons";
        $(name).hide();
    });


    $("#add_albumbox_link").click(function(){
        $.getJSON("album/love", {
            albumid: albumid
        }, function(json){
            message = json.message.description.toString();
            alert(message + albumName);
        });
    });

    // album cd lerini rotate etme
    //    $('.album_list_width div').each(function() {
    //        var angle = getRandomInt(-25,25);
    //        $(this).children("img").each(function() {
    //            $(this).rotate(angle);
    //        });
    //    });

    //createAlbumBoxEffect();
    prepareGeneral();
    calculateBigPageHeight();
           
    
});


var lefts = [];
var tops = [];
function createAlbumBoxEffect() {
    var z = 0; //for setting the initial z-index's
    var inAnimation = false; //flag for testing if we are in a animation

    $('.album_list_width img').each(function() { //set the initial z-index's
        z++; //at the end we have the highest z-index value stored in the z variable
        $(this).css('z-index', z); //apply increased z-index to <img>
    });

    var z = 0; //for setting the initial z-index's
    var inAnimation = false; //flag for testing if we are in a animation
    var left = 0, top = 0;
    var i = 0;
    $('.album_list_width div').each(function() { //set the initial z-index's
        left = (i%2) * -20;
        lefts[i] = left;
        top = (i%2) * 20;
        tops[i]= top;
        $(this).css("right", left);
        $(this).css("top", top);
        z++; //at the end we have the highest z-index value stored in the z variable
        $(this).css('z-index', z); //apply increased z-index to <img>
        $(this).attr("id", "albumdiv_" + i);
        i ++;
    });

    function swapFirstLast(isFirst) {
        if(inAnimation) return false; //if already swapping pictures just return
        else inAnimation = true; //set the flag that we process a image

        var processZindex, direction, newZindex, inDeCrease; //change for previous or next image
        var length = 0;
        if(isFirst) {
            processZindex = z;
            direction = '-';
            newZindex = 1;
            inDeCrease = 1;
            length = 40;
        } //set variables for "next" action
        else {
            processZindex = 1;
            direction = '';
            newZindex = z;
            inDeCrease = -1;
            length = 20;
        } //set variables for "previous" action

        $('.album_list_width div').each(function() { //process each image
            var id = $(this).attr("id").toString();
            var place = id.indexOf("_", 0);
            var i = id.substr(place + 1, id.length - place - 1);
            if($(this).css('z-index') == processZindex) { //if its the image we need to process
                $(this).animate({
                    'right' : direction + ($(this).width() + length) + 'px'
                }, 'slow', function() { //animate the img above/under the gallery (assuming all pictures are equal height)
                    $(this).css('z-index', newZindex) //set new z-index
                    .animate({
                        'right' : lefts[i]
                    }, 'slow', function() { //animate the image back to its original position
                        inAnimation = false; //reset the flag
                    });
                //lefts[i] += 6;
                //tops[i] += 6;
                });
            } else { //not the image we need to process, only in/de-crease z-index $(this).css("margin-left")
                //                $(this).css('z-index', parseInt($(this).css('z-index')) + inDeCrease); //in/de-crease the z-index by one  //
                $(this).animate({
                    'right' : lefts[i]
                }, 'slow', function() { //make sure to wait swapping the z-index when image is above/under the gallery
                    $(this).css('z-index', parseInt($(this).css('z-index')) + inDeCrease); //in/de-crease the z-index by one
                });
            }
        });

        return false; //don't follow the clicked link
    }

    $('.album_forw_link').click(function() {
        return swapFirstLast(true); //swap first image to last position
    });

    $('.album_prev_link').click(function() {
        return swapFirstLast(false); //swap last image to first position
    });
}

