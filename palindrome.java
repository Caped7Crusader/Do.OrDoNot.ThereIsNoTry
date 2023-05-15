public class palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
        if(str.equalsIgnoreCase(reverseStr)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
