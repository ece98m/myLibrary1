/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibrary1;

import Book.Book;
import static Book.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import student.Student;

/**
 *
 * @author Burak
 */
public class LibraryUtility {
    
    //sabit kitap listesinden ayrı dinamik bi müsait kitap listesi oluşturacağız
    private static   ArrayList<Book> AvailableBooks;
    private ArrayList<Book> AlphabeticalBookListbyTitle;	
	public LibraryUtility () throws FileNotFoundException {
		
		this.AvailableBooks= listOfBooks();	
                this.AlphabeticalBookListbyTitle= new ArrayList<Book>();
	}


     ArrayList<Borrowings> History = new ArrayList<>();
        
	
    
    public  ArrayList<Book> Borrow(Book book, Student borrower, Date issuedDate) throws FileNotFoundException  {
      AvailableBooks.remove(book);
      Borrowings newBorrowing=new Borrowings(book,borrower,null,issuedDate);    
      History.add(newBorrowing);    
      return AvailableBooks;}
      
 
    public  ArrayList<Book> returnTheBook(Book book, Student borrower, Date dateReturned) throws FileNotFoundException {
      AvailableBooks.add(book);
      Borrowings newBorrowing=new Borrowings(book,borrower,null,dateReturned);   
      History.add(newBorrowing);  
      return AvailableBooks;

    
}
public static void AlphabeticalBookListbyTitle() throws FileNotFoundException {
    
    List<String> liste=new ArrayList<>();
    
    
        for (int i=0; i<listOfBooks().size(); i++){
            
            liste.add(listOfBooks().get(i).getNameOfBook());
        }
        
for (int i = 0; i < liste.size() - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < liste.size(); j++) {
        if (liste.get(j).compareTo(liste.get(minIndex)) < 0) {
            minIndex = j;
        }
    }
    if (minIndex != i) {
        Collections.swap(liste, i, minIndex);
    }
}

for (String s : liste) {
    System.out.println(s);
}
    
}

    
    
    
    
    
    
}
