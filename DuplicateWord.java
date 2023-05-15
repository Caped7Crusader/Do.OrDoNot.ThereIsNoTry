public class DuplicateWord {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        String[] stringArray = string.toLowerCase().split(" ");

        for(int i=0; i<stringArray.length; i++){
            int count = 1;
            for(int j=i+1; j< stringArray.length; j++){
                if(stringArray[i].equals(stringArray[j])){
                    count++;
                    stringArray[j] = "0";
                }
            }
            if(count>=1 && stringArray[i]!="0"){
                System.out.println(stringArray[i] +" " +count);
            }
        }
    }
}
