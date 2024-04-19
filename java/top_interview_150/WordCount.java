package top_interview_150;

import java.util.HashMap;

public class WordCount {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> match = new HashMap<>();
        String[] wordCount = s.split(" ");
        if (pattern.length() != wordCount.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (match.containsKey(pattern.charAt(i))) {
                if (!match.get(pattern.charAt(i)).equals(wordCount[i])) {
                    return false;
                }
            } else {
                if (match.containsValue(wordCount[i])) {
                    return false;
                }
                match.put(pattern.charAt(i), wordCount[i]);
            }
        }
        return true;
    }
}
