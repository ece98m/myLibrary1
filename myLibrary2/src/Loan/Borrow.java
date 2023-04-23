/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

import static Library.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import student.student;
import student.studentFactory;

/**
 *
 * @author Burak
 */
public class Borrow {
       studentFactory factory=new studentFactory();
         ArrayList<student> myList=factory.createStudentFile();
       
         
                 
                 
//    public Borrow {
//       
//}
 
         
    public void borrowBook() throws FileNotFoundException{
     List<Loan> recordsOfBorrowings=new ArrayList();
      boolean valid=factory.searchStudentById();
      Scanner scan=new Scanner(System.in);
       
    if (valid==true){
            
            System.out.println("Please enter the book ID you are looking for");
            String bookID=scan.nextLine();
        
            for (int i=0; i<listOfBooks().size(); i++){
                 
                 
        if (bookID.equals(listOfBooks().get(i).getID().toLowerCase())){
            System.out.println("there is this book in this lib");
            System.out.println(listOfBooks().get(i).isAvailability());
            
            if ((listOfBooks().get(i).isAvailability())==true){
               System.out.println("Congratulations! You have borrowed the book successfully");
                 Loan borrow=new Loan(listOfBooks().get(i),myList.get(i),new Date(),null);
                 recordsOfBorrowings.add(borrow);
                 listOfBooks().get(i).setAvailability();
             }
            else {
                
                System.out.println("The book has been borrowed by someone else");
                    }
         
        }
        else if ((listOfBooks().size()-1==i )&& (!bookID.equals(listOfBooks().get(i).getID().toLowerCase()))){
                 System.out.println("No book record with this ID.TRY AGAIN");
                 }
        
        }
     
     }
    else{System.out.println("Operation failed");}
    
       }}