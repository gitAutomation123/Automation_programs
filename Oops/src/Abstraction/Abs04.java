package Abstraction;
interface print{
	void like();
	}

interface here{
	void run();
}
class Drive implements print,here{
	public void like() {
		System.out.println("fff");
	}
	 public void run() {
	}
	 void Ram() {
		 System.out.println("yyyy");
	 }
}
    public class Abs04 {
    public static void main(String[] args) {
    	print g=new Drive();
    	g.like();

	}

}
