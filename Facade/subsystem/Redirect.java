package subsystem;

public class Redirect {
    public static void redirect(User user){
        System.out.println("Redirect to http://abc.com/"+user.username);
    }
    public static void redirect(String path){
        System.out.println("Redirect to http://abc.com/"+path);
    }
}