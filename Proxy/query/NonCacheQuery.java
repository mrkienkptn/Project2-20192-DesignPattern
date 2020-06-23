package query;

import java.util.List;
import data.Student;

public class NonCacheQuery implements QueryService {
    Querier query = new Querier();
    @Override
    public List<Student> getData(String dbName) {
        return query.getData(dbName);
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