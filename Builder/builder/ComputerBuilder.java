package builder;
import computer.Type;
import component.*;
public interface ComputerBuilder {
    void setType(Type type);
    void setCPU(CPU cpu);
    void setType(String optionType);
    void setCPUCooling(CPUCooling cpuc);
    void setPowerSupply(PowerSupply pws);
    void setRAM(RAM ram);
    void setScreen(Screen screen);
    void setStorage(Storage str);
}