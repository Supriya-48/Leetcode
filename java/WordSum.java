class Solution {
    public int findSum(String word){
        int sum=0;
       String res="";
       for(int i=0;i<word.length();i++)
       {
           char c=word.charAt(i);
           res+=(char)c-'a';
       }
       sum+=Integer.valueOf(res);
       return sum;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
       return findSum(targetWord)==findSum(firstWord)+findSum(secondWord);
    }
}