package Abstraction;
abstract class Bike{
	abstract void run();
	 void speed(int i) {
	 System.out.println("amz");
}
}
class Car extends Bike{
	 void run() {
		 System.out.println("dem");
	 }
	 void speed(int i) {
		 super.speed(100);
	 System.out.println("ty");
}

	 void man() {
		 System.out.println("fgh");
	 }
}
public abstract class Abs01 {
	public static void main(String args[]) {
     //Car y=new Car();
	//y.run();
	//y.speed(100);
	//y.man();
	Bike j=new Car();
	j.run();
    j.speed(8);
	}
}



