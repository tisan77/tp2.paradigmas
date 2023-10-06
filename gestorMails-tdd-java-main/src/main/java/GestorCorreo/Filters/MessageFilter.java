package GestorCorreo.Filters;
import java.util.ArrayList;
import GestorCorreo.*;
import java.util.stream.Collectors;


public class MessageFilter extends Filter {

        public MessageFilter(){
                super.setName("Filtro de Mensaje");
        }
        
     @Override
     protected ArrayList<Mail> searchString(String toSearch, Box box) {
          ArrayList<Mail> mails = box.getAll().stream()
                  .filter(mail -> mail.getMessage().contains(toSearch))
                  .collect(Collectors.toCollection(ArrayList::new)); // Collect the filtered mails into an ArrayList
          return mails; // Return the ArrayList containing filtered mails
      }

}
