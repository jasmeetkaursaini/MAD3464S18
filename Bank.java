/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */

import java.util.Scanner;
public class Bank {
    
    String name;
    int id;
    Scanner in = new Scanner(System.in);

    Bank() 
    {
       this.name = "Unknown";
       this.id = 0;
    }

    public Bank(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }
    
    void setName()
    {
        System.out.println("Enter Bank name : ");
        name = in.nextLine();
    }
    String getName()
    {
        return name;
    }
    
    void setId()
    {
        System.out.println("Enter ID : ");
        id = Integer.parseInt(in.nextLine());
    }
    int getId()
    {
        return id;
    }
    
    @Override
    public String toString()
    {
        String data = "Bank Name : " + name + "\nID : " + id; 
        return data;
    }
    
}
