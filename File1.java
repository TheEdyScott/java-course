import java.io.*;
public class File1{
  public static void main(String[] args){
      File f=new File("ISC.txt"); //Tipo de variable file se convierte en objeto
      if(f.exists()){   //Evalua si existe
        f.delete();     //Lo elimina
        System.out.println("File delete");
      }
      else
        System.out.println("File not exists");
  }
}
