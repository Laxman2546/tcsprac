public class Lcm {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a % b);
    }
    public static void main(String[] args){
            int a = 12;
            int b = 6;
            int lcm = a * b / gcd(a,b);
            int gcd = gcd(b,a %b);
        System.out.println(lcm + " " + gcd);
    }

}
