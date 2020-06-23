package commodity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box extends Item{
    private List <Commodity> commodities = new ArrayList<>();
    public Box(String name, Commodity ...items) {
        super(name);
        add(items);
    }
    @Override
    public void add(Commodity ... items){
        commodities.addAll(Arrays.asList(items));
    }
    @Override
    public void add(Commodity item){
        commodities.add(item);
    }
    @Override
    public int getCost(){
        int C = 0;
        for (Commodity c : commodities){
            C += c.getCost();
        }
        return C;
    }
    @Override
    public void showInfo() {
        System.out.println(name+ " has: ");
        for (Commodity c: commodities){         
            c.showInfo();
        }
    }
    
}