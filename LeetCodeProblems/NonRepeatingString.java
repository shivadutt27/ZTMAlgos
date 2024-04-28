package LeetCodeProblems;
import java.util.HashMap;

public class NonRepeatingString {
    public static void main(String[] args) {
        System.out.println(nonRepeatingString("abcabcbb"));
        //System.out.println(nonRepeatingString("pwwkew"));
        //System.out.println(nonRepeatingString("bbbbb"));
    }

    public static int nonRepeatingString(String s){
        var map = new HashMap<String,Integer>();
        String key;
        for(int i=0; i<s.length()-1;i++){
            System.out.println("current index is: "+i);
            if(s.charAt(i) == s.charAt(i+1) && i<s.length()-1){
                while(s.charAt(i) == s.charAt(i+1)){
                    i+=1;
                    if(i==s.length()-1){
                        break;
                    }
                }
            }
            key = String.valueOf(s.charAt(i));
            if(!map.containsKey(key)){
                map.put(key.toString(),i);
            }
        }
        int counter = 1;
        for(int i=0; i<map.size(); i++){
            if(map.containsValue(i) && map.containsValue(i+1)){
                counter++;
            }
        }
        System.out.println(map.toString());
        System.out.println(map.size());
        return counter;
    }    
}
