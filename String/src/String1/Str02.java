package String1;

public class Str02 {

	public static void main(String[] args) {
		String s1="ILoveMumbai";
		char e= s1.charAt(3);
		System.out.println(e);
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
		String temp = "";// "DhanoriPune";//output: enuPironahD
		for (int i = s1.length() - 1; i >= 0; i--) {
			temp = temp + s1.charAt(i);
	}
		System.out.println("Original str1: " + s1);
		System.out.println("Reverse temp: " + temp);
		//System.out.println(reverseString("ILoveMumbai"));

}
}