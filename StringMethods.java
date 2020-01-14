public class StringMethods{
	public static void main(String[] args) {
		String s1,t1,u1;
		s1="ham";
		t1="burger";
		u1=s1.concat(t1); //Concatena
		System.out.println(u1);
		String s2,t2;
		s2="hamburger";
		t2=s2.substring(3); //Substraee una cadena a partir de la posicion BURGER
		System.out.println(t2);		
		t2=s2.substring(3,7); //Substraee una cadena inicio y fin BURG
		System.out.println(t2);	
	}
}