package manager;

import request.Request;

public class Director extends BaseManager {

    @Override
    protected boolean canAccept(int n_day, boolean want_quit) {
        if (n_day > 7 || want_quit)
            return true;
        return false;
    }
    @Override
    protected void doAccept(Request req) {
        System.out.print("Director: ");
        if (!req.wantQuitWork()){
            System.out.println("You can leave work in "+ req.getDay()+" days");
        }
        else{
            System.out.println("OK, You cann quit this work");
        }
    }    
}