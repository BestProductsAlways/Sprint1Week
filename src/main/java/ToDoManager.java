import java.util.ArrayList;

public class ToDoManager {
    private ArrayList<User> users;

    public ToDoManager() {
        users = new ArrayList<>();
    }

    public void createUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                System.out.println("User with this name already exists.");
                return;
            }
        }
        users.add(new User(name));
    }

    public User getUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        System.out.println("User not found.");
        return null;
    }

    public static void main(String[] args) {
        ToDoManager manager = new ToDoManager();
        manager.createUser("Alice");
        manager.createUser("Bob");

        User alice = manager.getUser("Alice");
        if (alice != null) {
            alice.addTask("Buy groceries");
            alice.addTask("Pay bills");
            alice.viewTasks();

            alice.markTaskAsCompleted("Buy groceries");
            alice.viewTasks();
        }

        User bob = manager.getUser("Bob");
        if (bob != null) {
            bob.addTask("Walk the dog");
            bob.viewTasks();
        }
    }
}
