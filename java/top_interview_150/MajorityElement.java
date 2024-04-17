package top_interview_150;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i], freq.get(nums[i])+1);
            }else{
                freq.put(nums[i], 1);
            }
        }
        int max = 0,maxKey =0;
        for (Integer key : freq.keySet()) {
            if (freq.get(key) >= max) {
                max = freq.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }
}
