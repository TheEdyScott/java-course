
import java.util.Scanner;
public class ejercicio1{
	public static void main(String[] arg){

	System.out.println("Calculadora");
	ejercicio1.Sum();
	ejercicio1.Res();
	}

	public static void Sum(){
	int a,b,r;
	Scanner reader = new Scanner(System.in);
	System.out.println("Ingrese numero 1: ");
	a=reader.nextInt();
	System.out.println("Ingrese numero 2: ");
	b=reader.nextInt();
	r=a+b;
	System.out.println("La suma es: "+r);
	}
	public static void Res(){
	int a,b,r;
	Scanner reader = new Scanner(System.in);
	System.out.println("Ingrese numero 1: ");
	a=reader.nextInt();
	System.out.println("Ingrese numero 2: ");
	b=reader.nextInt();
	r=a-b;
	System.out.println("La resta es: "+r);
	}
}
