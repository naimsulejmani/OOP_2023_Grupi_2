package associations_relationships.todoapp;

import java.util.Scanner;

public class TodoApp {
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Zgjedh meny-ne: ");
        TodoMenu.showMenu();
        int menuId = Integer.parseInt(reader.nextLine());
        TodoMenu selectedMenu = TodoMenu.selectById(menuId);

        while (selectedMenu != TodoMenu.EXIT) {
            if (selectedMenu != null) {
                switch (selectedMenu) {
                    case ADD -> addNewTodo();
                    case CHANGE_COMPLETED -> changeTodoStatus();
                    case CHANGE_TITLE -> changeTodoTitle();
                    case DELETE -> deleteTodo();
                    case PRINT_ALL -> printAllTodos();
                    case PRINT_BY -> printAllTodosByFilter();
                    case RESET -> clearAllTodos();
                }
            } else {
                System.out.println("Nuk keni zgjedhur menu valide!");
            }
            System.out.println("Zgjidh njeren nga menyte: ");
            TodoMenu.showMenu();
            menuId = Integer.parseInt(reader.nextLine());
            selectedMenu = TodoMenu.selectById(menuId);
        }
        System.out.println("Aplikacioni u mbyll! See you soon!");

    }

    private static void clearAllTodos() {
        // TODO: shtoni nje kontrolle ose pyetni a jeni i sigurte PO/JO
        TodoService.reset();
    }

    private static void printAllTodosByFilter() {
        System.out.println("Shkruani filterin per raportim: ");
        String filterText = reader.nextLine();
        TodoService.printAllTodosThatContains(filterText);
    }

    private static void printAllTodos() {
        TodoService.printAll();
    }

    private static void deleteTodo() {
        System.out.println("Zgjidh njeren nga todo-te e meposhtme sipas ID-se");
        TodoService.printAll();
        int todoId = Integer.parseInt(reader.nextLine());
        TodoService.deleteById(todoId);
    }

    private static void changeTodoTitle() {
        System.out.println("Zgjidh njeren nga todo-te e meposhtme sipas ID-se");
        TodoService.printAll();
        int todoId = Integer.parseInt(reader.nextLine());
        System.out.println("Shkruaj titullin e ri: ");
        String newTitle = reader.nextLine();
        TodoService.changeTitleFor(todoId, newTitle);
    }

    private static void changeTodoStatus() {
        System.out.println("Zgjidh njeren nga todo-te e meposhtme sipas ID-se");
        TodoService.printAll();
        int todoId = Integer.parseInt(reader.nextLine());
        TodoService.changeCompletedById(todoId);
    }

    private static void addNewTodo() {
        System.out.println("Shkruaj todo: ");
        String title = reader.nextLine();
        TodoService.add(title);
    }
}







