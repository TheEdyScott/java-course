import java.util.*;
public class DateTime3{
  public static void main(String[] args){
    GregorianCalendar leapday=new GregorianCalendar();
    if(leapday.isLeapYear(2096)) //Cecha si el año es bisisesto 
      System.out.println("2096 is a leap year");
    else
      System.out.println("2096 is not a leap year");
  }
}
