/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    //notification, user dropdown
    
    $(".after_login_span").hover(function(){
        $(".rm_menu_list_login").css("padding-left", "14px");
        $(".panel_drop_down_icon").css("right", "1px");
    }, function(){
        $(".rm_menu_list_login").css("padding-left", "15px");
        $(".panel_drop_down_icon").css("right", "2px");
    });
    
    $(".radiomode_logo").hover(function(){
        $("img.radiomode_logo").attr("src", "static/images/header/logo_white_blue_5_shine_3.png");
    }, function(){
        $("img.radiomode_logo").attr("src", "static/images/header/logo_white_blue_5.png");
    });
    $("ul.notification_list").hide();
    $("#expanded_login").hide();
    $(".expand_login_button").click(function(){
        $("#expanded_login").toggle();
        if($("ul.notification_list").is(':visible')){
            $("ul.notification_list").toggle();
            $(".home_notifications").toggleClass("home_notifications_click");
        }
    }); 
  
    
    $("a.home_notifications").click(function(){        
       
        $("ul.notification_list").toggle();
        $(".home_notifications").toggleClass("home_notifications_click");
        if($("#expanded_login").is(':visible')){
            $("#expanded_login").toggle();
        }
    });
    
    //Search AutoComplete
    $(".main_search_area").autocomplete("autocomplete_artists.do", {
        max: 10
    });
    $(".main_search_area").result(function(event, data, formatted){
        //        var object = new CREATE_STATION();
        //        var artistName = $(".main_search_area").val();
        //        $.getJSON("radio/check_artist.do", {
        //            artist: artistName
        //        }, object.checkArtist);

        //        $("li.ac_even,li.ac_odd").each(function(){
        //            var value= $(this).html();
        //            var artistName = value.replace("<strong>", "");
        //            artistName = artistName.replace("</strong>", "");
        //            $(this).html('<a href="artist/' + artistName + '">' + value + '</a>');
        //
        //        });

        window.location = 'artist/' + $(this).val();
    });

    //background-color:#f1f1f1;
    //-moz-box-shadow:0 0 8px #888888;

    // a.left_menu_links:hover {
    //    -moz-box-shadow:0 0 8px #888888;
    //}
    
    prepareActionElements();

    if ($.browser.msie) {
        $('.right_box_features').boxShadow( 0, 0, 5, "#aaaaaa");
        $('.content_shape').boxShadow( 0, 0, 5, "#aaaaaa");
        $('.ie_center_shadow_box').boxShadow( 0, 0, 5, "#aaaaaa");
        $('.left_box_features').boxShadow( 0, 0, 5, "#aaaaaa");
        $('.new_shadow').boxShadow( 0, 0, 5, "#aaaaaa");
    //        $('.ie_song_overlay_shadow').boxShadow( 0, 0, 3, "#cccccc");
    //        $('.ie_album_overlay_shadow').boxShadow( 10, 0, 5, "#cccccc");
    //        $('.ie_artist_overlay_shadow').boxShadow( 0, 0, 4, "#cccccc");
    }

//Submenu links
 
    

   
});

function prepareGeneral() {
    //    $('a.left_menu_links').hover(function(){
    //
    //        $(this).css("background-color","#f1f1f1");
    //    },function(){
    //
    //        $(this).css("background-color","#ffffff");
    //    });
    // sol menu renk degisiklikleri
    $("a.left_menu_links").css("-moz-box-shadow","0px 0px 5px #888888")
    $('a.left_menu_links').css('background-color', '#FFFFFF');
    $('a.left_menu_links:first').css('background-color', '#f1f1f1');
    $("a.left_menu_links").css("box-shadow","0px 0px 0px");
    $("a.left_menu_links:first").css("box-shadow","0px 0px 5px #888888");
    $(".left_hidden_div_1").css("width","15px");
    $(".left_hidden_div_1").css("height","38px");
    $(".left_hidden_div_1").css("margin-top","-4px");
    $('a.left_menu_links').css('width', '144');
    $('a.left_menu_links:first').css('width', '151');
   
    $('a.left_menu_links').css('z-index',0);
    $('a.left_menu_links:first').css('z-index',1);

    $('a.left_menu_links').click(function(){
        //        $('a.left_menu_links').css('-moz-box-shadow', $(this).css('-moz-box-shadow'));
        //        $(this).css('-moz-box-shadow', '0 0 8px #888888');

        $("a.left_menu_links").css("box-shadow","0px 0px 0px");
        $(this).css("box-shadow","0px 0px 5px #888888");
        
         
        $(".left_hidden_div").css("width","15px");
        $(".left_hidden_div").css("height","44px");
        $(".left_hidden_div").css("margin-top","-10px");

        $('a.left_menu_links').css('background-color', '#FFFFFF');
        $(this).css('background-color', '#f1f1f1');

        $('a.left_menu_links').css('width', '144');
        $(this).css('width', '151');

        $('a.left_menu_links').css('z-index',0);
        $(this).css('z-index',1);

    });
    $("a[class$='More']").not($('.left_menu_links')).click(function(){
        //        $('a.left_menu_links').css('-moz-box-shadow', $(this).css('-moz-box-shadow'));
        //        $(this).css('-moz-box-shadow', '0 0 8px #888888');
        var thisClass = "." + $(this).attr("class");
        

        $("a.left_menu_links").css("box-shadow","0px 0px 0px");
        $("a.left_menu_links").filter(thisClass).css("box-shadow","0px 0px 5px #888888");

        $(".left_hidden_div_1").css("width","15px");
        $(".left_hidden_div_1").css("height","38px");
        $(".left_hidden_div_1").css("margin-top","-4px");

        $(".left_hidden_div").css("width","15px");
        $(".left_hidden_div").css("height","44px");
        $(".left_hidden_div").css("margin-top","-10px");
        
        $('a.left_menu_links').css('background-color', '#FFFFFF');
        $("a.left_menu_links").filter(thisClass).css('background-color', '#f1f1f1');

        $('a.left_menu_links').css('width', '144');
        $("a.left_menu_links").filter(thisClass).css('width', '151');

        $('a.left_menu_links').css('z-index',0);
        $("a.left_menu_links").filter(thisClass).css('z-index',1);

    });
}

