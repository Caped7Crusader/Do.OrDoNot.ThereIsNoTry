
    import java.util.HashMap;

    public class duplicateWordHashMap {
        public static void main(String[] args) {
            String string = "Big black bug bit a big black dog on his big black nose";

            //Converts the string into lowercase
            string = string.toLowerCase();

            //Split the string into words using built-in function
            String words[] = string.split(" ");

            System.out.println("Duplicate words in a given string : ");

            //Create a HashMap to store word count
            HashMap<String, Integer> wordCount = new HashMap<>();

            //Loop through all the words
            for(int i = 0; i < words.length; i++) {
                //If the word is already in the HashMap, increment the count
                if(wordCount.containsKey(words[i])) {
                    int count = wordCount.get(words[i]) + 1;
                    wordCount.put(words[i], count);
                }
                //If the word is not in the HashMap, add it with count = 1
                else {
                    wordCount.put(words[i], 1);
                }
            }

            //Loop through the HashMap and print the word and count
            for(String word : wordCount.keySet()) {
                if(wordCount.get(word) > 1) {
                    System.out.println(word + " - " + wordCount.get(word));
                }
            }
        }
    }
