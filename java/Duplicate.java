class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> d=new HashSet<>();
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(d.contains(nums[i])){
                return true;
            }
            else{
                d.add(nums[i]);
            }
        }
        return false;
    }
}