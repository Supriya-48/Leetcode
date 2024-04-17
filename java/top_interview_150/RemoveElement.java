package top_interview_150;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0,count =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] == val){
                count++;
            }
            else{
                nums[i++] = nums[j];

            }
        }
        return nums.length - count;
    }
}
