//En una cadena String alamacenar el abecedario completo e imprimir en 3 lineas diferentes los 5 primeros caracteres, los 5 de enmedio y los 5 ultimos
public class Ejercicio6{
	public static void main(String[] args) {
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
    String Primeros=abecedario.substring(0,5);
    String Enmedio=abecedario.substring((abecedario.length()/2)-3,(abecedario.length()/2)+2);
    String Ultimos=abecedario.substring(abecedario.length()-5);

    System.out.println(Primeros);
    System.out.println(Enmedio);
    System.out.println(Ultimos);

	}
}
