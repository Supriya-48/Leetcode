package top_interview_150;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <2){
            return strs[0];
        }
        String prefix = commonprefix(strs[0],strs[1]);
        for(int i = 2;i<strs.length;i++){
            prefix = commonprefix(prefix,strs[i]);
        }
        return prefix;
    }
    public String commonprefix(String s1, String s2){
        String prefix="";
        int length = s1.length() > s2.length() ? s2.length() : s1.length();
        for(int i=0;i <length;i++){
            if(s1.charAt(i) == s2.charAt(i)){
                prefix+=s1.charAt(i);
            }
            else{
                break;
            }
        }
        return prefix;
    }
}
