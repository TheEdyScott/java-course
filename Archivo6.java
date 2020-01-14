//Ingresar por teclado el nombre del archivo he imprimir en el abecedario, el archivo no debe existir
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Archivo6{
  public static void main(String[] args) throws IOException{ //Siempre que se utiliza la libreria io se agrega el throws Exception
  InputStreamReader isr= new InputStreamReader(System.in); //Lee en binario
  BufferedReader keyboard= new BufferedReader(isr); //Convierte el isr a caracteres
  String nombre;
  System.out.println("Ingrese nombre del archivo: ");
  nombre=keyboard.readLine();
  String ruta = nombre;
  File archivo = new File(ruta);
  BufferedWriter bw;
    if(archivo.exists()) {

           System.out.println("invalido");
    } else {
           bw = new BufferedWriter(new FileWriter(archivo));
           bw.write("abcdefghijklmnopqrstuvwxyz");
           bw.close();
    }

  }
}
