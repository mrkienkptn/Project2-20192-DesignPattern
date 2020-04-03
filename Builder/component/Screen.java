package component;

public class Screen {
    private String type;
    private String resolution;
    public Screen(String type, String res){
        this.type=type;
        this.resolution=res;
    }
    public void setType(String t){
        type=t;
    }
    public void setCapacity(String n){
        resolution=n;
    }
    public String getCapacity(){
        return resolution;
    }
    public String getType(){
        return type;
    }
    public void showInfo(){
        System.out.println("Screen:\n\t"+"Type: "+type+"\n\tResolution: "+resolution);
    }
}