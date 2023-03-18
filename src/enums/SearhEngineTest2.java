package enums;

import java.util.Scanner;

public class SearhEngineTest2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Zgjidh njeren nga keto search engine: ");
        for (SearchEngine engine : SearchEngine.values()) {
            System.out.printf("(%s) per %s%n", engine, engine.getUrl());
        }

        String engine = reader.nextLine();
        SearchEngine userEngine = SearchEngine.valueOf(engine.toUpperCase());
        System.out.println("SELECTED -> " + userEngine);
    }
}
