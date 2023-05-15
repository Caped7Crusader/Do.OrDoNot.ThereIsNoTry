package subString;

import java.nio.charset.CharacterCodingException;
import java.util.HashSet;
import java.util.Set;

public class slidingWindow {
    public static void main(String[] args) {
        String s = "pwwkew";
        Set<Character> distinctChar = new HashSet<>();
        int right = 0;
        int left = 0;
        int maxLength = 0;
        while(right < s.length()){
            if(!distinctChar.contains(s.charAt(right))){
                distinctChar.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, distinctChar.size());
            }else{
                distinctChar.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(maxLength);
    }
}
