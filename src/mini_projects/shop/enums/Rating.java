package mini_projects.shop.enums;

public enum Rating {
    ZERO_STAR("\u2606\u2606\u2606\u2606\u2606", 0),
    ONE_STAR("\u2605\u2606\u2606\u2606\u2606", 1),
    TWO_STAR("\u2605\u2605\u2606\u2606\u2606", 2),
    THREE_STAR("\u2605\u2605\u2605\u2606\u2606", 3),
    FOUR_STAR("\u2605\u2605\u2605\u2605\u2606", 4),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605", 5),
    ;
    private String stars;
    private int value;

    Rating(String stars, int value) {
        this.stars = stars;
        this.value = value;
    }

    public String getStars() {
        return stars;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + stars;
    }
}
