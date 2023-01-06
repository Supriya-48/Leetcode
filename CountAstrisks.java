class Solution {
    public int countAsterisks(String s) {
        int count=0,indexA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                indexA+=1;
            }
            else if(s.charAt(i)=='*' && indexA %2==0){
                count+=1;
            }
        }
        return count;
    }
}