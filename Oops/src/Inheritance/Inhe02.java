package Inheritance;


	class Country1{
		Country1(int i){
			System.out.println("dear");
		}
		void display() {
			System.out.println("real");
		}
	}
class State1 extends Country1{
	State1(int i){                      //why we have use parameterize cons ans super satetement here.
		super(i);
		System.out.println("name");
	}
	void  calling() {
		System.out.println("amazing");
	}
}
class City1 extends Country1{
	City1(int i) {
		super(i);
	System.out.println("result");
		}
}
public class Inhe02 {
	public static void main(String[] args) {
		City1 rem=new City1(10);
		//rem.calling();   how i can call this method with this object.
		
		State1 d=new State1(23);
		d.calling();

	}

}
