import java.util.HashMap;
import java.util.ArrayList;

public class ChatServer extends netzklassen.Server
{
    private ArrayList<Chat> chats;
    private ArrayList<User> users;
    private HashMap<String, User> ipAssignment;

    public ChatServer()
    {  
        super(666);
    }
    
    public  void processNewConnection(String pClientIP, int pClientPort) {
        
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        String[] splitMessage = pMessage.split(" ");
        User user = ipAssignment.get(pClientIP);
        boolean isLoggedIn = user != null;
        switch (splitMessage[0]) {
            case "LOGIN":
                break;
            case "REGISTER":
                break;
            case "LOGOUT":
                break;
        }
    }

    public void processClosingConnection(String pClientIP, int pClientPort) {
        
    }
}