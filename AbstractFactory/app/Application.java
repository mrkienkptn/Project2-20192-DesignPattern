package app;
import factories.FoodFactory;
import cake.Cake;
import bread.Bread;
public class Application{
    private Cake cake;
    private Bread bread;
    public Application(FoodFactory f){
        cake=f.produceCake();
        bread=f.produceBread();
    }
    public void print(){
        cake.print();
        bread.print();
    }
}