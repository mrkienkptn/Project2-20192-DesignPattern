package app;
import java.util.Scanner;
import factories.*;

public class Demo{
    public void configApplication(){
        Application app;
        FoodFactory f;
        System.out.println("========================\nProduce South Factory's products: input 1"+ 
                            "\nProduce North Factory's products: input 2"+
                            "\nStop produce: input 0"); 
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();

        while(i!=0){            
            if (i==1){
                f=new SouthFactory();
                app=new Application(f);
                app.print();
            }
            else{
                f=new NorthFactory();
                app=new Application(f);
                app.print();
            }
            i=input.nextInt();
        }
        input.close();
    }
    public static void main(String args[]){
        Demo d= new Demo();
        d.configApplication();
    }
}