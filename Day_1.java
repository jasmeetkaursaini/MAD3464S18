/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_1;

/**
 *
 * @author macstudent
 */
public class Day_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello JAVA");
        // TODO code application logic here
        int n1=10;
        float f1=10.5f;
        double d1=12.8234782;
        short s1=12;
        char c1='a';
        String str1="Java";
        boolean b1=true;
        
        
      System.out.println("Value of integer is " + n1);
        System.out.println("Value of float is " + f1);
        System.out.println("Value of double is " + d1);
        System.out.println("Value of short is " + s1);
        System.out.println("Value of char is " + c1);
        System.out.println("Value of string is " + str1);
        System.out.println("Value of boolean is " + b1);
        
        n1 *= 20; //n1=n1*20;
         System.out.println("Value of n1 is " + n1);
         
        n1++; //n1=n1+1;
        System.out.println("Value of n1 is " + n1);
         
        ++n1; //n1=202;
        System.out.println("Value of n1 is " + n1);
          
        n1--; // n1=n1-1 where n1=202
        System.out.println("Value of n1 is " + n1);
           
        //n1=201
           
        int n2=++n1;
        System.out.println("Value of n2 is " + n2);
        System.out.println("Value of n1 is " + n1);
             
        System.out.println("Value of n1 is " + (n1 + 10));
        
        System.out.println( n1 + 10 + "Value of n1 is " );
        
        c1='A';
        
        System.out.println("Value of c1 is " + c1);
        System.out.println("Value of c1 is " + c1 + 10 );
        System.out.println("Value of c1 is " +(char)(c1+10) );
        System.out.println("Value of c1 is " + ++c1);
        System.out.println("Value of c1 is " + c1++);
    }
    
}
