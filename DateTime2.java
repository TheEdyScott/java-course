import java.util.*;
public class DateTime2{
  public static void main(String[] args){
    GregorianCalendar leapday=new GregorianCalendar(1998,10,07); //Año mes(menos uno poque empieza en 0) y dia
    System.out.println(leapday.getTime());
  }
}
