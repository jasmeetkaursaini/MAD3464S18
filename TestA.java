/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasmeet kaur
 */
public class TestA extends TestC implements A, B
{ 
   
    @Override
    public void display()
    {
        System.out.println("Number inside A : " + number);
    }
    
//    public void show()
//    {
//        System.out.println("Number inside B ");
//    }
    
    @Override
    public void output()
    {
        System.out.println("Output from C ");
    }
    
}
