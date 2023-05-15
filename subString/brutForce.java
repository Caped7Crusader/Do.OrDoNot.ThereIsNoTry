package subString;

public class brutForce {
    public static void main(String[] args) {
        String s = "aaaaaaaa";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
//                maxLength = Math.max(maxLength, currentSubstring.length());
                if (currentSubstring.length() > maxLength) {
                    maxLength = currentSubstring.length();
                }
            }
        }
        System.out.println(maxLength);
    }
}
