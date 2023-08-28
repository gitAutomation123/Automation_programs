package String1;

public class Str03 {

	public static void main(String[] args) {
		String S1="I am from UP, I am workig in Accenture, I working as QA Deleivery Head";
		System.out.println(S1);
		String[] S2=S1.split(" ");
		for(String s:S2) {
			System.out.println(s);
	}
		
String[] S3=S1.split(" ",5);//it divided into 5 parts.
	for(String S5:S3) {
	System.out.println(S5);
}
	String S6="       i am  from india        ";
	System.out.println(S6);
	System.out.println(S6.length());//it calculate the length.
	System.out.println(S6.trim()); //it trim the  end spaces.
	System.out.println(S6.substring(1,3));
	
	String S7=" i         love         india";
		//	System.out.println(S7);
	//		System.out.println(S7.trim());//it will not work here .....only trim end points.
			
}
}