package askedInInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class anagramList {
	
	 public static List<Character> getSortedCharList(String word) {
		 
	        char[] charArray = word.toCharArray();
	        
	        List<Character> charList = new ArrayList<Character>();
	        
	        for (char c : charArray) {
	            charList.add(c);
	        }

	        Collections.sort(charList);
	        return charList;
	    }
	 
	    public static boolean comparing(String wordOne, String wordTwo) {
	    	
	        List<Character> listWordOne = getSortedCharList(wordOne);
	        List<Character> listWordTwo = getSortedCharList(wordTwo);
	        
	        return listWordOne.equals(listWordTwo);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String wordOne = "listen";
	     String wordTwo = "silent";
	     
	        if (comparing(wordOne, wordTwo)) {
	            System.out.println(wordOne + " and " + wordTwo + " are anagrams.");
	        } else {
	            System.out.println(wordOne + " and " + wordTwo + " are not anagrams.");
	        }

	}

}
