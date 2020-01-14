//ingresar por teclado el numero de lineas a almacenar en un txt, al terminar el contenido se solicitara el nombre del archivo. el contenido debe guardar tambien la fecha y hora de creacion
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class examen2{
  public static void main(String[] args) throws IOException{ //Siempre que se utiliza la libreria io se agrega el throws Exception
  InputStreamReader isr= new InputStreamReader(System.in); //Lee en binario
  BufferedReader keyboard= new BufferedReader(isr); //Convierte el isr a caracteres
  String nombre="z.txt";
  int numero;
  String texto="";
  Scanner num=new Scanner(System.in);
  String ruta = nombre;
  File archivo = new File(ruta);
  BufferedWriter bw;
  bw = new BufferedWriter(new FileWriter(archivo));
  System.out.println("Ingrese la cantidad de lineas que tendra el archivo");
  numero=num.nextInt();
  for (int i=0;i<numero;i++){
    System.out.println("Ingrese texto");
    texto=keyboard.readLine();

    bw.write(texto);
    bw.newLine();
  }
  GregorianCalendar now=new GregorianCalendar();
  Date d= now.getTime(); //Variables date solo almacenan fechas , getTime debuelve fecha y hora
  System.out.println(d);

  bw.write("El archivo se creo: "+String.valueOf(d));
    bw.close();
  System.out.println("Ingrese el nombre del archivo: ");
  String f2="";
  String f3;
  f2=keyboard.readLine();
  f3=f2.concat(".txt");
  File f22 = new File(f3);
  archivo.renameTo(f22);


}
}
