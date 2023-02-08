class Solution {
    public int countDigits(int num) {
        int count=0,digit=0,n=num;
        while(n >0){
            digit=n%10;
            n/=10;
            count= num%digit==0 ? count+1 :count;
        }
        return count;
    }
}