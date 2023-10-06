package GestorCorreo;

import GestorCorreo.Interfaces.IAdressable;
import GestorCorreo.Interfaces.INameable;
import GestorCorreo.Interfaces.ISurnameable;

public class Contact implements IAdressable, INameable, ISurnameable {
    private Person persona = new Person("", "", "");

    public Contact(String name, String surname, String mailAdress){
        persona.setName(name);
        persona.setSurname(surname);
        persona.setMailAdress(mailAdress);
    }

    public Void setMailAdress(String mailAdress) {
        persona.setMailAdress(mailAdress);
        return null;
    }

    public String getMailAdress() {
        return persona.getMailAdress();
    }

    public void setName(String name) {
        persona.setName(name);
    }

    public String getName() {
        return persona.getName();
    }

    public Void setSurname(String surname) {
        persona.setSurname(surname);
        return null;
    }

    public String getSurname() {
        return persona.getSurname();
    }
}
