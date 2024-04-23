package top_interview_150;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int pivot = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] >= pivot - i){
                pivot = i;
            }
        }
        if(pivot == 0)
            return true;
        return false;
    }
}
