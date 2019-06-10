
public class SingleMove implements Move{
	
	public boolean visit(Peg peg, GameField[] destGameField,CheckerBoard board) {
		
		int pegLoc = peg.getLocationNumber();
		GameField pegDest = destGameField[0];
		GameField[][] gameBoard = board.getBoard();
				
			for(int i = 0; i < 17; i++){
		        for(int j = 0; j < 13; j++){
		            if(gameBoard[i][j].equals(pegLoc)){
		            
		            	if(gameBoard[i][j+1].equals(pegDest) || gameBoard[i][j-1].equals(pegDest) ||
		            	   gameBoard[i+1][j].equals(pegDest) || gameBoard[i+1][j-1].equals(pegDest) || gameBoard[i+1][j+1].equals(pegDest)|| 
		            	   gameBoard[i-1][j+1].equals(pegDest) || gameBoard[i-1][j-1].equals(pegDest) || gameBoard[i-1][j].equals(pegDest)	) {
		            	    if(pegDest.getIsEmpty()) {
		            	    	return true;
		            	    }
		            	    else { return false;}
		            	}
		            }
		        }
		    }
		return true;
	}

}
