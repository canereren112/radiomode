/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
 
    $("a.love_artist").click(function(){
        $.getJSON("artist/love", {
            artistid: $(this).attr("id")
        }, function(json){
            message = json.message.description.toString();
            alert("You loved this artist");
        });
    });

    $("a.block_artist").click(function(){
        $.getJSON("artist/block", {
            artistid: $(this).attr("id")
        }, function(json){
            message = json.message.description.toString();
            alert("You blocked this artist");
        });
    });

    $('a.json').attr("href", $(document).attr("URL") + "#");

    $('a').each(function(){
        var href = $(this).attr("href");
        href = href.replace(" ", "_");
        href = href.replace(" ", "_");
        href = href.replace(" ", "_");
        href = href.replace(" ", "_");

        //        href = href.replace("\u0131", "i");
        //        href = href.replace("\u015f", "s");
        //        href = href.replace("ö", "o");
        //        href = href.replace("ü", "u");
        //        href = href.replace("ç", "c");
        //        href = href.repl\u011fce("\u011f", "g");
        $(this).attr("href", href);
    });

    jQuery("abbr.timeago").timeago();

    $('#comment').keyup(function(){
        limitChars('comment', 1000, 'limitMessage');
    })

    $('span.duration').each(function(){

        length = parseInt($(this).html());
        length = parseInt(length / 1000);
        minute = parseInt(length / 60);
        second = parseInt(length % 60);
        $(this).html( minute + ":" + second);
        $(this).removeClass('duration');
    });

    // mavi buton ziplama efekti
    $(".blue_default_buttons").hover(function(){
        $(this).children("img").stop(true, true)
        .animate({
            top:"-9px"
        }, 200).animate({
            top:"-3px"
        }, 200) // first jump
        .animate({
            top:"-6px"
        }, 100).animate({
            top:"-3px"
        }, 100) // second jump
        .animate({
            top:"-5px"
        }, 100).animate({
            top:"-3px"
        }, 100); // the last jump
    },function(){
        $(this).children("img").stop(true, true).animate({
            top:"-3px"
        }, 100);
    });
});

