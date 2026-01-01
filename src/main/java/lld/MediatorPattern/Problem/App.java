package lld.MediatorPattern.Problem;

public class App {

    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        user1.sendMessage("Hello, Bob!", user2);
        user2.sendMessage("Hi, Alice!", user1);
    }
}
//so here the issue is that the users are directly communicating with each other without any mediator,
// which can lead to tight coupling and difficulty in managing interactions as the number of users increases.
//One object has to know about the other object to communicate which is not a good design practice.