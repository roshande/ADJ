/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package advj;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vikas Chauhan
 */
public class CommonTask implements Runnable {

    static int cnt = 1;
    static boolean found = false;
    String file;
    int id;

    @Override
    public void run() {
        System.out.println("Start: " + id + " -->" + Thread.currentThread().getName() + " File:" + file);
        for (int i = 10; i > 0; i--) {
            if (found) {
                System.out.println("Already Found...");
                break;
            }
            try {
                System.out.println("id:" + id + " Task:" + i);
                Thread.sleep((long) (Math.random() * 1000));
                if (file.equals("f3") && i == 5) {
                    found = true;
                    System.out.println("Found...");
                    break;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(CommonTask.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("End: " + id);
    }

    public CommonTask(String f) {
        this.id = ++cnt;
        this.file = f;
    }
}
