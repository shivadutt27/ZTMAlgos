import java.util.Arrays;

public class TestMergeSort{

    public static void main(String[] args){
        int[] arr1 = new int[]{0,3,4,31};
        int[] arr2 = new int[]{4,6,30};
        System.out.println(Arrays.toString(testMergeSort(arr1, arr2)));
    }

    private static int[] testMergeSort(int[] arr1, int[] arr2){
        int[] resultArr = new int[arr1.length+arr2.length+2];
        int p1 = 1;
        int p2 = 1;
        for(int i=0; i<arr1.length;i++){
            resultArr[i] = arr1[i];
        }
        System.out.println(resultArr[arr1.length-1]);
        for(int i=2; i<resultArr.length;i++){
            for(int j=0; j<arr2.length; j++){
                if(arr2[j]<=resultArr[i]){
                    resultArr[i+2] = resultArr[i+1];
                    resultArr[i+1] = arr2[j];
                }
            }
        }
        return resultArr;
    }
}