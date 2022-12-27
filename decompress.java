class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        int i;
        for(i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int[] dec=new int[size];
        int ind=0;
        for(i=1;i<=nums.length;i+=2){
            int freq=nums[i-1];
            Arrays.fill(dec,ind,ind+freq,nums[i]);
            ind+=freq;
        }
        return dec;
    }
}