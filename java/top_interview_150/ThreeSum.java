package top_interview_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int key:nums){
            System.out.println(key);
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1,k=nums.length-1;
            while(j<k){
                int total = nums[i] + nums[j]+nums[k];
                if(total == 0){
                    List<Integer> temp = new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                    res.add(temp);
                    j+=1;
                    while (nums[j] == nums[j-1] && j < k){
                        j+=1;
                    }
                }
                else if(total > 0)
                    k--;
                else if(total < 0)
                    j++;

            }
        }
        return res;
    }
}
