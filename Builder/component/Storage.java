package component;

public class Storage {
    private String type;
    private int capacity;
    public Storage(String t, int c){
        type=t;
        capacity=c;
    }
    public void setType(String t){
        type=t;
    }
    public void setCapacity(int n){
        capacity=n;
    }
    public int getCapacity(){
        return capacity;
    }
    public String getType(){
        return type;
    }
    public void showInfo(){
        System.out.println("Storage:\n\t"+"Type: "+type+"\n\tCapacity: "+capacity);
    }
}