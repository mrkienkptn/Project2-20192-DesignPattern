package agency;

import java.util.List;

import factory.Motor;
import factory.MotorFactory;

public class Agency1 implements Agency {
    private MotorFactory factory;

    public Agency1(MotorFactory factory) {
        this.factory = factory;
        factory.attach(this);
    }
    @Override
    public void importMotor(Motor m, int num) {
        System.out.print("Agency2 import " + num + " " + m.getName());
        if (m.getQuantity() >= num) {
            factory.setState(m, m.getQuantity() - num);
        } else {
            System.out.println("Not enough!");
        }
    }

    @Override
    public void update(String msg, List<Motor> list) {
    
        System.out.println("\nAgency1 receive notify:"+msg);
        String cannotImport = "Agency2 cannot import: ";
        for (Motor m: list){
            if (m.getCost()>50){
                cannotImport += m.getName();
            }
        }
        if (cannotImport != "Agency2 cannot import: ")
            System.out.println(cannotImport);
    }
}