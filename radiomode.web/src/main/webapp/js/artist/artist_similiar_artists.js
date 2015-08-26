/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


jQuery(document).ready(function() {
  

    
  
    var divId = "#artist_similiar_artist_paging"; 
    var pageNumber = $(".similiarArtistPageNumberOfArtist").text();
    var defaultViewNumberOfPage = 5;
    
    if(pageNumber.valueOf()>= 10){
        defaultViewNumberOfPage = 10;
    }
    
    if(pageNumber!=1){
        makeDivPaginate(divId, pageNumber.valueOf(),  1, defaultViewNumberOfPage); 
    }
});