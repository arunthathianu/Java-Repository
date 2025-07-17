package string_package;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java Program";
		String s1 = "Learn";
		int a = 2025;
		System.out.println("Length of String is: "+s.length());
		System.out.println("Index of P: "+s.charAt(5));
		String a_valueof = String.valueOf(a);
		System.out.println("Value of: "+a_valueof);
		System.out.println("Equals: "+s.equals("java programs"));
		System.out.println("Ignore case: "+s.equalsIgnoreCase("java program"));
		System.out.println("Is Empty: "+s.isEmpty());
		System.out.println("Upper Case: "+s.toUpperCase());
		System.out.println("Lower case: "+s.toLowerCase());
		System.out.println("Contains: "+s.contains("Pro"));
		System.out.println("Concat: "+s.concat(s1));
		
	}

}
