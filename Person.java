/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_4;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    
    String name;
    String address;
    int age;
    Scanner in = new Scanner(System.in);
    
    // Constructor

    Person() 
    {
        name = "Unknown";
        address = "Unknown";
        age = 1;
    }
    
    //Parametarize constructor

    Person(String name, String address, int age) 
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    Person(Person anotherPerson)
    {
        this.name = anotherPerson.name;
        this.address = anotherPerson.address;
        this.age = anotherPerson.age;
    }
    
    
    void setName()
    {
        System.out.println("Enter name : ");
        name = in.nextLine();
    }
    String  getName()
    {
        return name;
    }
    
    void setAddress()
    {
        System.out.println("Enter Address : ");
        address = in.nextLine();
    }
    String getAddress()
    {
        return address;
    }
    
    void setAge()
    {
        System.out.println("Enter age : ");
        //Wrapper class used with parse to convert string to integers
        age = Integer.parseInt(in.nextLine());
    }
    int getAge()
    {
        return age;
    }
    
    void setData()
    {
        setName();
        setAddress();
        setAge();
    }
    
    @Override
    public String toString()
    {
        String data = "Name : " + name + "\nAddress : " + address + "\nAge : " +age; 
        return data;
    }
    
}
