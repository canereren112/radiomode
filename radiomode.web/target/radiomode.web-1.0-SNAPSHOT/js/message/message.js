$(document).ready(function(){
   
    $('#message_down_content').load('messages/inbox');

    $('#inbox_link').click(function(){
        $('#message_down_content').load('messages/inbox');   
        return false;
    });

    $('#sent_link').click(function(){
        $('#message_down_content').load('messages/sent');
        return false;
    });    

    $('#profile_album_boxLink').click(function(){
        $('#message_down_content').load('music/albums/genre/all');
        return false;
    });
    calculateBigPageHeight();
    prepareGeneral();
});

function MESSAGE_GENERAL() {
    $('a.create_message_link').click(function(){
        $('#message_down_content').load('messages/create?senderName=');
        return false;
    });
        
    $('.message_profile_header').click(function(){
        var message_id = $(this).attr("val");
        $('#message_down_content').load('messages/'+message_id);
        return false;
    });

    $('.message_all').click(function(){
        $('.message_checkbox').attr('checked', true);
    });

    $('.message_reply_link').click(function(){
        var messageId = $(".read_message_profile_header").attr("val");
        $('#message_down_content').load('messages/reply/'+ messageId);
        return false;
    });

    $('.reply_message_send_link').click(function(){
        var messageId = $(".read_message_profile_header").attr("val");
        $('#message_down_content').load('messages/reply/'+ messageId);
        return false;
    });
    
   
    $('.message_none').click(function(){
        $('.message_checkbox').attr('checked',false);
    });

    $('.message_delete').click(function(){
        var checkedMessages = "";
        $('.message_checkbox').each(function(){
            var message_checked = $(this).attr("checked");
            if(message_checked == true){
                checkedMessages= checkedMessages + "_" +$(this).attr("val");
            }
        });
        if(checkedMessages == "")
            return false;
        var page = $(".page").val();
        var url = "messages/"+page+"/remove";
        $.post(url, {
            checkedMessages:checkedMessages
        },  function(json){
            if(json.parameter.name.toString() == "false")
                $("#userNameMessage").html("An error occured");
            else
                $('#message_down_content').load('messages/'+page);
        }, "json");
    });

    $('#replyMessageForm').ajaxForm({
        type: 'POST',
        target: '#message_down_content'
    });
}
