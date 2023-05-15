package ThoughtWorks;

public class repeatNon {
	
	public static void main(String[] args) {

		String input = "arewktkbt";
		char repeatedChar = '\0'; // initialize to null character
		char nonRepeatedChar = '\0'; // initialize to null character
		boolean foundRepeatedChar = false;
		boolean foundNonRepeatedChar = false;

		for(int i = 0; i < input.length(); i++) {
		    boolean isRepeated = false;
		    for(int j = i + 1; j < input.length(); j++) {
		        if(input.charAt(i) == input.charAt(j)) {
		            repeatedChar = input.charAt(i);
		            foundRepeatedChar = true;
		            isRepeated = true;
		            break;
		        }
		    }
		    if(!isRepeated && !foundNonRepeatedChar) {
		        nonRepeatedChar = input.charAt(i);
		        foundNonRepeatedChar = true;
		    }
		    if(foundRepeatedChar && foundNonRepeatedChar) {
		        break;
		    }
		}

		if(foundRepeatedChar) {
		    System.out.println("First repeated char is " + repeatedChar);
		} else {
		    System.out.println("No repeated char found.");
		}

		if(foundNonRepeatedChar) {
		    System.out.println("First non-repeated char is " + nonRepeatedChar);
		} else {
		    System.out.println("No non-repeated char found.");
		}


	}

}
