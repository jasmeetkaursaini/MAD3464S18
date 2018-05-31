/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day2 {
    
    public static void main(String[] args)
    {
        //Program of even and odd
        int n1 = 11;
        
        if (n1 % 2 ==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        
        //Program of bus pass
       char pass ='A';
        
        switch(pass)
        {
            case 'A':
                System.out.println("Adult pass : valid pass");
                break;
            case 'S':
                System.out.println("Student pass : valid pass");
                break;
            case 'O':
                System.out.println("Senior Citizen : valid pass");
                break;
            default:
                System.out.println("Invalid pass");
                break;
        } 
        
        //Program of bus pass not showing seperatly
        /*char pass ='W';
        
        switch(pass)
        {
            case 'A':
                
            case 'S':
                
            case 'O':
                System.out.println("valid pass");
                break;
            default:
                System.out.println("Invalid pass");
                break;
        } */
        
        // Program of addition
        switch(10+20)
        {
            case 10:
                System.out.println("Value is 10");
                break;
            case 20:
                System.out.println("Value is 20");
                break;
            case 30:
                System.out.println("Value is 30");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
        //Program of province using string
        String province ="ON";
        switch(province)
        {
            case "ON":
                System.out.println("Ontario");
                break;
            case "NV":
                System.out.println("Nova Scotia");
                break;
            case "AB":
                System.out.println("Alberta");
                break;
            default:
                System.out.println("Not valid province");
                break;   
        }
        
        //Using while loop (To do task repetedly)
        //while loop checks the value first and then displays value
        n1 = 20;
        while(n1 > 10)
        {
            System.out.println("Beyond limit" + n1);
            n1--;
        }
        //do while loop print the statement first and then checks the condition
        do{
            System.out.println("Beyond limit" + n1);
            n1--;
        }while(n1 > 10);
        
        
        //for loop do increment and then check the condition
        
        /*int i=0;
        for( ;i<=5 ;i++)
        {
            System.out.println("i :"+i);
        }*/
        
        /*
        int i=0;
        for( ;i<=5 ;)
        {
            System.out.println("i :"+ i++);
        }
        
        int i;
        for(i=0 ;i<=5 ;i++)
        {
            System.out.println("i :"+i);
        }
        */
        
        int i=0;
        for( ; ; )
        {
            if(i<5)
            {
                System.out.println("i =" +i++);
            }
            else
            {
                break;
            }
        }
        
        for(i=1 ;i<=5 ;i++)
        {
            if (i==3)
            {
                continue;
            }
            else
            {
                System.out.println("i :"+i);
            }   
        }
        
        // for loop to display the pattern
        for(i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        // for loop to display pyramid
        for(i=1;i<=5;i++)
        {
            for(int space=5; space>i ; space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        // for loop to display upside down pyramid
        for(i=1;i<=5;i++)
        {
            for(int space=1; space<i ; space++)
            {
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        
        //Array
        
        int numbers[] = new int[5];
        numbers[0] = 10;
        System.out.println("number [0] : " + numbers[0]);
        
        //To display the numbers
        for(i=0 ; i<5 ; i++)
        {
            numbers[i] = (i+1);
            System.out.println("number ["+i+"] :" +numbers[i]);
        }
        
        //To display the power of number
        for(i=0 ; i<5 ; i++)
        {
            numbers[i] = (int) Math.pow(i+1, 2);
            System.out.println("number ["+i+"] :" +numbers[i]);
        }
        
        //To multiply power with 10
        for(i=0 ; i<numbers.length ; i++)
        {
            System.out.println("value " + (i+1) + " : " + (numbers[i]*10));
        }
        
        //
        for(int no : numbers)
        {
            System.out.println(" no :"+no);
        }
        
        //Tables
        int table[][] = new int[5][3];
        for(int row=0; row<5; row++)
        {
            for(int col=0; col<3; col++)
            {
                table[row][col] = row+col;
                System.out.print(table[row][col] + " ");
            }
            System.out.println("");
        }
    }
    
}
