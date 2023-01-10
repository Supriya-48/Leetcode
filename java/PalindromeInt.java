class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            int res=0,n=x;
            while(n>0){
                res=res*10+n%10;
                n=n/10;
            }
            return (x==res);
        }
    }
}