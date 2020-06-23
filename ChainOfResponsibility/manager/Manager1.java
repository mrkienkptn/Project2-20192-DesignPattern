package manager;

import request.Request;

public class Manager1 extends BaseManager {
    
    @Override
    protected boolean canAccept(int n_day, boolean want_quit) {
        if (n_day <= 3 && !want_quit)
            return true;
        return false;
    }
    @Override
    protected void doAccept(Request req) {
        System.out.print("Manager1: ");
        System.out.println("You can leave in "+ req.getDay() + " days");

    }    
}