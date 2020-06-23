package client;

import query.CacheQuery;
import query.NonCacheQuery;
import query.QueryService;
import data.Student;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        QueryService cacheQuerrier = new CacheQuery();
        QueryService nonCacheQuerrier = new NonCacheQuery();

        System.out.println("Use Proxy Cache");
        long startTime = System.currentTimeMillis();
        List <Student> L1 = cacheQuerrier.getData("Student1");
        cacheQuerrier.showDb(L1);
        List <Student> L2 = cacheQuerrier.getData("Student2");
        cacheQuerrier.showDb(L2);
        List <Student> L3 = cacheQuerrier.getData("Student1");
        cacheQuerrier.showDb(L3);
        long finishTime = System.currentTimeMillis();
        System.out.println("Time by using Cache: "+ (finishTime - startTime));

        System.out.println("\n-------------------------\nNot Use Proxy Cache");
        startTime = System.currentTimeMillis();
        L1 = nonCacheQuerrier.getData("Student1");
        nonCacheQuerrier.showDb(L1);
        L2 = nonCacheQuerrier.getData("Student2");
        nonCacheQuerrier.showDb(L2);
        L3 = nonCacheQuerrier.getData("Student1");
        nonCacheQuerrier.showDb(L3);
        finishTime = System.currentTimeMillis();
        System.out.println("Time by not using Cache: "+ (finishTime - startTime));

    }
}