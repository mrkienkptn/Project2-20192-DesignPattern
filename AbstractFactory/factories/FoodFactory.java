package factories;
import cake.Cake;
import bread.Bread;
public interface FoodFactory{
    Cake produceCake();
    Bread produceBread();
}
