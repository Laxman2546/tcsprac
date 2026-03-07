import java.util.Arrays;

public class NextGreater {
    public  static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int k = 0;
        int idx = 0;
        int arrIdx = 0;
        int max = 0;
        int[] res =  new int[nums1.length];
        for(int j = 0;j<nums1.length;j++){


        for(int i=0;i<nums2.length;i++){
            if(nums1[j] == nums2[i]){
                idx=i;
                break;
            }
        }
        for (int i=idx+1;i<nums2.length;i++){
            if( i != nums2.length && nums2[i] > nums1[j] && nums2[i] > max ){
                max = nums2[i];
                break;
            } else if (i == nums2.length) {
                max = Math.max(max,nums2[idx]);
                break;
            } else{
                max = Math.max(max,nums2[idx]);
            }
        }
        if(max == nums1[j] || max < nums2[idx] ||  idx== nums2.length-1){
            res[k++] = -1;
            max = 0;
        }else{
            res[k++] =  max;
            max = 0;
        }
            }
        return res;
    }

    public static void main(String[] args) {
            int[] arr1 = {2,4};
            int[] arr2 = {1,2,3,4};
            System.out.println(Arrays.toString( nextGreaterElement(arr1,arr2))); //output : [7,7,7,7,7]
     }
}
