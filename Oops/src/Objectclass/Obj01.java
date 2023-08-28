package Objectclass;

public class Obj01 {

	public static void main(String[] args) {
		Obj01 g=new Obj01();
		System.out.println(g);
		System.out.println(g.toString());
		System.out.println(g.hashCode());
		Obj01 f=new Obj01();
		System.out.println(f);
        System.out.println(f.equals(g));
	}

}
