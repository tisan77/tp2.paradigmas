package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {
    @Test
    public void check_creation_of_contact(){
        Contact contacto = new Contact("Felix", "Toledo", "felix@gmail.com");
        assertEquals("Felix", contacto.getName());
        assertEquals("Toledo", contacto.getSurname());
        assertEquals("felix@gmail.com", contacto.getMailAdress());
    }


}
