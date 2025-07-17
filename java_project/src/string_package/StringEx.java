package string_package;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "java";
		String b = "java";
		String c = new String("java");
		String d = new String("java");
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
;	}

}
