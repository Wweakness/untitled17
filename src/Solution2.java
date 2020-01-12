import java.util.Arrays;

public class Solution2 {
    public static void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        int p=0;
        for(int i=nums.length-k;i<nums.length;i++) {
            arr[p]=nums[i];
            p++;
        }
        for(int j=0;j< nums.length-k;j++){
            arr[p]=nums[j];
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
}
