import java.util.Arrays;

public class NextGreater {
    public  static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int k = 0;
        int[] res =  new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    if(j < nums2.length-1 && nums2[j+1] > nums1[i]){
                        res[k++] = nums2[j+1];
                    }else{
                        res[k++] = -1;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
            int[] arr1 = {1,3,5,2,4};
            int[] arr2 = {6,5,4,3,2,1,7};
            System.out.println(Arrays.toString( nextGreaterElement(arr1,arr2))); //output : [7,7,7,7,7]
     }
}
