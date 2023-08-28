package String1;

public class Buffer01 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hello");
		System.out.println(s);
		
		s.append("imp"); //it add the value and create new string.
		System.out.println(s);
		
		s.insert(7, false);
		System.out.println(s);
		
		s.replace(1,3,"rrr");
		System.out.println(s);
		
		s.delete(1,8);
		System.out.println(s);
		
		System.out.println(s.capacity());
	}

}
