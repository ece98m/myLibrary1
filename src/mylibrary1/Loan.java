/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibrary1;

import static Book.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import student.Student;
import student.studentFactory;
import static student.studentFactory.createStudent;


/**
 *
 * @author Burak
 */
public class Loan {
      
    studentFactory factory=new studentFactory();
         ArrayList<Student> myList=factory.StudentList();
         
         
                 
                 
    public Loan() {
       
    }
 
    public void borrowBook() throws FileNotFoundException{
     List<Borrowings> recordsOfBorrowings=new ArrayList();
     
              
      System.out.println("  PLEASE enter the bookID that you want to borrow ");
      
      Scanner scan=new Scanner(System.in);
      
      String bookID=scan.nextLine();
      System.out.println("please enter your student ID ");
      int studentID=scan.nextInt();
      for (int i=0; i<myList.size(); i++){
          
//    if (studentID==(createStudent().get(i).getID())){
           if (studentID==(myList.get(i).getID())){

             System.out.println("Aradıgınız ogrenci kutuphanemize üyedir" + myList.get(i));

       for (int j=0; j<listOfBooks().size(); j++){
         if (bookID.equals(listOfBooks().get(j).getID().toLowerCase() )){
         
             System.out.println("Aradığınız kitap kütühanemizde bulunmaktadır" + listOfBooks().get(j));
             
             if (listOfBooks().get(j).isAvailability()==true){
                 
                 System.out.println("the book is available, continue");
                 
                 Borrowings borrow=new Borrowings(listOfBooks().get(j),myList.get(i),new Date(),null);
                 recordsOfBorrowings.add(borrow);
             }
             else
             {
                 System.out.println("book has already been borrowed by someone else . ");}
         
         
         
         
             
             
         break;
         }
         
         else if ((listOfBooks().size()-1==i )&& (!bookID.equals(listOfBooks().get(i).getID().toLowerCase()))){
             System.out.println("Aradığınız kitap kütüphanede bulunmamaktadır");
         
             
         }
       }}

          else if ((myList.size()-1==i )&& (studentID!=(myList.get(i).getID()))){
             System.out.println("Aradıgınız ogrenci kayitlarimizda bulunmamaktadir");}
           
     
    }
    
         
     }


    




    
}


    
 

