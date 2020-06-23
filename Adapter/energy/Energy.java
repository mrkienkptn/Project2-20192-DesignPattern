package energy;

public class Energy {
    private String type;
    public Energy(){}
    public Energy(String t){
        type = t;
    }
    public void setType(String t){
        type = t;
    }
    public String showType(){
        return type;
    }
}