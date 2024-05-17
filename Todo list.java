import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> tasks = new ArrayList<>();

    int choice;
    do {
      System.out.println("\nTo-Do List App");
      System.out.println("1. Add Task");
      System.out.println("2. Remove Task");
      System.out.println("3. Mark Task Complete");
      System.out.println("4. View All Tasks");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter a new task: ");
          scanner.nextLine(); // consume the newline character left by nextInt
          String newTask = scanner.nextLine();
          tasks.add(newTask);
          System.out.println("Task added successfully!");
          break;
        case 2:
          if (tasks.isEmpty()) {
            System.out.println("There are no tasks to remove!");
          } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
              System.out.println(i + 1 + ". " + tasks.get(i));
            }
            System.out.print("Enter the number of the task to remove: ");
            int removeIndex = scanner.nextInt() - 1;
            if (removeIndex >= 0 && removeIndex < tasks.size()) {
              tasks.remove(removeIndex);
              System.out.println("Task removed successfully!");
            } else {
              System.out.println("Invalid task number!");
            }
          }
          break;
        case 3:
          if (tasks.isEmpty()) {
            System.out.println("There are no tasks to mark complete!");
          } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
              System.out.println(i + 1 + ". " + tasks.get(i));
            }
            System.out.print("Enter the number of the task to mark complete: ");
            int completeIndex = scanner.nextInt() - 1;
            if (completeIndex >= 0 && completeIndex < tasks.size()) {
              String completedTask = tasks.get(completeIndex) + " (Completed)";
              tasks.set(completeIndex, completedTask);
              System.out.println("Task marked complete successfully!");
            } else {
              System.out.println("Invalid task number!");
            }
          }
          break;
        case 4:
          if (tasks.isEmpty()) {
            System.out.println("There are no tasks in your list!");
          } else {
            System.out.println("Tasks:");
            for (String task : tasks) {
              System.out.println(task);
            }
          }
          break;
        case 5:
          System.out.println("Exiting To-Do List App.");
          break;
        default:
          System.out.println("Invalid choice!");
      }
    } while (choice != 5);

    scanner.close();
  }
}
