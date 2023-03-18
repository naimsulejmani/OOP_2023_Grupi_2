package enums;

public class SuitTest {
    /*
        suit ka vlera 0-zemer, 1-diamond,...
     */
    public static void drawSuitOnCard(int suit) {
        // here we go
    }

    public static void drawSuitOnCard(Suit suit) {
        //here we go
    }

    public static void main(String[] args) {
        drawSuitOnCard(-1);
        drawSuitOnCard(123213);
        drawSuitOnCard(0);
        drawSuitOnCard(1);
        drawSuitOnCard(Suit.CLUBS);
        drawSuitOnCard(Suit.DIAMONDS);
//        drawSuitOnCard(Suit.ASDASD);

        System.out.println(Suit.DIAMONDS);

        String lloji = "CLUBS";
        Suit userSuit = Suit.valueOf(lloji);
        System.out.println(userSuit);

        lloji = "clubs";
        userSuit = Suit.valueOf(lloji.toUpperCase());
        System.out.println(userSuit);


    }
}





