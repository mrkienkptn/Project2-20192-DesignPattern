package commodity;

public interface Commodity {
    int getCost();
    void showInfo();
    String getName();
    void add(Commodity a);
    void add (Commodity ...a);
}