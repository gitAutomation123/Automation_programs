package Encapsulation;

public class Casting01 {

	public static void main(String[] args) {
		int age =67;
		double d=age;
		System.out.println(age);
		System.out.println(d);
		 
		double man=65.76876;
		int f=(int)man;      //explicit widening
		float e=(float)man;
		System.out.println(f);
		System.out.println(e); 

	}

}
