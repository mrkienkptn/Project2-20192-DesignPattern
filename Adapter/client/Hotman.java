package client;

import adapter.Target;

public class Hotman {
    private String status;
    private Target fan;

    public Hotman(){
        status = "I'm so hot :((";
    }
    public void setFan(Target f){
        fan = f;
    }
    public void setStatus(){
        if (fan.getEnergy().showType()=="Wind")
            status = "I'm cool";
        else status =  "I'm still very hot";;            
    }
    public void feelingNow(){
        System.out.println(status);
    }

}