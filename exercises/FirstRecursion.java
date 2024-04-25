import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstRecursion{

    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println(getFirstRecursionBrutly(new int[]{2,5,1,2,3,5,1,2,4}));
        System.out.println(getFirstRecursionBrutly(new int[]{2,1,1,2,3,5,1,2,4}));
        System.out.println(getFirstRecursionBrutly(new int[]{2,3,4,5}));

    }

    public static int getFirstRecursionBrutly(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}