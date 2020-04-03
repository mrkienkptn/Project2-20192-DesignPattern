package component;

public class CPU {
    private  String name;
    public CPU(String name){
        this.name=name;
    }
    public void setName(String s){
        name=s;
    }
    public String getName(){
        return name;
    }
    public void showInfo(){
        System.out.println("CPU name: "+ name);
    }
}