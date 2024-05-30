package top_interview_150;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i= s.trim().length() - 1;
        int count=0;
        s = s.trim();
        while(i >= 0 && i < s.length() && s.charAt(i) != ' ' )
        {
            count++;
            i--;
        }
        return count;
    }
}
