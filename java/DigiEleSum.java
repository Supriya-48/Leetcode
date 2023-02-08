class Solution {
    public int digitSum(int num){
        int digit=0;
        while(num >0){
            digit+=num%10;
            num/=10;
        }
        return digit;
    }
    public int differenceOfSum(int[] nums) {
        int digitSum=0,size=nums.length,eleSum=0;
        for(int i=0;i<size;i++){
            digitSum+=digitSum(nums[i]);
            eleSum+=nums[i];

        }
        return eleSum>digitSum ? eleSum-digitSum : digitSum-eleSum;
    }
}