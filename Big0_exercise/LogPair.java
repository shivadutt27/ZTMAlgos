public class LogPair{

    public static void main(String[] args){
        int[] intArr = {1,2,3,4,5};
        correctLogPairs(intArr);
        //getLogPairs(intArr);
    }

    private static void correctLogPairs(int[] intArr){
        for(int i=0; i<intArr.length; i++){ //O(n)
            for(int j=0; j<intArr.length; j++){ // O(n)
                System.out.println(intArr[i]+ ""+ intArr[j]);
            }
        }
    }

    // This is not logging own pair 
    private static void getLogPairs(int[] intArr){

        for(int i=0; i<intArr.length-1; i++){
            int p1 = intArr.length-1;
            while(i<p1){
                System.out.println(intArr[i]+""+intArr[p1]);
                p1--;
            }
        }
    }
}