package query;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.Student;

public class Querier implements QueryService {
// connect to database
    private void connectDatabase(String dbName){
        System.out.println("Connecting to database" + dbName + "...");
        try{
            Thread.sleep(400);
            System.out.println("Database  \" " + dbName + " \" is connected");
        }catch(InterruptedException e){
            e.printStackTrace();
        }        
    }
    @Override
    public List <Student> getData(String dbName) {
        List <Student> list = new ArrayList<>();

        try{
            connectDatabase(dbName);
            File myDb = new File("Proxy/database" + File.separator + dbName + ".txt");
            Scanner reader = new Scanner(myDb);
            while(reader.hasNextLine()){
                Student newStudent = new Student(reader.nextLine());
                list.add(newStudent);
            }
            reader.close();            
        }catch(FileNotFoundException e){
            System.out.println("Error while getting data from " + dbName);
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void showDb(List<Student> db) {}
    
}