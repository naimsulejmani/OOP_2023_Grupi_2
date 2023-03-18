package enums;

public enum SearchEngine {
    GOOGLE("https://www.google.com"),
    BING("https://www.bing.com"),
    YAHOO("https://www.yahoo.com");

    private final String url;
    private SearchEngine(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

//    @Override
//    public String toString() {
//        return "SearchEngine{" +
//                "url='" + url + '\'' +
//                '}';
//    }
}












