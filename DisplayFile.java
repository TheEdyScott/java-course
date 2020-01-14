import java.io.*;
public class DisplayFile{
  public static void main(String[] args) throws Exception{ //Siempre que se utiliza la libreria io se agrega el throws Exception
    File f=new File("example.txt"); //Tipo de variable file se convierte en objeto
    FileInputStream fis=new FileInputStream(f); //Ingresa contenido del archivo a la aplicacion
    InputStreamReader isr=new InputStreamReader(fis); //Lee el contenido en forma binaria
    BufferedReader br=new BufferedReader(isr);//Lee el contenido en forma de caracteres
    String line;
    line=br.readLine(); //Por cada linea mandamos a imprimir
    System.out.println(line);
    line=br.readLine();
    System.out.println(line);
    line=br.readLine();
    System.out.println(line);

  }
}
