package enums;

public class SearchEngineTest {
    public static void main(String[] args) {
        SearchEngine favoriteSearchEngine = SearchEngine.BING;
        System.out.println(favoriteSearchEngine);
        System.out.println(favoriteSearchEngine.getUrl());

        if (favoriteSearchEngine == SearchEngine.GOOGLE) {
            System.out.println("Hala sje dal ne BING me chatgpt 4 a!?");
        } else if (favoriteSearchEngine.equals(SearchEngine.BING)) {
            System.out.println("GOOD CHOICE");
        } else {
            System.out.println("A ka njerz qe perdorin YAHOO A !?");
        }


        System.out.println(favoriteSearchEngine.compareTo(SearchEngine.GOOGLE));
        System.out.println(SearchEngine.GOOGLE.compareTo(favoriteSearchEngine));

        SearchEngine[] searchEngines = SearchEngine.values();

        for (SearchEngine engine : searchEngines) {
            if (engine.getUrl().contains("goo"))
                System.out.printf("%s -> %s%n", engine, engine.getUrl());
        }

        SearchEngine engin = searchEngines[(int) (Math.random() * searchEngines.length)];
        System.out.println("Random Engine: " + engin);

        switch (engin) {
            case BING -> System.out.println("Keni zgjedh te duhuren");
            case YAHOO -> System.out.println("Spo din me perzgjedh!");
            case GOOGLE -> {
                System.out.println("GOOGLE ESHTE MA E MIRA");
                System.out.println("DERISA NUK E KA PERDORE CHATGPT-ne BING-u");
            }
        }

    }
}








