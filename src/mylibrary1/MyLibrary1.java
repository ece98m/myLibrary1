/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mylibrary1;

/**
 *
 * @author Burak
 */
// import necessary packages


import Book.Book;
import static Book.BookFactory.BookFactory;
import static Book.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static mylibrary1.LibraryUtility.AlphabeticalBookListbyTitle;
import student.Student;
import student.studentFactory;
import static student.studentFactory.createStudent;
import static student.studentFactory.getStudent;

import static student.studentFactory.writeOnFile;



public class MyLibrary1 {
   //  to handle exceptions include throws
public static void main(String[] args) throws FileNotFoundException{

    
  
 System.out.println(listOfBooks().size());
  System.out.println(listOfBooks());
  
   MyLibrary1 myRugbyClub = new MyLibrary1 ();
   
   int myInput; 
     boolean valid=true;

       Scanner myScanner=new Scanner(System.in);
       
//       MAIN MENU

      
             System.out.println("                             LİBRARY MAİN MENU\n");
        System.out.println("**************************************************************************************\n");
        System.out.println("1-) >>> Search for a specific book by title and/or author name. <<< \n");    //done 
        System.out.println("2-) >>> List all books by title and/or author name alphabetical order <<<\n");
        System.out.println("3-) >>> Search for a specific student by name and/or ID. <<<\n");
        System.out.println("4-) >>> List all students by alphabetical name and/or ID order. <<<\n");
        System.out.println("5-) >>> Register that a student has borrowed a book.<<<");
        System.out.println("6-) >>> Add that reader to waiting list (queue). <<<\n");
        System.out.println("7-) >>> Register that a student has returned a book.<<<");
        System.out.println("8-) >>> Display to the user the next student waiting for specific book <<<\n");
        System.out.println("9-) >>> For a specific student, list the books that they have borrowed<<<");
        System.out.println("0-) >>> Go back to main menu <<<\n");
                  
      
       
      
    
      
           
//  MAIN MENU TERMS
       while(valid){ 
          try{
           System.out.println("Please enter a number: ");
       myInput=myScanner.nextInt();
       switch(myInput){
           case 1:
                      searchingBook();
               break;
                case 2:
              AlphabeticalBookListbyTitle();
              
                   break;
                case 3:
            
              
            searchingStudent();
               break;
             
                case 4:
                    System.out.println(listOfBooks());  
                   
               break;
                  case 5:
                                
              System.out.println(listOfBooks());  
               
               break;
             
                case 6:
                    System.out.println(listOfBooks());  
                   
               break;
                
                case 7:
                    System.out.println(listOfBooks());  
                   
               break;
                  case 8:
                                
              System.out.println(listOfBooks());  
               
               break;
             
                case 9:
                    System.out.println(listOfBooks());  
                   
               break;
                case 10:
                     valid=false;
                     break;
          
                case 0:
                      System.out.println("                             LİBRARY MAİN MENU\n");
        System.out.println("**************************************************************************************\n");
        System.out.println("1-) >>> Search for a specific book by title and/or author name. <<< \n");
        System.out.println("2-) >>> List all books by title and/or author name alphabetical order <<<\n");
        System.out.println("3-) >>> Search for a specific student by name and/or ID. <<<\n");
        System.out.println("4-) >>> List all students by alphabetical name and/or ID order. <<<\n");
        System.out.println("5-) >>> Register that a student has borrowed a book.<<<");
        System.out.println("6-) >>> Add that reader to waiting list (queue). <<<\n");
        System.out.println("7-) >>> Register that a student has returned a book.<<<");
        System.out.println("8-) >>> Display to the user the next student waiting for specific book <<<\n");
        System.out.println("9-) >>> For a specific student, list the books that they have borrowed<<<");
        System.out.println("0-) >>> Go back to main menu <<<\n");
                  
               break;
                default:
                    System.out.println("Please enter a number between 0 and 10.");
                    
                break;
             }
       }
            
   
        catch(Exception e){
           System.out.println("Please enter a number between 0 and 10.");
          myScanner.nextLine();
       }
       } 
  
  
  
  
  
 
}


	
        private ArrayList<Student>  AlphabeticalStudentListbyTitle;
        private ArrayList<Student> WaitingList;
 
	public MyLibrary1() {
            // ADDING CONSTRUCTURES TO THE CREATED LISTS
          
		this.AlphabeticalStudentListbyTitle= new ArrayList<Student>();
		this.WaitingList= new ArrayList<Student>();
		
         
             
	} 



public static void searchingBook() throws FileNotFoundException {
    
     System.out.println("Please enter the name of Book you are looking for"); 
    Scanner scan=new Scanner(System.in);
    String bookName=scan.nextLine().toLowerCase();
   
    for (int i=0; i<listOfBooks().size(); i++){
         if (bookName.equals(listOfBooks().get(i).getNameOfBook().toLowerCase() )){
         
             System.out.println("Aradığınız kitap kütühanemizde bulunmaktadır" + listOfBooks().get(i));
         break;}
         else if ((listOfBooks().size()-1==i )&& (!bookName.equals(listOfBooks().get(i).getNameOfBook().toLowerCase()))){
             System.out.println("Aradığınız kitap kütüphanede bulunmamaktadır");}
         
    
    }  
		}
public static void searchingStudent() throws FileNotFoundException {
   
     System.out.println("Please enter the name of student you are looking for"); 
    Scanner scan=new Scanner(System.in);
    String studentName=scan.nextLine().toLowerCase();
    writeOnFile();
    for (int i=0; i<createStudent().size(); i++){
         if (studentName.equals(createStudent().get(i).getStudentName().toLowerCase() )){
         
             System.out.println("Aradığınız öğrenci kütüphanemize üyedir" + createStudent().get(i));
         break;}
         else if ((createStudent().size()-1==i )&& (!studentName.equals(createStudent().get(i).getStudentName().toLowerCase()))){
             System.out.println("Aradığınız öğrenci kayıtlarımızda bulunmamaktadır");}
         
    
    }  
		}
  















 }




    
    
            
