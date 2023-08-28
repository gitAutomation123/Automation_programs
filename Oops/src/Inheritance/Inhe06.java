package Inheritance;
 class Super{
	 void calling() {
		 System.out.println("drama");
	 }
 }
 class Dear extends Super{
	 void calling() {
		 super.calling();
		 System.out.println("high");
	 }
 }
class Name extends Dear {
	void calling() {
		super.calling();
		System.out.println("imp");
	}
}
public class Inhe06 {
public static void main(String[] args) {
	Super g=new Super();
    g.calling();
	}

}
