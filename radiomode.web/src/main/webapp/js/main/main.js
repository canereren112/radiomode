/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var signupFormValidator;
var dialogHTML;
var existsDialog = true;

$(document).ready(function(){
  
    
    dialogHTML = $("#signup_panel_dialog").html();

    $("#signup_panel_dialog").dialog({
        bgiframe: true,
        height: 400,
        width: 700,
        modal: true,
        autoOpen: false
    });

    prepareDialogForm();

    $("#sign_up, #login").click(function(){
        var type = $(this).attr("id");

        if(type == "sign_up") {
            $('#signup_div').show();
            $('#login_div').hide();
        }

        if(type == "login") {
            $('#signup_div').hide();
            $('#login_div').show();
        }

        if(existsDialog == false) {
            $("#signup_panel_dialog").html(dialogHTML);                        
            prepareDialogForm(type);
            existsDialog = true;
        }
        resetDialogForm();
        $("#signup_panel_dialog").dialog('open');
    });

    calculateBigPageHeight();
    prepareGeneral();
});

function prepareDialogForm(type) {

    signupFormValidator = $("#signupForm").validate();
    $("#signupForm").ajaxForm({
        type: 'POST',
        target: '#signup_panel_dialog',
        beforeSubmit: function(formData, jqForm, options){
            if($("#signupForm").valid() == false)
                return false;
            existsDialog = false;
            return true;
        }
    });

    $("#userName").bind('blur', function(){
        if(signupFormValidator.element("#userName") == true) {
            $.getJSON("checkUserName.do", {
                userName: this.value
            }, function(json){
                if(json.parameter.name.toString() == "false")
                    $("#userNameMessage").html("This User Name is already taken, please try another one");
                else
                    $("#userNameMessage").html("");
            });
        } else
            $("#userNameMessage").html("");
    });

    $("#email").bind('blur', function(){
        if(signupFormValidator.element("#email") == true) {
            $.getJSON("checkEmail.do", {
                email: this.value
            }, function(json){
                if(json.parameter.name.toString() == "false")
                    $("#emailMessage").html("This email is already taken, please try another one");
                else
                    $("#emailMessage").html("");
            });
        } else
            $("#emailMessage").html("");
    });

//    $("#loginForm").ajaxForm({
//        type: 'POST',
//        target: '#signup_panel_dialog',
//        beforeSubmit: function(formData, jqForm, options){
//            if($("#loginForm").valid() == false)
//                return false;
//            existsDialog = false;
//            return true;
//        }
//    });

}

function resetDialogForm() {
    $("#signupForm").resetForm();
    $("#loginForm").resetForm();
    $("label[class='error']").html("");
    $("#userNameMessage").html("");
    $("#emailMessage").html("");
}
