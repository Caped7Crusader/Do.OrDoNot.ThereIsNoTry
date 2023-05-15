public class replacing {
    public static void main(String[] args) {
        String str = "abababa";
        String get = "aba";
        String replace = "a";

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            int k = 0;
            if (str.charAt(i) == get.charAt(k) && i + get.length() <= str.length()) {
                int j;
                for (j = i; j < i + get.length(); j++) {
                    if (str.charAt(j) != get.charAt(k)) {
                        break;
                    }
                    else {
                        k = k + 1;
                    }
                }
                if (j == i + get.length()) {
                    ans = ans + (replace);
                    i = j - 1;
                }
                else {
                    ans = ans + (str.charAt(i));
                }
            }
            else {
                ans = ans + (str.charAt(i));
            }
        }
        System.out.print(ans);
    }
}
