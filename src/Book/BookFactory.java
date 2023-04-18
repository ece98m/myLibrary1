/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Burak
 */
public class BookFactory {
    
    public static String[][] BookFactory() throws FileNotFoundException {
            
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
                  Book newBook=new Book(name[0],name[1],name[2],name[3],name[4]);   
                  listOfBooks.add(newBook);
                }
	return listOfBooks ;	}
 
 
	
}

		   
    
    

	






  
          

    


