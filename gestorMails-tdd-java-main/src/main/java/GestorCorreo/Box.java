package GestorCorreo;

import java.util.ArrayList;

public class Box {

    private ArrayList<Mail> mails = new ArrayList<>();

    public int size(){
        return mails.size();
    }


    public void add(Mail mail) {
        mails.add(mail);
    }

    public Mail get(int index){
        return mails.get(index);
    }

    public ArrayList<Mail> getAll(){
        return mails;
    }
}
