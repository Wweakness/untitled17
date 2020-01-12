import java.util.Arrays;

public class Solution3 {
    public static void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }
        rotate(nums,k-1);
        int tmp=nums[nums.length-1];

        for(int i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=tmp;

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
}
