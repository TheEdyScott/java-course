public class Composition{
	public static void main(String[] args) {
		String first="Jhon";
		String middle="Fitzgerald";
		String last="Kennedy";
		String initials;
		String firstInt, middleInt, lastInt;
		firstInt=first.substring(0,1);
		middleInt=middle.substring(0,1);
		lastInt=last.substring(0,1);
		initials=firstInt.concat(middleInt.concat(lastInt)); //Metodo en composicion es cuando anidamos
		System.out.println(initials);
	}
}
