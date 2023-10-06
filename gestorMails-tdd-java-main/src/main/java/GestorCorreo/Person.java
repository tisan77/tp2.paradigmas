package GestorCorreo;

import GestorCorreo.Interfaces.IAdressable;
import GestorCorreo.Interfaces.INameable;
import GestorCorreo.Interfaces.ISurnameable;

public class Person implements  IAdressable,
                                ISurnameable,
                                INameable {
    private String name;
    private String surname;
    private String mailAdress;

    public Person(String name, String surname, String mailAdress){
        this.name = name;
        this.surname = surname;
        this.setMailAdress(mailAdress);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Void setSurname(String surname) {
        this.surname = surname;
        return null;
    }

    public Void setMailAdress(String mailAdress) {
        if(mailAdress.contains("@")){
            this.mailAdress = mailAdress;
        } else {
            this.mailAdress = mailAdress + "@femail.ctes";
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMailAdress(){
        return mailAdress;
    }
}