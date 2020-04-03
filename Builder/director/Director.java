package director;

import builder.ComputerBuilder;

import component.*;
import computer.Type;

public class Director {
    public void buildGamingPC(ComputerBuilder builder){
        builder.setType(Type.GAMING_PC);
        builder.setCPU(new CPU("Intel Core-i9 9900K 4.5Hz"));
        builder.setCPUCooling(new CPUCooling("Water Cooling"));
        builder.setPowerSupply(new PowerSupply("Corsail SM Series RM850", 850));
        builder.setRAM(new RAM(16));
        builder.setScreen(new Screen("Samsung", "4K-IPS"));
        builder.setStorage(new Storage("SSD", 1024));

    }
    public void buildOfficePC(ComputerBuilder builder){
        builder.setType(Type.OFFICE_PC);
        builder.setCPU(new CPU("Intel Core-i5 5000 3.5Hz"));
        builder.setCPUCooling(new CPUCooling("Fan Cooling"));
        builder.setPowerSupply(new PowerSupply("Cooler Master ELITE 500PK v3", 500));
        builder.setRAM(new RAM(16));
        builder.setScreen(new Screen("Samsung", "FullHD"));
        builder.setStorage(new Storage("HDD", 1024));

    }
    public void buildBussinessLaptop(ComputerBuilder builder){
        builder.setType(Type.BUSSINESS_LAPTOP);
        builder.setCPU(new CPU("Intel Core-i7 8500U 4.0Hz"));
        builder.setCPUCooling(new CPUCooling("Fan Cooling"));
       
        builder.setRAM(new RAM(16));
        builder.setScreen(new Screen("Laptop Screen", "2K"));
        builder.setStorage(new Storage("SSD", 512));

    }
    public void buildWorkStationLaptop(ComputerBuilder builder){
        builder.setType(Type.WORKSTATION_LAPTOP);
        builder.setCPU(new CPU("Intel Core-i7 7900K 4.5Hz"));
        builder.setCPUCooling(new CPUCooling("2 Fan Cooling"));
        builder.setRAM(new RAM(16));
        builder.setScreen(new Screen("Laptop Screeen", "2K"));
        builder.setStorage(new Storage("SSD", 1024));

    }
}