package interfaces.games;

public class ChessRuleSet implements RuleSet {
    @Override
    public boolean isLegal(Move m, Board b) {
        return Math.random() < 0.5;
    }

    @Override
    public void makeMove(Move m) {
        System.out.println("Pijuni leviz vetem nje para nese eshte e lire, ose e merr anash ne diagonale para!");
    }
}
