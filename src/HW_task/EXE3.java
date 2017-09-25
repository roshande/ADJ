/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package advj;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Vikas Chauhan
 */
//Single Thread executor
public class EXE3 {
      public static void main(String a[])
    {
        System.out.println("Main Starts");
        ExecutorService es = Executors.newSingleThreadExecutor();//spl case of FixedTP n=1
   
        //service
        es.execute(new CommonTask("f1"));//only one at a time no matter how many task submitted
        es.execute(new CommonTask("f2"));
        es.execute(new CommonTask("f3"));
       /* 
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        es.execute(new CommonTask());
        */
        //destruction
        es.shutdown();//will keep running if not shutdown//memory leak if not; and close the program
        
       // es.execute(new CommonTask()); //rejected Execution//will not accept any new task for execution
        System.out.println("Main Ends");
    }
}
