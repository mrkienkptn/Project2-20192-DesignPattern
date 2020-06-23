package query;

import java.util.ArrayList;
import java.util.List;

import data.Student;

public class CacheQuery implements QueryService {
    private Querier query = new Querier();

    private List <String> querriedList = new ArrayList<String>();
    private List <List <Student> > listDb = new ArrayList<>();
    @Override
    public List <Student> getData(String dbName) {
        // Kiểm tra xem dbName có trong cache chưa
        // nếu có
        if (this.querriedList.contains(dbName)){
            System.out.println("Data of \' " + dbName + "\' is exist in cache");
            int index = this.querriedList.indexOf(dbName);
            return this.listDb.get(index) ;
        }
        // nếu không có
        else{
            System.out.println("Data of " + dbName + " is not exist in cache");
            querriedList.add(dbName);
            List <Student> L = new ArrayList<>();
            try{
                L = query.getData(dbName);

            }catch(NullPointerException e){
                e.printStackTrace();
            }
            listDb.add(L);
            return L;
        }
    }

    @Override
    public void showDb(List<Student> db) {
        int i = 1;
        
        for (Student s: db){
            System.out.println(i + ". " + s.getName());
            i++;
        }
    }
}