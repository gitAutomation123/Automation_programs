package Abstraction;
interface clue{
	void pure();
}
interface real extends clue{
	void number();
}
class Drawing implements real {
	public void pure() {
		System.out.println("hhhh");
	}
	public void number() {
		System.out.println("jjjj");
	}
	void dark(){
		System.out.println("fff");
	}
}
public class Abs05 {

	public static void main(String[] args) {
		real f=new Drawing();
        f.pure();
	}

}
