package ThoughtWorks;

public class WordsOfSentenceInAlpahabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "A quick brown fox jumps over the lazy dog fom foe mn pk ir" ;
		String[] inputArray = input.split(" ");
		
		for(int i = 0; i <= inputArray.length - 1; i++) {
			for(int j = i + 1; j <= inputArray.length - 1; j++) {
				if(inputArray[i].compareToIgnoreCase(inputArray[j]) > 0) {
					String temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		
		for(String single : inputArray)
			System.out.println(single);
	}

}
