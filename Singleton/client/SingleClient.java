package client;
import player.*;
public class SingleClient {
    public static void main(String args[]){
        MusicPlayer session1= MusicPlayer.getInstance("Con cò");
        session1.Play();
        session1.showSong();
        session1.Exit();
        MusicPlayer session2= MusicPlayer.getInstance("Bà tôi");
        session2.showSong(); 
    }
}