package LeetCodeProblems.NonRepeatingSolutions;
import java.util.ArrayList;
import java.util.List;

public class NonRepeatingWithArray {

    public static void main(String[] args) {
        int result1= getNonRepeatingLength("");
        int result2 = getNonRepeatingLength("pwwkew");
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int getNonRepeatingLength(String str){
        List<String> subStrings = new ArrayList<>();
        subStrings.add("");
        
        for(char c: str.toCharArray()){
            subStrings.add(subStrings.get(subStrings.size()-1).contains(Character.toString(c))
                            ? Character.toString(c)
                            : subStrings.get(subStrings.size()-1)+c);}
        
        
        int longest = 0;
        for(String s: subStrings){
            longest = Math.max(longest, s.length());
        }
        
        return longest;
    }

    
}
