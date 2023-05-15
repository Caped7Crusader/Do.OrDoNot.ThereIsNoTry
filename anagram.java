public class anagram {
    public static String sortAscending(String str){
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            for(int j=0; j<charArray.length; j++){
                if(charArray[i]<charArray[j]){
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        String sortedStr = new String(charArray);
//        String sortedStr = String.valueOf(charArray);
        return sortedStr;
    }

    public static void anagram(String[] str){

        for(int i=0; i<str.length-1; i++){
            for(int j=i+1; j<str.length; j++){
                String sortedStr1 = sortAscending(str[i]);
                String sortedStr2 = sortAscending(str[j]);
                if(sortedStr1.equalsIgnoreCase(sortedStr2)){
                    System.out.println(str[i] +" " +str[j] +"  are anagram");
                }
            }
        }
    }
    public static void main(String[] args) {

        String[] given = {"eat", "ate", "llet", "tell"};
        anagram(given);
    }
}
