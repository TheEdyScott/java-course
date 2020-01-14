//Imprimir La fecha y hora y en la siguiente linea mostrar en mayusculas unicamente el mes
import java.util.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
public class Object4{
  public static void main(String[] args){

    GregorianCalendar now=new GregorianCalendar();
    Date d= now.getTime(); //Variables date solo almacenan fechas , getTime debuelve fecha y hora
    System.out.println(d);
    System.out.println(((String.valueOf(d)).substring(4,8)).toUpperCase()); //Valueof convierte todo a string

    //Month mes = LocalDate.now().getMonth();
    //String nombre = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
    //System.out.println(nombre.toUpperCase());

  }
}
