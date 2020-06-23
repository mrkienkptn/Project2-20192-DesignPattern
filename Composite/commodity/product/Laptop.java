package commodity.product;

import commodity.Item;
public class Laptop extends Item {

    public Laptop (int c, String n){
        super(c, n);
    }
    @Override
    public void showInfo(){
        System.out.println("A laptop, name: "+ name+" , cost: "+ cost);
    }

}