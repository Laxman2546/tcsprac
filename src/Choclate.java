import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 *  A chocolate factory is packing chocolates into the packets. The chocolate packets here
 * represent an array of N number of integer values. The task is to find the empty packets(0) of
 * chocolate and push it to the end of the conveyor belt(array). Click here to see solution
Example 1 : N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
 */
public class Choclate {
    public void moveZeroes(int[] arr){
        int left = 0;
        int right = 0;
        int n = arr.length;
        while(left != n && right !=n){
            if(arr[left] != 0 && arr[right] !=0){
                left++;
                right++;
            } else if (arr[left] == 0 && arr[right] == 0 ) {
                    right++;
            } else if (arr[left] == 0 && arr[right] !=0 ) {
                arr[left] = arr[right];
                arr[right] = 0;
            }else{
                left++;
            }
        }
    }
 public void method2(int[] nums){
        int n = 0;
     for (int i=0;i <nums.length;i++){
         if (nums[i] != 0) {
             int temp = nums[i];
             nums[i] = nums[n];
             nums[n] = temp;
             n++;
         }
 }

 }
public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int[] arr  = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
//            System.out.println("Enter element" +" "+ i+": " );
            arr[i] = sc.nextInt();
        }

//        moveZeroes(arr);
    method2(arr);
    System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
