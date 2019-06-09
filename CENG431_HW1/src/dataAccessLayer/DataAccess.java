package dataAccessLayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

import businessLayer.Person;

public class DataAccess {
	
	
	public void readData(String fileName,ArrayList<Person> list) {
		
		try {
			Scanner sc = new Scanner(new File(fileName));
			String line = sc.nextLine();
			StringTokenizer tokenizer = null;
			
			boolean eof = false;
			
			while(!eof) {
				
				tokenizer = new StringTokenizer(line,",");
				
				String name = tokenizer.nextToken().trim(); // trim() method omits the leading and trailing spaces.
			/*	String isbnNumber = tokenizer.nextToken();  
				
				Person p = new Person()
						
				book.addAuthor(author);
				
				*/
				try {
					line = sc.nextLine();
				} catch(NoSuchElementException e) {
					eof = true;
				}
				
			}
			sc.close();  

}
}