import java.util.ArrayList;
import java.util.Scanner;

public class TodoListController {
    private ArrayList<String> todoItems = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public String addItem(){
        // add new items to the array
        try {
            System.out.println("Enter description of what you want to do: ");
            String item = this.scanner.nextLine();
            if (item.isBlank()) {
                return "Failed to add empty item";
            } else {
                this.todoItems.add(item);
                return "Item added successfully";
            }
        } catch (Exception exception){
            return "Error: " + exception.getMessage();
        }
    }

    public void displayItems(){
        System.out.println("=== Items in todo list ===");
        int counter = 1;
        for (String item: this.todoItems){
            System.out.println( counter + ". " + item);
            counter ++; // the same as counter = counter + 1;
        }
    }
}
