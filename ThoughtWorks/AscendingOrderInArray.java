package ThoughtWorks;

public class AscendingOrderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {1, 2, 4, 5, 66, 23, 88, 0, 88, 6, 0, 0, 68, 89};
		
		for(int i = 0; i <= input.length - 1; i++) {
			for(int j = i + 1; j <= input.length - 1; j++) {
				if(input[i] > input[j]) {
					int temp = 0;
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					
				}
			}
		}
		for(int single : input)
		System.out.print(single + " ");
	}

}
