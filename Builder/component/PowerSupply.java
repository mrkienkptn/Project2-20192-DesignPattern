package component;

public class PowerSupply {
    private String name;
    private int wattage;
    private boolean isON=false;
    public PowerSupply(String n, int w){
        name=n;
        wattage=w;
    }
    public void setwattage(int w){
        wattage=w;
    }
    public void setName(String n){
        name=n;
    }
    public int getWattage(){
        return wattage;
    }
    public String getName(){
        return name;
    }
    public void showInfo(){
        System.out.println("Power supply:\n"+"\tName: "+ name+ "\n\tWattage: "+wattage+"\n");
    }
    public void ON(){
        isON=true;
    }
    public void OFF(){
        isON=false;
    }
    public void showStatus(){
        if (isON)
            System.out.println("Computer is on");
        else 
        System.out.println("Computer is off");
    }
}