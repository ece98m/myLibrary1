/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;import static Book.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
 import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import studentNameGenerator.NameGenerator;
/**
 *
 * @author Burak
 */
public class studentFactory {
    private ArrayList<Student> studentList;
    
    
    public  studentFactory() {
  this.studentList= new ArrayList();
}
    public static Student getStudent() { //burada her bu fonk çağırıldığında yeni öğrenci üretmiş oluyoruz
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			int studentID=0;
                   
			return new Student(name[0],name[1]);
			
		}
    
    protected static String[] generateName() {
		
		NameGenerator NG = new NameGenerator();
		
		String name = NG.getRandomName();
		
		return name.split(" ");
	}
    
    public static ArrayList<Student> createStudent(){ //bir object arrayliste 100 adet öğrenci oluşturduk
     
    ArrayList<Student> students=new ArrayList();    
        
         for (int i=0; i<100; i++){
    
        Student newStudent=getStudent();
        students.add(newStudent);
  
    }    
        
//          for (Student element : students) {
//            System.out.println(element);
//        }
    
    return students;
            }  
    
      public  ArrayList<Student> StudentList(){
          studentList=createStudent();
        return studentList;
    }
	
    
    public  void writeOnFile() {
       String filename = "C:\\Users\\Burak\\Desktop\\myLibrary1\\bu.txt";
       
try {
            FileWriter writer = new FileWriter(filename);
            
            // Write each object in the ArrayList to the file
            for (Object element : StudentList()) {
                writer.write(element.toString() + "\n");
            }
            
            // Close the FileWriter
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    
}
    
    public static void AlphabeticalStudentListbyName() throws FileNotFoundException {
    
    List<String> liste=new ArrayList<>();
    
    
        for (int i=0; i<createStudent().size(); i++){
            
            liste.add(createStudent().get(i).getStudentName()+" "+createStudent().get(i).getStudentSurname());
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

