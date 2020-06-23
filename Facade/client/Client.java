package client;
import facade.*;
public class Client {
    public static void main(String args[]){
        LoginFacade L = new LoginFacade();
        L.login("ABCDEFH", "1234567");
        L.login("Kien", "1234");
        L.login("LOLOLOLOL", "1234567");
    }
}