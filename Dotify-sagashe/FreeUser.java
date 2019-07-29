
/**
 * Write a description of class FreeUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FreeUser extends User
{
    // instance variables - replace the example below with your own
    AdGenerator ads;
    boolean hasOnePlaylist;

    public FreeUser(String userName, String password, int age){
        super(userName, password, age);
        AdGenerator ads = new AdGenerator();
        hasOnePlaylist = false;
    }
    
    void initializePlaylists(){
        playlist[];
    }
    
    boolean addNewPlaylist(Playlist p){
        playlist[0] = p;
        hasOnePlaylist = true;
    }
    
    int getNumberOfPlaylists(){
        if (hasOnePlaylist){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    String listenToSong(Song song){
        Song playSong = new Song();
        playSong.play();
        ads.go();
    }
}
