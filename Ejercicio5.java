//Generar 2 variables (Cadeana corta y cadena larga) cada una con su contenido correspondiente. De acuerdo a la longitud de la cadena corta extraer la misma cantidad de caracteres del final de la cadena larga
public class Ejercicio5{
	public static void main(String[] args) {
		String Largo="Sistemas";
    String Corto="ab";
    String impr;
    int L=Largo.length();
    int C=Corto.length();
    impr=Largo.substring(L-C);
    System.out.println(impr);

	}
}
