package Inheritance;


	class College{
		College(int i){
			System.out.println("imp");
		}
	}
class Group extends College{
	Group(int i){
		super(10);
		System.out.println("real");
	}
}
class Student extends College{
	Student(int i){
		super(10);
		System.out.println("extra");
	}
}
public class Inhe03 {
	public static void main(String[] args) {
		Student g=new Student(10);
		

	}

}
