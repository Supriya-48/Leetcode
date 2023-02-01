class Solution {
    public int[] plusOne(int[] digits) {
        int size=digits.length;
        int unit=digits[size-1];
        if(unit<9){
            digits[size-1]=unit+1;
        }
        else{
            int i=size-1;
            while(i>=0 && digits[i]==9){
                digits[i]=0;
                i--;
            }
            if(i>=0 && digits[i]<9){
                digits[i]+=1;
            }else{
                int res[]=new int[size+1];
                res[0]=1;
                for(int j=1;j<=size;j++){
                    res[j]=digits[j-1];
                }
                return res;
            }
            
        }
        return digits;
    }
}