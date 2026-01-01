package lld.MediatorPattern.Problem;

public class User {

    private  String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void sendMessage(String message, User user) {
        System.out.println(this.name + " sends message: " + message + " to " + user.getName());
    }
}
