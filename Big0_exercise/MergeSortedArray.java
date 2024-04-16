//Input will be ([0,3,4,31], [4,6,30])
//Output will be [0,3,4,4,6,30,31]
/*
    While brute force:
    Grab element from first array and check whether that element or smaller element 
    is present in second array; yes: keep that element 
*/
//Input will be ([0,3,4,31], [4,6,30])
//Output will be [0,3,4,4,6,30,31]
import java.util.Arrays;

class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 3, 4, 31};
        int[] arr2 = new int[]{4, 6, 30};
        int[] resultArr = mergeSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultArr[k++] = arr1[i++];
            } else {
                resultArr[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            resultArr[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            resultArr[k++] = arr2[j++];
        }
        
        return resultArr;
    }
}