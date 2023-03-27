package associations_relationships.todoapp;

public class TodoApp {
    public static void main(String[] args) {
//        TodoItem item = new TodoItem("Koha e iftarit");
//        item.changeCompleted();
//        System.out.println(item);
//
//        TodoItem item1 = new TodoItem("Arsenal Champion");
//        System.out.println(item1);
        TodoService.add("Arsenal Champions");
        TodoService.add("Chelse secunda devision");
        TodoService.add("Banjallucki per 1 jave rresht!");
//        TodoService.printAll();
//
//        System.out.println(TodoService.findById(10));
//        System.out.println(TodoService.findById(1));
//        TodoService.changeCompletedById(1);
//        TodoService.changeCompletedById(2);
//        TodoService.printAll();
//
//
//        TodoService.deleteById(3);
//        TodoService.printAll();
//
        TodoService.printAllTodosThatContains("ARSENAL");
        TodoService.changeTitleFor(1, "Manchester City Champion");
        TodoService.changeCompletedById(1);
        TodoService.printAll();

    }
}
