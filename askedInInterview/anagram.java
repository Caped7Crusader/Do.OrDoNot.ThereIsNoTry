package askedInInterview;

public class anagram {
	
	public static void anagramMethod(String[] array) {
	
	    for(int i = 0; i < array.length; i++) {
	        for(int j = i+1; j < array.length; j++) {
	            // Sort the characters in both strings
	            String sortedStr1 = sortString(array[i]);
	            String sortedStr2 = sortString(array[j]);
	
	            // Check if the sorted strings are equal
	            if(sortedStr1.equals(sortedStr2)) {
	                System.out.println(array[i] + " and " + array[j] + " are anagrams");
	            }
	        }
	    }     
	}
	
	public static String sortString(String inputString) {
	    // Convert the string to a character array
	    char[] charArray = inputString.toCharArray();

	    // Bubble sort algorithm to sort the character array
	    for(int i = 0; i < charArray.length - 1; i++) {
	        for(int j = 0; j < charArray.length - i - 1; j++) {
	            if(charArray[j] > charArray[j+1]) {
	                // Swap the adjacent elements
	                char temp = charArray[j];
	                charArray[j] = charArray[j + 1];
	                charArray[j + 1] = temp;
	            }
	        }
	    }

	    // Convert the sorted character array back to a string and return it
	    String sortedString = new String(charArray);
	    return sortedString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"ant", "ateee", "eeeat", "tnt", "nta"};
  
		anagramMethod(array);
	}

}
