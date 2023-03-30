package associations_relationships.todoapp;

public enum TodoMenu {
    ADD(1, " Shto nje Todo te ri"),
    CHANGE_COMPLETED(2, " Ndrysho statusin e todos"),
    CHANGE_TITLE(3, " Ndrysho titullin e todos"),
    DELETE(4, " Fshi nje todo!"),
    PRINT_ALL(5, " Printo te gjithe todo-te"),
    PRINT_BY(6, " Printo te gjithe todo-te sipas filtrit"),
    RESET(7, " Fshij te gjithe todo-te / reseto!"),
    EXIT(8, " Mbyll aplikacionin e todo-se!");
    private final int id;
    private final String description;

    TodoMenu(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public static TodoMenu selectById(int menuId) {
        for (TodoMenu menu : TodoMenu.values()) {
            if (menu.id == menuId)
                return menu;
        }
        return null;
    }


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static void showMenu() {
        System.out.println("--------------------------------------");
        for (TodoMenu menu : TodoMenu.values()) {
            System.out.printf("%d - %s %n", menu.id, menu.description);
        }
        System.out.println("--------------------------------------");
    }
}







