class Solution {
    public int singleNumber(int[] nums) {
     int size=nums.length,result=0;
     for(int i=0;i<size;i++){
       result^=nums[i];
     }
     return result;
       
    }
}