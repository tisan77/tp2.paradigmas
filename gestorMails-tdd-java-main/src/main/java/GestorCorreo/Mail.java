package GestorCorreo;

import java.util.ArrayList;

public class Mail {

    private String title;
    private String message;
    private String from;
    private ArrayList<String> to = new ArrayList<>();
    

    public Mail(String title, String message,  String from, ArrayList<String> to){
        this.title = title;
        this.message = message;
        this.from = from;
        this.to = to;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom(){
        return from;
    }
}
