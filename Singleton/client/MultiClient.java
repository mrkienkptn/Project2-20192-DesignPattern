package client;
import player.*;
public class MultiClient {
    public static void main(String args[]){       
        Thread Kien = new Thread(new Thread1());
        Thread Son = new Thread(new Thread2());
        Kien.start();
        Son.start();
    }
    static class Thread1 implements Runnable{
        @Override
        public void run() {
            MusicPlayer session= MusicPlayer.getInstance("Đảng cho ta mùa xuân");
            session.Play();
            session.showSong();
        }
    }
    static class Thread2 implements Runnable{
        @Override
        public void run() {
            MusicPlayer session= MusicPlayer.getInstance("Quốc ca");
            session.Play();
            session.showSong();
        }
    }
}