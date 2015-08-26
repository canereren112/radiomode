/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    
    $("#albums_other_albums").click(function(){
        if(($(".album_albums_similar_hidden_span").is(':visible'))){
            $(".album_albums_similar_hidden_span").hide();
        }
        if($(".album_albums_other_hidden_span").is(':hidden')){
            $(".album_albums_other_hidden_span").toggle();
        }
        return false;
    });
    
    $("#albums_similar_albums").click(function(){
        if($(".album_albums_other_hidden_span").is(':visible')){
            $(".album_albums_other_hidden_span").hide();
        }
        if($(".album_albums_similar_hidden_span").is(':hidden')){
            $(".album_albums_similar_hidden_span").toggle();
        }        
        return false;
    });
     calculateBigPageHeight();
});