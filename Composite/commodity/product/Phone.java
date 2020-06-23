package commodity.product;

import commodity.Item;
public class Phone extends Item {

    public Phone (int c, String n){
        super(c, n);
    }
    @Override
    public void showInfo(){
        System.out.println("A phone, name: "+name+" , cost: "+ cost);
    }

}