package concretebuilder;
import builder.*;
import component.*;
import computer.*;
public class PCBuilder implements ComputerBuilder {
    private Type type;
    private String optionType;
    private CPU cpu;
    private CPUCooling cpuc;
    private PowerSupply pws;
    private RAM ram;
    private Screen screen;
    private Storage str;
    @Override
    public void setType(Type type) {
        this.type=type;

    }
    @Override
    public void setType(String s){
        this.optionType=s;
    }
    @Override
    public void setCPU(CPU cpu) {
        this.cpu=cpu;

    }

    @Override
    public void setCPUCooling(CPUCooling cpuc) {
        this.cpuc=cpuc;

    }

    @Override
    public void setPowerSupply(PowerSupply pws) {
        this.pws=pws;

    }

    @Override
    public void setRAM(RAM ram) {
        this.ram=ram;

    }

    @Override
    public void setScreen(Screen screen) {
        this.screen=screen;

    }

    @Override
    public void setStorage(Storage str) {
        this.str=str;
    }
    public PC getResult(){
        return new PC(type, optionType, cpu, cpuc, pws, ram, screen, str);
    }

}