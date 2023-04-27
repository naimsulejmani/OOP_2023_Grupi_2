package mini_projects.shop.models;

import mini_projects.shop.enums.Rating;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Review {
    private String username;
    private String comment;
    private Rating rating;
    private LocalDateTime dateTime;
    private boolean anonymous;

    public Review(String username, String comment, Rating rating, LocalDateTime dateTime, boolean anonymous) {
        this.username = username;
        this.comment = comment;
        this.rating = rating;
        this.dateTime = dateTime;
        this.anonymous = anonymous;
    }

    public Review(String username, String comment, Rating rating, boolean anonymous) {
        this(username, comment, rating, LocalDateTime.now(), anonymous);
    }

    public String getUsername() {
        return isAnonymous() ? "*****" : username;
    }

    public String getComment() {
        return comment;
    }

    public Rating getRating() {
        return rating;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    @Override
    public String toString() {
        return String.format("%s - [%s]: %s - (%s)", rating.getStars(),
                getUsername(), comment,dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}












