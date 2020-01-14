//Imprimi la zona horaria en mayusculas y minisculas
import java.util.*;
public class Object5{
  public static void main(String[] args){
    GregorianCalendar now=new GregorianCalendar();
    TimeZone timeZone=now.getTimeZone(); //Zona horaria
    String s= timeZone.getDisplayName(); //Obtiene el nombre de la zona horaria
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());

  }
}
