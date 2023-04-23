/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Burak
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Burak
 */
public class BookFactory {
    
    public static String[][] BookFactory() throws FileNotFoundException { //read from file and write in 2D String Array 
            
            Scanner in = new Scanner(new File("data.txt"));
List<String[]> lines = new ArrayList<>();
while(in.hasNextLine()) {
    String line = in.nextLine().trim();
    String[] splitted = line.split(" , ");
    for(int i = 0; i<splitted.length; i++) {
        //get rid of additional " at start and end
        splitted[i] = splitted[i].substring(1, splitted[i].length()-1);
    }
    lines.add(splitted);
}

//pretty much done, now convert List<String[]> to String[][]
String[][] result = new String[lines.size()][];
for(int i = 0; i<result.length; i++) {
    result[i] = lines.get(i);
}
   
  return result; }
    
    
    

//burada yukarıda olusturdugu String[][] den alıp customlarını yazıya çevirip attritibuteleri ile
    //BOOK objelerinden oluşan arrayliste obje olarak ekliyoruz   
    
 public static ArrayList<Book> listOfBooks() throws FileNotFoundException {
     ArrayList<Book> listOfBooks = new ArrayList<>();
        String[][] bInfo = BookFactory(); 

        for (int j=1; j<bInfo.length ;j++){    //kitap adedi kadar devam et
                    String[] arr=bInfo[j];     //her bir kitap için satırı tut
              
           //   for (int i=0; i<arr.length ;i++){   //her 
               String[] name=Arrays.toString(arr).split(",");
                  Book newBook=new Book(name[0],name[1],name[2],name[3],name[4],true);   
                  listOfBooks.add(newBook);
                }
	return listOfBooks ;	}
 
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

		   
    
    

	
