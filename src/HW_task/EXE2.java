/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//FixedThreadPool
//See Cached Thread Pool
//package advj;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Vikas Chauhan
 */

public class EXE2 {
    public static void main(String a[])
    {
        System.out.println("Main Starts");
        ExecutorService es = Executors.newCachedThreadPool();//initialisation on executor service
      
        //service
        es.execute(new CommonTask("f1"));
        es.execute(new CommonTask("f2"));
        es.execute(new CommonTask("f3"));
     //   all will start and not wait for other to finish (reuses thr if possible); simultaneously all will work;will create as many thr as submited task
        es.execute(new CommonTask("f4"));
        es.execute(new CommonTask("f5"));
        es.execute(new CommonTask("f6"));
        es.execute(new CommonTask("f7"));
        es.execute(new CommonTask("f8"));
        es.execute(new CommonTask("f9"));
     //   all will start and not wait for other to finish (reuses thr if possible); simultaneously all will work;will create as many thr as submited task
        es.execute(new CommonTask("f10"));
        es.execute(new CommonTask("f11"));
        es.execute(new CommonTask("f12"));
        
        es.execute(new CommonTask("f13"));
        es.execute(new CommonTask("f14"));
        es.execute(new CommonTask("f15"));
     //   all will start and not wait for other to finish (reuses thr if possible); simultaneously all will work;will create as many thr as submited task
        es.execute(new CommonTask("f16"));
        es.execute(new CommonTask("f17"));
        es.execute(new CommonTask("f18"));
        //destruction
        es.shutdown();//will keep running if not shutdown//memory leak if not; and close the program
        
       // es.execute(new CommonTask()); //rejected Execution//will not accept any new task for execution
        System.out.println("Main Ends");
    }
}
