package example1;

public class static_global_variables {
	   static int age;
	   static boolean res;
	   static char grade;
	   static float roi;

	public static void main(String[] args) {
		System.out.println("program starts");
		
		System.out.println("default value of  age= " +age);
		System.out.println("default value of res= "+res);
		System.out.println("default value of grade= "+grade);
		System.out.println("default value of roi= "+roi);
		System.out.println("program ends");
		
		age= 20;
		res=false;
		grade='R';
		roi=.5f;
		
		System.out.println("updated value of age= "+age);
        System.out.println("updated value of res= "+res);
        System.out.println("updated value of grade="+grade);
        System.out.println("updatede valie of roi= "+roi);		
		
				
	

	}

}
