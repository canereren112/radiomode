/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



$(document).ready(function() {
    
         
    $(".jPag-pages a").click(function(){
        var currentPage =$(this).text(); 
        var artistID =$(".artistId").text(); 
        var url = "artistList/similiarArtist/"+ currentPage+"/artistNO/" + artistID;
        $('.similiar_artist_list_container').load(url);
        return true;
    });
    
    $(".jPag-first").click(function(){
        var artistID =$(".artistId").text(); 
        var url = "artistList/similiarArtist/1/artistNO/"+artistID;
        $('.similiar_artist_list_container').load(url);
        return true;
    });
    
    $(".jPag-last").click(function(){
        var lastPage =$(".similiarArtistPageNumberOfArtist").text(); 
        var artistID =$(".artistId").text(); 
        var url = "artistList/similiarArtist/"+lastPage+"/artistNO/"+artistID;
        $('.similiar_artist_list_container').load(url);
        return true;
    });
    

    calculateBigPageHeight();
});