
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class bankAccount extends Bank
{
    int accountNumber;
    String ownerName;
    float amount;
    float withDrawAmn;
    float depositAmn;
    Scanner in = new Scanner(System.in);

    public bankAccount() 
    {
        super();
        this.accountNumber = 0;
        this.ownerName = "Unknown";
        this.amount = 0.0f;
    }

    public bankAccount(String name, int id,int accountNumber, String ownerName, float amount) 
    {
        super(name, id);
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.amount = amount;
    }
    
    void setAccNum()
    {
        System.out.println("Enter Account number : ");
        accountNumber = Integer.parseInt(in.nextLine());
    }
    int getAccNum()
    {
        return accountNumber;
    }
    
    void setOwnName()
    {
        System.out.println("Enter Owner Name : ");
        ownerName = in.nextLine();
    }
    String getOwnName()
    {
        return ownerName;
    }
    
    void setAmount()
    {
        System.out.println("Enter amount : ");
        amount = Float.parseFloat(in.nextLine());
    }
    float getAmount()
    {
        return amount;
    }
    
    @Override
    public String toString()
    {
        return ( super.toString() + "\nAccount Number : " + this.accountNumber + "\nOwner Name : " + this.ownerName + "\nAmount : " + this.amount) ;
    }
    
    void setWithDraw()
    {
        System.out.println("\n\nEnter withdraw amount : ");
        withDrawAmn = Float.parseFloat(in.nextLine());
    }
    float getWithDraw()
    {
        return withDrawAmn;
    }
    
    public void withdraw()
    {
        if(withDrawAmn > amount)
        {
            System.out.println("Exceeds account balance");
        }
        else
        {
            amount = amount - withDrawAmn;
            System.out.println("Total ammount after withdraw : " + amount);
        }
    }
    
    void setDeposit()
    {
        System.out.println("\n\nEnter Deposit amount : ");
        depositAmn = Float.parseFloat(in.nextLine());
    }
    float getDeposit()
    {
        return depositAmn;
    }
    
    public void deposit()
    {
        if(depositAmn == 0)
        {
            System.out.println("No amount to be deposited");
        }
        else
        {
            amount += depositAmn;
        }
    }

    
}
