package LeetCodeProblems;
import java.util.HashMap;

public class NonRepeatingString {
    public static void main(String[] args) {
        System.out.println(nonRepeatingString("abcabcbb"));
        //System.out.println(nonRepeatingString("pwwkew"));
        //System.out.println(nonRepeatingString("bbbbb"));
    }

    public static int nonRepeatingString(String s){
        if (s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                // Move the start pointer to the right of the last occurrence of currentChar
                start = Math.max(start, map.get(currentChar) + 1);
            }
            System.out.println("start is "+start);
            map.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
            System.out.println("maximum length "+ maxLength);
        }

        return maxLength;
    }   
}
