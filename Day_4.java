/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_4;

/**
 *
 * @author Jasmeet
 */
public class Day_4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Employee emp1 = new Employee("Jasmeet","Toronto",22,"E101", "12 May 2018", 10);
        
        TemporaryEmployee te = new TemporaryEmployee("IOS developer", 80.5f , "Jasmeet", "Toronto", 22, "E101", "12 May 2018", 10);
        // Nmae,address and age id extended from the person class
//        emp1.name = "Jasmeet";
//        emp1.address = "Toronto";
//        emp1.age = 22;
        //System.out.println("Name : " + emp1.name + "\nAddress : " + emp1.address + "\nAge : " + emp1.age);
        System.out.println(te.toString());
        
        
        PermanentEmployee pe = new PermanentEmployee("Android developer", 16.5f, "Saini", "Brampton", 26, "E301", "12 June 2018", 12);
        System.out.println(pe.toString());
    }
    
}
