package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void create_new_user_with_name_surname_mailAdress(){
        User felixtoledo = new User("Felix", "Toledo", "felixtoledoctes");
        assertEquals("Felix", felixtoledo.getName());
        assertEquals("Toledo", felixtoledo.getSurname());
        assertEquals("felixtoledoctes@femail.ctes", felixtoledo.getMailAdress());
    }

    @Test
    public void create_new_user_and_check_entry_to_userlist(){
        MailManager femailcom = new MailManager();
        User felixtoledo = femailcom.createNewUser("Felix", "Toledo", "felixtoledoctes");

        assertEquals(1, femailcom.getUserList().size());
        assertEquals(felixtoledo, femailcom.getUserList().get(0));
    }

    @Test
    public void create_new_user_and_give_it_a_personalized_mail_adress(){
        MailManager femailcom = new MailManager();
        User felixtoledo = femailcom.createNewUser("Felix", "Toledo", "felixtoledoctes@gmail.com");
        assertEquals("felixtoledoctes@gmail.com", femailcom.getUserList().get(0).getMailAdress());
    }


}
