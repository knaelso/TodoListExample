import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        TodoListController todoListController = new TodoListController();

        while (!userInput.equals("3")){
            System.out.println("""
                === Todo list menu ===
                1. Add Item
                2. View Items
                3. Exit
                
                Please enter your option:
            """);
            userInput = scanner.nextLine();

            switch (userInput){
                case "1":
                    // add item to list
                    String response = todoListController.addItem();
                    System.out.println(response);
                    break;
                case "2":
                    todoListController.displayItems();
                    break;
                case "3":
                    // exit the application
                    break;
                default:
                    System.out.println("Please select one option from above");
                    break;
            }
        }
    }
}
