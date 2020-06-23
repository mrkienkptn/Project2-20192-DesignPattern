package request;

public class Request {
    private int days;
    private boolean stop = false;
    public Request(int day){
        System.out.println("Leave "+day+" days request");
        this.days = day;
    }
    public Request(boolean stop){
        this.stop = stop;
        System.out.println("Quit work request");
    }
    public int getDay(){
        return days;
    }
    public boolean wantQuitWork(){
        return this.stop;
    }
}