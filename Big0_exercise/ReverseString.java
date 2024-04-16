/*
 * Create a function that reverse String
 *  Input: "Hi My Name is Shivam", Output: "mavihS si eman iH" 
 *
 * 1.Treat every String problem as an array problem
 * 2.its an array of Characters
 * 3. As a bruteforce following are the steps coming to my mind
 *  i.Create an empty array
 *  ii.Split all the words separating through spaces into those Array
 *  iii.
 *  
 * 
 */

public class ReverseString {

    public static void main(String[] args){
        reverseString("Hi My Name is Shivam");
    }

    private static void reverseString(String str){
        System.out.println("Character is "+str.charAt(str.length()-1));
        int strLen = str.length();
        char[] charArr = new char[strLen];
        int i = 0;
        while(strLen>0){
            strLen--;
            charArr[i] = str.charAt(strLen);
            i++;
        }
        System.out.println(String.valueOf(charArr));
       } 

    }

    /*
     * Let's figure out the timeComplexity o(n)
     */
