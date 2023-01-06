class Solution {
    public boolean checkString(String s) {
        int size=s.length();
        boolean res=true;
        for(int i=0;i<size;i++){
            if(s.charAt(i)=='b'){
                for(int j=i+1;j<size;j++){
                    if(s.charAt(j)=='a'){
                        res=false;
                    }
                }
            }
        }
        return res;
    }
}