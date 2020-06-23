package adapter;

import energy.Energy;

public interface Target {
    void work(Energy e);
    Energy getEnergy();
}