function calculateSmallPageHeight() {
    var profileHeight2 = $(".wrapper_without_left_menu").height();
    profileHeight2 = 20 + profileHeight2;
    $(".big_content_without_left_menu").height(profileHeight2);   
}

function calculateBigPageHeight(){
    var profileHeight = $(".wrapper").height();
    profileHeight = 20+ profileHeight;
    $(".big_content").height(profileHeight);
}

function prepareActionElements() {
    // header menu fade efekti
    $(".rm_menu_list_link").fadeTo("slow", 0.0);
    $(".rm_menu_list_link").hover(function(){
        $(this).stop().fadeTo("slow", 1.0);
    }, function(){
        $(this).stop().fadeTo("slow", 0.0);
    });

    $(".menu_login").fadeTo("slow", 1.0);
    $(".menu_login").hover(function(){
        $(this).stop().fadeTo("slow", 1.0);
    });

    // facebook ve twitter hover efektleri
    $("#footer_facebook_icon").hover(function(){
        $("#footer_facebook_icon img").attr("src", "static/images/icons/footer_icons/facebook.png");
    }, function(){
        $("#footer_facebook_icon img").attr("src", "static/images/icons/footer_icons/facebook_black.png");
    });
    $("#footer_twitter_icon").hover(function(){
        $("#footer_twitter_icon img").attr("src", "static/images/icons/footer_icons/twitter.png");
    }, function(){
        $("#footer_twitter_icon img").attr("src", "static/images/icons/footer_icons/twitter_black.png");
    });
    $("#footer_linkedin_icon").hover(function(){
        $("#footer_linkedin_icon img").attr("src", "static/images/icons/footer_icons/linkedin.png");
    }, function(){
        $("#footer_linkedin_icon img").attr("src", "static/images/icons/footer_icons/linkedin_black.png");
    });
    
    /*
    $("button,input[type*='submit'],ul#icons li").hover(
        function(){
            $(this).addClass("ui-state-hover");
        },
        function(){
            $(this).removeClass("ui-state-hover");
        }).mousedown(
        function(){
            $(this).addClass("ui-state-active");
        }).mouseup(
        function(){
            $(this).removeClass("ui-state-active");
        });
     */

    // invoice button efekti
    $('.invoice_button').attr('src', 'static/images/buttons/gray_buttons/gray_button_default.png');
    $('.invoice_button').hover(function(){
        $('.invoice_button').attr('src', 'static/images/buttons/gray_buttons/gray_button_hover.png');
    }, function(){
        $('.invoice_button').attr('src', 'static/images/buttons/gray_buttons/gray_button_default.png');
    }).click(function(){
        $('.invoice_button').attr('src', 'static/images/buttons/gray_buttons/gray_button_active.png');
    });
}

// Returns a random integer between min and max
// Using Math.round() will give you a non-uniform distribution!
function getRandomInt(min, max)
{
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function limitChars(textid, limit, infodiv){
    var text = $('#'+textid).val();
    var textlength = text.length;

    if(textlength > limit){
        $('#' + infodiv).html('You cannot write more then '+limit+' characters!');
        $('#'+textid).val(text.substr(0,limit));
        return false;
    } else{
        $('#' + infodiv).html('You have '+ (limit - textlength) +' characters left.');
        return true;
    }
}

function showResultMessage() {
    var result = $('input[name=resultHidden]').val();
    if(result == "true") {
        $('span.ui-icon').addClass("ui-icon-info");
        $('#resultBox').addClass("ui-state-highlight").show();
    } else if(result == "false") {
        $('span.ui-icon').addClass("ui-icon-alert");
        $('#resultBox').addClass("ui-state-error").show();
    } else {
        $('#resultBox').hide();
        $('#resultMessage').html("");
    }
}
//Pagination function      
var pagingDivId;
var countNumber = new Number();
var displayNumber = new Number();
var indexNumber = new Number();

function makeDivPaginate(pagingDivId, countNumber, indexNumber, displayNumber ){
            
    $(pagingDivId).paginate({
        count 		: countNumber,
        start 		: indexNumber,
        display         : displayNumber,
        border					: false,
        text_color  			: '#0094D6',
        background_color    	: 'none',	
        text_hover_color  		: '#2573AF',
        background_hover_color	: 'none', 
        images		: false,
        mouse		: 'press'
    });
         
}