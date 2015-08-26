/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    
         
    $(".jPag-pages a").click(function(){
        var currentPage =$(this).text(); 
        var artistID =$(".artistId").text(); 
        var url = "artistList/listeners/"+ currentPage+"/artistNO/" + artistID;
        $('.artist_listener_list_container').load(url);
        return true;
    });
    
    $(".jPag-first").click(function(){
        var artistID =$(".artistId").text(); 
        var url = "artistList/listeners/1/artistNO/"+artistID;
        $('.artist_listener_list_container').load(url);
        return true;
    });
    
    $(".jPag-last").click(function(){
        var lastPage =$(".fanPageNumberOfArtist").text(); 
        var artistID =$(".artistId").text(); 
        var url = "artistList/listeners/"+lastPage+"/artistNO/"+artistID;
        $('.artist_listener_list_container').load(url);
        return true;
    });
    

    calculateBigPageHeight();
});