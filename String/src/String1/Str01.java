package String1;

public class Str01 {

	public static void main(String[] args) {
		Str01 g=new Str01();
		System.out.println(g);
		
		String s1="Mumbai";
		String s2="Mumbai";
		String s3="Delhi";
		String s4="Ranchi";
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		System.out.println(s1.equals(s3));//on the basic of value compare
	    System.out.println(s1==s3);//on the basic of address............in string properties of object class get change.
	    
	    String s5=new String("limited");
	    System.out.println(s5);
	    System.out.println(s4.equals(s5));
	}

}
