import java.util.Scanner;

public class Validanagram {
    public static boolean checkAnagram(String s1,String s2){
        int[] freq = new int[26];
        if(s1.length() != s2.length()){
            return false;
        }
        System.out.println(s1.charAt(0) - 'a'+"iam at a");
        for(int i=0;i<s1.length();i++){
            System.out.println(freq[s1.charAt(i)- 'a']);
            freq[s1.charAt(i) - 'a']++;
            System.out.println(freq[s1.charAt(i)- 'a']);
        }
        for(int i=0;i<s2.length();i++){
            System.out.println(freq[s1.charAt(i)- 'a']);
            freq[s2.charAt(i) - 'a']--;
        }
        for(int c : freq){
            if(c !=0 ){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the string2: ");
        String s2 = sc.nextLine();
        System.out.println(checkAnagram(s1,s2));;
    }
}
