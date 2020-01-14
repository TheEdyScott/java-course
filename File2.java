import java.io.*;
public class File2{
  public static void main(String[] args){
    File f1=new File("UPG.txt"); //Tipo de variable file se convierte en objeto
    File f2=new File("ISC.txt");
    f1.renameTo(f2); //f1 lo va a renombrar por el segundo archivo
    System.out.println("File renamed");

  }
}
