import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public class Todo {
    private final String id;
    private String todoName;
    private LocalTime addedTime;

    public Todo() {
        this.id = UUID.randomUUID().toString().replace('-',  '.');
    }

    public Todo(String todoName) {
        this();
        LocalTime localDate = LocalTime.now();
        this.todoName = todoName;
        this.addedTime = localDate;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }


    @Override
    public String toString() {
        return "Todo{" +
                "id='" + id + '\'' +
                ", todoName='" + todoName + '\'' +
                ", addedTime=" + addedTime +
                '}';
    }
}
