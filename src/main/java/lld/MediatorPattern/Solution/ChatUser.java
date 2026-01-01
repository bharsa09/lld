package lld.MediatorPattern.Solution;

public class ChatUser {

    private  String name;
    private ChatMediator chatMediator;
    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }
    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " is sending message: " + message);
        chatMediator.sendMessage(message, this);
    }
    public void ReceiveMessage(String message, ChatUser sender) {
        System.out.println(this.name + " received message: " + message + " from " + sender.getName());
    }
}