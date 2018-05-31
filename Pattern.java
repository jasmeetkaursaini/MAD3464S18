/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasmeet
 */
public class Pattern {
    public static void main(String[] args)
    {
        
        int i;
        int j;
        int space;
   
        // Square pattren
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1 || i==5 || j==1 || j==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }                   
                           
        System.out.println(" "); 
       
        // Hollow diamond pattern
        
       
        
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        
        for(i=2;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        
        
                                          
    }   
}
