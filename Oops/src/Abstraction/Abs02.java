package Abstraction;
abstract class City{
	abstract void run();
	abstract void simple();
}
 class House extends City{
	 void run() {
		 System.out.println("hard");
	 }
	 void simple() {
		 System.out.println("ravi");
	 }
	 void dark() {
		 System.out.println("imp");
	 }
 }

public class Abs02 {
public static void main(String[] args) {
   City g=new House();
   g.run();
   g.simple();

	}

}
