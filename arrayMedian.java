import java.util.Arrays;

public class arrayMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] mergedArray = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            mergedArray[i] = nums1[i];
        }
        for(int i = nums1.length; i < mergedArray.length; i++){
            mergedArray[i] = nums2[i - nums1.length];
        }
        Arrays.sort(mergedArray);
//        for(int i = 0; i < mergedArray.length; i++){
//            for(int j = i + 1; j < mergedArray.length; j++){
//                if(mergedArray[i] > mergedArray[j]) {
//                    int temp = mergedArray[j];
//                    mergedArray[j] = mergedArray[i];
//                    mergedArray[i] = temp;
//                }
//            }
//        }
//        for(int i = 0; i < mergedArray.length; i++)
//            System.out.println(mergedArray[i]);
        if(mergedArray.length % 2 == 0){
            int index = mergedArray.length / 2;
            int num1 = mergedArray[(int)index];
            int num2 = mergedArray[(int)(index -1)];
            System.out.println(num1 +" " +num2);
            median = (double)(num1 + num2) / 2;
        }else{
            int index = mergedArray.length / 2;
            median = (double)(mergedArray[index]);
        }
        return median;
    }
    public static void main(String[] args) {

        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        arrayMedian ans = new arrayMedian();
        System.out.println(ans.findMedianSortedArrays(array1, array2));
    }
}
