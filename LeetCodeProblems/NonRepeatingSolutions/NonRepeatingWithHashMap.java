package LeetCodeProblems.NonRepeatingSolutions;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingWithHashMap {

    /*
     * "abcabcbb" --> [{a:0},{}]
     * pwwkew
     */
    public static void main(String[] args) {
        int result1= NonRepeatingMethod("");
        int result2 = NonRepeatingMethod("pwwkew");
        int result3 = NonRepeatingMethod("abcabcbb");
        int result4 = NonRepeatingMethod("au");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public static int NonRepeatingMethod(String str){
        Map<String,Integer> map = new HashMap<>(str.length());
        int longest = 0;
        int l = 0;
        int r = 0; 
       
        while(r < str.length()){
            if(!map.containsKey(String.valueOf(str.charAt(r)))){
                map.put(String.valueOf(str.charAt(r)),r);
                longest = Math.max(longest, r-l+1);
                r++;
            }else{
                map.remove(String.valueOf(str.charAt(l)));
                l++;
            }

        }
        return longest;

    }
}
