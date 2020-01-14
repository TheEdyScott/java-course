//Programa en java que contenga una variable string e indicar si esta vacia de lo contrario imprimir solamente el primer caracter
public class Ejercicio7{
	public static void main(String[] args) {
		String xa="poiuy";
    if (xa.length()==0)
      System.out.println("Vacia");
    else
      System.out.println(xa.substring(0,1));

	}
}
