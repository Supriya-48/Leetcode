class Solution {
    public int countPairs(int[] nums, int k) {
        int count=0;
        int size=nums.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i]==nums[j] & (i*j)%k==0){
                    count+=1;
                }
            }
        }
        return count;
    }
}