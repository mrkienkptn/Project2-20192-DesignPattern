package manager;

import request.*;

public abstract class BaseManager{
    protected String name = this.getClass().getName();
    private BaseManager nextManager;

    public void accept(Request req) throws NullPointerException{

        System.out.println("Check permission for "+this.name);
        if (this.canAccept(req.getDay(), req.wantQuitWork())){            
            doAccept(req);            
        }
        else if(this.nextManager != null){
            System.out.println("Forward request to "+ nextManager.name);
            nextManager.accept(req);
        }
    }

    public void setNext(BaseManager manager){        
        this.nextManager = manager;        
    }
    protected abstract boolean canAccept(int n_day, boolean stop);
    protected abstract void doAccept(Request req);
}