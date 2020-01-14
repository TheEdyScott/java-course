public class Cascading{
	public static void main(String[] args) {
		String first="Jhon";
		String middle="Fitzgerald";
		String last="Kennedy";
		String initials;
		String firstInt, middleInt, lastInt;
		firstInt=first.substring(0,1);
		middleInt=middle.substring(0,1);
		lastInt=last.substring(0,1);
		initials=firstInt.concat(middleInt).concat(lastInt); //Metodo en cascada de concatenacion
		System.out.println(initials);
	}
}
