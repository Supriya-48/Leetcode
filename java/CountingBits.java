class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            res[i]= ((i&1) ==0) ? res[i>>1] :res[i-1]+1;
        }
        return res;
    }
}