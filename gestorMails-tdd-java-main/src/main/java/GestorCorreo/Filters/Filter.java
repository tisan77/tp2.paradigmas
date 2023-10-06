package GestorCorreo.Filters;
import java.util.ArrayList;
import GestorCorreo.*;
import GestorCorreo.Interfaces.INameable;

public class Filter implements INameable{
     private String name = "";

     protected ArrayList<Mail> searchString(String toSearch, Box box){
          return null;
     }

     public ArrayList<Mail> filter(String toSearchTitle, String toSearchAnother, Box box){
          searchString(toSearchTitle, box);
          searchString(toSearchAnother, box);
          return null;
     }

     public ArrayList<Mail> filter(String toSearch, Box box){
          ArrayList<Mail> mails = searchString(toSearch, box);
          return mails;
     }

     public void setName(String name){
          this.name = name;
     }

     public String getName(){
          return name;
     }
}
