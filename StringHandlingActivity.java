/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasmeet kaur
 */
public class StringHandlingActivity {
    public static void  main(String[] args)
    {
        
        StringBuffer str4 = new StringBuffer("Hello There");
        System.out.println("String 4 : " + str4);
        
             // How to replace string (How to update content of string buffer)
        
        str4.replace(0 , str4.length(),"Welcome to the world");
        System.out.println("After replacing String 4 : " +str4);
        
             //  How to reverse a sentence
      
        String str = "Five hundred days of SUMMER";    
        System.out.println("\nFive hundred days of SUMMER");
        
        String[] split = str.split(" ");
        String result = "";
        for (int i = split.length -1 ; i >= 0 ; i--)
        {
            result += (split[i] + " ");
        }
        System.out.println("Reverse sentence is : " + result.trim());
    }    
}
