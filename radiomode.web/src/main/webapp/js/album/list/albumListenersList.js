/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    
         
    $(".jPag-pages a").click(function(){
        var currentPage =$(this).text(); 
        var albumID =$(".listenerAlbumID").text(); 
        var url = "albumList/listeners/"+ currentPage+"/albumNO/" + albumID;
        $('.album_listener_list_container').load(url);
        return true;
    });
    
    $(".jPag-first").click(function(){
        var albumID =$(".listenerAlbumID").text(); 
        var url = "albumList/listeners/1/albumNO/"+albumID;
        $('.album_listener_list_container').load(url);
        return true;
    });
    
    $(".jPag-last").click(function(){
        var lastPage =$(".fanPageNumberOfAlbum").text(); 
        var albumID =$(".listenerAlbumID").text(); 
        var url = "albumList/listeners/"+lastPage+"/albumNO/"+albumID;
        $('.album_listener_list_container').load(url);
        return true;
    });
    

    calculateBigPageHeight();
});
