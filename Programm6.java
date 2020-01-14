public class Programm6{
	public static void main(String[] args) {
		String beforeTrim="      spacy  ";
    String afterTrim;
    afterTrim=beforeTrim.trim(); //El metodo trim quita espacios antes y despues
    if (beforeTrim.length()==afterTrim.length())
      System.out.println("String is no shorter");
    else 
      System.out.println("Shortened the string");

	}
}
