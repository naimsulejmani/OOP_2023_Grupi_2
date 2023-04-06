package inheritance.bird_app;

public class BirdTest {
    public static void main(String[] args) {
        Bird aBird = new Parrot();
//        Bird aBird1 = new Parrot("hello", "white+black", "pasul me gullash");
//        Bird aBird2 = new Goose("quack quack", "black", "hamburger te agores");

        //aBird1.test();
        //((Parrot)aBird1).test();

//        System.out.println(aBird1.getCall());
//        System.out.println(aBird2.getCall());
//
//
//        System.out.println(aBird1);
//        System.out.println(aBird2);
//        caller(aBird);
//        caller(aBird2);
    }

    public static void caller(Bird abird) {
        System.out.println(abird.getCall());
        System.out.println(abird);
    }
}




