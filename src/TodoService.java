import java.util.ArrayList;
import java.util.List;

public class TodoService {

    static List<Todo> todoList;

    public TodoService() {
        this.todoList = new ArrayList<>();
    }

    public static void createTodo(String todoName){
        Todo todo = new Todo(todoName);
        todoList.add(todo);
    }

    public static void updateTodo(String todoId, String newTodoName){
        for (Todo todo : todoList) {
            if (todo.getId().equals(todoId)){
                todo.setTodoName(newTodoName);
            }
        }
    }

    public static boolean deleteTodo(String todoId) {

        for (Todo todo : todoList) {
            if (todo.getId().equals(todoId)) {
                return   todoList.remove(todo);
            }
        }
        return false;
    }

    public static List<Todo> getTodo(){
        return todoList;
    }
}
