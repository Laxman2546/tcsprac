import java.util.Scanner;

public class Inout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        double c = sc.nextDouble();
        int d = sc.nextInt();
        System.out.println(a + " " + b + " " + c + " " +d);
        sc.close();
    }

}
