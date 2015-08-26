<%-- 
    Document   : profile_music
    Created on : 01.Oca.2011, 18:10:41
    Author     : EREN
--%>
<script type="text/javascript">
    jQuery(document).ready(function() {
        $('#profile_music_boxLink,#profile_song_boxLink').click(function(){
            $('#profile_content').load('user/' + profileUser + '/songbox/page/1');
            return false;
        });
        $('#profile_artist_boxLink').click(function(){
            $('#profile_content').load('user/' + profileUser + '/artistbox/page/1');
            return false;
        });
        $('#profile_album_boxLink').click(function(){
            $('#profile_content').load('user/' + profileUser + '/albumbox/page/1');
            return false;
        });
        $('#profile_activityLink').click(function(){
            $('#profile_content').load('user/' + profileUser + '/activity/page/1');
            return false;
        });
        calculateBigPageHeight();
        
    }
</script>


<div class="main_sub_menu_list list_shadow">
    <a href="#" class="main_sub_menu_first_item main_sub_menu_link " id="">
        Song
    </a>
    <a href="#" class="main_sub_menu_link" id="">
        Artist
    </a>
    <a href="#" class="main_sub_menu_link" id="">
        Album
    </a>
</div>
