package subsystem;

public class CheckValid {
    public static boolean check(User user){
        System.out.println("Checked user information");
        if (user.username.length()<6) {
            System.out.println("ERROR: Username is at least 6 characters");
            return false;
        }
        else if (user.password.length()<6){
            System.out.println("ERROR: Username is at least 6 characters");
            return false;
        }
        else {
            System.out.println("User name and password are valid");
            return true;
        }
    }
}