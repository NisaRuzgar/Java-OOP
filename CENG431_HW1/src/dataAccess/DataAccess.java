package dataAccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

 

public class DataAccess {
	 
	public ArrayList<String[]> readData(String fileName) {
		
		ArrayList<String[]> content  = new ArrayList<String[]>();
		try {
		
			Scanner sc = new Scanner(new File(fileName));
			String line = sc.nextLine();
			StringTokenizer tokenizer = null;
			
			boolean eof = false;
			
			while(!eof) {
				String[] elements = new String[4];
				tokenizer = new StringTokenizer(line," ");
				
				String job = tokenizer.nextToken();
				elements[0] = job;
				
				String name = tokenizer.nextToken(); 
				elements[1] = name;
				
				String surname = tokenizer.nextToken();
				elements[2] = surname;
				
				if(tokenizer.hasMoreTokens()) {
					String roomNumb = tokenizer.nextToken(); 
					elements[3] = roomNumb;
				}
				
				content.add(elements);
				
				try {
					line = sc.nextLine();
					
				} catch(NoSuchElementException e) {
					eof = true;
				}
				
				
			}
			sc.close();  

		
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} 
		return content;
	}
	
}