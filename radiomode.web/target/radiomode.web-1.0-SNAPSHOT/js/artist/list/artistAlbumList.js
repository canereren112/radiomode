/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {  

 
    
    
    //Sayflama Linkleri
    $(".jPag-pages a").click(function(){
        var currentPage =$(this).text(); 
        var artistID =$(".albumArtistId").text(); 
        var url = "artistList/albums/"+ currentPage+"/artistNO/" + artistID;
        $('.artist_album_song_list_container').load(url);
        return true;
    });
    
    $(".jPag-first").click(function(){
        var artistID =$(".albumArtistId").text(); 
        var url = "artistList/albums/1/artistNO/"+artistID;
        $('.artist_album_song_list_container').load(url);
        return true;
    });
    
    $(".jPag-last").click(function(){
        var lastPage =$(".albumPageNumberOfArtist").text(); 
        var artistID =$(".albumArtistId").text(); 
        var url = "artistList/albums/"+lastPage+"/artistNO/"+artistID;
        $('.artist_album_song_list_container').load(url);
        return true;
    });
    //Sayfalama Linkleri sonu

    calculateBigPageHeight();
});