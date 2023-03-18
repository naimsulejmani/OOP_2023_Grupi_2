package enums;

public class SearchEngineClass {
    public static final SearchEngineClass GOOGLE =
            new SearchEngineClass("https://www.google.com");
    public static final SearchEngineClass BING =
            new SearchEngineClass("https://www.bing.com");
    public static final SearchEngineClass YAHOO =
            new SearchEngineClass("https://www.yahoo.com");
    private final String url;

    private SearchEngineClass(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
