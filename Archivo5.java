//Leer el archivo 5lineas.txt he imprimir su contenido en el archivo 5lineasmas.txt
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Archivo5{
  public static void main(String[] args) throws IOException{ //Siempre que se utiliza la libreria io se agrega el throws Exception
    File f=new File("5lineas.txt"); //Tipo de variable file se convierte en objeto
    FileInputStream fis=new FileInputStream(f); //Ingresa contenido del archivo a la aplicacion
    InputStreamReader isr=new InputStreamReader(fis); //Lee el contenido en forma binaria
    BufferedReader br=new BufferedReader(isr);//Lee el contenido en forma de caracteres

    String ruta = "5lineasmas.txt";
    File archivo = new File(ruta);
    BufferedWriter bw;
    bw = new BufferedWriter(new FileWriter(archivo));
    String line;

    line=br.readLine(); //Por cada linea mandamos a imprimir
    System.out.println(line);
    bw.write(line);
    bw.newLine();

    line=br.readLine(); //Por cada linea mandamos a imprimir
    System.out.println(line);
    bw.write(line);
    bw.newLine();

    line=br.readLine(); //Por cada linea mandamos a imprimir
    System.out.println(line);
    bw.write(line);
    bw.newLine();

    line=br.readLine(); //Por cada linea mandamos a imprimir
    System.out.println(line);
    bw.write(line);
    bw.newLine();

    line=br.readLine(); //Por cada linea mandamos a imprimi
    System.out.println(line);
    bw.write(line);
    bw.close();


  }
}
