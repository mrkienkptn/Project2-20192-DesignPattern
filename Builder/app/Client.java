package app;
import concretebuilder.*;
import component.*;
import computer.*;
import director.*;
public class Client {
    public static void main(String args[]){
        //Use director
        System.out.println("Build a PC using Director: ");
        Director d=new Director();
        PCBuilder pcBuilder=new PCBuilder();
        d.buildGamingPC(pcBuilder);
        PC gamingPC=pcBuilder.getResult();
        gamingPC.turnON();
        gamingPC.showInfo();
        //Without use director
        System.out.println("===============================\nBuild a laptop do not use Director: ");
        LaptopBuilder lapBuilder= new LaptopBuilder();
        lapBuilder.setType("Cheap Laptop");
        lapBuilder.setCPU(new CPU("Intel core-i3 2.5Hz"));
        lapBuilder.setCPUCooling(new CPUCooling("Color Water Cooling"));
        lapBuilder.setRAM(new RAM(4));
        lapBuilder.setScreen(new Screen("Low quality screen", "SD"));
        lapBuilder.setStorage(new Storage("SSD", 256));
        Laptop lt= lapBuilder.getResult();
        lt.showInfo();
    }
}