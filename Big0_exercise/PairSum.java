/*
 * Collection of number is given, we have to find the sum of pair of numbers
 * in that collection.
 * Examples given are:
 * input: [1,2,3,9], 8 Output: false (because no pair has sum equals given)
 * input:[1,2,4,4], 8 Output: true
 */
public class PairSum {
    //try first with bruteforce
    public static void main(String[] args){
        System.out.println(checkPairSumSorted(new int[]{1,2,3,9}, 8));
    }
    //Lets create a method which takes int array and int sum as an input
    //and return boolean

    private static boolean checkPairSum(int[] intArr, int sum){
        for(int i=0; i<intArr.length; i++){
            for(int j=i+1; j<intArr.length; j++){
                if(intArr[i]+intArr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Now if the input increases this code is not scalable 
     * because the time Complexity: O(n^2) Space Complexity: O(1)
     * ========Better Approach==========
     * Now as it is stated that: input Array is sorted in ascending order
     * Check if the sum of first and last element with the input:sum
     * if firstElement+lastElement > sum, shift lastElement to left
     * else shift firstElement to right
     *      
     * */

    private static boolean checkPairSumSorted(int[] intArr, int sum){
        int p1 = 0;
        int p2 = intArr.length-1;
        while(p1<p2){
            if(intArr[p1]+intArr[p2] == sum) return true;
            else if(intArr[p1]+intArr[p2]>sum ){
                p2--;
            }else{
                p1++;
            }
        }
        return false;
    }

}
