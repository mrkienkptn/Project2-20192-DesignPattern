package computer;
import component.*;
public class Laptop {
    private final Type type;
    private final String optionType;
    private final CPU cpu;
    private final CPUCooling cpuc;
    private final RAM ram;
    private final Screen screen;
    private final Storage str;
    
    public Laptop(Type type, String optionType, CPU cpu, CPUCooling cpuc, RAM ram, Screen screen, Storage str){
        this.cpu=cpu;
        this.type=type;
        this.cpuc=cpuc;
        this.ram=ram;
        this.screen=screen;
        this.str=str;
        this.optionType=optionType;
    }
    public Type getType(){
        return this.type;
    }
    public CPU getCpu(){
        return this.cpu;
    }
    public CPUCooling getCpuCooling(){
        return cpuc;
    }
    public RAM getRam(){
        return ram;
    }
    public Screen getScreen(){
        return screen;
    }
    public Storage getStorage(){
        return str;
    }
    public String getOptionType(){
        return optionType;
    }
    public void showInfo(){
        if (type!=null)
            System.out.println("Type: "+ type);
        if (optionType!="")
            System.out.println("Type: "+ optionType);
        cpu.showInfo();
        cpuc.showInfo();
        ram.showInfo();
        screen.showInfo();
        str.showInfo();
    }
}