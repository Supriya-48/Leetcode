class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE,currentSum=0,size=nums.length;
        for(int i=0;i<size;i++){
            currentSum+=nums[i];
            maxSum= currentSum>maxSum ? currentSum :maxSum;
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
