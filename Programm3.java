public class Programm3{
	public static void main(String[] args) {
		String first="Jhon";
		String middle="Fitzgerald";
		String last="Kennedy";
		String initials;
		String firstInit, middleInit, lastInit;
		firstInit=first.substring(0,1); //j
		middleInit=middle.substring(0,1); //f
		lastInit=last.substring(0,1); //k
		initials=firstInit.concat(middleInit); //jf
		initials=initials.concat(lastInit); //jfk
		System.out.println(initials);	
	}
}