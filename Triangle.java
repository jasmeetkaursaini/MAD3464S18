/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasmeet kaur
 */
public class Triangle extends Shape {

    public Triangle(int x, int y) 
    {
        super(x,y);
    }
    
    @Override
    void draw()
    {
        System.out.println("x Drawing triangle at " + super.x + " and " + super.y );
    }
}
