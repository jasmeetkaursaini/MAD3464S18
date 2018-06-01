
import java.io.InputStream;
import java.io.OutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasmeet
 */
public class PersonTest {
    public static void main(String args[])
    {
        Person jasmeet = new Person();
        jasmeet.name = "Jasmeet";
        jasmeet.address = "Toronto";
        jasmeet.age = 22;
        
        System.out.println("Name : " + jasmeet.name + "\nAddress : " + jasmeet.address + "\nAge : " + jasmeet.age);
        
//        Person foram = new Person();
//        
//        foram.setName();
//        String nm = foram.getName();
//        
//        foram.setAddress();
//        String add = foram.getAddress();
//        
//        foram.setAge();
//        int age = foram.getAge();
//        
//        System.out.println("\n\nName : " + nm + "\nAddress : " + add + "\nAge : " + age);
//        
//        Person anu = new Person();
//        anu.setData();
//        System.out.println(anu.toString());
          
          Person aman = new Person();
          System.out.println(aman.toString());
          
          Person rimpal = new Person("Rimpal","Brampton",20);
          System.out.println(rimpal.toString());
          
          Person rimpal2 = new Person(rimpal);
          System.out.println(rimpal2.toString());
        
    }
    
}
