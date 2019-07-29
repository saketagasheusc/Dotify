import java.util.*;

public class Playlist
{
    // instance variables - replace the example below with your own
    String name;
    ArrayList songs = new ArrayList();

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist(String name, ArrayList songs)
    {
        
    }
    
    public Playlist(String name)
    {
    
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getSongs(){
        return songs;
    }
    
    public void setSongs(ArrayList songs){
        this.songs = songs;
    }
    
    String getSongsToString(){
    
    }
    
    String toString(){
    
    }
    
    void addSongToList(Song s){
    
    }
    
    void removeSongFromList(Song s){
        
    }
    
    void clearList(){
    
    }
    
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
