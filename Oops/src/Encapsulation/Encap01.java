package Encapsulation;
class Right{
	private int age=23;
	private double number=19;
	
	public int getage() {
		return age;
	}
	public double getnumber() {
	return number;
	}
	public void setage() {
		this.age=age;
	}
	public void setnumber(double number) {
		this.number=number;
	}
}

public class Encap01 {

	public static void main(String[] args) {
		Right g=new Right();
		System.out.println(g.getage());
		System.out.println(g.getnumber());
		g.setage();
		g.setnumber(3456);
		System.out.println(g.getage());
		//why we have to print the set and get number why we cant access them like we access any method.
		//g.get age();

	}

}
