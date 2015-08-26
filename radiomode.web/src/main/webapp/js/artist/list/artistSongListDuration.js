/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    
   
    $('span.duration').each(function(){
        length = parseInt($(this).html());
        length = parseInt(length / 1000);
        minute = parseInt(length / 60);
        second = parseInt(length % 60);
        $(this).html( minute + ":" + second);
        $(this).removeClass('duration');
    });
    
    //Buy Heart ve Shop simgelerinin görünüp saklanması olayı
    $(".box_icons").hide();
    $('.popular_song_list_grid_0,.popular_song_list_grid_1').hover(function() {
        //$(".user_songs_heart_image").hide();
        var name = "#" + $(this).attr("id");
        name = name + " .box_icons";
        $(name).show();
    }, function() {
        var name = "#" + $(this).attr("id");
        name = name + " .box_icons";
        $(name).hide();
    });
    
    //Pagination Codes starting 
    
});