import java.util.Scanner;

public class Maxsub {
//    Test Case,Input,Output,Explanation
//    Case 1,8   -2 -3 4 -1 -2 1 5 -3,    7,"The subarray [4, -1, -2, 1, 5] gives the maximum sum of 7."
//    Case 2,51 2 3 4 5,15,The entire array is the maximum subarray.
//            Case 3,4-1 -2 -3 -4,-1,The maximum sum is the largest single element -1.
    public static  int maximumsub(int[] arr){
        int profit = 0;
        int maxProfit = -1;
        for(int i=0 ;i<arr.length;i++){
            if(profit < 1 && arr[i] > 0){
                profit=arr[i];
                maxProfit = Math.max(profit,maxProfit);
            }else{
                profit += arr[i];
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int[] arr = new int[days];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumsub(arr));
    }
}
