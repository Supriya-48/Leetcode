package top_interview_150;

public class RemoveDuplicatesFromSortedArrayTwo {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=2) return nums.length;
        int pos = 0,freqCount=1;
        for(int i=1;i<nums.length;i++){
            freqCount = nums[pos] != nums[i] ? 1 : freqCount+1;
            if(freqCount <=2){
                nums[++pos] = nums[i];
            }
        }
        return ++pos;
    }
}
