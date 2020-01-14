import java.util.*;
public class DateTime1{
  public static void main(String[] args){
    GregorianCalendar now=new GregorianCalendar();
    Date d= now.getTime(); //Variables date solo almacenan fechas , getTime debuelve fecha y hora
    System.out.println(d);
    TimeZone timeZone=now.getTimeZone(); //Zona horaria
    String s= timeZone.getDisplayName(); //Obtiene el nombre de la zona horaria
    System.out.println(s);
    System.out.println(now.getTimeZone().getDisplayName());
  }
}
