package top_interview_150;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int k=0,j=s.length()-1;
        String newS = "";
        for(int i=0;i<s.length();i++){
            char check = Character.toLowerCase(s.charAt(i));
            if((check >='a' && check <= 'z') || Character.isLetterOrDigit(check) ){
                newS += check;
            }
        }
        j = newS.length()-1;
        while(k<j){
            if(newS.charAt(k) != newS.charAt(j)){
                return false;
            }else{
                k++;
                j--;
            }
        }
        return true;

    }
}
