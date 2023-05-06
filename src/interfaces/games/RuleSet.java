package interfaces.games;

public interface RuleSet {
    boolean isLegal(Move m, Board b);

    void makeMove(Move m);
}
