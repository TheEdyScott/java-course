//Ingresar una cadena, e indicar si es una cadena, un archivo, o una url
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class tarea{
  public static void main(String[] args) throws IOException{ //Siempre que se utiliza la libreria io se agrega el throws Exception
  InputStreamReader isr= new InputStreamReader(System.in); //Lee en binario
  BufferedReader keyboard= new BufferedReader(isr); //Convierte el isr a caracteres
  String c1;
  int nc1;
  System.out.println("Ingrese cadena: ");
  c1=keyboard.readLine();
  nc1=c1.length();
  String Fc1,Fc2;
  String urll=".com";
  String ar=".";
  Fc1= c1.substring(nc1-4,nc1);
  //Fc2= c1.substring(nc1-4,nc1-3);
  System.out.println(Fc1);
  if(Fc1.equals(urll)){
    System.out.println("Es una url");
  }
  for (int i=0;i<nc1;i++){
    Fc2= c1.substring(nc1-i,(nc1-i)+1);
    System.out.println(Fc2);
  }

 }
}
