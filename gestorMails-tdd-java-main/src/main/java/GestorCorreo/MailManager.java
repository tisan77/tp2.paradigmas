package GestorCorreo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MailManager {
    private ArrayList<User> userList = new ArrayList<>();

    public MailManager() {
    }

    public void sendMessages(User from, Mail mail){
        ArrayList<String> mailDirections = mail.getTo();
        List<User> matchingUsers = findUsersByMails(mailDirections);
        from.addMailToOutbox(mail);

        for (User user : matchingUsers){
            user.addMailToInbox(mail);
        }
    }

    private List<User> findUsersByMails(ArrayList<String> mails) {
        List<User> matchingUsers = userList.stream()
                .filter(user -> mails.stream()
                        .anyMatch(mail -> user.getMailAdress().equals(mail)))
                .collect(Collectors.toList());

        return matchingUsers;
    }

    public void addUserToList(User newUser) {
        userList.add(newUser);
    }
    
    public User createNewUser(String name, String surname, String mailAdress){
        User user = new User(name, surname, mailAdress);
        addUserToList(user);
        return user;
    }

    //Test purpose
    public ArrayList<User> getUserList() {
        return userList;
    }
}
