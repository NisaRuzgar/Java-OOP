
public interface Move {
	//visitor and strategy should apply here
	public boolean visit(Peg peg, GameField[] destGameField, CheckerBoard board);
}
