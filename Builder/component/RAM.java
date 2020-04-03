package component;

public class RAM {
    private int capacity;
    public RAM(int c){
        capacity=c;
    }
    public void setCapacity(int n){
        capacity=n;
    }
    public int getCapacity(){
        return capacity;
    }
    public void showInfo(){
        System.out.println("RAM: "+capacity+"GB");
    }
}