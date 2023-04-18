/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibrary1;

import Book.Book;
import java.util.Date;
import student.Student;

/**
 *
 * @author Burak
 */
public class Borrowings {      
    private Book book;
    private Student borrower;
    private Date issuedDate;
    private Date dateReturned;

    public Borrowings(Book book, Student borrower, Date issuedDate, Date dateReturned) {
        this.book = book;
        this.borrower = borrower;
        this.issuedDate = issuedDate;
        this.dateReturned = dateReturned;
    }

    public Book getBook() {
        return book;
    }

    public Student getBorrower() {
        return borrower;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrower(Student borrower) {
        this.borrower = borrower;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    @Override
    public String toString() {
        return "Borrowings{" + "book=" + book + ", borrower=" + borrower + ", issuedDate=" + issuedDate + ", dateReturned=" + dateReturned + '}';
    }
    

}
