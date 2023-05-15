package ThoughtWorks;

public class OptimisedRepeatedNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String input = "atrewt";
		    int[] charCount = new int[256]; // assuming ASCII characters
		    
		    // count the characters in the input string
		    for (int i = 0; i < input.length(); i++) {
		        charCount[input.charAt(i)]++;
		    }
		    
		    for (int i = 0; i < charCount.length; i++) {
		        if (charCount[i] > 0) {
		            System.out.println((char) i + ": " + charCount[i]);
		        }
		    }
		    
		    // find the first non-repeated character
		    char nonRepeatedChar = '\0'; // initialize to null character
		    boolean foundNonRepeatedChar = false;
		    for (int i = 0; i < input.length(); i++) {
		        if (charCount[input.charAt(i)] == 1) {
		            nonRepeatedChar = input.charAt(i);
		            foundNonRepeatedChar = true;
		            break;
		        }
		    }
		    if (foundNonRepeatedChar) {
		        System.out.println("First non-repeated char is " + nonRepeatedChar);
		    } else {
		        System.out.println("No non-repeated char found.");
		    }
		    
		    // find the first repeated character
		    char repeatedChar = '\0'; // initialize to null character
		    boolean foundRepeatedChar = false;
		    for (int i = 0; i < input.length(); i++) {
		        if (charCount[input.charAt(i)] > 1) {
		            repeatedChar = input.charAt(i);
		            foundRepeatedChar = true;
		            break;
		        }
		    }
		    if (foundRepeatedChar) {
		        System.out.println("First repeated char is " + repeatedChar);
		    } else {
		        System.out.println("No repeated char found.");
		    }
	}

}
