/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasmeet kaur
 */
public class StringHandling {
    public static void main(String[] args)
    {
        String str1 = "Test";
        String str2 =new String("Java");
        
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        
        String str3 = str1 +str2 ;
        str3 = str2.concat(str1);
        
        System.out.println("String 3 : " + str3);
        
        
        //method of string and property of array
        int len = str2.length();
        System.out.println("Length : " + len);
        
        for(int i=0; i<= str2.length()-1 ; i++)
        {
            System.out.print(str2.charAt(i) + " ");
        }
        System.out.println("");
        
        str2 = "Test string";
        for(int i=0; i<= str2.length()-1 ; i+=2)
        {
            System.out.print("i: " + i);
            System.out.print(str2.charAt(i) + " ");
        }
        System.out.println("");    
        
        for(int i=str2.length()-1; i>=0 ; i--)
        {
            System.out.print("i: " + i);
            System.out.print(str2.charAt(i) + " ");
        }
        System.out.println(""); 
        //str2.reverse();   function is not used in java
        
        
        str2 = "Java";
        str3 = "java" ;
        
        if(str2.equals(str3))
            System.out.println("Equal string");
        else
            System.out.println("Different string");
        
        str2 = "Java";
        str3 = "Jbva" ;
        System.out.println(str2.compareToIgnoreCase(str3)); //compareTo is case sensitive
        
        System.out.println(str2.endsWith("va"));
        
        str2 = "This is a test String";
        int p;
        p = str2.indexOf('i');
        System.out.println("p : " + p);
        
        int q = str2.indexOf("test");
        System.out.println("q : " + q);
        
        int s = str2.indexOf('i',4);
        System.out.println("s : " + s);
        
        int t = str2.lastIndexOf('i');
        System.out.println("t : " + t);
        
        System.out.println(str2.replace('i', '$'));
        
         str2 = "This is a test String";
         //Integer:  wrapper class for primitive datatype
        int wordCount =0;
        for (int i = 0; i < str2.length() ; i++) 
        {
            if(Character.isWhitespace(str2.charAt(i)))
            {
                wordCount++;
            }
        }
        System.out.println("Word Count : " + wordCount++);
        
        
        StringBuffer str4 = new StringBuffer("Hello There");
        int len1 = str4.length();
        
        System.out.println("String 4 : " + str4);
        str4.append("Good Afternoon");
        
        str4.setCharAt(1, '&');
        str4.insert(4, "@@");
        System.out.println("String 4 : " + str4);
        
        System.out.println(str4.reverse());
                
              //  how to update content of string buffer
        
        str4.replace(0 , str4.length(),"welcome to the world");
        System.out.println("After replacing String 4 : " +str4);
        
        
    }
}
