package subsystem;

public class GetInfo{
    public static String returnInfo(User user){
        System.out.println("Get user information done");
        System.out.println( "Username: "+user.username+"\nPassword: "+ user.password);
        return user.username+" "+user.password;
    }
}