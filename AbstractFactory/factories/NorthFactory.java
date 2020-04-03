package factories;
import bread.*;
import cake.*;
public class NorthFactory implements FoodFactory{

	@Override
	public Cake produceCake() {
        return new N_Cake();
	}

	@Override
	public Bread produceBread() {
		return new N_Bread();
	}
    
}