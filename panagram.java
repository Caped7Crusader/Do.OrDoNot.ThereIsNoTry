import java.util.HashSet;
import java.util.Set;

public class panagram {
    public static void main(String[] args) {
        String str ="The quick brown fox jumps over the lazy dog.";
        Set<Character> charSet = new HashSet<>();
        for(char single : str.toCharArray()){
            if(single>='a' && single<='z'){
                charSet.add(single);
            }else if(single>='A' && single<='Z'){
                single = Character.toLowerCase(single);
                charSet.add(single);
            }
        }
        System.out.println(charSet.toString());
        if(charSet.size()==26){
            System.out.println("panagram");
        }else{
            System.out.println("not panagram");
        }
    }
}
