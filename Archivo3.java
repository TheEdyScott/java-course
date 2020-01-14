//Ingresar por teclado nombre, apellido paterno y apellido materno, he imprimir en mayusculas las iniciales
import java.io.*;
public class Archivo3{
  public static void main(String[] args) throws Exception{ //Siempre que se utiliza la libreria io se agrega el throws Exception
    InputStreamReader isr= new InputStreamReader(System.in); //Lee en binario
    BufferedReader keyboard= new BufferedReader(isr); //Convierte el isr a caracteres
    String nombre;
    System.out.println("Ingrese nombre: ");
    nombre=keyboard.readLine();
    String ApPat;
    System.out.println("Ingrese apellido paterno: ");
    ApPat=keyboard.readLine();
    String ApMat;
    System.out.println("Ingrese apellido materno: ");
    ApMat=keyboard.readLine();
    System.out.println((nombre.substring(0,1).concat(ApPat.substring(0,1)).concat(ApMat.substring(0,1))).toUpperCase());

  }
}
