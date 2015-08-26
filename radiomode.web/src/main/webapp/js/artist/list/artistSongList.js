/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




$(document).ready(function() {
    
   
    //Pagination Codes starting 
 
    $(".jPag-pages a").click(function(){
        var count =  0; 
        var currentPage =$(this).text(); 
        var artistID =$(".artistId").text(); 
        var url = "artistList/songs/"+ currentPage+"/artistNO/" + artistID + " #artist_list_container" ;
        
            
        $('#main_list_content').load(url );
       
            
        return true;
    });
    
    $(".jPag-first").click(function(){
        var artistID =$(".artistId").text(); 
        var url = "artistList/songs/1/artistNO/"+artistID;
        $('#artist_popular_song_list_container').load(url);
        return true;
    });
    
    $(".jPag-last").click(function(){
        var lastPage =$(".songPageNumberOfArtist").text(); 
        var artistID =$(".artistId").text(); 
        var url = "artistList/songs/"+lastPage+"/artistNO/"+artistID;
        $('#artist_popular_song_list_container').load(url);
        return true;
    });
    //Pagination Codes finishes

    calculateBigPageHeight();
});