package lld.MediatorPattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    private List<ChatUser> ChatUsers;

    public ChatRoom(){
        this.ChatUsers = new ArrayList<>();
    }


    @Override
    public void addUser(ChatUser user) {
        this.ChatUsers.add(user);
    }

    @Override
    public void sendMessage(String message, ChatUser sender) {

        for(ChatUser u : this.ChatUsers){
            if(u != sender){
                u.ReceiveMessage(message, sender);
            }
        }
    }
}
