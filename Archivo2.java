//Leer el archivo 6lineas.txt he imprimir en una sola los 5 ultimos caracteres de cada linea del archivo
import java.io.*;
public class Archivo2{
  public static void main(String[] args) throws Exception{ //Siempre que se utiliza la libreria io se agrega el throws Exception
    File f=new File("6lineas.txt"); //Tipo de variable file se convierte en objeto
    FileInputStream fis=new FileInputStream(f); //Ingresa contenido del archivo a la aplicacion
    InputStreamReader isr=new InputStreamReader(fis); //Lee el contenido en forma binaria
    BufferedReader br=new BufferedReader(isr);//Lee el contenido en forma de caracteres
    String line;
    String line1;
    String line2;
    String line3;
    String line4;
    String line5;
    line=br.readLine(); //Por cada linea mandamos a imprimir
    int tamano=line.length();
    System.out.print(line.substring(tamano-5,tamano));
    System.out.print(" ");
    line1=br.readLine(); //Por cada linea mandamos a imprimir
    int tamano1=line1.length();
    System.out.print(line1.substring(tamano1-5,tamano1));
    System.out.print(" ");
    line2=br.readLine(); //Por cada linea mandamos a imprimir
    int tamano2=line2.length();
    System.out.print(line2.substring(tamano2-5,tamano2));
    System.out.print(" ");
    line3=br.readLine(); //Por cada linea mandamos a imprimir
    int tamano3=line3.length();
    System.out.print(line3.substring(tamano3-5,tamano3));
    System.out.print(" ");
    line4=br.readLine(); //Por cada linea mandamos a imprimir
    int tamano4=line4.length();
    System.out.print(line4.substring(tamano4-5,tamano4));
    System.out.print(" ");
    line5=br.readLine(); //Por cada linea mandamos a imprimir
    int tamano5=line5.length();
    System.out.print(line5.substring(tamano5-5,tamano5));


  }
}
