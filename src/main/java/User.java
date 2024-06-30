public class User {
    private String name;
    private Task head;

    public User(String name) {
        this.name = name;
        this.head = null;
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
    }

    public void markTaskAsCompleted(String description) {
        Task current = head;
        while (current != null) {
            if (current.getDescription().equals(description)) {
                current.markAsCompleted();
                return;
            }
            current = current.getNext();
        }
    }

    public void viewTasks() {
        Task current = head;
        while (current != null) {
            System.out.println("Task: " + current.getDescription() + ", Status: " + (current.isCompleted() ? "Completed" : "Pending"));
            current = current.getNext();
        }
    }
}

