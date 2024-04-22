package top_interview_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] carray = strs[i].toCharArray();
            Arrays.sort(carray);
            String s = new String(carray);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<String>(List.of(strs[i])));
            }else{
                List<String> temp = map.get(s);
                temp.add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());

    }
}
