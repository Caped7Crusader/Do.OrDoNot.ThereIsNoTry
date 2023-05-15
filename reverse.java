public class reverse {
    public static void main(String args[]){
        String str = "string";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
             reverse = reverse + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reverse);
    }
}
