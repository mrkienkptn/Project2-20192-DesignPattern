package query;
import java.util.List;
import data.Student;

public interface QueryService {
    List <Student> getData(String dbName);
    void showDb(List<Student> db);
}