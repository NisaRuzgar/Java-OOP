
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckerBoard{
	public static final int[] p1FieldR = new int[]{7,19,20,32,33,34,44,45,46,47};
	public static final int[] p2FieldP = new int[]{62,63,64,65,75,76,77,89,90,102};
	public static final int[] p3FieldY = new int[]{128,141,142,153,154,155,166,167,168,169};
	public static final int[] p4FieldO = new int[]{174,175,176,177,188,189,190,201,202,215};
	public static final int[] p5FieldG = new int[]{119,132,133,144,145,146,157,158,159,160};
	public static final int[] p6FieldB = new int[]{53,54,55,56,66,67,68,80,81,93};
	
	private GameField[][] board;
	
	
	 public void setBoard(GameField[][] board) {
		   this.board = board ;
		  }
	
	 public GameField[][] getBoard() {
		    return board;
		  }
	 public void createPlayers(int numPlayer) {
		 
		 
	 }
	 
	 public boolean checkPegsReachGoal(ArrayList<Peg> pField) {
		
		 ArrayList<Integer> p1Block = new ArrayList<Integer>() ;
		 for(Peg p: pField) {
			 p1Block.add( p.getLocationNumber());
		 }
		 
		 if(pField.get(0).getColor() == Color.RED ) {
			 p1Block.retainAll(p4FieldO);
			 if(p1Block.size()== 10) {return true;}else {return false;}
		 } 
		 if(pField.get(0).getColor() == Color.PINK ) {
			 p1Block.retainAll(p5FieldG);
			 if(p1Block.size()== 10) {return true;}else {return false;}
		 }
		 if(pField.get(0).getColor() == Color.YELLOW ) {
			 p1Block.retainAll(p6FieldB);
			 if(p1Block.size()== 10) {return true;}else {return false;}
		 } 
		 if(pField.get(0).getColor() == Color.ORANGE ) {
			 p1Block.retainAll(p1FieldR);
			 if(p1Block.size()== 10) {return true;}else {return false;}
		 }
		 if(pField.get(0).getColor() == Color.GREEN ) {
			 p1Block.retainAll(p2FieldP);
			 if(p1Block.size()== 10) {return true;}else {return false;}
		 } 
		 if(pField.get(0).getColor() == Color.BLUE ) {
			 p1Block.retainAll(p3FieldY);
			 if(p1Block.size()== 10) {return true;}else {return false;}
		 }
		 
		 return false;
	 }

}
