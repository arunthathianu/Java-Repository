package string_package;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbuff = new StringBuffer("Java");
		
		System.out.println("Append : "+sbuff.append(" Programming"));
		System.out.println("Insert : "+sbuff.insert(16, " Language"));
		
		System.out.println("Replace: "+sbuff.replace(5, 16, "Hai"));
		System.out.println("Delete: "+sbuff.delete(5, 9));
		StringBuffer sbuff1 = new StringBuffer("");
		System.out.println("Capacity "+sbuff.capacity());
		System.out.println("Capacity "+sbuff1.capacity());
		
		//Sub String
		System.out.println(sbuff.substring(0));
		System.out.println(sbuff.substring(1, 4));
	}

}
