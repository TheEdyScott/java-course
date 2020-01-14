//Ingresar por teclado 3 cadenas de texto y crear un archivo con la mas grande
//Ingresar por teclado el nombre del archivo he imprimir en el abecedario, el archivo no debe existir
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Archivo7{
  public static void main(String[] args) throws IOException{ //Siempre que se utiliza la libreria io se agrega el throws Exception
  InputStreamReader isr= new InputStreamReader(System.in); //Lee en binario
  BufferedReader keyboard= new BufferedReader(isr); //Convierte el isr a caracteres
  String c1,c2,c3;
  System.out.println("Ingrese primer cadena: ");
  c1=keyboard.readLine();
  System.out.println("Ingrese segunda cadena: ");
  c2=keyboard.readLine();
  System.out.println("Ingrese tercer cadena: ");
  c3=keyboard.readLine();
  int nc1,nc2,nc3;
  nc1=c1.length();
  nc2=c2.length();
  nc3=c3.length();

  String ruta = "cadena.txt";
  File archivo = new File(ruta);
  BufferedWriter bw;
  bw = new BufferedWriter(new FileWriter(archivo));
  if (nc1>nc2&&nc1>nc3){
    bw.write(c1);
  }
  else if(nc2>nc1&&nc2>nc3) {
    bw.write(c2);
  }
  else{
    bw.write(c3);
  }
  bw.close();
  }
}
