package ThoughtWorks;


public class FirstRepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String input = "atraewt";
        char repeatedChar = '\0'; // initialize to null character
        boolean foundRepeatedChar = false;
        
        for(int i = 0; i < input.length(); i++) {
            for(int j = i+1; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)) {
                    repeatedChar = input.charAt(i);
                    foundRepeatedChar = true;
                    break;
                }
            }
            if(foundRepeatedChar) {
                break;
            }
        }
        if(foundRepeatedChar) {
            System.out.println("First repeated char is " + repeatedChar);
        } else {
            System.out.println("No repeated char found.");
        }
	}    
}
