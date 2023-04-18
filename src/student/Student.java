/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Burak
 */
public class Student {
    private String studentName;
    private String studentSurname;
    private int ID ;
   // private int adress;
    private int idStarter=0;
    
    public Student(String studentName, String studentSurname) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.ID = generateID();
     
    }
     private int generateID() {
             this.idStarter++;

                 return this.idStarter;
                }
 
   public String toString() {
		
		return  "\n*********\nstudent ID:" + this.ID+"\nName of student:" + this.studentName+ " " +this.studentSurname.toString();
	}
 
    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }
    
     public int getID() {
        return ID;
    }
    
    
 
}
