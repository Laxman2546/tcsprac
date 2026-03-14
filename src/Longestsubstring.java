import java.util.HashSet;
import java.util.Scanner;
public class Longestsubstring {
    public static int  subString(String longestString){

        int maxCount = 0;
        //abcabcbb
        int left = 0;
        int right = 0;
        HashSet hs = new HashSet();
        while(right != longestString.length()){
            if(!hs.contains(longestString.charAt(right))){
                hs.add(longestString.charAt(right));
                maxCount = Math.max(maxCount,right - left + 1);
                right++;
            }else{
                hs.remove(longestString.charAt(left));
                left++;
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String");
        String longestString  = sc.nextLine();
        int longestSubstring= subString(longestString);
        System.out.println(longestSubstring);
    }
}
