
/**
 * Write a description of class PremiumUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumUser extends User
{
    // instance variables - replace the example below with your own
    int currentNumberOfPlaylists;
    int numSongsPlayed;
  
    public PremiumUser(String userName, String password, int age)
    {
        super(userName, password, age);
        currentNumberOfPlaylists = 0;
        numSongsPlayed = 0;
    }

    void initializePlaylists(){
    
    }
    
    boolean addNewPlaylists(Playlist p){
    
    }
    
    int getNumberOfPlaylists(){
    
    }
    
    String listenToSong(Song song){
    
    }
}
