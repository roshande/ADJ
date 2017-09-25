/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ThreadExample implements Runnable {

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("Outer Run: "+Thread.currentThread().getName());
        
        for(int i=0;i<10;++i)
        {
            try {
                System.out.println(""+i+Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
       /* System.out.println("In Main: "+Thread.currentThread().getName());
        
        ThreadExample expl = new ThreadExample();
        //no start method accessible
        expl.run();
        
        Thread t = new Thread("AnonymousThread"){
            @Override
            public void run(){
                System.out.println("Anonymous Inner Run: "+Thread.currentThread().getName());
            }
        };
        //to run call start
        t.start();
        t.run();
        
        Thread t1 = new Thread(expl,"t1");
        t1.start();
        //t.start();
               */
        
        //same call stack
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        
        //t1.run();
        //t2.run();
        
        //different call stack/pool
        //Multithreaded
        //control passes in between threads
        Thread t3 = new Thread(t1,"t3");
        Thread t4 = new Thread(t2,"t4");
        
        t3.start();
        t4.start();

    }
}
