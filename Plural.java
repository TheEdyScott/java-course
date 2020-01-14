import java.io.*;
public class Plural{
  public static void main(String[] args) throws Exception{ //Siempre que se utiliza la libreria io se agrega el throws Exception
    InputStreamReader isr= new InputStreamReader(System.in); //Lee en binario
    BufferedReader keyboard= new BufferedReader(isr); //Convierte el isr a caracteres
    String inputline;
    inputline=keyboard.readLine();
    System.out.print(inputline);
    System.out.println("s");
  }
}
