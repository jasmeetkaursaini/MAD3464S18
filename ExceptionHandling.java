/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasmeet kaur
 */
public class ExceptionHandling {
    public static void main(String args[])
    {
        try
        {
        int n = Integer.parseInt("123");
        System.out.println("n : " + n);
        
        n = n / n;
        System.out.println("n : " + n);
        
        if(n<150)
        {
            throw new NumberFormatException();
        }
        
        int numbers[] = {10,20,30};
        //System.out.println("Numbers[5] : " + numbers[5]);
        } 
        catch(ArithmeticException e)
        {
            System.err.println(e);
            e.printStackTrace();  //To track error line by line indecating line number.
        }
        catch(IndexOutOfBoundsException e)
        {
            System.err.println();
        }
        finally
        {
            System.out.println("The finally block.");
        }
    }
    
}
