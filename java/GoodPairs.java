class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> counter=new HashMap<>();
        int size=nums.length,goodpairs=0;
        
        for(int i=0;i<size;i++){
            if(counter.containsKey(nums[i])){
                counter.put(nums[i],counter.get(nums[i])+1);
            }
            else{
                counter.put(nums[i],1);
            }
        }
        for(Integer value:counter.values()){
            goodpairs+=(value*(value-1))/2;
        }
        return goodpairs;
    
    }
}