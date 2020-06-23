package facade;
import subsystem.*;
public class LoginFacade {
    private static int count=1;
    public void login(String username, String password){
        System.out.println("\n--------------------------------");
        System.out.println("Client: "+count);
        User user = new User(username, password);
        String info = GetInfo.returnInfo(user);
        boolean valid = CheckValid.check(user);
        if (valid) {
            count ++;
            QueryDB.query(info);
            Redirect.redirect(user);
            StoreInSession.store(info);
        }
        else{
            Redirect.redirect("login");
        }
    }
}