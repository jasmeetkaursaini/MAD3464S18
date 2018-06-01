/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class DailyTask {
    
    public static void main(String[] args)
    {
        System.out.println("Method overloading Programs");
        
        //object creation
        // Type and variable name(object of class arithmetic)
        Arithmetic operation1 = new Arithmetic();
        operation1.num1 = 20;
        System.out.println("Number 1 = "+ operation1.num1);
        operation1.addition();
        
        // Addition
        //int       
        int sum = operation1.addition(23, 45);
        System.out.println("Sum = " + sum);
        
        //float
        float fsum = operation1.addition(123.45f, 12.12f);
        System.out.println("Float sum = " + fsum);
        
        int [] number = {10,20,30,45};
        operation1.addition(number);
        
        //int... indicates many number of parameters
        operation1.addition(1,2,3);
        operation1.addition(1,5,3,8,9,5,7,45,25);
        
    }
    
}
