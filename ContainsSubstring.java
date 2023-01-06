class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int size=patterns.length,count=0;
        for(int i=0;i<size;i++){
            if(word.contains(patterns[i])){
                count+=1;
            }
        }
        return count;
    }
}