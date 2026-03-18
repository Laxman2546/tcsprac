public class Bitmanipulation {
    public static void main(String[] args) {
        //swapping without a variable
        int a = 1; //0001
        int b = 2; //0010
        a = a ^ b; //0011
        b = a ^ b; //0001
        a = a ^ b; //0010
//       System.out.println(a + " " + b);
        //finding weather the number is divisible by  2 or not
        int n = 4;//0100
//        if ((n & 1) == 0) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        n = n|(1 << 1);
        n = n & (0 << 2);
        n = n|(1 << 1);
        System.out.println(n);
    }
}
