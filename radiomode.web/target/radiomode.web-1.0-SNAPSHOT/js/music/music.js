$(document).ready(function(){
    
    $('#music_down_content').load('music/artists/genre/all');

    $('#profile_artist_boxLink').click(function(){
        $('#music_down_content').load('music/artists/genre/all');
        return false;
    });

    $('#profile_song_boxLink').click(function(){
        $('#music_down_content').load('music/songs/genre/all');
        return false;
    });

    $('#profile_album_boxLink').click(function(){
        $('#music_down_content').load('music/albums/genre/all');
        return false;
    });
    
   calculateSmallPageHeight();
   prepareGeneral();
});

function MUSIC_ARTIST() {
    $('a.music_genre_link').click(function(){
        var genre = $(this).html();
        $('#music_down_content').load('music/artists/genre/' + genre);
        return false;
    });
}

function MUSIC_ALBUM() {
    $('a.music_genre_link').click(function(){
        var genre = $(this).html();
        $('#music_down_content').load('music/albums/genre/' + genre);
        return false;
    });
}

function MUSIC_SONG() {
    $('a.music_genre_link').click(function(){
        var genre = $(this).html();
        $('#music_down_content').load('music/songs/genre/' + genre);
        return false;
    });
}



