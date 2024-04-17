package top_interview_150;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        if(s.length() !=0 && t.length() == 0)
            return false;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j < s.length() && s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        if(j == s.length())
            return true;
        return false;
    }
}
