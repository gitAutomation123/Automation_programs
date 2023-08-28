package Inheritance;


	class country{
		country(boolean i){
			System.out.println("important");
		}
		void display() {
			System.out.println("real");
		}
	}
	class state extends  country{
		state(int p){
			super(true);
			System.out.println("not");
		}
		void calling() {
			System.out.println("true");
		}
	}
	class city extends state{
		city(char u){
			super(3445);
			System.out.println("dear");
		}
		void imp() {
			System.out.println("differ");
		}
	
	}
	public class Inhe01 {
	public static void main(String[] args) {
		city g=new city('h');
		System.out.println(g);
		g.imp();
		g.calling();
		g.display();
	

	}

}
