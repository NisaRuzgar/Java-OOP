import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
	
 public static void main(String[] args) {  
	
	 Scanner scan = new Scanner(System.in);
	 ArrayList<Player> playerList = new ArrayList<Player>();
	 ArrayList<Peg> pegList = new ArrayList<Peg>();
	 CheckerBoard board = new CheckerBoard();
     
	 Simulation sim = new Simulation();
	 sim.initialize();
	
	System.out.println("Please choose the number of player between 2 and 6");
	int numPlayer = scan.nextInt();
	
	for(int i = 0;i< numPlayer; i++) {
		String name = "Player "+ (i+1); 
		Player player = new Player(name);
		playerList.add(player);
		/*Sýrayla color verecek enumdan 
		Peg peg = new Peg();
		onceden yerleri finalle belirlenmis renkli blocklarý ekleyecek
		pegList.add(peg);*/
	}
	
	 Collections.shuffle(playerList);
	 
	 System.out.println("The Player order and their peg color is: ");
	 for(int i =0; i< playerList.size(); i++ ) {
		 System.out.println(" "+ playerList.get(i).getName());
	 }
	 
	 
	 for(int i =0; i< playerList.size(); i++ ) {
		 
		 if(!(board.checkPegsReachGoal(playerList.get(i).getPegList()))) {
			 System.out.println(" "+ playerList.get(i).getName() + "'s turn"); 
			 System.out.println("Please select one of your peg "); 
			 int locNum = scan.nextInt();
			 System.out.println("Please write your destination path in order(i.e: 3,5,7) "); 
			 String destPath = scan.nextLine();
			 // trim yapýlcak
		 
			 if(locNum>1) {
				 //peg.get(locNum),GameField[] path,board
					 playerList.get(i).setCurrentMove(new JumpingMove());
					while(!(playerList.get(i).makeMove(peg, destLocation, board))){
						System.out.println("Invalid path, please enter correct path "); 
				 }
			   //pegin yerini tasý
			 }else {
				//peg.get(locNum),GameField[] path,board
				 playerList.get(i).setCurrentMove(new JumpingMove());
				while(!(playerList.get(i).makeMove(peg, destLocation, board))){
					System.out.println("Invalid path, please enter correct path "); 
			 }
				//pegin yerini tasý
			 }
		 
		 }else {
			 System.out.println("Congratulations!  "+playerList.get(i).getName()+" is win!" ); 
		 }
	 }
 }
}
