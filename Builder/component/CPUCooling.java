package component;

public class CPUCooling {
    private  String name;
    public CPUCooling(String name){
        this.name=name;
    }
    public void setName(String s){
        name=s;
    }
    public String getName(){
        return name;
    }
    public void showInfo(){
        System.out.println("CPU cooling name: "+ name);
    }
}