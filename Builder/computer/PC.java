package computer;


import component.*;
public class PC {
    private final Type type;
    private final String optionType;
    private final CPU cpu;
    private final CPUCooling cpuc;
    private final PowerSupply pws;
    private final RAM ram;
    private final Screen screen;
    private final Storage str;
    
    public PC(Type type, String optionType, CPU cpu, CPUCooling cpuc, PowerSupply pws, RAM ram, Screen screen, Storage str){
        this.cpu=cpu;
        this.cpuc=cpuc;
        this.pws=pws;
        this.ram=ram;
        this.screen=screen;
        this.str=str;
        this.type=type;
        this.optionType=optionType;
    }

    public void showInfo(){
        if (type!=null)
            System.out.println("Type: "+ type);
        if (optionType!="")
            System.out.println("Type: "+ optionType);
        cpu.showInfo();
        cpuc.showInfo();
        pws.showInfo();
        ram.showInfo();
        screen.showInfo();
        str.showInfo();
    }
    public void turnON(){
        pws.ON();
        pws.showStatus();
    }

}