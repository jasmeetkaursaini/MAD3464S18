/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class bankDetails {
    
    public static void main(String[] args) 
    {
       bankAccount b = new bankAccount();
       bankAccount amn = new bankAccount();
        
        b.setName();
        String name = b.getName();
        
        b.setId();
        int id = b.getId();
        
        b.setAccNum();
        int accountNumber = b.getAccNum();
        
        b.setOwnName();
        String ownerName = b.getOwnName();
        
        b.setAmount();
        float amount = b.getAmount();
        
        
        
        System.out.println("\nBank Name : " + name + "\nId : " + id + "\nAccount Number : " + accountNumber + "\nOwner Name : " + ownerName + "\nAmount : " + amount);
        
        
        //System.out.println(b.toString());
      
        
        
        amn.setWithDraw();
        float withDrawAmn = amn.getWithDraw();
        
        amn.withdraw();
        //System.out.println("Total amount after withdrawal : " + withDrawAmn);   
        
        
        
        amn.setDeposit();
        float depositAmn = amn.getDeposit();
        
        amn.deposit();
        //System.out.println("Total amount after deposit : " +  depositAmn);
    }
    
}
