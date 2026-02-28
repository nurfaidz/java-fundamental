public class TodolistApp {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * View method to display the to-do list
     */
    public static void showTodolist() {
        System.out.println("TODO LIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * Controller method to add an item to the to-do list
     */
    public static void addTodoList(String todo) {
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Controller method to remove an item from the to-do list
     */
    public static void updateTodoList() {

    }

    /**
     * Controller method to remove an item from the to-do list
     */
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }

            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("Belajar Java");
        addTodoList("Belajar PHP");
        addTodoList("Belajar Python");
        addTodoList("Belajar Golang");
        addTodoList("Belajar JavaScript");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodolist();
    }

    public static String input(String info) {
        System.out.print(info + ": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * View method to display the to-do list
     */
    public static void viewShowTodoList() {
        while (true) {
            showTodolist();

            System.out.println("MENU");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("x. Exit");

            var input = input("Choice");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Option not found");
            }
        }
    }

    public static void testViewShowTodoList() {

        addTodoList("Menu 1");
        addTodoList("Menu 2");
        addTodoList("Menu 3");
        addTodoList("Menu 4");
        addTodoList("Menu 5");
        viewShowTodoList();
    }

    /**
     * View method to add an item to the to-do list
     */
    public static void viewAddTodoList() {
        System.out.println("ADD TODO");

        var todo = input("Todo (x to cancel)");

        if (todo.equals("x")) {
            // cancel
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("One");
        addTodoList("Two");

        viewAddTodoList();
        showTodolist();
    }

    /**
     * View method to remove an item from the to-do list
     */
    public static void viewRemoveTodoList() {
        System.out.println("REMOVE TODO");

        var number = input("Number (x to cancel)");

        if (number.equals("x")) {
            // cancel
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));

            if (!success) {
                System.out.println("Failed to remove todo " + number);
            }
        }
    }

    public static void tesViewRemoveTodoList() {
        addTodoList("One");
        addTodoList("Two");
        addTodoList("Three");

        showTodolist();
        viewRemoveTodoList();
        showTodolist();
    }
}
