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
public class PermanentEmployee extends Employee
{
    String pDesignation;
    float pHourlyWages;

    public PermanentEmployee() 
    {
        super();
        this.pDesignation = "Unknown";
        this.pHourlyWages = 16.5f;
    }

    public PermanentEmployee(String pDesignation, float pHourlyWages, String name, String address, int age, String eID, String joiningDate, int deptNo) {
        super(name, address, age, eID, joiningDate, deptNo);
        this.pDesignation = pDesignation;
        this.pHourlyWages = pHourlyWages;
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + "\nDesignation : " + this.pDesignation + "\nHourly Wages : " + this.pHourlyWages);
    }
    
    
}
