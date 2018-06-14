package multithread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasmeet kaur
 */
public class SecondThread implements Runnable{
    
    Thread t;
    String name;
    
    public SecondThread(String name)
    {
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("Second thread created " + t);
        t.start();
    }

    @Override
    public void run() {
         try 
        {
        for(int i=1; i<=5 ; i++)
        {
                System.out.println("Forst thread : " +i);
              
                Thread.sleep(1000);  
              //  FirstThread start();  //Starts execution
        }
        } 
        catch(InterruptedException ex) 
        { 
            ex.printStackTrace(); 
        }
         finally
         {
             System.out.println("Existing from first thread");
         }
        }
    
    
}
