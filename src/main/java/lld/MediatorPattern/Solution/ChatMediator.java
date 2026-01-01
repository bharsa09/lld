package lld.MediatorPattern.Solution;

public interface ChatMediator {

    void sendMessage(String message, ChatUser user);

    void addUser(ChatUser user);
}
