package lld.MediatorPattern.Solution;

public class chatApp {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        ChatUser user1 = new ChatUser("Alice",mediator);
        ChatUser user2 = new ChatUser("Bob",mediator);
        ChatUser user3 = new ChatUser("Charlie",mediator);


        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello everyone!");

    }
}
