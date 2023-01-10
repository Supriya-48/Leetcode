class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        Map<Integer,Integer> res=new HashMap<>(); 
        for(int i=0;i<size;i++){
            if(res.containsKey(target-nums[i])){
                return new int[]{i,res.get(target-nums[i])};
            }else{
                res.put(nums[i],i);
            }
        }
        return new int[]{0};
    }
}