/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Jasmeet kaur
 */
public class ArrayListTest {
    public static void main (String[] args)
    {
        //int [] productName = new int[5];  Consumes space if all the 6 place is not filled so we use arraylist
        ArrayList<String> productName = new ArrayList<>();
        
        productName.add("Projector");
        productName.add("Excel");
        productName.add("Contigo");
        productName.add("Apple");
        
        productName.add(2,"Oracle");
        System.out.println("=======");
        
        if (productName.contains("Oracle"))
        {
              productName.remove("Oracle");
        }
        else
        {
            System.err.println("Buy prodect first");
        }
        
        for(String Raman : productName)
        {
            System.out.println(Raman);
        }
        
        Collections.sort(productName);
        System.out.println("=======");
        for(String Raman : productName)
        {
            System.out.println(Raman);
        }
        
        System.out.println("=======");
        
        ArrayList<Books> library = new ArrayList<Books>();
        Books book1 = new Books(101, "The sky is falling" , 9);
        Books book2 = new Books(102, "Pride and Prejudice" , 6);
        Books book3 = new Books(103, "The monk" , 3);
        Books book4 = new Books(104, "Courage" , 5);
        
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        
        for(Books bk : library)
        {
            bk.dispalyInfo();
        }
        
        System.out.println("=======");
        System.out.println("No of books available in library : " +library.size());
        
        if (library.contains(book4))
        {
            library.remove(book4);
        }
        System.out.println("No of books available in library : " +library.size());
        
        System.out.println("=======");
        library.add(2,new Books(120, "Pearls" , 11));
        for(Books bk : library)
        {
            bk.dispalyInfo();
        }
        
        System.out.println("No of books available in library : " +library.size());
        System.out.println("=======");
        
        //Collections.sort(library);  //Need to customize as we made the function and it would be override
        Collections.sort(library,new bookTitleComparator());
        for(Books bk : library)
        {
            bk.dispalyInfo();
        }
        System.out.println("=======");
        Collections.sort(library,new bookRatingComparator()); 
        for(Books bk : library)
        {
            bk.dispalyInfo();
        }
        
    }
}
