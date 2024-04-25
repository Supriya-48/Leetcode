package top_interview_150;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int count=0,product=1;
        for(int i:nums){
            if(i !=0){
                product*=i;
            }else{
                count+=1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                nums[i] = product/nums[i];
            }else if(count == 1){
                nums[i] = nums[i]==0 ? product : 0;
            }else if(count > 1){
                nums[i] = 0;
            }
        }
        return nums;
    }
}
