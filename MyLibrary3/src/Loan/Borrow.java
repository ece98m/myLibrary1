/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

import Library.Book;
import Library.BookFactory;
import static Library.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import mylibrary3.MyLibrary3;
import student.student;

import student.studentFactory;

/**
 *
 * @author Burak
 */
public class Borrow {
      studentFactory factory=new studentFactory();
      BookFactory myBookFactory= new BookFactory();
         List<Loan> recordsOfBorrowings = new ArrayList<>();  
   
         
                 
                 
 
 
public void borrowBook(ArrayList<student> studentList) throws FileNotFoundException {
   
    List<Book> books = listOfBooks();

    Scanner scan = new Scanner(System.in);
    factory.searchStudentById(studentList);
   //  Loan borrow = new Loan(books.get(i), myList.get(i), new Date(), null);
//                    recordsOfBorrowings.add(borrow);
//                    borrowedBooks.add(books.get(i));
 
}



}
//    public Borrow {
//       this.currentlyBorrowedBooks=
//}
 
         










