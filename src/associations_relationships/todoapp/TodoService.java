package associations_relationships.todoapp;

import java.util.ArrayList;

public class TodoService {
    private static ArrayList<TodoItem> todos = new ArrayList<>();

    public static void add(String title) {
        TodoItem newTodo = new TodoItem(title);
        todos.add(newTodo);
    }

    public static void printAll() {
        System.out.println("Total todos: " + todos.size());
        System.out.println("------------------------------");
        for (TodoItem todo : todos) {
            System.out.println(todo);
        }
        System.out.println("------------------------------");
    }

    public static TodoItem findById(int todoId) {
        for (int i = 0; i < todos.size(); i++) {
            TodoItem item = todos.get(i);
            if (item.getID() == todoId)
                return item;
        }
        return null;
    }

    public static void changeCompletedById(int todoId) {
        TodoItem item = findById(todoId);
        if (item == null) {
            System.out.println("Nuk ekziston todo me id: " + todoId);
        } else {
            item.changeCompleted();
        }
    }

    public static void deleteById(int todoId) {
        TodoItem item = findById(todoId);
        if (item == null) {
            System.out.println("Nuk ekziston todo me id: " + todoId);
        } else {
            todos.remove(item);
        }
    }

    public static void reset() {
        System.out.println("Sistemi do te reseton te dhenat");
        System.out.println("Do te humben gjithsej: " + todos.size() + " todos.");
        todos.clear();
    }

    public static void changeTitleFor(int todoId, String title) {
        TodoItem item = findById(todoId);
        if (item == null) {
            System.out.println("Nuk ekziston todo me id: " + todoId);
        } else {
            item.setTitle(title);
        }
    }

    public static void printAllTodosThatContains(String text) {
        for (TodoItem item : todos) {
            if (item.getTitle().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(item);
            }
        }
    }
}








