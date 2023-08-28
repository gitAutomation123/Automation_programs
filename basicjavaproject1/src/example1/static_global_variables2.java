package example1;

public class static_global_variables2 {
	
	static int num1,num2,num3,res;

	public static void main(String[] args) {
		System.out.println("program starts");
		 
		System.out.println("result of num1= "+num1);
		System.out.println("result of num2= "+num2);
		System.out.println("result of num3 = "+num3);
		
		 int num1=10,num2=20,res=num1+num2+num3; //why we have to give data type again as we already declare in static variable.
		System.out.println("result is res1 = "+res);
		
	int	num3=100;
		int res3=num1+num2+num3;
		 System.out.println("result is res3 ="+res3);
		  System.out.println("program ends");
		
	}

}
