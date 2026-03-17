import java.util.Scanner;

public class challan {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int[] lastDigit = new int[size];
        for(int i=0;i<size;i++){
            lastDigit[i] = sc.nextInt();
        }
        int date = sc.nextInt();
        int fine = sc.nextInt();

        int isEven =  date  % 2;
        int amount = 0;
        for(int num : lastDigit){
            if(isEven != num % 2){
                amount+=fine;
            }
        }
        System.out.println(amount);
        sc.close();
    }
}
