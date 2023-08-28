package Inheritance;


	class Fruits{
		public void result(){
			System.out.println("imp");
		}
	}
	class Apple extends Fruits{
		public void result() {
			System.out.println("real");
		}
		public void detect() {
			System.out.println("acceleration");
		}
	}
	public class Inhe04 {
	public static void main(String[] args) {
		Fruits d= new Apple();
		d.result(); //how i can call child class result method?
		//d.detect();

	}

}
