/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecutorServiceDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class CommonTask implements Runnable{
    static int count = 1;
    int id;

    public CommonTask() {
        this.id=count++;
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Start " + this.id + Thread.currentThread().getName());
        for(int i=0;i<11;++i)
        {
            System.out.println(""+this.id+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CommonTask.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("End " + this.id);
    }
}
