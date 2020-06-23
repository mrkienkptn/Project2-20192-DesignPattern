package factory;

public class Motor {
    private int cost;
    private int quantity;
    private String  name;
    public Motor(int cost, int quantity, String name){
        this.cost = cost;
        this.quantity = quantity;
        this.name  = name;
    }
    public String getName() {
        return name;
    }    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getCost() {
        return cost;
    }
    public int getQuantity() {
        return quantity;
    }
}