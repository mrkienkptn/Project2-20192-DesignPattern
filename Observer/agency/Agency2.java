package agency;

import java.util.List;

import factory.Motor;
import factory.MotorFactory;

public class Agency2 implements Agency{
    private MotorFactory factory;
    public Agency2(MotorFactory factory){
        this.factory = factory;
        factory.attach(this);
    }
    @Override
    public void importMotor(Motor m, int num){
        System.out.print("Agency2 import "+ num+ " "+ m.getName());
        if (m.getQuantity() >= num){
            factory.setState(m, m.getQuantity() - num);
        }
        else{
            System.out.println("Not enough!");
        }
    }
    @Override
    public void update(String msg, List<Motor> list) {
        System.out.println("\nAgency2 receive notify: "+msg);
        
    }
}