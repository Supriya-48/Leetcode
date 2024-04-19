package top_interview_150;

import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapping = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(mapping.containsKey(s.charAt(i))){
                if(mapping.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(mapping.containsValue(t.charAt(i))){
                    return false;
                }
                mapping.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
