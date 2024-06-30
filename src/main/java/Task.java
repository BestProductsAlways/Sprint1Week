public class Task {
    private String description;
    private boolean isCompleted;
    private Task next;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        this.next = null;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }
}

