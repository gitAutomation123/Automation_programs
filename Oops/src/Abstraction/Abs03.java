package Abstraction;
abstract class New{
	public abstract void dark();
	public void run() {
		System.out.println("out");
	}
}
class Raw extends New{
 public	void dark() {
		System.out.println("dear");
	}
 void Happy() {
	 System.out.println("etc");
 }
}
class Insta extends New{
	public void dark() {
		System.out.println("imp");
	}
	void extra() {
		System.out.println("drama");
	}
}
   public class Abs03 {
    public static void main(String[] args) {
		New h=new Insta();
		h.dark();
		//h.extra();
		h.run();
	//	h.happy();

	}

}
