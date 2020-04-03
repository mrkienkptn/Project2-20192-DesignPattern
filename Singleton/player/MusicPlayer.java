package player;
public final class MusicPlayer{
    private static volatile MusicPlayer  instance;
    private String status; //pause or play
    private String song="";
    private MusicPlayer(String song){  
        this.song=song;      
    }
    public static MusicPlayer getInstance (String song){
        MusicPlayer result= instance;
        if (result!=null) return result;
        synchronized(MusicPlayer.class){
            if (instance==null) 
            instance=new MusicPlayer(song);
        }        
        return instance;
    }
    public void Play(){
        status="playing";
    }
    public  void Exit(){
        status="paused";
    }
    public void showSong(){
        if (song=="")
            System.out.println(" No song is playing...");
        else {
            System.out.println(song+" is "+ status);
        }
    }
}