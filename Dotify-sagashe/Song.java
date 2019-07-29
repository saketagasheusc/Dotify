import java.io.*;
import java.net.URL;
import java.util.Scanner;
import javax.sound.sampled.*;


/**
 * Song class can play local files or URL locations of Sound files in the following formats: wav aifc aiff au snd 
 *
 */
public class Song implements Playable{
   
    private String nameOfSong;
    private String fileName;
    private boolean songIsLocalFile;


    /**
     * FOR TEST PURPOSES ONLY, GREAT WAY TO FIND NEW AUDIO FILES AND SEE IF THEY WORK. SINCE SOME WAVE FILES ARE ENCODED DIFFERENTLY, 
     * SOUNDS/SONGS DON'T ALWAYS PLAY AS EXPECTED - THIS MAIN METHOD ALLOWS US TO TEST THE LOCAL FILE/ ULL TO SEE IF THE SOUNDS WE WANT ACTUALLY PLAY
     * 
     */
    public static void main(String[] args){
        Song test = new Song("Dark Side", "http://www.thesoundarchive.com/email/yoda-message-from-the-darkside.wav", false);
        test.play();

        Song test2 = new Song("Cow", "audio//cow.wav", true);
        test2.play();
    }


    public Song(String name, String fileName, boolean isLocal){
       // TO DO - complete
    }

    
    public String getNameOfSong(){
        return nameOfSong;
    }
    
    public void setNameOfSong(String nameOfSong){
        this.nameOfSong = nameOfSong;
    }
    
    public int getFileName(){
        return fileName;
    }
    
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    public String[] getPlaylists(){
        return playlist;
    }
    
    public void play(){

        if(songIsLocalFile ){ //Reading sound from a local file
            AudioHelper.playFile(fileName);
        }
        else{ //Reading sound from a URL
            AudioHelper.playURL(fileName);
        }

    }
    public void playOnce(){
        if( songIsLocalFile ){ //Reading sound from a local file
            AudioHelper.playFile(fileName, false);
        }
        else{ //Reading sound from a URL
            AudioHelper.playURL(fileName, false, "Now Playing " + this.getNameOfSong());
        }
    }
    
    public String toString(){
        // TO DO - update so it returns song's name
        String msg = "";
        return msg;
    }
}
