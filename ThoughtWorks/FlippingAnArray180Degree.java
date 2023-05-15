package ThoughtWorks;

public class FlippingAnArray180Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayInput = {1, 6, 0, 9, 0, 1};
		int arrayLength = arrayInput.length;
		int[] arrayReverse = new int[arrayLength];
		boolean palindrome = true;
		
		for(int i = 0; i <= arrayLength - 1; i++) {
			
			switch(arrayInput[arrayLength - 1 - i]) {
	            case 6:
	            	arrayReverse[i] = 9;
	                break;
	            case 9:
	            	arrayReverse[i] = 6;
	                break;
	            default:
	            	arrayReverse[i] = arrayInput[arrayLength - 1 - i];
	         }
			
		}
		
		for(int single : arrayInput)
			System.out.print( " " + single);	
		System.out.println();
		
		for(int single : arrayReverse)
			System.out.print( " " + single);	
		System.out.println();

		for(int i = 0; i <= arrayLength - 1; i++) {
			if(arrayInput[i] != arrayReverse[i]) {
				palindrome = false;
				break;
			}
		}
		
		if(palindrome) {
			System.out.println("the array is water image");
		} else {
			System.out.println("the array is not water image");
		}

	}

}
