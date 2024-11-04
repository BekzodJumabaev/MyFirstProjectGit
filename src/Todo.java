import java.time.LocalTime;
import java.util.UUID;

public class Todo {
    private String id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalTime getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(LocalTime addedTime) {
        this.addedTime = addedTime;
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
