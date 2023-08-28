package example1;

public class Simple_intrest {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		
		int principle=1000;
		float rate=8.5f;
		int time=6;
		double simpleintrest=principle*rate*time/100; //why we cant use float here?
		
		System.out.println("simple intrest of the value is= "+simpleintrest);
		 System.out.println("program ends");
		

	}

}
