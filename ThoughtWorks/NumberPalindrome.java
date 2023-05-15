package ThoughtWorks;

public class NumberPalindrome {
	
	public static long reverseNumber(long number) {

		long reversedNumber = 0;
		
		while(number != 0) {
			reversedNumber = reversedNumber * 10 + (number % 10);
			number = number / 10;
		}
		
		return reversedNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long number = 98;
		
		boolean isPalindrome = false;
		
		while(isPalindrome == false) {
			long reversedNumber = reverseNumber(number);
			
			System.out.println(number);
			System.out.println(reversedNumber);
			
			if(number == reversedNumber) {
				isPalindrome = true;
				System.out.println("palindrome");
			} else {
				System.out.println("not palindrome");
				number = number + reversedNumber;
			}
		}
	}

}
