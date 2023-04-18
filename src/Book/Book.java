/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;


// import necessary packages

public class Book {
  private String ID;  
  private String authorName;
  private String authorSurname;
  private String nameOfBook;
  private String genre;
  private boolean availability;

    public Book(String ID, String authorName, String authorSurname, String nameOfBook, String genre) {
        this.ID = ID;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.nameOfBook = nameOfBook;
        this.genre = genre;
        this.availability = true;
    }

    

    public String getID() {
        return ID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
  
  public String toString() {
		
		return "\n******\nBook ID:" + this.ID+"\nBook name:" + this.nameOfBook+"\nauthor name:" + this.authorName+ " " +this.authorSurname.toString();
	}
  
}