/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_4;

/**
 *
 * @author macstudent
 */

    
    public class Employee extends Person     //properties of person class will be dispalyed here. Person is a super/parent class and employee is child and sub class.
            
        {
            String eID;
            String joiningDate;
            int deptNo;

        Employee() 
        {
            super();     //Inherits the default constructor of Person class  
            this.eID = "E###";
            this.joiningDate = "DD MM YYYY";
            this.deptNo = 0 ;
        }

        public Employee(String name,String address,int age, String eID, String joiningDate, int deptNo) 
        {
            super(name, address, age);
            this.eID = eID;
            this.joiningDate = joiningDate;
            this.deptNo = deptNo;
        }
        
        @Override
        public String toString()
        {
            String personDetails = super.toString();
            String data = "\nEmployee ID : " + this.eID + "\nJoining Date : " + this.joiningDate + "\nDept no : " + this.deptNo ;
            
            return personDetails + data;
        }
            
            
        }
    

