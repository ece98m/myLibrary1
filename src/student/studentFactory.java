/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;import java.io.FileNotFoundException;
 import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import studentNameGenerator.NameGenerator;
/**
 *
 * @author Burak
 */
public class studentFactory {
    
    public Student getStudent() { //burada her bu fonk çağırıldığında yeni öğrenci üretmiş oluyoruz
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new Student(name[0],name[1]);
			
		}
    
    protected static String[] generateName() {
		
		NameGenerator NG = new NameGenerator();
		
		String name = NG.getRandomName();
		
		return name.split(" ");
	}
    
    public String[][] studentFactory(){
    String[][] studentData=new String[100][2];
    
    for (int i=0; i<100; i++){
    
            studentData[i][0]=getStudent().getStudentName();
            studentData[i][1]=getStudent().getStudentSurname();
            studentData[i][2]=Integer.toString(getStudent().getID());
    }
    
    return studentData;
            }  
	
    
    public  void writeOnFile() {
        String[][] data = studentFactory();
        String filename = "bu.txt";
        
        try {
            FileWriter writer = new FileWriter(filename);
            
            for (String[] row : data) {
                for (String value : row) {
                    writer.write(value + ",");
                }
                writer.write("\n");
            }
            
            writer.close();
            System.out.println("Data written to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
