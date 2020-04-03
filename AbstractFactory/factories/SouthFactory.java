package factories;
import cake.*;
import bread.*;
public class SouthFactory implements FoodFactory{

    @Override
    public Cake produceCake() {
        return new S_Cake();
    }

    @Override
    public Bread produceBread() {
        return new S_Bread();
    }
}