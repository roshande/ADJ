/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package advj;

//import java.io.FileNotFoundException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * *************
 * Java Thread pool represents a group of worker threads that are waiting for
 * the job and reuse many times.
 *
 * In case of thread pool, a group of fixed size threads are created. A thread
 * from the thread pool is pulled out and assigned a job by the service
 * provider. After completion of the job, thread is contained in the thread pool
 * again.
 *
 */
/**
 *
 * @author Vikas Chauhan
 */
//FixedThreadPool
//See common task class
public class EXE1 {

    public static void main(String a[])  {
        //CommonTask x = new CommonTask("")
        System.out.println("Main Starts");
        ExecutorService es = Executors.newFixedThreadPool(3);//initialisation on executor service

        //service
        es.execute(new CommonTask("f1"));//execute starts specified thr
        es.execute(new CommonTask("f2"));
        es.execute(new CommonTask("f3"));
        //if one finishes other starts; but not more than 3 at a time;will wait in queue till other finishess
        es.execute(new CommonTask("f4"));
        es.execute(new CommonTask("f5"));
        es.execute(new CommonTask("f6"));
        ///////////////////////////////////////////////////////////////
        es.execute(() -> {
            System.out.println("Asynchronous task 1:" + Thread.currentThread().getName());
        });
      //  ExecutorService es1 = Executors.newSingleThreadExecutor();
      
//        es1.execute(new Runnable() {
//            public void run() {
//                System.out.println("Asynchronous task 2:" + Thread.currentThread().getName());
//            }
//        });
        //destruction
        //es.shutdownNow();
        es.shutdown();//stops invoking ExecutorService//will keep running if not shutdown//memory leak if not;
        //es.execute(new CommonTask("1")); //rejected Execution//will not accept any new task for execution

        System.out.println("Main Ends");
    }
}
