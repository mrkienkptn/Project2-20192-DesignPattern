package factory;

import java.util.ArrayList;
import java.util.List;

import agency.Agency;

public class MotorFactory {
    List<Motor> products = new ArrayList<>();
    List<Agency> agencies = new ArrayList<>();
    public void newProduct(Motor motor){
        products.add(motor);
        String msg = "Factory has new product:"+ motor.getName()+
        " - cost: "+ motor.getCost()+" - quantity: "+ motor.getQuantity();
        this.notifyToAgency(msg, this.products);
    }
    public List<Motor> getList(){
        return products;
    }
    public void setState(Motor motor, int quantity){
        int i = products.indexOf(motor);
        Motor changeProduct = products.get(i);
        changeProduct.setQuantity(quantity);
        products.set(i, changeProduct);

        String msg = "Message from Factory: ";
        for (Motor m: products){
            msg +=  m.getName()+" - cost: " + m.getCost()+ " -quantity: "+ m.getQuantity()+ ", ";
        }
        this.notifyToAgency(msg, this.products);
    }
    public void notifyToAgency(String msg, List<Motor> list){
        for (Agency a: agencies){
            a.update(msg, list);
        }
    }
    public void attach(Agency a){
        agencies.add(a);
    }
    public void detach(Agency a){
        agencies.remove(a);
    }

}