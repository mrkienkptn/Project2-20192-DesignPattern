package client;

import manager.BaseManager;
import manager.Director;
import manager.Manager1;
import manager.Manager2;

public class Flow {
    public static BaseManager getManager() throws NullPointerException{
        BaseManager manager1 = new Manager1();
        BaseManager manager2 = new Manager2();
        BaseManager director = new Director();

        manager1.setNext(manager2);
        manager2.setNext(director);

        return manager1;
    }
}