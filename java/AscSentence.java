class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int curr,prev=0;
        for(int i=0;i<str.length;i++){
            char[] c=str[i].toCharArray();
            if(Character.isDigit(c[0])){
                curr=Integer.parseInt(str[i]);
                if(prev==0){
                    prev=Integer.parseInt(str[i]);
                }
                else if(prev>=curr){
                    return false;
                }
                prev=curr;
            }
        }
        return true;
    }
}