/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithread;

/**
 *
 * @author Jasmeet kaur
 */
public class FirstThread extends Thread{
    
    FirstThread()
    {
        super("First thread ");
        System.out.println("First thread created ");
        start();
    }
    public void run()
    {
         try 
        {
        for(int i=1; i<=5 ; i++)
        {
           
                System.out.println("Forst thread : " +i);
                Thread.sleep(1000);  
              //  FirstThread start();  //Starts execution
        }
        } 
        catch(InterruptedException e) 
        { 
            e.printStackTrace(); 
        }
         finally
         {
             System.out.println("Existing from first thread");
         }
    }
    
}
