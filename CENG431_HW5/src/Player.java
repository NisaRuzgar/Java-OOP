import java.util.ArrayList;

public class Player {
	private String name;
	private Move currentMove;
	private ArrayList<Peg> pegList;
	private ArrayList<GameField> targetFields;

	
	public Player(String name) {
		this.name= name;
		setPegList(new ArrayList<Peg>());
		currentMove = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Move getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(Move currentMove) {
		this.currentMove = currentMove;
	}
	
	public ArrayList<Peg> getPegList() {
		return pegList;
	}

	public void setPegList(ArrayList<Peg> pegList) {
		this.pegList = pegList;
	}
	
	public boolean makeMove(Peg peg, GameField[] destLocation,CheckerBoard board) {
		return currentMove.visit(peg,destLocation,board);
	}
	  


}
