/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArrayList;

import java.util.Comparator;

/**
 *
 * @author Jasmeet kaur
 */
public class Books {
    
    int bookId;
    String bookTitle;
    int bookRating;
    ///private int Id;

    public Books()
    {
        this.bookId = 0;
        this.bookTitle = "Unknown";
        this.bookRating = 0;
    }

    public Books(int bookId, String bookTitle, int bookRating) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;
    }
    
    void setId(int Id)
    {
        System.out.println("Enter id : ");
        this.bookId = Id ;
    }
    int getId()
    {
        return this.bookId;
    }
    
    void setBookTitle(String Title)
    {
        System.out.println("Enter title : ");
        this.bookTitle = Title ;
    }
    String getBookTitle()
    {
        return this.bookTitle;
    }
    
    void setBookRating(int Rating)
    {
        System.out.println("Enter rating : ");
        this.bookRating = Rating ;
    }
    int getBookRating()
    {
        return this.bookRating;
    }
    
    void dispalyInfo()
    {
        System.out.println("Book Id : " +this.bookId+ "\nBook Title : " +this.bookTitle+ "\nBook rating : " +this.bookRating);
    }
    
}
    class bookTitleComparator implements Comparator<Books>
    {
        @Override
        public int compare(Books o1, Books o2)
        {
            return  o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
        }
    }
    
    class bookRatingComparator implements Comparator<Books>
    {
        @Override
        public int compare(Books o1, Books o2)
        {
            if(o1.bookRating == o2.bookRating)
                return 0;
            else if (o1.bookRating  < o2.bookRating)
                return 1;
            else
                return -1;
        }
    }
    

