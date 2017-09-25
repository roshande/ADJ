/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package advj;

/**
 *
 * @author Vikas Chauhan
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Rail
{
    private static Scanner s;

    public static void main(String[] args) throws IOException
    {
        int a,b;
        s = new Scanner(System.in);
        
        String[] name = new String[100];
        int [] time = new int[100];
        
        System.out.println("----------Railway Ticket Booking----------");
        
        System.out.println("State the No. of windows do you want:- ");
        int no_win = s.nextInt();
        ExecutorService es=Executors.newFixedThreadPool(no_win);
        
        System.out.println("State the no of customer to book the ticket:- ");
        int no_cust = s.nextInt();
        
        System.out.println("Write name of customer & give estimated time:- ");
        for (a = 0; a < no_cust; a++) 
        {
            b=a+1;
            System.out.println("Booking no :- "+ b);
            System.out.print(b +".) Person Name:- ");
            name[a] = s.next();
            System.out.print("Time:- ");
            time[a] = s.nextInt();
        }
        
        System.out.println("\n-------Railway Ticket Booking Starts Now------");
        for ( a = 0; a < no_cust; a++) 
        {
            es.execute(new customer(name[a],time[a]));
        }
        es.shutdown();
    }
}

class customer implements Runnable
{
     String Name;
     int Time;
     customer (String n, int t)
     {
          Name=n;
          Time=t;
     }
     
     @Override
     public void run()
     {
     System.out.println(Name+" is now at window ");
        try 
        {
            Thread.sleep(Time);
        } catch (Exception e) 
        {
            e.getMessage();
        }
     System.out.println(Name+ " has got his Railway Tickets & he is leaving Queue");
     }
}
