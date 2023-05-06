package interfaces.games;

public class Game {
    public static void play(RuleSet ruleSet, Move m, Board b) {
        if (ruleSet.isLegal(m, b)) {
            ruleSet.makeMove(m);
        } else {
            System.out.println("Ilegal move! Please try again!");
        }
    }
    public static void main(String[] args) {
        ChessRuleSet chessRule = new ChessRuleSet();
        Move pijuni = new Move();
        Board chessBoard = new Board(8, 8);
        CheckersRuleSet checkersRule = new CheckersRuleSet();
        Move figure = new Move();
        Board checkersBoard = new Board(20, 20);
        play(chessRule, pijuni, chessBoard);
        play(checkersRule, figure, checkersBoard);

    }
}
