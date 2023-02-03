class Solution {
    public int[] searchRange(int[] nums, int target) {
        int size=nums.length;
        int[] res=new int[2];
        res[0]=start(nums,target);
        res[1]=end(nums,target);
        return res;
    }
    public int start(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int idx=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target)
                end=mid-1;
            else
                start=mid+1;
            if(nums[mid]==target)
                idx=mid;
        }
        return idx;
        }
    public int end(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int idx=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<=target)
                start=mid+1;
            else
                end=mid-1;
            if(nums[mid]==target)
                idx=mid;
        }
        return idx;
        }
    }