/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasmeet
 */
public class Arithmetic {
    
    int num1 = 10;
    
    void addition()
    {
        System.out.println("Addition = "+ (num1+20));
    }
    
    int addition(int n1,int n2)
    {
        //System.out.println("Sum of " + n1 + " Add " + n2 + " is " + (n1+n2));
        return (n1 + n2);
    }
    
    //To handle float value
    float addition(float n1,float n2)
    {
        return (n1 + n2);
    }
    
    //bound to parameters
    /* void addition(int [] n1)
    {
        int sum=0;
        for(int i=0; i<n1.length; i++)
        {
            sum += n1[i];
        }
        System.out.println("Sum = "+sum);
    } */
    
    // not bound to parameters
    void addition(int... numbers)
    {
        int sum=0;
        for(int no: numbers)
        {
            sum +=no;
        }
        System.out.println("Sum = " + sum);
    }
    
}
