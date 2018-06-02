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
public class TemporaryEmployee extends Employee
{
    String designation;
    float hourlyWages;

    public TemporaryEmployee() 
    {
        super();
        this.designation = "Unknown";
        this.hourlyWages = 0.0f;
    }

    public TemporaryEmployee(String designation, float hourlyWages, String name, String address, int age, String eID, String joiningDate, int deptNo) {
        super(name, address, age, eID, joiningDate, deptNo);
        this.designation = designation;
        this.hourlyWages = hourlyWages;
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + "\nDesignation : " + this.designation + "\nHourly Wages : " + this.hourlyWages);
    }
    
    
}
