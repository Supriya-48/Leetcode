package top_interview_150;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            if(i>0 && roman.get(s.charAt(i)) > roman.get(s.charAt(i-1))){
                sum+= roman.get(s.charAt(i)) - roman.get(s.charAt(i-1));
                i--;
            }else{
                sum+=roman.get(s.charAt(i));
            }
        }
        return sum;
    }
}
