import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstRecursion{

    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println(getFirstRecursionBrutly(new int[]{2,5,1,2,3,5,1,2,4}));
        System.out.println(getFirstRecursionBrutly(new int[]{2,1,1,2,3,5,1,2,4}));
        System.out.println(getFirstRecursionBrutly(new int[]{2,3,4,5}));

        System.out.println("==============HashMap=======================");

        System.out.println(getFirstRecursionHashMap(new int[]{2,5,1,2,3,5,1,2,4}));
        System.out.println(getFirstRecursionHashMap(new int[]{2,1,1,2,3,5,1,2,4}));
        System.out.println(getFirstRecursionHashMap(new int[]{2,3,4,5}));


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

    /*
     * HashMap ----> As we know know HashMap doesnot have duplicate values.
     * By assigning each element as a key in HashMap, we know when key is being reused
     */

    public static int getFirstRecursionHashMap(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }
            else{
                return arr[i];
            }
        }
        return 0;
    }
}