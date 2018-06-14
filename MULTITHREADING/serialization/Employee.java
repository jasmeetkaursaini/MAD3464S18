/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serialization;

/**
 *
 * @author Jasmeet kaur
 */
public class Employee implements java.io.Serializable {
    
    public String name;
    public String address;
    //public transient int SSN 
   public int SSN;
    public int number ;
    
    public void mailCheque()
    {
        System.out.println("Mailing a cheque to " + name + " " + number);
    }
}
