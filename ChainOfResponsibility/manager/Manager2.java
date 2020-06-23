package manager;

import request.Request;

public class Manager2 extends BaseManager {

    @Override
    protected boolean canAccept(int n_day, boolean want_quit) {
        if (n_day <= 7 && !want_quit)
            return true;
        return false;
    }
    @Override
    protected void doAccept(Request req) {
        System.out.print("Manager2: ");
        System.out.println("You can leave in " + req.getDay() + " days");

    }
}