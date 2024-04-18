package top_interview_150;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(nums.length == 1)
        {
            return;
        }
        int[] res = new int[nums.length];
        int index=0;
        for(int i=(nums.length-k);i < nums.length;i++){
            res[index] = nums[i];
            index++;
        }
        for(int i=0;i < (nums.length - k);i++){
            res[index] = nums[i];
            index++;
        }
        System.arraycopy(res,0,nums,0,nums.length);
    }
}
