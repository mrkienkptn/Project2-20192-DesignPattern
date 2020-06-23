package commodity;

public abstract class Item implements Commodity{
    protected int cost;
    protected String name;
    public Item(int cost, String name){
        this.cost = cost;
        this.name = name;
    }
    public Item(String name){
        this.name = name;
    }
    @Override
    public int getCost(){
        return this.cost;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void add(Commodity c){}
    @Override
    public void add(Commodity ...c){}
}