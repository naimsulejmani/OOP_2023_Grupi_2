package associations_relationships.todoapp;

import java.time.LocalDateTime;

public class TodoItem {
    private static int generateId = 0;
    private final int ID;
    private String title;
    private boolean completed;
    private LocalDateTime createdAt;

    public TodoItem(String title) {
        this.ID = ++generateId;
        this.title = title;
        createdAt = LocalDateTime.now();
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void changeCompleted() {
        this.completed = !completed;
    }

    // [1] - Koha e iftarit (2023-03-27T19:04:00) - TRUE / FALSE 👍👎
    @Override
    public String toString() {
        String completed = this.completed ? "✅" : "❌";
        return String.format("[%d] - %s (%s) - %s", ID, title, createdAt, completed);
    }
}















