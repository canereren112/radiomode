/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
        
    $('#edit_profile_content').load('edit_profile/general');

    $('#generalLink').click(function(){
        $('#edit_profile_content').load('edit_profile/general');
        return false;
    });

    $('#photoLink').click(function(){
        $('#edit_profile_content').load('edit_profile/photo');
        return false;
    });

    $('#passwordLink').click(function(){
        $('#edit_profile_content').load('edit_profile/password');
        return false;
    });

    $('#emailLink').click(function(){
        $('#edit_profile_content').load('edit_profile/email');
        return false;
    });
    calculateBigPageHeight();
    prepareGeneral();
});

// edit-profile.jsp sinifi
function EMAIL() {
    $("input, textarea, select, button").uniform();
        
    $('#editProfileEmailForm').ajaxForm({
        type: 'POST',
        target: '#edit_profile_content'
    });

    showResultMessage();
}

// password.jsp sinifi
function PASSWORD() {
    $("input, textarea, select, button").uniform();
        
    $('#editProfilePasswordForm').ajaxForm({
        type: 'POST',
        target: '#edit_profile_content'
    });

    showResultMessage();
}

// photo.jsp sinifi
function PHOTO() {
    $("input, textarea, select, button").uniform();

    $('#editProfilePhotoForm').ajaxForm({
        type: 'POST',
        target: '#edit_profile_content'
    });

    showResultMessage();
}

// general.jsp sinifi
function GENERAL() {
    $("input, textarea, select, button").uniform();
        
    $('#editProfileGeneralForm').ajaxForm({
        type: 'POST',
        target: '#edit_profile_content'
    });

    var gender = $('input[name=genderHidden]').val();
    if(gender == 'M') {
        $('#male').attr("checked", "checked")
    } else if(gender == 'F') {
        $('#female').attr("checked", "checked")
    } else if(gender == 'O') {
        $('#other').attr("checked", "checked")
    }

    var day = $('input[name=dayHidden]').val();
    $('#day').val(day).attr("selected");
    var month = $('input[name=monthHidden]').val();
    $('#month').val(month).attr("selected");
    var year = $('input[name=yearHidden]').val();
    $('#year').val(year).attr("selected");

    var countryCode = $('input[name=countryCodeHidden]').val();
    $('#countryCode').val(countryCode).attr("selected");

    showResultMessage();
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