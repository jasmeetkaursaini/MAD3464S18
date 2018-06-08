/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasmeet kaur
 */
public abstract class Shape {
    int x;
    int y;
    final int z= 10;

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
 
    void diaplay()
    {
        System.out.println("Dispalying name");
    }
    
    abstract void draw();
   
}
