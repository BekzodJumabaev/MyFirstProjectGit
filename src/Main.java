import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner strScanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            System.out.println("""
                       WELCOME
                    0: Exit
                    1: Create todo
                    2: Update todo
                    3: Delete todo
                    4: Viev todo's
                    """);
            System.out.println("Choose...");
            int i = scanner.nextInt();
            switch (i){
                case 0 -> {
                    System.out.println("See you never!");
                    return;
                }
                case 1 -> {
                    System.out.println("Enter name.");
                    String todoName = strScanner.nextLine();
                    boolean todo = TodoService.createTodo(todoName);
                    if (todo){
                        System.out.println("Todo yaratildi:");
                    }else {
                        System.out.println("Todo yaratilmadi:");
                    }
                }
                case 2 -> {
                    List<Todo> todo = TodoService.getTodo();
                    System.out.println(todo);
                    System.out.println("Enter todo Id.");
                    String id = strScanner.nextLine();
                    System.out.println("Enter new name.");
                    String newName = strScanner.nextLine();
                    TodoService.updateTodo(id, newName);
                }
                case 3 -> {List<Todo> todo = TodoService.getTodo();
                    System.out.println(todo);
                    System.out.println("Enter todo Id");
                    String id = strScanner.nextLine();
                    boolean b = TodoService.deleteTodo(id);
                    if (b){
                        System.out.println("O'chrildi.");
                    }else {
                        System.out.println("O'chirilmadi");
                    }
                }
                case 4 -> {
                    List<Todo> todo = TodoService.getTodo();
                    System.out.println(todo);
                }
            }
        }
    }
}