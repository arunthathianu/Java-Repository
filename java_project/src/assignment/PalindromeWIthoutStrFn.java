package assignment;

public class PalindromeWIthoutStrFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "palindrome";
		char start = str.charAt(0);
		char end = str.charAt(str.length()-1);
		boolean isPalindrome = true;
		
//		while(start!=end)
//		{
//			if (start >= 'A' && start <= 'Z') 
//			{
//                start = (char)(start + 32);
//            }
//            if (end >= 'A' && end <= 'Z') 
//            {
//            	end = (char)(end + 32);
//            }
//
//			//ispalindrome = false;
//			break;
//			if (start != end) {
//                isPalindrome = false;
//                break;
//            }
//			start++;
//			end--;
//			
//		}
		
		
		if(isPalindrome)
			System.out.println("Not palindrome");
		else
			System.out.println("Given string is palindrome");
			

	}

}
