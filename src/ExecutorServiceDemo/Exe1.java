/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author student
 */
public class Exe1 {
    public static void main(String[] args) {
        System.out.println("Main Start");
        
        //Threads aren't reusable by default
        //Reusable thread pool
        //newFixedThreadPool,newSingleThreadExecutor,newCachedThreadPool
        //
        ExecutorService es = Executors.newSingleThreadExecutor();
        /*es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        */
        
        for(int i=0;i<100;++i)
            es.execute(new CommonTask());
        
        es.shutdown();//no more assignment of job
        System.out.println("Main Ends");
    }
}
