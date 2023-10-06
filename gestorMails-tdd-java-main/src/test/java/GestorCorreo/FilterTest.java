package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.*;
import GestorCorreo.Filters.*;

import java.util.ArrayList;


public class FilterTest {
     MailManager app = new MailManager();
     User felix = app.createNewUser("Felix", "Toledo", "felixtoledoctes");
     User rodrigo = app.createNewUser("rodri", "Gonzalez", "rodrigo@gmail.com");
     User grace = app.createNewUser("grace", "meza", "gracemeza10");
     

     @Test
     public void filter_from_title(){
          felix.addNewContact("Gracielita", "Meza - TRABAJO", "gracemeza10@femail.ctes");
          felix.addNewContact("Rodri", "Mi hermano", "rodrigo@gmail.com");

          felix.createMessage(app, "BuscoEste", "mensaje", felix.getAllContactMails());
          felix.createMessage(app, "Nobuskoezte", "mjito", "rodrigo@gmail.com");
          felix.createMessage(app, "EsteSiBusco", "mensaje", "gracemeza10@femail.ctes");

          TitleFilter filtro = new TitleFilter();
          ArrayList<Mail> resultado = felix.filterOutbox("Busco", filtro);
          assertEquals(2, resultado.size());
     }

     @Test
     public void filter_from_message(){
          felix.createMessage(app, "mensaje a grace", "hola graciela", "gracemeza10@femail.ctes");
          felix.createMessage(app, "mensaje a grace", "chau grace", "gracemeza10@femail.ctes");
     
          MessageFilter filtro = new MessageFilter();
          ArrayList<Mail> resultado = grace.filterInbox("hola", filtro);
          assertEquals(1, resultado.size());
     }

     @Test
     public void filter_from_from(){
          felix.createMessage(app, "hola", "mjito", "rodrigo@gmail.com");
          felix.createMessage(app, "chau", "mjito", "rodrigo@gmail.com");
          grace.createMessage(app, "Nobuskoezte", "mjito", "rodrigo@gmail.com");

          FromFilter filtro = new FromFilter();
          ArrayList<Mail> resultado = rodrigo.filterInbox("felixto", filtro);
          assertEquals(2, resultado.size());
     }

     @Test
     public void filter_from_title_and_from(){
          
     }

     @Test
     public void filter_from_title_and_message(){
          
     }

     @Test
     public void name_of_filters(){
          FromFilter filtroRemitente = new FromFilter();
          MessageFilter filtroMensaje = new MessageFilter();
          TitleFilter filtroAsunto = new TitleFilter();

          String nombreFiltroRemitente = filtroRemitente.getName();
          String nombreFiltroMensaje = filtroMensaje.getName();
          String nombreFiltroAsunto = filtroAsunto.getName();

          assertEquals("Filtro de Remitente", nombreFiltroRemitente);
          assertEquals("Filtro de Mensaje", nombreFiltroMensaje);
          assertEquals("Filtro de Asunto", nombreFiltroAsunto);

     }
}
