/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jasmeet kaur
 */
public class MultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1 = new Thread();
        System.out.println("Current thread : " + t1);
        
        t1.setName("Test thread");
        t1.setPriority(10);
        System.out.println("Thread info after modification : " +t1);
        System.out.println("State of thread t1 : " +t1.getState());
        System.out.println("State of thread t1 alive or dead : " +t1.isAlive());
        System.out.println("State of thread t1 daemon or non-daemon : " +t1.isDaemon());
        
        try 
        {
        for(int i=1; i<=3 ; i++)
        {
           
                System.out.println("Main thread : " +i);
                new FirstThread();
                new SecondThread("Second cups");
                new SecondThread("Second innings");
                
                Thread.sleep(1000);
                System.out.println("State of thread t1 : " +t1.getState());
        }
        } 
        catch(InterruptedException ex) 
        { 
            ex.printStackTrace(); 
        }
         finally
         {
             System.out.println("Existing from main thread");
         }
    }
    
}
