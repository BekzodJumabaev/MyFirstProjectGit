import java.util.ArrayList;
import java.util.List;

public class TodoService {

    List<Todo> todoList;

    public TodoService() {
        this.todoList = new ArrayList<>();
    }

    public boolean createTodo(String todoName){
        boolean add = false;
        Todo todo = new Todo(todoName);
        add = todoList.add(todo);
        return add;
    }

    public void updateTodo(String todoId, String newTodoName){
        for (Todo todo : todoList) {
            if (todo.getId().equals(todoId)){
                todo.setTodoName(newTodoName);
            }
        }
    }

    public boolean deleteTodo(String todoId) {
        boolean remove = false;
        for (Todo todo : todoList) {
            if (todo.getId().equals(todoId)) {
                remove = todoList.remove(todo);
            }
        }
        return remove;
    }

    public List<Todo> getTodo(){
        return todoList;
    }
}
