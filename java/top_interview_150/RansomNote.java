package top_interview_150;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        for(int i=0;i<ransomNote.length();i++){
            int index = magazine.indexOf(ransomNote.charAt(i));
            if(index < 0){
                return false;
            }else{
                magazine = magazine.substring(0,index)+magazine.substring(index+1,magazine.length());
            }
        }
        return true;
    }
}
