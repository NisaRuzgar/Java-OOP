
public class JumpingMove implements Move{
	public boolean visit(Peg peg, GameField[] destGameField,CheckerBoard board) {

		int pegLoc = peg.getLocationNumber();
		GameField[][] gameBoard = board.getBoard();
		
		for(int i = 0; i < 17; i++){
	        for(int j = 0; j < 13; j++){
	            if(gameBoard[i][j].equals(pegLoc)){
					for(int k=0;k<destGameField.length;k++) {
				    	if(destGameField[k].getIsEmpty()) {
				    		if(destGameField[k].getLocationNumber() < pegLoc) {
				    			int remainder = pegLoc - destGameField[k].getLocationNumber();
				    			if((remainder % 13 ) == 0) {
				    		      if(gameBoard[i-1][j].getIsEmpty()){return false;}
				    		    }if((remainder % 13 ) == 12) {
					    		   if(gameBoard[i-1][j-1].getIsEmpty()){return false;}
					    		}if((remainder % 13 ) == 1) {
					    		      if(gameBoard[i-1][j+1].getIsEmpty()){return false;}
					    		}if((remainder % 13 ) == 2) {
					    		      if(gameBoard[i][j-1].getIsEmpty()){return false;}
					    		}
				    			
				    		}
				    		if(destGameField[k].getLocationNumber() > pegLoc) {
				    			int remainder = pegLoc - destGameField[k].getLocationNumber();
				    			if((remainder % 13 ) == 0) {
				    		      if(gameBoard[i+1][j].getIsEmpty()){return false;}
				    		    }if((remainder % 13 ) == 12) {
					    		   if(gameBoard[i+1][j-1].getIsEmpty()){return false;}
					    		}if((remainder % 13 ) == 1) {
					    		      if(gameBoard[i+1][j+1].getIsEmpty()){return false;}
					    		}if((remainder % 13 ) == 2) {
					    		      if(gameBoard[i][j+1].getIsEmpty()){return false;}
					    		}
				    			
				    		}
				    	}else {return false;}
					}
					return true;
	            }
	         }
	      }
		return false;
	}
}
