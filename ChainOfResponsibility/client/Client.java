package client;
import request.*;

public class Client {
    public static void main(String args[]) throws NullPointerException{
        Request leave3Day = new Request(3);
        Flow.getManager().accept(leave3Day);
        System.out.println("==================");

        Request leave5Day = new Request(5);
        Flow.getManager().accept(leave5Day);
        System.out.println("==================");

        Request leave20Day = new Request(20);
        Flow.getManager().accept(leave20Day);
        System.out.println("==================");

        Request quitWork = new Request(true);
        Flow.getManager().accept(quitWork);
        System.out.println("==================");
    }
}