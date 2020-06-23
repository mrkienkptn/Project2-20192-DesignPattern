package client;
import adapter.*;
import energy.Energy;
public class Demo {
    public static void main(String args[]){
        Hotman hotMan = new Hotman();
        Target electricFan = new Fan(); 

        System.out.println("\nWhen electric fan do not work");
        hotMan.feelingNow();

        electricFan.work(new Energy());        
        hotMan.setFan(electricFan);
        hotMan.setStatus();
        System.out.println("\nWhen electric fan is working");        
        hotMan.feelingNow();
        
    }
}