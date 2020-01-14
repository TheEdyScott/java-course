public class Programm4{
	public static void main(String[] args) {
		String s1="deoxyribonucleic";
		String s2="hippopotamus";
		String s3="a short ride in a fast car";
		int length1=s1.length(); //lee la cantidad de caracteres
		int length2=s2.length();
		int length3=s3.length();
		int average=(length1+length2+length3)/3;
		System.out.println("The average is: ");
		System.out.println(average);
	}
}