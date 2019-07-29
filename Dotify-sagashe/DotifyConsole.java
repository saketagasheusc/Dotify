import java.util.ArrayList;
import java.util.Scanner;

/**
 * The DotifyConsole class simply provides method definitions for all the abstract methods in Dotify
 * All input/output in this version is through the console window System.in and System.out
 * @author kendra
 *
 */
public class DotifyConsole extends Dotify{
    //Class Variable
    private static final String OPTIONS = "\n"
            + "---------- DOTIFY MENU ----------\n"
            + "|   1:  List All Songs          |\n"
            + "|   2:  Display Playlists       |\n"
            + "|   3:  Create Playlist         |\n"
            + "|  -1:  Quit Dotify             |\n"
            + "---------------------------------\n"
            + "Please enter your choice:";

    //CONSTRUCTORS
    
    public DotifyConsole(){
        super(); //let the super set things up
    }
    
    // "LAUNCHER" main method -- this is the starting point of the whole system
    public static void main (String[] args){
        Dotify console = new DotifyConsole();
        console.run();
    }
    
    @Override
    protected void displayWelcome() {
        System.out.println("Hello! Welcome to Dotify!");
    }
    
    @Override
    protected void displayGoodbye() {
        System.out.println("See you later!");
    }
    
    @Override
    public void displayError(String message){
        System.out.println("System.err.println");
    }
    
    @Override
    public void displaySongs(ArrayList<Song> songs){
        
    }
    
    @Override
    public void displayJoinDialog(){
        
    }

    @Override
    public int getUserChoiceDialog(){
        return 1;
    }
    
    @Override
    protected void displayPlaylists() {
        
    }
    
    @Override
    protected void upgradeUserDialog() {
        
    }
    
    protected void createPlaylist() {

    }

}