package adapter;
import energy.*;

public class Fan implements Target {
    private Energy e = new Energy("Electric");

    @Override
    public void work(Energy en){
        en.setType("Wind");
        e= en;
    }
    @Override
    public Energy getEnergy(){
        return e;
    }
}