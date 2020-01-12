import java.util.Arrays;

class Solution1 {
    public static void rotate(int[] nums, int k) {
        StringBuffer A=new StringBuffer();
        StringBuffer B=new StringBuffer();
        for(int i=nums.length-k;i<nums.length;i++){
            String a=String.valueOf(nums[i]);
            A.append(a);
        }
        for(int j=0;j<nums.length-k;j++){
            String b=String.valueOf(nums[j]);
            B.append(b);
        }
       StringBuffer E=A.append(B);
        String D=E.toString();
        char[] arr=D.toCharArray();
         int[] arr1=new int[arr.length];
         for (int n=0;n<arr.length;n++){
             arr1[n]=Integer.parseInt(String.valueOf(arr[n]));
         }
        System.out.println(Arrays.toString(arr1));





    }

    public static void main(String[] args) {
        int[] t={1,2,3,4,5,6,7};
        int k=3;
        rotate(t,k);
    }
}