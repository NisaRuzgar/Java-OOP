package domain;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dataAccess.DataAccess;

public class Menu {
	
	DataAccess dal = new DataAccess();		
	AppMediator mediator = new AppMediator();
	
	
	int chosenTask = 0;
	int i = 1;
	Staff staff = null; 
	Result result = null;
	Task assignedTask = null;
	
	
	public Menu() {
		
		mediator.init(dal);
		//mediator.monitorStaff();
		
	 	System.out.println("\n \n__________________\n");
		System.out.println("\tHospital Dispatch and Monitor System");
	 	System.out.println("__________________\n");

		Scanner scan = new Scanner(System.in);
		
		do{	
		
		for(Person patient: mediator.patients) {
			
		 	 System.out.println("The current patient : " + patient.getName() +"\n" );

		 	 System.out.println("--- | Please Choose a task for this patient to perform! |---\n \t (If you want to exit, please enter the 0 !)\n");
		 	 System.out.println("\t TASKS");
		 	 
		 	 for(Staff p: mediator.staffs) {					
					System.out.print(i + "- "); 
					System.out.println(p.getJob().toString() + " " + p.getName() + " " + p.getSurname());
					i++;
			 }
		 	i=0;
		 	do{
	 		 	chosenTask = scan.nextInt();
	 		 	
	 		 	if(chosenTask > 7 || chosenTask < 0) {
	 		 		System.out.println("Invalid choice");
				}else if (chosenTask == 0) {
					System.out.println("Quit from this patient"); 
					break;
				}else {	 
						assignedTask = mediator.getTask(chosenTask);
						staff = mediator.getStaff(assignedTask);
						result = mediator.assignTask(assignedTask,staff);
					System.out.println("The result is: " + result);
					break;
				}	 	
		 	} while(chosenTask != 0);
		 	System.out.println("If you want monitor patient and assign task to staff, please enter 1, otherwise 0. \n\n1");
			chosenTask = scan.nextInt();
			if (chosenTask==0) {
				break;
				} 
		}
	}while(chosenTask != 0) ;
}   }