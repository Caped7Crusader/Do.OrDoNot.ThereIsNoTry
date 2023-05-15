public class dictionary {
    public static void main(String[] args) {

        String str = "this is a spelling error in the error message displayed when a user tries to save a file";
        String[] strArray = str.split(" ");
        for(int i=0; i<strArray.length; i++){
            for(int j=i+1; j<strArray.length-1; j++){
                if(strArray[i].compareToIgnoreCase(strArray[j])>0){
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }
        for (String single: strArray) {
            System.out.println(single);
        }
    }
}
