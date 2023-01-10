class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s=new StringBuilder();
        s.append(String.valueOf(x));
        if(s.toString().equals(s.reverse().toString())){
            return true;
        }
        return false;
    }
}