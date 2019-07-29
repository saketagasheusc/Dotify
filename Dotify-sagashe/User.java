
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract public class User
{
    // instance variables - replace the example below with your own
    protected String userName;
    protected String password;
    protected int age;
    protected Playlist playlist[];
    private int numPlaylists;
    int PLAYLISTS_ALLOWED_FREE_USER = 1;
    int PLAYLISTS_ALLOWED_PREMIUM_USER = 10;

    /**
     * Constructor for objects of class User
     */
    public User(String userName, String password, int age)
    {
        this.userName = userName;
        this.password = password;
        this.age = age;
        numPlaylists = 0;
        initializePlaylists();
    }
    
    public String getUserName(){
        return userName;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public Playlist getPlaylists(){
        return playlist;
    }
    
    boolean checkPassword(String tryWord){
        if (tryWord == password){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean changePassword(String oldPass,String newPass){
        if (oldPass == password){
            oldPass = newPass;
            return true;
        }
        else{
            return false;
        }
    }
    
    String toString(){
        return getUsername() + ", " + getAge() + "years old."; 
    }
    
    abstract void initializePlaylists();
    
    abstract boolean addNewPlaylist(Playlist p);
    
    abstract int getNumberOfPlaylists();
    
    abstract String listenToSong(Song nameOfSong);
}
