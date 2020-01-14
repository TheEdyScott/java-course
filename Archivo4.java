//Ingresar por teclado el nombre de un archivo, si existiara dicho archivo borrarlo y mandar mensaje de lo contrario indicar que no existe
import java.io.*;
public class Archivo4{
  public static void main(String[] args)throws Exception{
    InputStreamReader isr= new InputStreamReader(System.in); //Lee en binario
    BufferedReader keyboard= new BufferedReader(isr); //Convierte el isr a caracteres
    String nombre;
    System.out.println("Ingrese nombre del archivo: ");
    nombre=keyboard.readLine();
    File f=new File(nombre); //Tipo de variable file se convierte en objeto
      if(f.exists()){   //Evalua si existe
        f.delete();     //Lo elimina
        System.out.println("File delete");
      }
      else
        System.out.println("File not exists");
  }
}
