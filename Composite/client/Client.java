package client;

import commodity.*;
import commodity.product.*;

public class Client {
    public static void main(final String args[]) {
        final Box container = new Box("Container");
        container.add(
            new Box("Box1", 
                new Laptop(2000, "Thinkpad"),
                new Phone(1000, "Samsung"),
                new Laptop(1500, "DELL"),
                new Box("Box2",
                    new Phone(1200, "Sony"),
                    new Phone (20, "Nokia 1280")
                )
            ),
            new Phone(500, "Iphone 7"),
            new Laptop(850, "Acer")
        );
        System.out.println(
            "=======================================\nTotal cost: "
            + container.getCost());
        System.out.println(
            "\n----------------------------------------\nInformation: ");
        container.showInfo();
    }
}