public class Objects{
	public static void main(String[] args) {
		String s, upper, lower;
		s=new String("Hello"); //Cuando utlizas new significa que se genera un objeto, Los objetos deben de ser del mismo tipo que la variable, Un objeto es una copia- instancia de una clase principal, una variable solo puede almacenar datos y un objeto tiene acceso a diferentes metodos
		upper=s.toUpperCase();
		lower=s.toLowerCase();
		System.out.println(s);
		System.out.println(upper);
		System.out.println(lower);
	}
}
