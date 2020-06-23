package client;

import agency.Agency1;
import agency.Agency2;
import factory.Motor;
import factory.MotorFactory;

public class Client {
    public static void main(String[] args) {
        MotorFactory factory = new MotorFactory();

        Agency1 agency1 = new Agency1(factory);
        Agency2 agency2 = new Agency2(factory);

        Motor m1 = new Motor(30, 1000,"Wave");
        
        factory.newProduct(m1);
        
        System.out.println("--------------------------");
        agency1.importMotor(m1, 100);

        Motor m3 = new Motor(100, 100, "SH");
        factory.newProduct(m3);
        System.out.println("--------------------------");
        agency2.importMotor(m1, 20);
        System.out.println("--------------------------");
        agency2.importMotor(m3, 50);
    }
}