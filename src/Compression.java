import java.util.Scanner;
public class Compression {
        public static String letterCompress(String s){
            String res = "";
            int left = 0;
            char current = s.charAt(0);
            int count = 0;
            while(left != s.length()){
                if(s.charAt(left) == current){
                    count++;
                    left++;
                }else{
                    res = count > 1 ? res + current+count : res+current;
                    current = s.charAt(left);
                    count=(char)1;
                    left++;

                }
            }
            return count > 1 ? res + current+count : res+current;
        }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter String: ");
            String s = sc.nextLine();
            String res = letterCompress(s);
            System.out.println(res);
        System.out.println(res.length());

        //second leetcode  String Compression

    }
}
