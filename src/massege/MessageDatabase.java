package massege;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
   private static List<Message> baseList = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        baseList.add(new Message(u1, u2, text));

    }
    public static List<Message> getMessages(){
        return baseList;
    }
    public static void showDialog(User u1, User u2){
        for(Message message : getMessages()){
            if(message.getSender() == u1 && message.getReceiver() == u2 || message.getSender() == u2 && message.getReceiver() == u1)
                System.out.println(message);

        }
    }

}
